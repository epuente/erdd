package controllers;

import static play.data.Form.form;

import java.io.*;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;


import classes.MyFooter;
import classes.PdfFondo;
import com.avaje.ebean.Expr;
import com.avaje.ebean.annotation.Transactional;
import com.fasterxml.jackson.databind.JsonNode;
import com.itextpdf.text.*;
import classes.miCorreo;
import classes.miPdf;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import controllers.util.ControladorSeguroCoordinador;
import models.*;
import models.Version;


import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xwpf.model.XWPFHeaderFooterPolicy;
import org.apache.poi.xwpf.usermodel.*;
import org.apache.poi.util.Units;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;


import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFHeader;
//import org.apache.poi.xwpf.usermodel.XWPFHeaderFooterPolicy;
//import org.apache.poi.xwpf.usermodel.HeaderFooterType;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;




import org.apache.poi.xwpf.usermodel.*;
import org.json.JSONObject;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.*;
import org.apache.poi.util.Units;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;


import org.apache.poi.util.Units;
import org.apache.poi.xwpf.usermodel.*;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.*;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFHeader;
import org.apache.poi.util.Units;
import java.io.*;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import play.data.DynamicForm;
import play.data.Form;
import play.db.ebean.Model;
import play.mvc.Result;
//import views.html.Recurso.list;
import views.html.Evaluaciones.evaluada;
import views.html.Recursoevaluador.*;
import views.html.errores.errorNoEvaluado;
import views.html.errores.noExisteRecurso;

public class RecursoevaluadorController  extends ControladorSeguroCoordinador {

    public static Result asignarEvaluadoresList(){
        List<Long> edos = new ArrayList<>();
        edos.add(6L);
        edos.add(7L);
        edos.add(8L);
        edos.add(9L);
//		edos.add(10L);
//		edos.add(11L);
        edos.add(100L);
        edos.add(400L);


        System.out.println("desde REcursoevaluadorController.asignarEvaluadoresList");
        return ok(list.render( Recurso.find.where().in("estado.id", edos).findList() ));
    }





    public static Result asignarEvaluadoresCreate(Long id){
        Form<Recursoevaluador> reForm =	form(Recursoevaluador.class);
        List<Recursoevaluador> re = Recurso.find.byId(id).recursoevaluadores;
        return ok( create.render(reForm, id, Calendario.find.all(), re   ));
    }

    @play.db.ebean.Transactional
    public static Result asignarEvaluadoresSave(Long id, String tipo) {
        DynamicForm df = form().bindFromRequest();
        System.out.println(df);

        Recurso r = Recurso.find.byId(id);
        EvaluacionFecha ef = new EvaluacionFecha();
        DateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal  = Calendar.getInstance();
        if (  r.estado.id == 5L){
            try {
                cal.setTime(formato.parse( df.get("fechalimite") ));
            } catch (ParseException e) {
                System.out.println("************************* error en conversión de fecha");
                e.printStackTrace();
            }
        }
        Calendar fi = Calendar.getInstance();
        fi.add(Calendar.DAY_OF_YEAR, 1);
        while (fi.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY && fi.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){
            fi.add(Calendar.DATE, 1);
            response().setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
            response().setHeader("Pragma", "no-cache"); // HTTP 1.0.
            response().setHeader("Expires", "0"); // Proxies.

        }
        ef.fechainicio = fi.getTime();
        if ( EvaluacionFecha.find.where().eq("recurso.id", id).findUnique() == null  ){
            ef.recurso = r;
            ef.ndias = Integer.parseInt(df.get("ndias"));
            ef.fechalimite =   cal.getTime();
            ef.save();
        }


        List<Long> listaDestinatarios = new ArrayList<>();
        int numeroEvaluadores = 0;
        for(long d = 1L; d<=4L;d++){
            Recursoevaluador actual = Recursoevaluador.find.where().eq("recurso.id", id).eq("aspecto.id", d).findUnique();
            String propuesto = df.get("evaluador"+d);
            // Ya existe el evaluador del aspecto para ese recurso?
            if (actual != null) {
                // Ya existe
                if (propuesto!="")
                    if ( actual.evaluador.id != Long.parseLong(propuesto) ){
                        //Si existe y el evaluador es diferente
                        reasignarEvaluador(actual.id, propuesto);
                        listaDestinatarios.add( actual.evaluador.id );
                        numeroEvaluadores++;
                    } else {
                        //Ya existe, pero el evaluador es el mismo
                        numeroEvaluadores++;
                    }
            } else {
                // No existe, es nuevo, se agrega
                if (propuesto!=""){
                    Recursoevaluador re = new Recursoevaluador();
                    re.recurso = r;
                    re.aspecto = Aspecto.find.byId( Long.parseLong(df.get("aspecto"+d)   ));
                    re.evaluador = Evaluador.find.byId( Long.parseLong( propuesto ) );
                    re.estadoevaluacion = EstadoEvaluacion.find.byId(1L);
                    r.recursoevaluadores.add(re);
                    numeroEvaluadores++;
                    listaDestinatarios.add( re.evaluador.id );
                }
            }
        }

        System.out.println("numeroEvaluadores: " + numeroEvaluadores);
        if (numeroEvaluadores == 4)
            r.estado = Estado.find.byId(6L);
        else {
            r.estado = Estado.find.byId(100L);
        }
        r.update();
        r.refresh();


        // Enviar correo a los evaluadores

        DateFormatSymbols dfs = new DateFormatSymbols();
        String[] months = dfs.getMonths();

        miCorreo mc = new miCorreo();
        mc.asunto = "Asignación de recurso a evaluar";
        String m1 = "Se le informa que el día ";
        String m3 = " fue asignado(a) como evaluador(a) del recurso didáctico digital '"+r.titulo+"', con número de folio "+r.oficio.folio+" y clasificado como "+r.clasificacion.criterio2.descripcion+" de tipo "+r.clasificacion.criterio3.catalogo.descripcion+".";

        String m4 = "<br><br>El equipo de evaluación está integrado por:<br><br>";
        StringBuilder listaEvaluadores = new StringBuilder();
        String enWeb="";
        String credenciales = "";

        int u = 1;

        for(Recursoevaluador linea : r.recursoevaluadores){
            listaEvaluadores.append((u++)).append(". ").append(linea.evaluador.personal.nombreCompleto()).append(" (evaluador del aspecto: ").append(linea.aspecto.descripcion).append(").<br>");
        }
        listaEvaluadores.append("<br><br>");

        String m6="";
        if (r.formatoentregaotro.isEmpty()){
            m6 = "El formato de entrega fue en "+r.formatoentrega.descripcion+", el cual será entregado de forma personal.";
        } else {
            m6 = "El formato de entrega fue en "+r.formatoentregaotro;
        }

        if ( !r.url.isEmpty() ){
            enWeb = "<br>Podrá consultar el contenido en línea a través de un explorador en la siguiente dirección:<br>"+r.url+"<br>";
            if ( r.recursosenweb.isEmpty() ){
                credenciales = "<br>No se requieren datos de acceso ya que está abierto.<br><br>";
            } else {
                credenciales = "<br>Los datos para ingresar son:<br>Usuario:"+r.recursosenweb.get(0).usuario+"<br>Clave de acceso:"+r.recursosenweb.get(0).password+"<br><br>";
            }
        }
        cal.setTime(r.evaluacionFecha.fechalimite);
        String m7 = "<br><br>La fecha límite para la conclusión de su evaluación es el día " + cal.get(Calendar.DAY_OF_MONTH)+" de "+ months[cal.get(Calendar.MONTH)]+" del año "+cal.get(Calendar.YEAR)+".";

        for(Recursoevaluador linea : Recursoevaluador.find.where().eq("recurso.id",r.id).in("evaluador.id", listaDestinatarios).findList()){
            mc.para = Collections.singletonList(linea.evaluador.personal.correo);
            mc.mensaje="Apreciable "+linea.evaluador.personal.nombreCompleto()+":<br><br>";
            cal.setTime(linea.recurso.auditinsert);


            String m2 = cal.get(Calendar.DAY_OF_MONTH)+" de "+ months[cal.get(Calendar.MONTH)];
            mc.mensaje += m1+m2+m3+m4+listaEvaluadores+m6+enWeb+credenciales+m7+"<br><br>El Departamento de Investigación e Innovación agradece de antemano su colaboración en este proceso.";
            //mc.run();
            mc.enviar();

            CorreoSalida cs = new CorreoSalida(mc, r);
            cs.save();

        }
        flash("success","Se asignaron evaluadores al recurso '"+r.titulo+"'");
        return redirect(routes.ClasificacionController.list());
    }

