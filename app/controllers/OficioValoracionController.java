package controllers;

import static play.data.Form.form;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import actions.miPdf;
import com.fasterxml.jackson.databind.JsonNode;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import models.*;
import models.Version;
import org.json.JSONException;
import org.json.JSONObject;
import play.data.DynamicForm;
import play.data.Form;
import play.db.ebean.Transactional;
import play.mvc.Result;
import play.mvc.Http.MultipartFormData;
import play.mvc.Http.MultipartFormData.FilePart;
import views.html.OficioValoracion.*;

public class OficioValoracionController extends ControladorSeguroCoordinador{
	
    public static Result GO_HOME = redirect( 
            routes.OficioValoracionController.list()
        );		
	
	
    
    public static Result list(){    	
    	//List<Recurso>  r = Ebean.find(Recurso.class).fetch("oficio").where().isNotNull("oficio").findList();    
    	List<Recurso>  r = Recurso.find.where().eq("estado.id", 110L).ne("oficio", null).findList(); 
    	return ok(list.render(r ));    	
    }
    
	public static Result create(Long id){
        Form<Recurso> rForm = form(Recurso.class).fill(   Recurso.find.byId(id)     );        
		return ok (asignarOficioValoracion.render(id, rForm));		
	}	



    //Aqui debe tomar el oficio de valoracion que el mismo sistema genera

	@Transactional
	public static Result save(Long id) throws Exception{
		DynamicForm df = form().bindFromRequest();
		System.out.println("\n\nDesde OficioValoracionController.save");
		System.out.println(df);
        Recurso r = Recurso.find.byId(id);    
        r.estado = 	Estado.find.byId(110L);
		r.update(r.id); 
		r.refresh();
        System.out.println("................................  "+r.oficiovaloracion);
        if (r.oficiovaloracion == null){
        	r.oficiovaloracion = new OficioValoracion();
        } else {
        	r.oficiovaloracion = OficioValoracion.searchByRecurso(id);
        }
        r.oficiovaloracion .recurso = Recurso.find.byId(id);
        r.oficiovaloracion .numero = df.get("oficiovaloracion.numero");
       DateFormat formatter = null;
       formatter = new SimpleDateFormat("yyyy-MM-dd");
        r.oficiovaloracion .fechaoficio = (Date) formatter.parse(df.get("oficiovaloracion.fechaoficio"));
        if (1==2){
		//Graba los documentos
		MultipartFormData body = request().body().asMultipartFormData();
			FilePart fp = body.getFile("oficiovaloracion.contenido");
			  if (fp != null) {
				    String fileName = fp.getFilename();
				    String contentType = fp.getContentType();
				    File file = fp.getFile();
				    try {
						Path p = Paths.get(file.getPath());
						byte[] byteFile = Files.readAllBytes(p);
						r.oficiovaloracion .nombrearchivo = fileName;
						r.oficiovaloracion .contenttype = contentType;
						r.oficiovaloracion .contenido =  byteFile;
					} catch (FileNotFoundException e) {
						System.out.println("error, archivo no encontrado "+e);
						e.printStackTrace();
					} catch (IOException ioe){
						System.out.println("error, excepcion de entrada/salida "+ioe);
						ioe.printStackTrace();
					}
			  }
		}

        // Se genera el oficio de valoración y se guarda en OficioValoracion
        String folio = df.get("oficiovaloracion.numero");
        String fecha = df.get("oficiovaloracion.fechaoficio");
        String recepcion = df.get("oficiovaloracion.foliorecepcion");
        String iniciales = df.get("oficiovaloracion.iniciales");
        r.oficiovaloracion.nombrearchivo = "OfVal-"+r.id+"-"+r.numcontrol+".pdf";
        r.oficiovaloracion.contenttype = "application/pdf";
        r.oficiovaloracion.contenido = generaOficioValoracionByte(r.id, folio, fecha, recepcion, iniciales);


        if ( OficioValoracion.searchByRecurso(id) == null  ){
			r.oficiovaloracion.save();
		} else {
			r.oficiovaloracion.update(OficioValoracion.searchByRecurso(id).id);
		}
		
		if (r.encuesta != null){
	        if (r.encuesta.estado.id == 3 &&  r.estado.id == 110){
	        	EncuestaController.enviarOficioValoracion(r.oficiovaloracion);
	        	r.estado =  Estado.find.byId(12L);
	        	r.update();
	        }
		}
		
        flash("success", "Al recurso " + r.oficiovaloracion .recurso.titulo + " le ha sido asignado el oficio de valoración "+r.oficiovaloracion.numero);
		return redirect(routes.RecursoController.completoList());
		
	}