    public static Result mostrarEvaluadores(Long id) {
        List<Recursoevaluador> re =  Recursoevaluador.find.where().eq("recurso.id", id).findList();
        return ok (mostrarEvaluadores.render(re) );
    }

    public static Result mostrarEvaluacionesSinAtender(int tipo){
        List<Recursoevaluador> re = null;
        if (tipo == 0){
            re =  Recursoevaluador.find.where()
                    .eq("recurso.estado.id", 6L).findList();
        }
        if (tipo == 1){
            re =  Recursoevaluador.find.where()
                    .not(Expr.in("recurso.estado.id", Arrays.asList(400, 401,402)))
                    .eq("estadoevaluacion.id", 1L).findList();
        }
        return ok(listarEvaluacionesSinAtender.render(re, tipo));
    }

    public static Result mostrarEvaluacionesEnProceso(int tipo){
        List<Recursoevaluador> re = null;
        if (tipo == 0){
            re =  Recursoevaluador.find.where()
                    .eq("recurso.estado.id", 7).findList();
        }
        if (tipo == 1){
            re =  Recursoevaluador.find.where()
                    .not(Expr.in("recurso.estado.id", Arrays.asList(400, 401,402)))
                    .eq("estadoevaluacion.id", 2L).findList();
        }

        return ok(listarEvaluacionesEnProceso.render(re, tipo));
    }

    public static Result mostrarEvaluacionesPorRevisar(int tipo){
        List<Recursoevaluador> re = null;
        if (tipo == 0){
            re = Recursoevaluador.find.where()
                    .eq("recurso.estado.id", 8).findList();
        }
        if (tipo == 1){
            re = Recursoevaluador.find.where()
                    .not(Expr.in("recurso.estado.id", Arrays.asList(400, 401,402)))
                    .eq("estadoevaluacion.id", 3).findList();

        }
        //System.out.println("REcurso con todas sus evaluaciones por revisar: "+re.size());
        return ok(listarEvaluacionesPorRevisar.render(re, tipo));
    }

    public static Result mostrarEvaluacionesConObservaciones(int tipo){
        List<Recursoevaluador> re = null;
        if (tipo == 0){
            re = Recursoevaluador.find.where()
                    .eq("recurso.estado.id", 9).findList();
        }
        if (tipo == 1){
            re = Recursoevaluador.find.where()
                    .not(Expr.in("recurso.estado.id", Arrays.asList(400, 401,402)))
                    .eq("estadoevaluacion.id", 4).findList();
        }
        return ok(listarEvaluacionesConObservaciones.render(re, tipo));
    }

    public static Result mostrarEvaluacionesConcluidas(int tipo, String device){
        List<Recursoevaluador> re = null;
        //  0   Para recursos con todos sus aspectos evaluados
        if (tipo == 0){
            re = Recursoevaluador.find.where()
                    .in("recurso.estado.id", Arrays.asList(10, 11, 12, 110))
                    .findList();
        }
        //  1   Para evaluación incompleta  (algunos aspectos evaluados, pero no todos)
        if (tipo == 1){
            re = Recursoevaluador.find.where()
                    .not(Expr.in("recurso.estado.id", Arrays.asList(400, 401,402)))
                    .eq("estadoevaluacion.id", 5L).findList();
        }
        return ok(listarEvaluacionesConcluidas.render(re, tipo));
    }


    public static Result reporteEvaluacion(Long id) throws DocumentException, IOException {
        System.out.println("Desde RecursoEvaluadorController.reporteEvaluacion");
        /*
        ByteArrayOutputStream baosPDF = new ByteArrayOutputStream();
        miPdf mipdf = new miPdf(id);
        mipdf.baos = baosPDF;
        try {
            mipdf.generarReporteFinal("admin");
        } catch (Exception e) {
            e.printStackTrace();
        }
        response().setContentType("application/pdf");
        return ok (  mipdf.baos.toByteArray() );
         */

        Recurso r = Recurso.find.byId(id);
        if (r == null){
            return ok( noExisteRecurso.render());
        }
        if (r.estado.id < 10) {
            return ok( errorNoEvaluado.render());
        }

        ByteArrayOutputStream baosPDF = new ByteArrayOutputStream();
        miPdf mipdf = new miPdf(id);
        mipdf.baos = baosPDF;

        String emisor="admin";

        // Aqui se pone el código de miPdf.generarReporteFinal
        System.out.println("Generando PDF(reporte final) ...");
        System.out.println("...   "+mipdf.id);

        mipdf.setClaveControl(r.numcontrol);

        List<Version> versiones = Version.lista();
        List<Formatoentrega> fe = Formatoentrega.lista();
        List<Modalidad> modalidades = Modalidad.find.all();
        List<Dirigidoa> dirigidoa = Dirigidoa.find.all();
        ArrayList<Long> rdir = new ArrayList<>();
        recursoDirigidoa.find.where().eq("recurso.id", mipdf.id).findList().forEach(z -> {
            //rdir.add(z.id);
            rdir.add(z.dirigidoa.id);
        });

        List<Aspecto> aspectos = Aspecto.find.all();
        List<Recursoevaluador> re = r.recursoevaluadores;
        Document doc = new Document(PageSize.LETTER, 40,40,90,40);
        PdfWriter docWriter;
        docWriter = PdfWriter.getInstance(doc, mipdf.baos);

        //Encabezado del reporte pdf
        MyFooter auxPie = new MyFooter();
        auxPie.emisor = emisor;
        auxPie.titulo = "Reporte de Evaluación Técnico Pedagógica";
        docWriter.setPageEvent(auxPie);

        doc.addTitle("Reporte de Evaluación Técnico Pedagógica");
        doc.addCreationDate();
        doc.addCreator("SERDD");

        Font fontbold = FontFactory.getFont("Cournier-bold", 10, Font.BOLD);
        Font fontCuerpo = FontFactory.getFont("Cournier",9);
        Font fontLMS = FontFactory.getFont("Cournier",7);
        Font fontSmall = FontFactory.getFont("Cournier",5);


        PdfPTable tablaInicial = new PdfPTable(6);
        tablaInicial.setWidthPercentage(100);
        tablaInicial.setSpacingBefore(5);
        tablaInicial.setSpacingAfter(5);
        PdfPCell celdaInicial = new PdfPCell();
        celdaInicial.setPadding(5);
        celdaInicial.setBorderColor(BaseColor.LIGHT_GRAY);


        doc.open();
        PdfPTable tabla = new PdfPTable(tablaInicial);
        PdfPCell celda = new PdfPCell( celdaInicial  );
        celda.setPhrase(new Phrase("Folio: "+r.oficio.folio, fontbold));
        celda.setColspan(3);
        celda.setHorizontalAlignment(Element.ALIGN_LEFT);
        celda.setBackgroundColor(BaseColor.LIGHT_GRAY);
        celda.setBorder(Rectangle.NO_BORDER);
        tabla.addCell(celda);

        celda = new PdfPCell( new Phrase("Datos de identidad", fontbold)  );
        celda.setPadding(5);
        celda.setColspan(3);
        celda.setHorizontalAlignment(Element.ALIGN_RIGHT);
        celda.setBackgroundColor(BaseColor.LIGHT_GRAY);
        celda.setBorder(Rectangle.NO_BORDER);
        tabla.addCell(celda);

        doc.add(tabla);

        PdfPTable tabla2= new PdfPTable(tablaInicial);
        celda = new PdfPCell( celdaInicial);
        celda.setHorizontalAlignment(Element.ALIGN_LEFT);
        celda.setPhrase( new Phrase("Título del recurso: ", fontCuerpo)  );
        celda.setColspan(2);
        tabla2.addCell(celda);
        celda.setPhrase(new Phrase(r.titulo, fontCuerpo) );
        celda.setColspan(4);
        tabla2.addCell(celda);

        celda.setPhrase(new Phrase("Área del conocimiento: ", fontCuerpo)  );
        celda.setColspan(2);
        tabla2.addCell(celda);
        celda.setPhrase( new Phrase(r.areaconocimiento.descripcion, fontCuerpo)  );
        celda.setColspan(4);
        tabla2.addCell(celda);

        celda.setPhrase(new Phrase("Nivel: ", fontCuerpo)  );
        celda.setColspan(2);
        tabla2.addCell(celda);
        celda.setPhrase(new Phrase(r.niveleducativo.descripcion, fontCuerpo)  );
        celda.setColspan(4);
        tabla2.addCell(celda);

        celda.setPhrase(new Phrase("Unidad académica: ", fontCuerpo)  );
        celda.setColspan(2);
        tabla2.addCell(celda);
        celda.setPhrase(new Phrase(r.unidadacademica.nombre, fontCuerpo)  );
        celda.setColspan(4);
        tabla2.addCell(celda);

        celda.setPhrase( new Phrase("Programa académico: ", fontCuerpo)  );
        celda.setColspan(2);	tabla.addCell(celda);
        celda.setPhrase( new Phrase(r.programaacad, fontCuerpo)  );
        celda.setColspan(4);
        tabla2.addCell(celda);


        doc.add(tabla2);

        PdfPTable tabla3 = new PdfPTable(tablaInicial);
        celda = new PdfPCell( celdaInicial);
        celda.setPhrase( new Phrase("Modalidad en la cual se usará: ", fontCuerpo)  );
        celda.setColspan(2);
        tabla3.addCell(celda);

        //Subtabla de Modalidad
        PdfPTable tablaModalidad = new PdfPTable( modalidades.size()*3  );

        celda = new PdfPCell(celdaInicial);
        for (Modalidad m : modalidades){
            celda.setPhrase(new Phrase(m.descripcion, fontCuerpo));

            celda.setColspan(2);
            tablaModalidad.addCell(celda);
            celda.setHorizontalAlignment(Element.ALIGN_CENTER);
            if (m.id == r.modalidad.id){
                celda.setPhrase(new Phrase("X", fontCuerpo));
            } else {
                celda.setPhrase(new Phrase(" ", fontCuerpo));
            }
            celda.setColspan(1);
            tablaModalidad.addCell(celda);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
        }

        //PdfPCell cmod = new PdfPCell (tablaModalidad);
        //cmod.setPadding(0);
        //cmod.setColspan(4);
        //tabla3.addCell(cmod);
        //doc.add(tabla3);

        PdfPTable tablaDir = new PdfPTable(tablaInicial);
        celda = new PdfPCell(celdaInicial);

        celda.setPhrase( new Phrase("Dirigido a:", fontCuerpo)  );
        celda.setColspan(2);
        tablaDir.addCell(celda);

        //Subtabla Dirigido a
        /*
        PdfPTable tablaDirigidoa = new PdfPTable( dirigidoa.size()*3  );
        celda = new PdfPCell(celdaInicial);
        for (Dirigidoa d : dirigidoa){
            celda.setPhrase(new Phrase(d.descripcion, fontCuerpo));

            celda.setColspan(2);
            tablaDirigidoa.addCell(celda);
            celda.setHorizontalAlignment(Element.ALIGN_CENTER);
            if ( rdir.contains(d.id) ){
                celda.setPhrase(new Phrase("X", fontCuerpo));
            } else {
                celda.setPhrase(new Phrase(" ", fontCuerpo));
            }
            celda.setColspan(1);
            tablaDirigidoa.addCell(celda);

            celda.setHorizontalAlignment(Element.ALIGN_LEFT);

        }

        //Duración en .....

        UnidadMedida tipoD = UnidadMedida.find.setId(r.unidadmedida.id).findUnique();
        String um = tipoD==null?"unidad de medida no definida":tipoD.descripcion.toLowerCase();

        PdfPCell xy = new PdfPCell (tablaDirigidoa);
        xy.setPadding(0);
        xy.setColspan(4);
        tablaDir.addCell(xy);
        doc.add(tablaDir);
*/
        PdfPTable tabla4 = new PdfPTable(tablaInicial);
        celda = new PdfPCell(celdaInicial);
        //celda.setPhrase( new Phrase("Duración en "+um+":", fontCuerpo)  );
        celda.setColspan(2);
        tabla4.addCell(celda);
        //celda.setPhrase(new Phrase(r.duracion, fontCuerpo)  );
        celda.setColspan(4);
        tabla4.addCell(celda);


        celda.setPhrase(new Phrase("Fecha de elaboración del recurso:", fontCuerpo)  );
        celda.setColspan(2);
        tabla4.addCell(celda);
        Calendar cal = Calendar.getInstance();
        cal.setTime(r.elaboracion);
        celda.setPhrase( new Phrase(   cal.get(Calendar.DAY_OF_WEEK)+ "/"+cal.get(Calendar.MONTH)+"/"+(cal.get(Calendar.YEAR)), fontCuerpo )  );
//		celda.setPhrase( new Phrase(   r.elaboracion.getDay()+ "/"+r.elaboracion.getMonth()+"/"+(r.elaboracion.getYear()+1900), fontCuerpo )  );
        celda.setColspan(4);
        tabla4.addCell(celda);
        doc.add(tabla4);


        PdfPTable tabla5 = new PdfPTable(tablaInicial);
        celda = celdaInicial;
        celda.setPhrase(new Phrase("Autores:", fontCuerpo)  );
        celda.setColspan(2);
        tabla5.addCell(celda);


        // Subtabla de autores
        PdfPTable tablaAutores = new PdfPTable(4);
        for (RecursoAutor a : r.autores){
            celda.setPhrase(new Phrase(a.nombreCompleto(), fontCuerpo));
            celda.setColspan(2);
            tablaAutores.addCell(celda);
            celda.setPhrase(new Phrase(a.autorfuncion.descripcion, fontCuerpo));
            celda.setColspan(2);
            tablaAutores.addCell(celda);
        }
        PdfPCell c2 = new PdfPCell (tablaAutores);
        c2.setPadding(0);
        c2.setColspan(4);
        tabla5.addCell(c2);

        doc.add(tabla5);

        PdfPTable tabla6 = new PdfPTable(tablaInicial);
        celda = new PdfPCell(celdaInicial);
        celda.setPhrase( new Phrase("Versión:", fontCuerpo)  );
        celda.setColspan(2);
        tabla6.addCell(celda);

        //Subtabla de versiones
        PdfPTable tablaVersiones = new PdfPTable( versiones.size()*3   );
        for (Version v : versiones){
            PdfPCell c = new PdfPCell(celdaInicial);
            c.setPhrase(new Phrase(v.descripcion, fontCuerpo));
            c.setColspan(2);
            tablaVersiones.addCell(c);
            if (r.version.id == v.id){
                c.setPhrase(new Phrase("X", fontCuerpo));
            } else {
                c.setPhrase(new Phrase(" ", fontCuerpo));
            }
            c.setColspan(1);
            c.setHorizontalAlignment(Element.ALIGN_CENTER);
            tablaVersiones.addCell(c);
            c.setHorizontalAlignment(Element.ALIGN_LEFT);
        }
        PdfPCell cv = new PdfPCell(tablaVersiones);
        cv.setPadding(0);
        cv.setColspan(4);
        tabla6.addCell(cv);
        doc.add(tabla6);

        PdfPTable tabla7 = new PdfPTable( tablaInicial  );
        celda = new PdfPCell( celdaInicial);
        celda.setPhrase( new Phrase("Formato de entrega: ", fontCuerpo)  );
        celda.setColspan(2);
        tabla7.addCell(celda);

        //Subtabla de formato de entrega
        PdfPTable tablaFe = new PdfPTable( 6  );
        for (Formatoentrega f : fe){
            celda = new PdfPCell(celdaInicial);
            celda.setPhrase(new Phrase(f.descripcion, fontCuerpo));
            celda.setColspan(1);
            tablaFe.addCell(celda);
            if (f.id == r.formatoentrega.id){
                celda.setPhrase(new Phrase("X", fontCuerpo));
                celda.setHorizontalAlignment(Element.ALIGN_CENTER);
            } else {
                celda.setPhrase(new Phrase("  ", fontCuerpo));
            }

            celda.setColspan(1);
            tablaFe.addCell(celda);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
        }

        //tablaFe.completeRow();

        celda = new PdfPCell(celdaInicial);
        // Por si se encuentra en una url en línea
        celda.setPhrase(new Phrase("Internet/LMS", fontLMS));
        celda.setColspan(1);
        tablaFe.addCell(celda);
        celda = new PdfPCell(celdaInicial);


        if (r.url.isEmpty()){
            celda.setPhrase(new Phrase("   ", fontCuerpo));
        } else {
            celda.setPhrase(new Phrase(" X "+r.url, fontCuerpo));
        }
        celda.setColspan(5);
        tablaFe.addCell(celda);
        tablaFe.completeRow();

        PdfPCell cfe = new PdfPCell (tablaFe);
        cfe.setPadding(0);
        cfe.setColspan(4);
        tabla7.addCell(cfe);
        tabla7.completeRow();

        doc.add(tabla7);

        PdfPTable tabla8 = new PdfPTable(tablaInicial);
        celda = new PdfPCell(celdaInicial);
        celda.setPhrase( new Phrase("Clasificacion: ", fontCuerpo)  );
        celda.setColspan(2);
        tabla8.addCell(celda);

        if (r.clasificacion.tiporecurso != null){
            celda.setPhrase(new Phrase(r.clasificacion.criterio1.descripcion+" / "+r.clasificacion.criterio2.descripcion, fontCuerpo)  );
        } else {
            celda.setPhrase(new Phrase("", fontCuerpo)  );
        }
        celda.setColspan(4);
        tabla8.addCell(celda);


        doc.add(tabla8);



//   doc.newPage();

        //Subtabla de aspectos y calificaciones


        for (Recursoevaluador reev : re){
            PdfPTable tabla9 = new PdfPTable( tablaInicial );
            //tabla9.setWidthPercentage(100);
            PdfPTable tablaRE = new PdfPTable( 12  );

            tablaRE.setWidthPercentage(100);
            celda = new PdfPCell(celdaInicial);

            //PdfPTable tablaCalif = new PdfPTable(tablaInicial);


            celda.setPhrase(new Phrase("Aspecto "+reev.aspecto.descripcion, fontbold)  );
            celda.setPadding(5);
            celda.setHorizontalAlignment(Element.ALIGN_RIGHT);
            celda.setBackgroundColor(BaseColor.LIGHT_GRAY);
            celda.setBorderColor(BaseColor.LIGHT_GRAY);
            celda.setColspan(12);
            tablaRE.addCell(celda);

            celda.setPhrase( new Phrase(""));
            celda.setColspan(3);
            celda.setBackgroundColor(null);
            celda.setBorderColor(BaseColor.WHITE);
            tablaRE.addCell(celda);

            celda.setColspan(3);
            celda.setPhrase(new Phrase("Porcentaje máximo: ", fontCuerpo));
            tablaRE.addCell(celda);

            celda.setPhrase( new Phrase( (100/aspectos.size()+"%"), fontCuerpo  )  );
            celda.setColspan(3);
            tablaRE.addCell(celda);

            celda.setPhrase( new Phrase(""));
            celda.setColspan(3);
            tablaRE.addCell(celda);



            celda.setPhrase( new Phrase(""));
            celda.setColspan(3);
            celda.setBackgroundColor(null);
            tablaRE.addCell(celda);

            celda.setColspan(3);
            celda.setPhrase(new Phrase("Porcentaje obtenido: ", fontCuerpo));
            tablaRE.addCell(celda);

            //celda.setPhrase( new Phrase( reev.calificacionPorcentajeAspectos().toString()+"%"  , fontCuerpo  )  );
            celda.setPhrase( new Phrase( reev.recurso.calificacionesAspectos.stream().filter(f-> Objects.equals(f.aspecto.id, reev.aspecto.id)).collect(Collectors.toList()).get(0).calificacion+"%"  , fontCuerpo  )  );
            celda.setColspan(3);
            tablaRE.addCell(celda);

            celda.setPhrase( new Phrase(""));
            celda.setColspan(3);
            tablaRE.addCell(celda);

            celda = new PdfPCell(celdaInicial);
            celda.setColspan(12);

            celda.addElement(tablaRE);
            tabla9.addCell(celda);
            celda = new PdfPCell(celdaInicial);
            doc.add(tabla9);
        }

        //total

        PdfPTable tabla10 = new PdfPTable( 12  );
        tabla10.setWidthPercentage(100);

        celda = new PdfPCell(celdaInicial);
        celda.setPhrase(new Phrase("Total", fontbold));
        celda.setHorizontalAlignment(Element.ALIGN_RIGHT);
        celda.setBackgroundColor(BaseColor.LIGHT_GRAY);
        celda.setBorderColor(BaseColor.LIGHT_GRAY);
        celda.setColspan(12);
        tabla10.addCell(celda);


        celda.setPhrase( new Phrase(""));
        celda.setColspan(3);
        celda.setBackgroundColor(null);
        tabla10.addCell(celda);


        celda.setPhrase( new Phrase(""));
        celda.setColspan(3);
        tabla10.addCell(celda);


        celda.setColspan(3);
        //celda.setPhrase(new Phrase( r.calificacionPorcentajeGral()+"%" , fontCuerpo));
        celda.setPhrase(new Phrase( r.calificacion.calificacion+"%" , fontCuerpo));
        tabla10.addCell(celda);

        celda.setPhrase( new Phrase(""));
        celda.setColspan(3);
        tabla10.addCell(celda);
        doc.add(tabla10);


        PdfPTable tabla11 = new PdfPTable(tablaInicial);
        celda = new PdfPCell(celdaInicial);

        celda.setPhrase(new Phrase("Evaluadores asignados", fontbold)  );
        celda.setPadding(10);
        celda.setHorizontalAlignment(Element.ALIGN_RIGHT);
        celda.setBackgroundColor(BaseColor.LIGHT_GRAY);
        celda.setBorderColor(BaseColor.LIGHT_GRAY);
        celda.setColspan(6);
        tabla11.addCell(celda);


        //Tabla de Evaluadores
        System.out.println("emisor: "+emisor);
        if(emisor.compareTo("admin") == 0){
            System.out.println("admin");
            celda.setPhrase(new Phrase("Aspecto", fontbold)  );
            celda.setPadding(10);
            celda.setHorizontalAlignment(Element.ALIGN_CENTER);
            celda.setBackgroundColor(null);
            celda.setBorderColor(BaseColor.LIGHT_GRAY);
            celda.setColspan(2);
            tabla11.addCell(celda);
            celda.setPhrase(new Phrase("Nombre", fontbold)  );
            celda.setColspan(2);
            tabla11.addCell(celda);
            celda.setPhrase(new Phrase("Firma", fontbold)  );
            celda.setColspan(2);
            tabla11.addCell(celda);
            PdfPCell celdaF = new PdfPCell(celdaInicial);

            for (Recursoevaluador eva : re ){
                celda.setPhrase(new Phrase(eva.aspecto.descripcion, fontCuerpo)  );
                celda.setColspan(2);
                tabla11.addCell(celda);
                celda.setPhrase(new Phrase(eva.evaluador.personal.nombreCompleto(), fontCuerpo)  );
                celda.setColspan(2);

//                celda.setFixedHeight(210f);
//                celda.setPadding(3f);
                celda.setHorizontalAlignment(Element.ALIGN_CENTER);
                celda.setVerticalAlignment(Element.ALIGN_MIDDLE);

                tabla11.addCell(celda);




                celda.setPhrase(new Phrase("", fontCuerpo)  );
                celda.setColspan(2);


                /* Imágenes de firmas*/
                EvaluadorFirma f = eva.evaluador.firma;
                if (f!=null) {
                    Image firma = Image.getInstance(f.contenido);
                    firma.scaleToFit(50, 50);
                    firma.scaleAbsolute(50,50);
                    firma.setAlignment(Element.ALIGN_CENTER);
                    // Se agrega la imágen a la celda
                    celda.setHorizontalAlignment(Element.ALIGN_CENTER);
                    celda.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    celda.addElement(firma);





                }
                    // Se agrega la celda a la tabla
                    tabla11.addCell(celda);
            }
        } else {
            System.out.println("otro");
            celda.setPhrase(new Phrase("Aspecto", fontbold)  );
            celda.setPadding(10);
            celda.setHorizontalAlignment(Element.ALIGN_CENTER);
            celda.setBackgroundColor(null);
            celda.setBorderColor(BaseColor.LIGHT_GRAY);
            celda.setColspan(3);
            tabla11.addCell(celda);
            celda.setPhrase(new Phrase("Nombre", fontbold)  );
            celda.setColspan(3);
            tabla11.addCell(celda);
            for (Recursoevaluador eva : re ){
                celda.setPhrase(new Phrase(eva.aspecto.descripcion, fontCuerpo)  );
                celda.setColspan(3);
                tabla11.addCell(celda);
                celda.setPhrase(new Phrase(eva.evaluador.personal.nombreCompleto(), fontCuerpo)  );
                celda.setColspan(3);
                tabla11.addCell(celda);
            }
        }
        doc.add(tabla11);

        PdfPTable tabla12 = new PdfPTable(tablaInicial);
        celda = new PdfPCell(celdaInicial);

        celda.setPhrase(new Phrase("Resultado", fontbold)  );
        celda.setPadding(10);
        celda.setHorizontalAlignment(Element.ALIGN_RIGHT);
        celda.setBackgroundColor(BaseColor.LIGHT_GRAY);
        celda.setBorderColor(BaseColor.LIGHT_GRAY);


        celda.setColspan(6);
        tabla12.addCell(celda);
        /*
        //celda.setPhrase(new Phrase("Clave de registro DEV", fontCuerpo)  );
        celda.setPadding(10);
        celda.setHorizontalAlignment(Element.ALIGN_CENTER);
        celda.setBackgroundColor(null);
        celda.setBorderColor(BaseColor.LIGHT_GRAY);
        celda.setColspan(3);
        tabla12.addCell(celda);

        //celda.setPhrase(new Phrase(r.numcontrol, fontCuerpo)  );
        celda.setColspan(3);
        tabla12.addCell(celda);
*/
        celda.setHorizontalAlignment(Element.ALIGN_CENTER);
        celda.setBackgroundColor(null);
        celda.setBorderColor(BaseColor.LIGHT_GRAY);
        celda.setPhrase(new Phrase("Resultado", fontbold)  );
        celda.setColspan(2);
        tabla12.addCell(celda);

        celda.setPhrase(new Phrase(r.calificacionLetraGral(), fontbold)  );
        celda.setColspan(4);
        tabla12.addCell(celda);



        doc.add(tabla12);

        //TAbla observaciones generales
        PdfPTable tabla13 = new PdfPTable(tablaInicial);
        celda = new PdfPCell(celdaInicial);
        celda.setPhrase(new Phrase("Comentarios", fontbold)  );
        celda.setPadding(10);
        celda.setHorizontalAlignment(Element.ALIGN_RIGHT);
        celda.setBackgroundColor(BaseColor.LIGHT_GRAY);
        celda.setBorderColor(BaseColor.LIGHT_GRAY);
        celda.setColspan(12);
        tabla13.addCell(celda);
//doc.add(tabla13);

        for (Recursoevaluador reev : re){
            celda.setPhrase(new Phrase("Aspecto "+reev.aspecto.descripcion, fontCuerpo)  );
            celda.setPadding(5);
            celda.setHorizontalAlignment(Element.ALIGN_RIGHT);
            celda.setBackgroundColor(null);
            celda.setBorderColor(BaseColor.LIGHT_GRAY);
            celda.setColspan(2);
            tabla13.addCell(celda);
            String obEvaluacion ="";
            if(reev.observacionEvaluacion!=null)
                obEvaluacion = reev.observacionEvaluacion.observacion;
            celda.setPhrase( new Phrase(obEvaluacion, fontCuerpo));
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setColspan(10);
            celda.setBackgroundColor(null);
            celda.setBorderColor(BaseColor.LIGHT_GRAY);
            tabla13.addCell(celda);

        }


        doc.add(tabla13);
        doc.close();

        docWriter.close();


        // Aqui termina
        response().setContentType("application/pdf");
        return ok (  mipdf.baos.toByteArray() );


    }