    // Los siguientes 3 métodos se implementaron cuando se generaron los oficios de valoración por el mismo sistema

    // Genera PDF y lo muestra en el navegador
    // Recibe los parametros via json
    public static Result generaOficioValoracionAJAX()  {
        System.out.println("Desde OficioValoracionController.generaOficioValoracionAJAX");
        JsonNode json = request().body().asJson();
        System.out.println(json);

        long idRecurso = json.findValue("idRecurso").longValue();
        String folio = json.findValue("folio").textValue();
        String fecha = json.findValue("fecha").textValue();
        String recepcion = json.findValue("recepcion").textValue();
        String iniciales = json.findValue("iniciales").textValue();

        byte[] r = generaOficioValoracionByte(idRecurso, folio, fecha, recepcion, iniciales);
        response().setContentType("application/pdf");
        response().setHeader("Content-Disposition", "inline");
        System.out.println("---------------------");
        return ok (r);
    }

    // Regresa el pdf generado como un arreglo de bytes
    public static byte[] generaOficioValoracionByte(long idRecurso, String folio, String fecha, String folRecepcion, String iniciales){
        SimpleDateFormat sdf0 = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat sdf = new SimpleDateFormat("d 'de' MMMM 'de' yyyy");

        ByteArrayOutputStream baosPDF = new ByteArrayOutputStream();
        miPdf mipdf = new miPdf(idRecurso);
        mipdf.baos = baosPDF;

        String emisor="formatoOV";

        System.out.println("Generando oficio de valoración en PDF ...");
        System.out.println("...   "+mipdf.id);

        Recurso r = Recurso.find.byId(idRecurso);


        OficiovaloracionFormato ovf = OficiovaloracionFormato.find
                .byId(1L);

        mipdf.setClaveControl(r.numcontrol);

        List<Version> versiones = Version.lista();


        List<Recursoevaluador> re = r.recursoevaluadores;
        Document doc = new Document(PageSize.LETTER, 40,40,140,95);
        PdfWriter docWriter;
        try {
            docWriter = PdfWriter.getInstance(doc, mipdf.baos);
        } catch (DocumentException e) {
            throw new RuntimeException(e);
        }

        //Font fontboldTitulo = FontFactory.getFont("Cournier-bold", 14, Font.BOLD);
        Font fontboldTitulo = FontFactory.getFont("Noto-sans-bold", 10, Font.BOLD);
        //Font fontbold = FontFactory.getFont("Cournier-bold", 12, Font.BOLD);
        Font fontbold = FontFactory.getFont("Noto-sans-bold", 10, Font.BOLD);
        //Font fontCuerpo = FontFactory.getFont("Cournier",12);
        Font fontCuerpo = FontFactory.getFont("Noto-sans",10);
        //Font fontLMS = FontFactory.getFont("Cournier",7);
        Font fontLMS = FontFactory.getFont("Noto-sans",5);

        Font fontMonse = FontFactory.getFont("Montserrat",7);

        //Encabezado del reporte pdf
        PdfFondo auxPie = new PdfFondo();
        auxPie.emisor = emisor;
        auxPie.titulo = "Reporte de Evaluación Técnico Pedagógica";
        docWriter.setPageEvent(auxPie);

        doc.addTitle("Reporte de Evaluación Técnico Pedagógica");
        doc.addCreationDate();
        doc.addCreator("SERDD");

        try {
            PdfPTable tablaInicial = new PdfPTable(6);
            tablaInicial.setWidthPercentage(100);
            //tablaInicial.setSpacingBefore(5);
            tablaInicial.setSpacingAfter(-12);
            PdfPCell celdaInicial = new PdfPCell();
            //celdaInicial.setPaddingLeft(6f);
            //celdaInicial.setBorderColor(BaseColor.LIGHT_GRAY);


            Paragraph parrafo = new Paragraph();
            parrafo.setFont(fontCuerpo);
            parrafo.setSpacingBefore(10f);
            parrafo.setAlignment(Element.ALIGN_LEFT);
            parrafo.setMultipliedLeading(1.1f);


            doc.open();

            PdfPTable tabla = new PdfPTable(tablaInicial);
            PdfPCell celda = new PdfPCell( celdaInicial  );
            // label folio (que en realidad es el número de oficio)
            celda.setPhrase(new Phrase("Folio", fontbold));
            celda.setColspan(3);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setBorder(Rectangle.NO_BORDER);
            tabla.addCell(celda);

            celda = new PdfPCell( new Phrase(ovf.encabezado, fontboldTitulo)  );
            celda.setPadding(5);
            celda.setColspan(3);
            celda.setHorizontalAlignment(Element.ALIGN_RIGHT);
            celda.setBorder(Rectangle.NO_BORDER);
            tabla.addCell(celda);

            doc.add(tabla);

            // folio (número de oficio)
            tabla = new PdfPTable(1);
            tabla.setWidthPercentage(100);
            celda = new PdfPCell(celdaInicial);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPhrase( new Phrase(folio));
            celda.setBorder(Rectangle.NO_BORDER);
            tabla.addCell(celda);
            doc.add(tabla);

            // Label Asunto
            tabla = new PdfPTable(1);
            tabla.setWidthPercentage(40);
            tabla.setSpacingBefore(25);
            tabla.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda = new PdfPCell(celdaInicial);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPhrase(new Phrase("Asunto", fontbold));
            celda.setBorder(Rectangle.NO_BORDER);
            tabla.addCell(celda);
            //Asunto
            celda = new PdfPCell(celdaInicial);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPhrase(new Phrase(ovf.asunto, fontCuerpo));
            celda.setBorder(Rectangle.NO_BORDER);
            tabla.addCell(celda);
            doc.add(tabla);

            // fecha
            tabla = new PdfPTable(1);
            tabla.setWidthPercentage(100);
            tabla.setSpacingBefore(10);
            celda = new PdfPCell(celdaInicial);
            celda.setHorizontalAlignment(Element.ALIGN_RIGHT);

            //celda.setPhrase(new Phrase("Ciudad de México, "+ sdf.format(r.oficiovaloracion.fechaoficio)  , fontCuerpo));
            Date laFecha = sdf0.parse(fecha);

            System.out.println("cadena recibida "+fecha);
            System.out.println("fecha convertida "+laFecha);
            System.out.println("fecha convertida formato dd-mm-yyyy "+sdf0.format(laFecha));
            System.out.println("fecha convertida "+sdf.format(laFecha));


            celda.setPhrase(new Phrase("Ciudad de México, "+ sdf.format(laFecha)  , fontCuerpo));


            celda.setBorder(Rectangle.NO_BORDER);
            tabla.addCell(celda);
            doc.add(tabla);

            // Para
            tabla = new PdfPTable(1);
            tabla.setWidthPercentage(100);
            tabla.setSpacingBefore(10);
            celda = new PdfPCell(celdaInicial);

            celda.setHorizontalAlignment(Element.ALIGN_LEFT);

            String textoDirector = "[nombreDirector]\nDirector[directorGenero] de [articulo] "+r.unidadacademica.nombre+" del Instituto Politécnico Nacional\nPRESENTE";

            System.out.println("genero dir UA: "+r.unidadacademica.directores.get(0).genero);
            System.out.println("artículo UA: "+r.unidadacademica.articulo);

            if (r.unidadacademica.directores.size()>0) {
                if (r.unidadacademica.directores.get(0).genero.length() > 0)
                    textoDirector = textoDirector.replace("[directorGenero]", Objects.equals(r.unidadacademica.directores.get(0).genero, "F") ? "a" : "");

                if (r.unidadacademica.directores != null && r.unidadacademica.directores.size() > 0)
                    textoDirector = textoDirector.replace("[nombreDirector]", r.unidadacademica.directores.get(0).nombreConTitulo());

                if (r.unidadacademica.directores != null && r.unidadacademica.directores.size() > 0)
                    textoDirector = textoDirector.replace("[nombreDirector]", r.unidadacademica.directores.get(0).nombreConTitulo());
            }
            System.out.println(r.unidadacademica.articulo!=null);
            if (r.unidadacademica.articulo!=null) {
                System.out.println("art si "+r.unidadacademica.articulo=="M"?"la":"el");
                textoDirector = textoDirector.replace("[articulo]", r.unidadacademica.articulo);
            }




            parrafo.setFont(fontbold);
            parrafo.setAlignment(Element.ALIGN_JUSTIFIED);
            parrafo.add(textoDirector);
            doc.add(parrafo);

            // Cuerpo1
            String folioOficioSolicitud = r.oficio.folio;
            String folioOficioSolicitudRecibido = sdf.format(r.oficio.fecharecepcion);
            String stringAux = ovf.cuerpo1
                    .replace("[folio]", folioOficioSolicitud)
                    .replace("[fechaFolio]", folioOficioSolicitudRecibido);
            parrafo.clear();
            parrafo.setFont(fontCuerpo);
            parrafo.add(stringAux);
            doc.add(parrafo);


            // inicia tabla
            String ua = "";
            String titulo = r.titulo;
            String autores = "";

            List<String> lstAutores = r.autores.stream().map(m -> m.nombreCompleto()).collect(Collectors.toList());

            autores = String.join(", ", lstAutores);
            tabla = new PdfPTable(2);
            tabla.setWidths(new int[]{80,200});
            tabla.setWidthPercentage(100);
            //tabla.setSpacingBefore(2);
            // tabla rdd
            celda = new PdfPCell(celdaInicial);
            celda.setPaddingLeft(6f); celda.setMinimumHeight(20f);  celda.setPaddingBottom(6f);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPhrase(new Phrase("RDD"  , fontbold));
            tabla.addCell(celda);
            celda = new PdfPCell(celdaInicial);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPaddingLeft(6f); celda.setMinimumHeight(20f);
            celda.setPhrase(new Phrase(r.titulo  , fontCuerpo));
            tabla.addCell(celda);

            // tabla autores
            celda = new PdfPCell(celdaInicial);
            celda.setPaddingLeft(6f);
            celda.setMinimumHeight(20f);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPhrase(new Phrase("Autores"  , fontbold));
            tabla.addCell(celda);
            celda = new PdfPCell(celdaInicial);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPaddingLeft(6f); celda.setMinimumHeight(20f); celda.setPaddingBottom(6f);
            celda.setPhrase(new Phrase(autores  , fontCuerpo));
            tabla.addCell(celda);

            // tabla Unidad académica
            celda = new PdfPCell(celdaInicial);
            celda.setPaddingLeft(6f);
            celda.setMinimumHeight(20f);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPhrase(new Phrase("Unidad académica"  , fontbold));
            tabla.addCell(celda);
            celda = new PdfPCell(celdaInicial);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPaddingLeft(6f); celda.setMinimumHeight(20f); celda.setPaddingBottom(6f);
            celda.setPhrase(new Phrase(r.unidadacademica.nombre  , fontCuerpo));
            tabla.addCell(celda);

            // tabla nivel
            celda = new PdfPCell(celdaInicial);
            celda.setPaddingLeft(6f);
            celda.setMinimumHeight(20f);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPhrase(new Phrase("Nivel"  , fontbold));
            tabla.addCell(celda);
            celda = new PdfPCell(celdaInicial);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPaddingLeft(6f); celda.setMinimumHeight(20f);
            celda.setPhrase(new Phrase(r.niveleducativo.descripcion  , fontCuerpo));
            tabla.addCell(celda);

            // tabla área conocimiento
            celda = new PdfPCell(celdaInicial);
            celda.setPaddingLeft(6f);
            celda.setMinimumHeight(20f);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPhrase(new Phrase("Área de conocimiento"  , fontbold));
            tabla.addCell(celda);
            celda = new PdfPCell(celdaInicial);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPaddingLeft(6f); celda.setMinimumHeight(20f);
            celda.setPhrase(new Phrase(r.areaconocimiento.descripcion  , fontCuerpo));
            tabla.addCell(celda);

            // tabla version
            celda = new PdfPCell(celdaInicial);
            celda.setPaddingLeft(6f);
            celda.setMinimumHeight(20f);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPaddingLeft(6f); celda.setMinimumHeight(20f);
            celda.setPhrase(new Phrase("Versión"  , fontbold));
            tabla.addCell(celda);
            celda = new PdfPCell(celdaInicial);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPaddingLeft(6f); celda.setMinimumHeight(20f);
            celda.setPhrase(new Phrase(r.version.descripcion  , fontCuerpo));
            tabla.addCell(celda);

            // tabla categoría (calificacion)
            celda = new PdfPCell(celdaInicial);
            celda.setPaddingLeft(6f);
            celda.setMinimumHeight(20f);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPhrase(new Phrase("Categoría"  , fontbold));
            tabla.addCell(celda);
            celda = new PdfPCell(celdaInicial);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPaddingLeft(6f); celda.setMinimumHeight(20f);
            celda.setPhrase(new Phrase(r.clasificacion.tiporecurso.descripcion , fontCuerpo));
            tabla.addCell(celda);
            doc.add(tabla);
            // termimna tabla

            // cuerpo2   (resultado de la evaluación)
            String evaluacion = r.calificacionLetraGral();
            String aux2 = ovf.cuerpo2
                    .replace("[evaluación]", evaluacion);
            parrafo.clear();
            parrafo.add(aux2);
            doc.add(parrafo);


            // alojado (tiene url)
            if (r.url!=null && !r.url.isEmpty()) {
                // ¿requiere user/pass?
                boolean usaCuenta = !r.recursosenweb.isEmpty();
                String x = ovf.cuerpo5
                        .replace("[enlaces]", r.url);
                parrafo.clear();
                parrafo.add(x);
                doc.add(parrafo);
                if (usaCuenta){
                    parrafo.clear();
                    parrafo.add("El acceso requiere de usuario y clave, mismas que se le haran llegar.");
                    doc.add(parrafo);
                }
            }

            // despedida
            if (ovf.despedida!=null){
                parrafo.clear();
                parrafo.add(ovf.despedida);
                doc.add(parrafo);
            }

            // despedida director dev
            String textoDirectorDEV = "[directorDEV]";
            String directorDevGenero  = "";
            Director directorDEV = Director.find.where().eq("ur", "DEV").findUnique();
            if (directorDEV!=null) {
                if (!directorDEV.nombreCompleto().isEmpty())
                    textoDirectorDEV = directorDEV.nombreConTitulo();
                if (Objects.equals(directorDEV.genero, "F")){
                    directorDevGenero="a";
                }
            }
            parrafo.clear();
            parrafo.setFont(fontbold);
            parrafo.add("ATENTAMENTE\n\"La Técnica al servicio de la Patria\"\n"+textoDirectorDEV+"\nDirector"+directorDevGenero);
            doc.add(parrafo);

            // c.c.p.
            // Datos de la direccion  correspondiente (EMS, ES o Posgrado)
            String textoDirNivel="";
            switch (r.niveleducativo.id.intValue()){
                case 1:  {
                    Director d = Director.find.where().eq("ur", "EMS").findUnique();
                    if (d!=null){
                        textoDirNivel = d.nombreConTitulo() +" - Director"+(Objects.equals(d.genero, "F") ?"a":"")+" de Educación Media Superior del IPN. Para su conocimiento.";
                    }
                }
                case 2:  {
                    Director d = Director.find.where().eq("ur", "ES").findUnique();
                    if (d!=null){
                        textoDirNivel = d.nombreConTitulo() +" - Director"+(Objects.equals(d.genero, "F") ?"a":"")+" de Educación Superior del IPN. Para su conocimiento.";
                    }
                }
                case 3:  {
                    Director d = Director.find.where().eq("ur", "PGD").findUnique();
                    if (d!=null){
                        textoDirNivel = d.nombreConTitulo() +" - Director"+(Objects.equals(d.genero, "F") ?"a":"")+" de Posgrado del IPN. Para su conocimiento.";
                    }
                }
            }


            tabla = new PdfPTable(2);
            tabla.setWidths(new int[]{10,200});
            tabla.setWidthPercentage(100);
            tabla.setSpacingBefore(10);
            celda = new PdfPCell(celdaInicial);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPhrase(new Phrase( "c.c.p. " , fontMonse));
            celda.setBorder(Rectangle.NO_BORDER);
            tabla.addCell(celda);
            celda = new PdfPCell(celdaInicial);
            celda.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
            celda.setPhrase(new Phrase( textoDirNivel+"\nInteresado."  , fontMonse));
            celda.setBorder(Rectangle.NO_BORDER);
            tabla.addCell(celda);
            doc.add(tabla);

            // iniciales
            if (iniciales!=null && !iniciales.isEmpty()){
                parrafo.clear();
                parrafo.setSpacingBefore(2f);
                parrafo.setFont(fontMonse);
                parrafo.add(iniciales);
                doc.add(parrafo);
            }


            // folio recepción
            parrafo.clear();
            parrafo.setSpacingBefore(2f);
            parrafo.setFont(fontMonse);
            parrafo.add("Folio recepción: "+folRecepcion);
            doc.add(parrafo);


            // CCD 2023
            parrafo.clear();
            parrafo.setSpacingBefore(2f);
            parrafo.setFont(fontMonse);
            parrafo.add("CCD 2023: [¿?]");
            doc.add(parrafo);

        } catch (DocumentException e) {
            System.out.println("Error. Ocurrió una excepción "+e.getMessage());
            throw new RuntimeException(e);
        } catch (ParseException e) {
            System.out.println("Error en la conversion - (ParseException)");
            throw new RuntimeException(e);
        }
        doc.close();
        docWriter.close();
        return mipdf.baos.toByteArray();
    }