    public static Result pruebaCorreo() throws Exception{
        System.out.println("****************************************************************************************************");
        miCorreo mc2 = new miCorreo();
        mc2.asunto = "abcdef";
        mc2.mensaje= "12345";
        List<String> listaD = new ArrayList<>();
        listaD.add("epuente_72@yahoo.com");
        //listaD.add("aperezg@ipn.mx");

        mc2.para = listaD;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        miPdf mipdf = new miPdf(1L);
        //  mipdf.id = 1L;
        mipdf.baos = outputStream;
        mipdf.generarReporteFinal("otro");

        //mc2.adjuntos = Collections.singletonList(mipdf.baos);
        //mc2.nombresAdjuntos = Collections.singletonList("Oficio X ");

        mc2.enviar();
        return ok ("Se envió");
    }



    @Transactional
    @play.db.ebean.Transactional
    private static void reasignarEvaluador(Long idRE, String propuesto){
        System.out.println("desde reasignarEvaluador "+idRE+" "+propuesto);
        Recursoevaluador registro = Recursoevaluador.find.byId(idRE);
        Recursoevaluador nuevo = new Recursoevaluador();
        nuevo.recurso =   Recurso.find.byId(registro.recurso.id);
        nuevo.evaluador = Evaluador.find.byId( Long.parseLong(propuesto) );
        nuevo.aspecto = Aspecto.find.byId(registro.aspecto.id);
        nuevo.estadoevaluacion = EstadoEvaluacion.find.byId(1L);
        nuevo.save();
        List<HistorialestadoEvaluacion> h = HistorialestadoEvaluacion.find.where().eq("recurso.id", registro.recurso.id).eq("recursoevaluador.id", registro.id).findList();
        if (h !=null)
            h.forEach(Model::delete);
        registro.delete();
    }


    public static Result evaluada(Long idRe, String idAspecto){
        if (idAspecto.isEmpty() || idAspecto.contentEquals("0")){
            System.out.println("............  cero");
            List<Recursoevaluador> t = Recursoevaluador.find.where().eq("recurso.id", idRe).findList();
            return ok ( evaluada.render(t, idAspecto, t.get(0).recurso )  );
        } else {
            System.out.println("............  NO cero");
            List<Recursoevaluador> aux = Recursoevaluador.find.where().eq("id",idRe).findList();
            return ok ( evaluada.render(aux, idAspecto, aux.get(0).recurso)  );
        }
    }


    public static Result evaluadas(Long idRecurso, String tipo){
        Recurso r = Recurso.find.byId(idRecurso);
        return ok ( evaluada.render( r.recursoevaluadores, tipo, r)  );
    }


    public static Boolean concluida(){
        System.out.println('x');
        return (true);
    }



    public static Result pruebaOficioValoracion(){
        System.out.println("Desde REcursoevaluadorController.pruebaOficioValoracion");
        ByteArrayOutputStream baosPDF = new ByteArrayOutputStream();
        long id =24;
        miPdf mipdf = new miPdf(id);
        mipdf.baos = baosPDF;

        String emisor="formatoOV";

        // Aqui se pone el código de miPdf.generarReporteFinal
        System.out.println("Generando PDF(prueba) ...");
        System.out.println("...   "+mipdf.id);

        Recurso r = Recurso.find.byId(id);
        mipdf.setClaveControl(r.numcontrol);

        List<Version> versiones = Version.lista();
        List<Formatoentrega> fe = Formatoentrega.lista();
        List<Modalidad> modalidades = Modalidad.find.all();
        List<Dirigidoa> dirigidoa = Dirigidoa.find.all();
        ArrayList<Long> rdir = new ArrayList<>();
        recursoDirigidoa.find.where().eq("recurso.id", mipdf.id).findList().forEach(z -> {
            //rdir.add(z.id);
            rdir.add(z.dirigidoa.id);
        });

        List<Aspecto> aspectos = Aspecto.find.all();
        List<Recursoevaluador> re = r.recursoevaluadores;
        Document doc = new Document(PageSize.LETTER, 40,40,90,40);
        PdfWriter docWriter;
        try {
            docWriter = PdfWriter.getInstance(doc, mipdf.baos);
        } catch (DocumentException e) {
            throw new RuntimeException(e);
        }

        //Encabezado del reporte pdf
        MyFooter auxPie = new MyFooter();
        auxPie.emisor = emisor;
        auxPie.titulo = "Reporte de Evaluación Técnico Pedagógica";
        docWriter.setPageEvent(auxPie);

        doc.addTitle("Reporte de Evaluación Técnico Pedagógica");
        doc.addCreationDate();
        doc.addCreator("SERDD");

        Font fontbold = FontFactory.getFont("Cournier-bold", 10, Font.BOLD);
        Font fontCuerpo = FontFactory.getFont("Cournier",9);
        Font fontLMS = FontFactory.getFont("Cournier",7);

        PdfPTable tablaInicial = new PdfPTable(6);
        tablaInicial.setWidthPercentage(100);
        tablaInicial.setSpacingBefore(5);
        tablaInicial.setSpacingAfter(5);
        PdfPCell celdaInicial = new PdfPCell();
        celdaInicial.setPadding(5);
        celdaInicial.setBorderColor(BaseColor.LIGHT_GRAY);


        doc.open();
        PdfPTable tabla = new PdfPTable(tablaInicial);
        PdfPCell celda = new PdfPCell( celdaInicial  );
        celda.setPhrase(new Phrase("Folio: "+r.oficio.folio, fontbold));
        celda.setColspan(3);
        celda.setHorizontalAlignment(Element.ALIGN_LEFT);
        celda.setBackgroundColor(BaseColor.LIGHT_GRAY);
        celda.setBorder(Rectangle.NO_BORDER);
        tabla.addCell(celda);

        celda = new PdfPCell( new Phrase("Datos de identidad", fontbold)  );
        celda.setPadding(5);
        celda.setColspan(3);
        celda.setHorizontalAlignment(Element.ALIGN_RIGHT);
        celda.setBackgroundColor(BaseColor.LIGHT_GRAY);
        celda.setBorder(Rectangle.NO_BORDER);
        tabla.addCell(celda);

        try {
            doc.add(tabla);
        } catch (DocumentException e) {
            throw new RuntimeException(e);
        }


        doc.close();

        docWriter.close();


        // Aqui termina
        response().setContentType("application/pdf");
        return ok (  mipdf.baos.toByteArray() );

    }