    // Guardar el pdf del oficio de valoracion con el botón desde la ventana modal
    @com.avaje.ebean.annotation.Transactional
    public static Result saveOficioValoracionAJAX()  {
        System.out.println("Desde RecursoevaluadorController.saveOficioValoracion");
        JsonNode json = request().body().asJson();
        JSONObject jo = new JSONObject();
        System.out.println(json);

        SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy");


        long idRecurso = json.findValue("idRecurso").longValue();
        String folio = json.findValue("folio").textValue();
        String fecha = json.findValue("fecha").textValue();
        String recepcion = json.findValue("recepcion").textValue();
        String iniciales = json.findValue("iniciales").textValue();

        byte[] bytes = generaOficioValoracionByte(idRecurso, folio, fecha, recepcion, iniciales);
        response().setContentType("application/pdf");
        response().setHeader("Content-Disposition", "inline");
        System.out.println("---------------------");

        try {
            jo.put("estado", "error");
            jo.put("mensaje", "No fue posible generar y/o guardar el oficio de valoración.");
            Recurso recurso = Recurso.find.byId(idRecurso);
            OficioValoracion of = new OficioValoracion();
            of.recurso = recurso;
            of.nombrearchivo = "OfVal-"+ recurso.numcontrol+".pdf";
            of.contenttype="application/pdf";
            of.numero = folio;
            of.fechaoficio = sdf.parse(fecha);
            of.foliorecepcion = recepcion;
            of.iniciales = iniciales;
            of.contenido = bytes;
            of.save();
            recurso.estado=Estado.find.byId(110L);
            recurso.update();

            System.out.println("SALVADOOOOOO");

            //return redirect( routes.RecursoevaluadorController.mostrarEvaluacionesConcluidas(0,"lg") );

            jo.put("estado", "grabado");
            jo.put("mensaje", "Se generó el oficio de valoración para el recurso "+ recurso.titulo+" con clave de control "+ recurso.numcontrol);

        } catch (ParseException e) {
            System.out.println("Error de conversion de fecha "+e.getMessage());
            throw new RuntimeException(e);
        } catch (JSONException e) {
            System.out.println("Error de conversion de conversion JSON "+e.getMessage());
            throw new RuntimeException(e);
        }
        return ok(  jo.toString() );
    }