    public static Result pruebaPDFImagen() throws DocumentException {
        System.out.println("Desde RecursoevaluadorController.pruebaPDFImage");
        SimpleDateFormat sdf = new SimpleDateFormat("d 'de' MMMM 'de' yyyy");

        ByteArrayOutputStream baosPDF = new ByteArrayOutputStream();
        long id =1;
        miPdf mipdf = new miPdf(id);
        mipdf.baos = baosPDF;

        String emisor="formatoOV";


        System.out.println("Generando PDF(prueba) ...");
        System.out.println("...   "+mipdf.id);

        Recurso r = Recurso.find.byId(id);

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

        Font fontboldTitulo = FontFactory.getFont("Cournier-bold", 14, Font.BOLD);
        Font fontbold = FontFactory.getFont("Cournier-bold", 12, Font.BOLD);
        Font fontCuerpo = FontFactory.getFont("Cournier",12);
        Font fontLMS = FontFactory.getFont("Cournier",7);

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


            doc.open();

            //doc.add(new Phrase("jajajaj"));

            PdfPTable tabla = new PdfPTable(tablaInicial);
            PdfPCell celda = new PdfPCell( celdaInicial  );
            // label folio (que en realidad es el número de oficio)
            celda.setPhrase(new Phrase("\nFolio", fontbold));
            //celda.add(new Phrase(r.oficio.folio, fontCuerpo));
            celda.setColspan(3);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            //celda.setBackgroundColor(BaseColor.LIGHT_GRAY);
            celda.setBorder(Rectangle.NO_BORDER);
            tabla.addCell(celda);



            celda = new PdfPCell( new Phrase(ovf.encabezado, fontboldTitulo)  );
            celda.setPadding(5);
            celda.setColspan(3);
            celda.setHorizontalAlignment(Element.ALIGN_RIGHT);
            //celda.setBackgroundColor(BaseColor.LIGHT_GRAY);
            celda.setBorder(Rectangle.NO_BORDER);
            tabla.addCell(celda);

            doc.add(tabla);

            // folio (número de oficio)
            tabla = new PdfPTable(1);
            tabla.setWidthPercentage(100);
            celda = new PdfPCell(celdaInicial);
            //celda.setColspan(3);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPhrase( new Phrase(r.oficiovaloracion.numero));
            celda.setBorder(Rectangle.NO_BORDER);
            //celda.setBackgroundColor(BaseColor.LIGHT_GRAY);
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
            celda.setPhrase(new Phrase("Ciudad de México, "+ sdf.format(r.oficiovaloracion.fechaoficio)  , fontCuerpo));
            celda.setBorder(Rectangle.NO_BORDER);
            tabla.addCell(celda);
            doc.add(tabla);

            // Para
            tabla = new PdfPTable(1);
            tabla.setWidthPercentage(100);
            tabla.setSpacingBefore(10);
            celda = new PdfPCell(celdaInicial);

            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPhrase(new Phrase("[nombreDirector]\nDirector de "+r.unidadacademica.nombre+" del Instituto Politécnico Nacional\nPRESENTE"  , fontbold));
            celda.setBorder(Rectangle.NO_BORDER);
            tabla.addCell(celda);
            doc.add(tabla);

            // Cuerpo1
            String folioOficioSolicitud = r.oficio.folio;
            String folioOficioSolicitudRecibido = sdf.format(r.oficio.fecharecepcion);
            String stringAux = ovf.cuerpo1
                    .replace("[folio]", folioOficioSolicitud)
                    .replace("[fechaFolio]", folioOficioSolicitudRecibido);
            tabla = new PdfPTable(1);
            tabla.setWidthPercentage(100);
            tabla.setSpacingBefore(10);
            celda = new PdfPCell(celdaInicial);
            celda.setHorizontalAlignment(Element.ALIGN_RIGHT);
            celda.setPhrase(new Phrase(stringAux  , fontCuerpo));
            celda.setBorder(Rectangle.NO_BORDER);
            tabla.addCell(celda);
            doc.add(tabla);

            // tabla
            String ua = "";
            String titulo = r.titulo;
            String autores = "";

            List<String> lstAutores = r.autores.stream().map(RecursoAutor::nombreCompleto).collect(Collectors.toList());

            autores = String.join(", ", lstAutores);
            tabla = new PdfPTable(2);
            tabla.setWidths(new int[]{80,200});
            tabla.setWidthPercentage(100);
            //tabla.setSpacingBefore(2);
            // tabla rdd
            celda = new PdfPCell(celdaInicial);
            celda.setPaddingLeft(6f);
            celda.setMinimumHeight(20f);
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
            celda.setPaddingLeft(6f); celda.setMinimumHeight(20f);
            celda.setPhrase(new Phrase(autores  , fontCuerpo));
            tabla.addCell(celda);

            // tabla UR
            celda = new PdfPCell(celdaInicial);
            celda.setPaddingLeft(6f);
            celda.setMinimumHeight(20f);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPhrase(new Phrase("Unidad académica"  , fontbold));
            tabla.addCell(celda);
            celda = new PdfPCell(celdaInicial);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPaddingLeft(6f); celda.setMinimumHeight(20f);
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


            // cuerpo2   (resultado de la evaluación)
            String evaluacion = r.calificacionLetraGral();
            String aux2 = ovf.cuerpo2
                    .replace("[evaluación]", evaluacion);
            tabla = new PdfPTable(1);
            tabla.setWidthPercentage(100);
            tabla.setSpacingBefore(10);
            celda = new PdfPCell(celdaInicial);
            celda.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
            celda.setPhrase(new Phrase( aux2  , fontCuerpo));
            celda.setBorder(Rectangle.NO_BORDER);
            tabla.addCell(celda);
            doc.add(tabla);

            // alojado (tiene url)
            if (r.url!=null && !r.url.isEmpty()) {
                // ¿requiere user/pass?
                boolean usaCuenta = !r.recursosenweb.isEmpty();
                String x = ovf.cuerpo3
                        .replace("[enlaces]", r.url);
                tabla = new PdfPTable(1);
                tabla.setWidthPercentage(100);
                tabla.setSpacingBefore(10);
                celda = new PdfPCell(celdaInicial);
                celda.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
                celda.setPhrase(new Phrase(x, fontCuerpo));
                celda.setBorder(Rectangle.NO_BORDER);
                tabla.addCell(celda);
                doc.add(tabla);
                if (usaCuenta){
                    tabla = new PdfPTable(1);
                    tabla.setWidthPercentage(100);
                    tabla.setSpacingBefore(10);
                    celda = new PdfPCell(celdaInicial);
                    celda.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
                    celda.setPhrase(new Phrase("El acceso requiere de usuario y clave, mismas que se le haran llegar.", fontCuerpo));
                    celda.setBorder(Rectangle.NO_BORDER);
                    tabla.addCell(celda);
                    doc.add(tabla);
                }
            }

            // despedida
            if (ovf.despedida!=null){
                tabla = new PdfPTable(1);
                tabla.setWidthPercentage(100);
                tabla.setSpacingBefore(10);
                celda = new PdfPCell(celdaInicial);
                celda.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
                celda.setPhrase(new Phrase(ovf.despedida, fontCuerpo));
                celda.setBorder(Rectangle.NO_BORDER);
                tabla.addCell(celda);
                doc.add(tabla);
            }

            // despedida director dev
            tabla = new PdfPTable(1);
            tabla.setWidthPercentage(100);
            tabla.setSpacingBefore(10);
            celda = new PdfPCell(celdaInicial);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPhrase(new Phrase( "ATENTAMENTE\n\"La Técnica al servicio de la Patria\"\n"+"director de la dev\nDirector"  , fontbold));
            celda.setBorder(Rectangle.NO_BORDER);
            tabla.addCell(celda);
            doc.add(tabla);

            // c.c.p.
            tabla = new PdfPTable(2);
            tabla.setWidths(new int[]{10,200});
            tabla.setWidthPercentage(100);
            tabla.setSpacingBefore(10);
            celda = new PdfPCell(celdaInicial);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPhrase(new Phrase( "c.c.p. "  , fontLMS));
            celda.setBorder(Rectangle.NO_BORDER);
            tabla.addCell(celda);
            celda = new PdfPCell(celdaInicial);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPhrase(new Phrase( "[nombres].\nInteresado. "  , fontLMS));
            celda.setBorder(Rectangle.NO_BORDER);
            tabla.addCell(celda);
            doc.add(tabla);

            // folio recepción
            tabla = new PdfPTable(1);
            tabla.setWidthPercentage(100);
            tabla.setSpacingBefore(10);
            celda = new PdfPCell(celdaInicial);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPhrase(new Phrase( "Folio recepción: [folio recepción]"  , fontLMS));
            celda.setBorder(Rectangle.NO_BORDER);
            tabla.addCell(celda);
            doc.add(tabla);

            // CCD 2023
            tabla = new PdfPTable(1);
            tabla.setWidthPercentage(100);
            //tabla.setSpacingBefore(10);
            celda = new PdfPCell(celdaInicial);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPhrase(new Phrase( "CCD 2023: [¿?]"  , fontLMS));
            celda.setBorder(Rectangle.NO_BORDER);
            tabla.addCell(celda);
            doc.add(tabla);

        } catch (DocumentException e) {
            throw new RuntimeException(e);
        }
        doc.close();
        docWriter.close();