    // Actualiza el pdf del oficio de valoracion con el botón desde la ventana modal
    @com.avaje.ebean.annotation.Transactional
    public static Result editOficioValoracionAJAX()  {
        System.out.println("Desde RecursoevaluadorController.updateOficioValoracion");
        JsonNode json = request().body().asJson();
        JSONObject jo = new JSONObject();
        System.out.println(json);

        SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy");


        long idRecurso = json.findValue("idRecurso").longValue();
        String folio = json.findValue("folio").textValue();
        String fecha = json.findValue("fecha").textValue();
        String recepcion = json.findValue("recepcion").textValue();
        String iniciales = json.findValue("iniciales").textValue();

        byte[] bytes = generaOficioValoracionByte(idRecurso, folio, fecha, recepcion, iniciales);
        response().setContentType("application/pdf");
        response().setHeader("Content-Disposition", "inline");
        System.out.println("---------------------");

        try {
            jo.put("estado", "error");
            jo.put("mensaje", "No fue posible generar y/o guardar el oficio de valoración.");
            Recurso recurso = Recurso.find.byId(idRecurso);
            // ¿ya existe un ofio de valoracion para este recurso?
            OficioValoracion existe = OficioValoracion.searchByRecurso(idRecurso);
            OficioValoracion of = new OficioValoracion();
            of.recurso = recurso;
            of.nombrearchivo = "OfVal-"+ recurso.numcontrol+".pdf";
            of.contenttype="application/pdf";
            of.numero = folio;
            of.fechaoficio = sdf.parse(fecha);
            of.foliorecepcion = recepcion;
            of.iniciales = iniciales;
            of.contenido = bytes;
            of.update(existe.id);
            recurso.estado=Estado.find.byId(110L);
            recurso.update();

            System.out.println("ACTUALIZADOOOOOOOOOOOO");

            //return redirect( routes.RecursoevaluadorController.mostrarEvaluacionesConcluidas(0,"lg") );

            jo.put("estado", "actualizado");
            jo.put("mensaje", "Se actualizó el oficio de valoración para el recurso "+ recurso.titulo+" con clave de control "+ recurso.numcontrol);

        } catch (ParseException e) {
            System.out.println("Error de conversion de fecha "+e.getMessage());
            throw new RuntimeException(e);
        } catch (JSONException e) {
            System.out.println("Error de conversion de conversion JSON "+e.getMessage());
            throw new RuntimeException(e);
        }
        return ok(  jo.toString() );
    }

}