        // Aqui termina
        response().setContentType("application/pdf");
        System.out.println("generado");
        return ok (  mipdf.baos.toByteArray() );
    }


    private static boolean checkClass(String className) {
        try {
            Class.forName(className);
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    // version 5.4.1
    public static Result reporteEvaluacionWord() throws IOException {
        try (XWPFDocument doc = new XWPFDocument()) {

            System.out.println("POI Core version: " + org.apache.poi.Version.getVersion());
            System.out.println("Clase HeaderFooterPolicy disponible: " +
                    (checkClass("org.apache.poi.xwpf.usermodel.XWPFHeaderFooterPolicy") ? "SÍ" : "NO"));


            // Estilo para título
            XWPFParagraph titlePara = doc.createParagraph();
            titlePara.setAlignment(ParagraphAlignment.CENTER);

            XWPFRun titleRun = titlePara.createRun();
            titleRun.setText("Informe Anual 2023");
            titleRun.setColor("2F5496");
            titleRun.setFontSize(20);
            titleRun.setBold(true);

            // Párrafo normal con sangría
            XWPFParagraph normalPara = doc.createParagraph();
            normalPara.setIndentationLeft(400); // 400 twips = 0.25 pulgadas

            XWPFRun normalRun = normalPara.createRun();
            normalRun.setText("Este documento fue generado automáticamente usando Apache POI 5.4.1.");
            normalRun.setFontSize(12);

            // Tabla con bordes personalizados
            XWPFTable table = doc.createTable(4, 3);

            // Estilo de borde para la tabla
            table.setInsideHBorder(XWPFTable.XWPFBorderType.SINGLE, 4, 0, "000000");
            table.setInsideVBorder(XWPFTable.XWPFBorderType.SINGLE, 4, 0, "000000");
            //table.setBottomBorder(XWPFTable.XWPFBorderType.SINGLE, 8, 0, "2F5496");

            // Encabezados de tabla
            table.getRow(0).getCell(0).setText("Mes");
            table.getRow(0).getCell(1).setText("Ventas");
            table.getRow(0).getCell(2).setText("Crecimiento");

            // Datos de la tabla
            String[][] data = {
                    {"Enero", "$15,000", "5%"},
                    {"Febrero", "$18,500", "23%"},
                    {"Marzo", "$21,200", "15%"}
            };

            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[i].length; j++) {
                    table.getRow(i+1).getCell(j).setText(data[i][j]);
                }
            }

            // Guardar documento
            try (FileOutputStream out = new FileOutputStream("Informe_2023.docx")) {
                doc.write(out);
            }

            return ok ("Documento Word moderno creado con éxito (Informe_2023.docx)");
        }
    }


    public static Result conEncabezado() throws IOException, BadElementException {
        Image imgUPEV = null;

        imgUPEV = Image.getInstance(ReporteLogo.find.byId(1L).getContenido());

        byte[] x = ReporteLogo.find.byId(1L).getContenido();
        InputStream is = new ByteArrayInputStream(x);

        try (XWPFDocument doc = new XWPFDocument()) {

            // 2. Configurar la política de encabezados (IMPORTANTE para POI 5.4.1)
            CTSectPr sectPr = doc.getDocument().getBody().isSetSectPr() ?
                    doc.getDocument().getBody().getSectPr() :
                    doc.getDocument().getBody().addNewSectPr();
            XWPFHeaderFooterPolicy headerFooterPolicy = new XWPFHeaderFooterPolicy(doc, sectPr);

            // 3. Crear el encabezado DEFAULT
            XWPFHeader header = headerFooterPolicy.createHeader(XWPFHeaderFooterPolicy.DEFAULT);

            // 4. Crear párrafo en el encabezado
            XWPFParagraph headerParagraph = header.createParagraph();
            headerParagraph.setAlignment(ParagraphAlignment.RIGHT);

            // 5. Agregar texto al encabezado
            XWPFRun headerRun = headerParagraph.createRun();
            headerRun.setText("Mi Compañía - ");

            // 6. Agregar imagen al encabezado
            try (FileInputStream imageStream = new FileInputStream("/home/eduardo/Imágenes/logoDEVReporte.png")) {


                // Crear una tabla
                XWPFTable tabla = doc.createTable(1, 3);
                tabla.getRow(0).getCell(0).setText("Nombre");
                tabla.getRow(0).getCell(1).setText("Edad");
                tabla.getRow(0).getCell(2).setText("Juan");



                headerRun.addPicture(
                        is,
                         XWPFDocument.PICTURE_TYPE_PNG,
                        "logoDEVReporte.png",
                        //Units.toEMU(50),  // Ancho (50 puntos ≈ 1.76 cm)
                        //Units.toEMU(25)   // Alto (25 puntos ≈ 0.88 cm)
                        Units.pixelToEMU(58),
                        Units.pixelToEMU(52)
                );
            } catch (IOException e) {
                System.out.println("Excepción "+e.getMessage());
                throw new RuntimeException(e);
            } catch (InvalidFormatException e) {
                throw new RuntimeException(e);
            }

            // 7. Agregar contenido al cuerpo del documento
            XWPFParagraph bodyParagraph = doc.createParagraph();
            XWPFRun bodyRun = bodyParagraph.createRun();
            bodyRun.setText("Este documento demuestra cómo agregar imágenes a encabezados en POI 5.4.1");
            bodyRun.addBreak();

            bodyRun.addCarriageReturn();
            bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();
            bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();bodyRun.addCarriageReturn();

            bodyRun.setText("Funciona correctamente con la versión " +
                    org.apache.poi.Version.getVersion());

            // 8. Guardar el documento
            try (FileOutputStream out = new FileOutputStream("DocumentoConEncabezado.docx")) {
                doc.write(out);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            return ok("Documento creado exitosamente con POI " +
                    org.apache.poi.Version.getVersion());
        }
    }




    public static Result conEncabezadoTabla() throws IOException {
        try (XWPFDocument doc = new XWPFDocument()) {
            // 1. Configurar política de encabezados
            CTSectPr sectPr = doc.getDocument().getBody().isSetSectPr()
                    ? doc.getDocument().getBody().getSectPr()
                    : doc.getDocument().getBody().addNewSectPr();
            XWPFHeaderFooterPolicy policy = new XWPFHeaderFooterPolicy(doc, sectPr);

            // 2. Crear encabezado DEFAULT
            XWPFHeader header = policy.createHeader(XWPFHeaderFooterPolicy.DEFAULT);

            // 3. Crear tabla en el encabezado (1 fila, 3 columnas)
            XWPFTable table = header.createTable(1, 3);

            // 4. Configurar ancho de la tabla (100% del ancho de página)
            table.setWidth("100%");

            // 5. Configurar ancho de columnas
            // Columna 1: 30%
            //setColumnWidth(table, 0, "30%");
            // Columna 2: 40%
            //setColumnWidth(table, 1, "40%");
            // Columna 3: 30%
            //setColumnWidth(table, 2, "30%");

            // 6. Configurar contenido de las celdas
            // Celda 1: Logo
            XWPFTableCell cell1 = table.getRow(0).getCell(0);
            cell1.setVerticalAlignment(XWPFTableCell.XWPFVertAlign.CENTER);

            byte[] bLogoDEV = ReporteLogo.find.byId(1L).getContenido();
            InputStream isLogoDEV = new ByteArrayInputStream(bLogoDEV);

            byte[] bEscudoIPN = ReporteLogo.find.byId(2L).getContenido();
            InputStream isEscudoIPN = new ByteArrayInputStream(bEscudoIPN);
            try {


                XWPFParagraph p1 = cell1.addParagraph();
                p1.setAlignment(ParagraphAlignment.LEFT);
                XWPFRun r1 = p1.createRun();
                // Agrega aquí tu imagen si es necesario
                // r1.addPicture(...);

                r1.addPicture(
                        isEscudoIPN,
                        XWPFDocument.PICTURE_TYPE_JPEG,
                        "ipn-escudo.jpg",
                        Units.pixelToEMU(65),
                        Units.pixelToEMU(95)
                );


            } catch (Exception e) {
                e.printStackTrace();
            }

            // Celda 2: Título
            XWPFTableCell cell2 = table.getRow(0).getCell(1);
            cell2.setVerticalAlignment(XWPFTableCell.XWPFVertAlign.CENTER);
            XWPFParagraph p2 = cell2.addParagraph();
            p2.setAlignment(ParagraphAlignment.CENTER);
            XWPFRun r2 = p2.createRun();

            XWPFParagraph p1C2 = doc.createParagraph();

            p1C2.createRun().setText("INSTITUTO POLITÉCNICO NACIONAL");


            r2.setText("Reporte de Evaluación Técnico Pedagógica");
            r2.setBold(true);
            r2.setFontSize(14);

            // Celda 3: Fecha
            XWPFTableCell cell3 = table.getRow(0).getCell(2);
            cell3.setVerticalAlignment(XWPFTableCell.XWPFVertAlign.CENTER);
            XWPFParagraph p3 = cell3.addParagraph();
            p3.setAlignment(ParagraphAlignment.RIGHT);
            XWPFRun r3 = p3.createRun();
            //r3.setText("Fecha: " + java.time.LocalDate.now());
            //r3.setItalic(true);
            r3.addPicture(
                    isLogoDEV,
                    XWPFDocument.PICTURE_TYPE_PNG,
                    "logoDEVReporte.png",
                    Units.pixelToEMU(58),
                    Units.pixelToEMU(52)
            );

            // 7. Agregar contenido al cuerpo del documento
            XWPFParagraph bodyPara = doc.createParagraph();
            bodyPara.createRun().setText("Este es el contenido principal del documento.");
            bodyPara.createRun().addBreak();
            bodyPara.createRun().setText("El encabezado contiene una tabla de 3 columnas.");

            // 8. Guardar documento
            try (FileOutputStream out = new FileOutputStream("DocumentoConTablaEnEncabezadoJAJA.docx")) {
                doc.write(out);
                System.out.println("Documento creado exitosamente con tabla en el encabezado");
            }
        } catch (InvalidFormatException e) {
            throw new RuntimeException(e);
        }

        return ok("ok");
    }


    //Método auxiliar para configurar ancho de columnas
    private static void setColumnWidth(XWPFTable table, int colIndex, String width) {
        CTTblWidth tblWidth = CTTblWidth.Factory.newInstance();
        tblWidth.setType(STTblWidth.PCT);
        tblWidth.setW(new BigInteger("5000")); // Valor porcentual (5000 = 50%)

        if (width.endsWith("%")) {
            int percent = Integer.parseInt(width.substring(0, width.length() - 1));
            tblWidth.setW(BigInteger.valueOf(percent * 50)); // Conversión a unidades de Word
        }

        table.getCTTbl().getTblGrid().getGridColArray(colIndex).setW(tblWidth.getW());
    }


    public static Result imprimirEvaluacionGral(Long id) throws DocumentException {
        System.out.println("Desde RecursoevaluadorController.imprimirEvaluacionGral");
        ByteArrayOutputStream baosPDF = new ByteArrayOutputStream();
        JSONObject retorno = new JSONObject();
        System.out.println("id: "+id);
        miPdf mipdf = new miPdf(id);
        mipdf.baos = baosPDF;
        mipdf.generaImpresionEvaGral();
        response().setContentType("application/pdf");
        response().setHeader("Content-Disposition", "inline; filename=DetalleETPRDD_" + mipdf.getClaveControl()+".pdf");
        response().setHeader("Access-Control-Allow-Origin", "*");
        response().setHeader("Allow", "*");
        response().setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, DELETE, OPTIONS");
        response().setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept, Referer, User-Agent");
        return ok (  mipdf.baos.toByteArray() );
    }

}

