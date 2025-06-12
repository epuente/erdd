package classes;

import java.io.ByteArrayOutputStream;
import java.text.SimpleDateFormat;
import java.util.*;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.HyphenationAuto;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import models.*;
import models.Version;

import java.util.List;
import java.util.stream.Collectors;

public class miPdf {
	public Long id;
	private String numControl;
	public ByteArrayOutputStream baos;
	
	
	public miPdf(Long id) {
		this.id = id;
        Recurso r = Recurso.find.byId(this.id);
        if (r!= null && r.numcontrol!=null && !r.numcontrol.isEmpty())
		    this.numControl = Recurso.find.byId(this.id).numcontrol;
	}
	
	public String getClaveControl() {
		return numControl;
	}


	public void setClaveControl(String claveControl) {
		this.numControl = claveControl;
	}


	public void generarReporteFinal(String emisor) throws Exception {
        System.out.println("Generando PDF(reporte final)...");
        System.out.println("...   "+this.id);
		Recurso r = Recurso.find.byId(this.id);
		this.setClaveControl(r.numcontrol);
		
		List<Version> versiones = Version.lista();
		List<Formatoentrega> fe = Formatoentrega.lista();
		List<Modalidad> modalidades = Modalidad.find.all();
		List<Dirigidoa> dirigidoa = Dirigidoa.find.all();
		ArrayList<Long> rdir = new ArrayList<>();
		recursoDirigidoa.find.where().eq("recurso.id", this.id).findList().forEach(z -> {
			rdir.add(z.id);
		});
		List<Aspecto> aspectos = Aspecto.find.all();
		//List<Recursoevaluador> re = Recursoevaluador.find.where().eq("recurso.id", r.id).findList();
		List<Recursoevaluador> re = r.recursoevaluadores;
        Document doc = new Document(PageSize.LETTER, 40,40,90,40);
        PdfWriter docWriter;
        docWriter = PdfWriter.getInstance(doc, this.baos);

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

        PdfPCell cmod = new PdfPCell (tablaModalidad);
        cmod.setPadding(0);
        cmod.setColspan(4);
        tabla3.addCell(cmod);	  
        doc.add(tabla3);

		PdfPTable tablaDir = new PdfPTable(tablaInicial); 
		celda = new PdfPCell(celdaInicial);
				
        celda.setPhrase( new Phrase("Dirigido a:", fontCuerpo)  );
        celda.setColspan(2);	
        tablaDir.addCell(celda);
	    
	    //Subtabla Dirigido a
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
        PdfPCell xy = new PdfPCell (tablaDirigidoa);
        xy.setPadding(0);
        xy.setColspan(4);
        tablaDir.addCell(xy);	  
        doc.add(tablaDir);

			PdfPTable tabla4 = new PdfPTable(tablaInicial);
			celda = new PdfPCell(celdaInicial);
	        celda.setPhrase( new Phrase("Duración en horas:", fontCuerpo)  );
        celda.setColspan(2);
        tabla4.addCell(celda);
        celda.setPhrase(new Phrase(r.duracion, fontCuerpo)  );
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
	        for (Recursoevaluador eva : re ){
		        celda.setPhrase(new Phrase(eva.aspecto.descripcion, fontCuerpo)  );
		        celda.setColspan(2);		        
		        tabla11.addCell(celda);
		        celda.setPhrase(new Phrase(eva.evaluador.personal.nombreCompleto(), fontCuerpo)  );
		        celda.setColspan(2);
		        tabla11.addCell(celda);
		        celda.setPhrase(new Phrase("", fontCuerpo)  );
		        celda.setColspan(2);		        
		        tabla11.addCell(celda);

                /* Imágenes de firmas*/
                /*
                String url =  "http://148.204.111.41:8089/reporte/verFirma/1";
                Image firma = null;
                firma = Image.getInstance(url);

                 */

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
    
        celda.setPhrase(new Phrase("Clave de registro DEV", fontCuerpo)  );
        celda.setPadding(10);
        celda.setHorizontalAlignment(Element.ALIGN_CENTER);
        celda.setBackgroundColor(null); 
        celda.setBorderColor(BaseColor.LIGHT_GRAY);
        celda.setColspan(3);		        
        tabla12.addCell(celda);	        
        
        celda.setPhrase(new Phrase(r.numcontrol, fontCuerpo)  );
        celda.setColspan(3);
        tabla12.addCell(celda);
        
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
    }
	
	
	public void generarSolicitudEvaluacion() throws DocumentException{
		System.out.println("Generando PDF   (solicitud de evaluación)...");
    	Recurso r = Recurso.find.byId(this.id);

        
        Document doc = new Document(PageSize.LETTER, 40,40,90,40);
        PdfWriter docWriter;
        docWriter = PdfWriter.getInstance(doc, this.baos);
        
        MyFooter auxPie = new MyFooter();
        auxPie.titulo = "Cédula de Solicitud de Evaluación Técnico-Pedagógica\nde Recurso Didáctico Digital (CESOE)";        
        docWriter.setPageEvent(auxPie);
        
        doc.addTitle("Solicitud ERDD");
        doc.addCreationDate();
        doc.addCreator("SERDD");
        doc.open();

       // Font fontbold = FontFactory.getFont("Cournier-bold", 10, Font.BOLD);
        Font fontCuerpo = FontFactory.getFont("Cournier",9);	        
	        
	        
	        
	        PdfPTable tabla = new PdfPTable(6);
	        tabla.setWidthPercentage(100);
	        tabla.setSpacingBefore(20);
	        
	        PdfPCell celda = new PdfPCell( new Phrase("Datos de identidad")  );
	        celda.setPadding(6);	
	        
	        celda.setColspan(6);  
	        celda.setHorizontalAlignment(Element.ALIGN_RIGHT);
	        celda.setBackgroundColor(BaseColor.LIGHT_GRAY); celda.setBorderColor(BaseColor.LIGHT_GRAY);
	        tabla.addCell(celda);
	        //cellt1.setBorder(Rectangle.NO_BORDER);
	        
	        celda.setHorizontalAlignment(Element.ALIGN_LEFT);		        
	        celda.setPhrase( new Phrase("Título del recurso", fontCuerpo)  );celda.setBorderColor(BaseColor.LIGHT_GRAY); celda.setBackgroundColor(BaseColor.WHITE);
	        celda.setColspan(2);		        
	        tabla.addCell(celda);
	        celda.setPhrase(new Phrase(r.titulo, fontCuerpo) );		        
	        celda.setColspan(4);
	        tabla.addCell(celda);
	        
	        celda.setPhrase(new Phrase("Área del conocimiento", fontCuerpo)  );
	        celda.setColspan(2);
	        tabla.addCell(celda);		        
	        celda.setPhrase( new Phrase(r.areaconocimiento.descripcion, fontCuerpo)  );
	        celda.setColspan(4);
	        tabla.addCell(celda);

	        celda.setPhrase(new Phrase("Nivel", fontCuerpo)  );
	        celda.setColspan(1);
	        tabla.addCell(celda);
	        celda.setPhrase(new Phrase(r.niveleducativo.descripcion, fontCuerpo)  );
	        celda.setColspan(2);
	        tabla.addCell(celda);
	        
	        celda.setPhrase( new Phrase("Duración en "+ r.unidadmedida.descripcion.toLowerCase(), fontCuerpo)  );
	        celda.setColspan(2);
	        tabla.addCell(celda);
	        celda.setPhrase(new Phrase(r.duracion, fontCuerpo)  );
	        celda.setColspan(1);	
	        tabla.addCell(celda);
	        
	        celda.setPhrase(new Phrase("Unidad académica", fontCuerpo)  );
	        celda.setColspan(1);
	        tabla.addCell(celda);
	        
	        celda.setPhrase(new Phrase(r.unidadacademica.nombre, fontCuerpo)  );
	        celda.setColspan(3);
	        tabla.addCell(celda);

	        celda.setPhrase(new Phrase("Fecha de elaboración del recurso", fontCuerpo)  );
	        celda.setColspan(1);
	        tabla.addCell(celda);
	        
	        Calendar cal = Calendar.getInstance();
			cal.setTime(r.elaboracion);
	    //    celda.setPhrase( new Phrase(   r.elaboracion.getDay()+ "/"+r.elaboracion.getMonth()+"/"+(r.elaboracion.getYear()+1900), fontCuerpo )  );
	    	celda.setPhrase( new Phrase(   cal.get(Calendar.DAY_OF_WEEK)+ "/"+cal.get(Calendar.MONTH)+"/"+(cal.get(Calendar.YEAR)), fontCuerpo )  );
	        celda.setColspan(1); tabla.addCell(celda);

	        celda.setPhrase( new Phrase("Programa académico", fontCuerpo)  );
	        celda.setColspan(2);	tabla.addCell(celda);
	        
	        celda.setPhrase( new Phrase(r.programaacad, fontCuerpo)  );
	        celda.setColspan(4);	tabla.addCell(celda);			        
	        
	        celda.setPhrase( new Phrase("Modalidad", fontCuerpo)  );
	        celda.setColspan(1);	tabla.addCell(celda);			        
	        
	        celda.setPhrase(new Phrase(r.modalidad.descripcion, fontCuerpo)  );
	        celda.setColspan(2);	tabla.addCell(celda);			        

	        celda.setPhrase( new Phrase("Versión", fontCuerpo)  );
	        celda.setColspan(1);	tabla.addCell(celda);
	        
	        celda.setPhrase(new Phrase(r.version.descripcion, fontCuerpo)  );
	        celda.setColspan(2);	tabla.addCell(celda);			        

	        celda.setPhrase( new Phrase("Sinópsis", fontCuerpo)  );
	        celda.setColspan(1);	tabla.addCell(celda);			        
	        
	        celda.setPhrase(new Phrase(r.sinopsis, fontCuerpo)  );
	        celda.setColspan(5);	tabla.addCell(celda);			
	        
	        celda.setPhrase(new Phrase("Formato de entrega", fontCuerpo)  );
	        if (r.formatoentregaotro.length() == 0){
		        celda.setColspan(2);	tabla.addCell(celda);
		        celda.setPhrase( new Phrase(r.formatoentrega.descripcion, fontCuerpo)  );
		        celda.setColspan(4);	tabla.addCell(celda);				        
	        } else {
		        celda.setColspan(1);	tabla.addCell(celda);
		        celda.setPhrase( new Phrase(r.formatoentrega.descripcion, fontCuerpo)  );
		        celda.setColspan(2);	tabla.addCell(celda);	
		        celda.setPhrase(new Phrase("Otro formato de entrega", fontCuerpo)  );
		        celda.setColspan(2);	tabla.addCell(celda);
		        celda.setPhrase( new Phrase(r.formatoentregaotro, fontCuerpo)  );
		        celda.setColspan(1);	tabla.addCell(celda);
	        }		        



	        if (!r.recursosenweb.isEmpty()){		        	
	        	celda.setPhrase(new Phrase("Url del recurso", fontCuerpo));
	        	celda.setColspan(2);	tabla.addCell(celda);
	        	
	        	celda.setPhrase(new Phrase(r.url, fontCuerpo));
	        	celda.setColspan(4);	tabla.addCell(celda);
	        	
	        	celda.setPhrase(new Phrase("Usuario", fontCuerpo));
	        	celda.setColspan(1);	tabla.addCell(celda);
	        	
	        	celda.setPhrase(new Phrase(r.recursosenweb.get(0).usuario, fontCuerpo));		        	
	        	celda.setColspan(2);	tabla.addCell(celda);		   
	        	
	        	celda.setPhrase(new Phrase("Clave de acceso", fontCuerpo));
	        	celda.setColspan(2);	tabla.addCell(celda);
	        	
	        	celda.setPhrase(new Phrase(r.recursosenweb.get(0).password, fontCuerpo));		        	
	        	celda.setColspan(1);	tabla.addCell(celda);			        	
	        }

            /*
	        PdfPTable tablaPC = new PdfPTable(5);		        
	        tablaPC.setSpacingBefore(20);
	        tablaPC.setWidthPercentage(100);		        
	        celda.setPhrase(new Phrase("Palabras clave que definen el recurso")  );
	        celda.setBorder(Rectangle.NO_BORDER);
	        celda.setColspan(5);
	        tablaPC.addCell(celda);
	        
	        celda.setBorder(Rectangle.BOX);
	        for(int a = 0; a < r.palabrasclave.size(); a++  ){
	        	celda.setPhrase(new Phrase( r.palabrasclave.get(a).descripcion, fontCuerpo));
	        	celda.setColspan(1);    tablaPC.addCell(celda);
	        }		        
	        celda.setBorderColor(BaseColor.LIGHT_GRAY);
	        tablaPC.completeRow();

             */
	        
	        PdfPTable tablaAut = new PdfPTable(6);	
	        tablaAut.setWidthPercentage(100);
	        tablaAut.setSpacingBefore(20);
	        celda.setPhrase(new Phrase("Autores por función"));
	        celda.setColspan(6);
	        celda.setBackgroundColor(BaseColor.LIGHT_GRAY);
	        celda.setHorizontalAlignment(Element.ALIGN_RIGHT);
	        tablaAut.addCell(celda);
	        celda.setBackgroundColor(BaseColor.WHITE);
	        celda.setHorizontalAlignment(Element.ALIGN_LEFT);
	        
	        celda.setPhrase(new Phrase("Autor de contenidos que fungirá como responsable", fontCuerpo));
	        celda.setColspan(3);	tablaAut.addCell(celda);
	        		        
	        celda.setPhrase(new Phrase(   r.getResponsable().nombreCompleto().toString(), fontCuerpo  ));
	        celda.setColspan(3);	tablaAut.addCell(celda);

	        celda.setPhrase(new Phrase("Teléfono", fontCuerpo));
	        celda.setColspan(1);	tablaAut.addCell(celda);
	        
	        celda.setPhrase(new Phrase(   r.getResponsable().correo.telefono, fontCuerpo  ));
	        celda.setColspan(2);	tablaAut.addCell(celda);			        

	        celda.setPhrase(new Phrase("Correo electrónico", fontCuerpo));
	        celda.setColspan(1);	tablaAut.addCell(celda);
	        
	        celda.setPhrase(new Phrase(   r.getResponsable().correo.email, fontCuerpo  ));
	        celda.setColspan(2);	tablaAut.addCell(celda);	
	        
	        celda.setPhrase(new Phrase(   "Firma ", fontCuerpo ));
	        celda.setColspan(6);	tablaAut.addCell(celda);
	        
    
	        
	        PdfPTable tablaOa = new PdfPTable(6); 
	        tablaOa.setWidthPercentage(100);
	        tablaOa.setSpacingBefore(20);
	        if (r.autores.size() > 1){
		        celda.setPhrase(new Phrase(  "Otros autores"  ));
		        celda.setHorizontalAlignment(Element.ALIGN_CENTER);
		        celda.setColspan(4);	tablaOa.addCell(celda);	

		        celda.setPhrase(new Phrase(  "Firma"  ));
		        celda.setBackgroundColor(BaseColor.WHITE);
		        celda.setHorizontalAlignment(Element.ALIGN_CENTER);
		        celda.setColspan(2);	tablaOa.addCell(celda);
	        }
	        
	        
	        celda.setHorizontalAlignment(Element.ALIGN_LEFT);
	        for (RecursoAutor a : r.autores){
	        	if (a.autorfuncion.id != 1){
//	        		celda.setPhrase(new Phrase(  ""  ));
	        		if (a.otrafuncion == null){
	        			 celda.setPhrase(new Phrase(  a.autorfuncion.descripcion, fontCuerpo  ));
	        		}else{
	        			 celda.setPhrase(new Phrase(  a.autorfuncion.descripcion +"\n"+a.otrafuncion, fontCuerpo ));
	        		}
	        		celda.setColspan(2);	tablaOa.addCell(celda);
	        		

	        		celda.setPhrase(new Phrase(  a.nombreCompleto(), fontCuerpo ));
	        		celda.setColspan(2);	tablaOa.addCell(celda);
	        		
	        				
	        		celda.setPhrase(new Phrase(  "" ));
	        		celda.setColspan(2);   		tablaOa.addCell(celda);	
	        	}
	        }
	        
	        
	        
			tablaAut.getDefaultCell().setBorderColor(BaseColor.LIGHT_GRAY);
			tablaAut.completeRow();

	        doc.add(tabla);
	        //doc.add(tablaPC);
	        doc.add(tablaAut);
	        doc.add(tablaOa);

	        doc.close();
	        docWriter.close();			
	}

    public void generaImpresionEvaGral() throws DocumentException {
        System.out.println("Desde miPdf.generaImpresionEvaGral");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy kk:mm:ss");
        List<Aspecto> aspectos = Aspecto.find.orderBy("id").findList();
        String[] arrResumen = {"Calificación aspecto", "Total de reactivos", "Si cumple", "No cumple", "Parcialmente", "No aplica"};
        // Configurar hyphenation para español
        // Parámetros: idioma, país, guiones mínimos al inicio, guiones mínimos al final
        HyphenationAuto hyphenation = new HyphenationAuto("es", "ES", 2, 2);


        Recurso r = Recurso.find.byId(this.id);

        Document doc = new Document(PageSize.LETTER.rotate(), 40,40,90,40);
        PdfWriter docWriter;
        docWriter = PdfWriter.getInstance(doc, this.baos);

        MyFooter auxPie = new MyFooter();
        auxPie.titulo = "Reporte detalle de ETPRDD del Recurso Didáctico Digital:\n"+r.titulo;
        docWriter.setPageEvent(auxPie);

        doc.addTitle("Detalle de evaluación");
        doc.addCreationDate();
        doc.addCreator("SERDD");
        doc.addSubject("Reporte de detalle de la evaluación teórico-práctica del recurso didáctico digital "+r.titulo);
        doc.open();

        // Font fontbold = FontFactory.getFont("Cournier-bold", 10, Font.BOLD);
        Font fontCuerpo = FontFactory.getFont("Cournier",8);
        Font fontCuerpo0 = FontFactory.getFont("Cournier",8, BaseColor.LIGHT_GRAY);
        Font fontLMS = FontFactory.getFont("Cournier",7);
        Font fontLMSItalic = FontFactory.getFont("Cournier",7, Font.ITALIC);


        PdfPTable tabla = new PdfPTable(20);
        tabla.setWidthPercentage(100);
        tabla.setSpacingBefore(20);

        PdfPCell celda = new PdfPCell( new Phrase("Identificación")  );
        celda.setPadding(6);

        celda.setColspan(20);
        celda.setHorizontalAlignment(Element.ALIGN_RIGHT);
        celda.setBackgroundColor(BaseColor.LIGHT_GRAY); celda.setBorderColor(BaseColor.LIGHT_GRAY);
        tabla.addCell(celda);

        celda.setHorizontalAlignment(Element.ALIGN_LEFT);
        celda.setPhrase( new Phrase("Título del recurso", fontCuerpo)  );celda.setBorderColor(BaseColor.LIGHT_GRAY); celda.setBackgroundColor(BaseColor.WHITE);
        celda.setColspan(3);
        tabla.addCell(celda);
        celda.setPhrase(new Phrase(r.titulo, fontCuerpo) );
        celda.setColspan(11);
        tabla.addCell(celda);
        celda.setPhrase(new Phrase("Clave de control", fontCuerpo)  );
        celda.setColspan(3);
        tabla.addCell(celda);
        celda.setPhrase( new Phrase(r.numcontrol, fontCuerpo)  );
        celda.setColspan(3);
        tabla.addCell(celda);



        celda.setPhrase(new Phrase("Dependencia politécnica", fontCuerpo)  );
        celda.setColspan(4);
        tabla.addCell(celda);
        celda.setPhrase( new Phrase(r.unidadacademica.nombre, fontCuerpo)  );
        celda.setColspan(16);
        tabla.addCell(celda);


        //tabla.addCell(celda);

        celda.setPhrase(new Phrase("Calificación general", fontCuerpo)  );
        celda.setColspan(4);
        tabla.addCell(celda);
        celda.setPhrase( new Phrase(r.calificacion.calificacion.toString()+",  "+r.calificacionLetraGral(), fontCuerpo)  );
        celda.setColspan(4);
        tabla.addCell(celda);
        celda.setPhrase(new Phrase("Fecha de evaluación", fontCuerpo)  );
        celda.setColspan(4);
        tabla.addCell(celda);
        celda.setPhrase( new Phrase( sdf.format(r.calificacion.auditinsert), fontCuerpo)  );
        celda.setColspan(12);
        tabla.addCell(celda);
        tabla.completeRow();

        doc.add(tabla);

        //  Resumen
        PdfPTable tablaResumen = new PdfPTable(5);
        tablaResumen.setWidthPercentage(100);
        tablaResumen.setSpacingBefore(20);
        tablaResumen.getDefaultCell().setBorderColor(BaseColor.LIGHT_GRAY);

        PdfPCell celdaResumen = new PdfPCell( new Phrase("Resumen")  );
        celdaResumen.setPadding(6);
        celdaResumen.setColspan(5);
        celdaResumen.setHorizontalAlignment(Element.ALIGN_RIGHT);
        celdaResumen.setBackgroundColor(BaseColor.LIGHT_GRAY); celdaResumen.setBorderColor(BaseColor.LIGHT_GRAY);
        tablaResumen.addCell(celdaResumen);

        celdaResumen.setHorizontalAlignment(Element.ALIGN_LEFT);
        celdaResumen.setPhrase( new Phrase("", fontCuerpo)  );celdaResumen.setBorderColor(BaseColor.LIGHT_GRAY); celdaResumen.setBackgroundColor(BaseColor.WHITE);
        celdaResumen.setColspan(1);
        tablaResumen.addCell(celdaResumen);

        for (Aspecto aspecto: aspectos) {

            celdaResumen.setPhrase(new Phrase(aspecto.descripcion, fontCuerpo) );
            celdaResumen.setHorizontalAlignment(Element.ALIGN_CENTER);
            celdaResumen.setColspan(1);
            tablaResumen.addCell(celdaResumen);
        }

        for (String x : arrResumen){
            celdaResumen.setPhrase(new Phrase(x, fontCuerpo) );
            celdaResumen.setHorizontalAlignment(Element.ALIGN_LEFT);
            celdaResumen.setColspan(1);

            tablaResumen.addCell(celdaResumen);

            for (RecursoCalificacionA calificacionesAspecto : r.calificacionesAspectos){
                celdaResumen.setHorizontalAlignment(Element.ALIGN_CENTER);
                // Calificación del aspecto
                if (  Arrays.asList(arrResumen).indexOf(x) == 0 ) {
                    celdaResumen.setPhrase(new Phrase(calificacionesAspecto.calificacion.toString(), fontCuerpo));
                }
                // Número total reactivos
                if (  Arrays.asList(arrResumen).indexOf(x) == 1 ) {
                    Recursoevaluador unAspecto = r.recursoevaluadores.stream().filter(f1 -> f1.aspecto.id == calificacionesAspecto.aspecto.id).findFirst().get();
                    long tr = unAspecto.evaluaciones.size();
                    celdaResumen.setPhrase(new Phrase( Long.toString(tr), fontCuerpo));
                }
                // Número total de respuestas "Si cumple" valor 2
                if (  Arrays.asList(arrResumen).indexOf(x) == 2 ) {
                    Recursoevaluador unAspecto = r.recursoevaluadores.stream().filter(f1 -> f1.aspecto.id == calificacionesAspecto.aspecto.id).findFirst().get();
                    long respSiCumple = unAspecto.evaluaciones.stream().filter(f->f.respuesta==2).count();
                    celdaResumen.setPhrase(new Phrase( Long.toString(respSiCumple), fontCuerpo));
                }

                // Número total de respuestas "No cumple" valor 0
                if (  Arrays.asList(arrResumen).indexOf(x) == 3 ) {
                    Recursoevaluador unAspecto = r.recursoevaluadores.stream().filter(f1 -> f1.aspecto.id == calificacionesAspecto.aspecto.id).findFirst().get();
                    long respNoCumple = unAspecto.evaluaciones.stream().filter(f->f.respuesta==0).count();
                    celdaResumen.setPhrase(new Phrase( Long.toString(respNoCumple), fontCuerpo));
                }

                // Número total de respuestas "Parcialmente" valor 1
                if (  Arrays.asList(arrResumen).indexOf(x) == 4 ) {
                    Recursoevaluador unAspecto = r.recursoevaluadores.stream().filter(f1 -> f1.aspecto.id == calificacionesAspecto.aspecto.id).findFirst().get();
                    long parcialmente = unAspecto.evaluaciones.stream().filter(f->f.respuesta==1).count();
                    celdaResumen.setPhrase(new Phrase( Long.toString(parcialmente), fontCuerpo));
                }

                // Número total de respuestas "No aplica" valor -1
                if (  Arrays.asList(arrResumen).indexOf(x) == 5 ) {
                    Recursoevaluador unAspecto = r.recursoevaluadores.stream().filter(f1 -> f1.aspecto.id == calificacionesAspecto.aspecto.id).findFirst().get();
                    long noaplica = unAspecto.evaluaciones.stream().filter(f->f.respuesta==-1).count();
                    celdaResumen.setPhrase(new Phrase( Long.toString(noaplica), fontCuerpo));
                }

                celdaResumen.setColspan(1);
                tablaResumen.addCell(celdaResumen);
            }
        }
        doc.add(tablaResumen);


        //  Detalle
        for (Aspecto aspecto: aspectos) {

            PdfPTable tablaD = new PdfPTable(4);
            tablaD.setWidthPercentage(100);
            tablaD.setSpacingBefore(20);
            tablaD.getDefaultCell().setBorderColor(BaseColor.LIGHT_GRAY);

            PdfPCell celdaD = new PdfPCell( new Phrase("Detalle del aspecto: "+aspecto.descripcion)  );
            celdaD.setPadding(6);
            celdaD.setColspan(4);
            celdaD.setHorizontalAlignment(Element.ALIGN_RIGHT);
            celdaD.setBackgroundColor(BaseColor.LIGHT_GRAY);celdaD.setBorderColor(BaseColor.LIGHT_GRAY);
            tablaD.addCell(celdaD);

            Recursoevaluador unAspecto = r.recursoevaluadores.stream().filter(f1 -> f1.aspecto.id ==
                    aspecto.id).findFirst().get();

            //////////////
            List<Evaluacion> er = Evaluacion.find.where().eq("recursoevaluador.id", unAspecto.id).findList();
            ArrayList<Long> arrIds = new ArrayList<>();
            for ( Evaluacion a : er){
                arrIds.add(a.evaluaciontabla.id);
            }
            List<EvaluacionTabla> yy = EvaluacionTabla.find.where().idIn(arrIds)
                    .findList();
            //////////////

            //System.out.println("aspecto "+unAspecto.aspecto.descripcion);
            //for ( EvaluacionTabla a: EvaluacionTabla.searchByRecursoEvaluadorId(unAspecto.id)){
            for ( EvaluacionTabla a: yy){
                //System.out.println("    id reactivo: "+a.reactivo.id+"  "+a.reactivo.descripcion.substring(0, 10));

                PdfPCell celdaCol = new PdfPCell();
                celdaCol.setPadding(4);
                celdaCol.setColspan(1);
                celdaCol.setBorderColor(BaseColor.LIGHT_GRAY);

                celdaCol.setHorizontalAlignment(Element.ALIGN_RIGHT);
                celdaCol.addElement(new Phrase("id reactivo: " + a.reactivo.id, fontLMSItalic));

                Paragraph p = new Paragraph(a.reactivo.descripcion, fontCuerpo);
                //p.setAlignment(Element.ALIGN_JUSTIFIED_ALL);
                p.setHyphenation(new HyphenationAuto("es", "ES", 2, 2));
                celdaCol.addElement(p);
                //celdaCol.addElement(   new Phrase(eva.evaluaciontabla.reactivo.descripcion, fontCuerpo)   );
                celdaCol.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
                PdfPTable tablaInterna = new PdfPTable(2);
                tablaInterna.setWidthPercentage(100);
                //tablaInterna.setHorizontalAlignment(Element.ALIGN_CENTER);
                tablaInterna.getDefaultCell().setBorder(Rectangle.NO_BORDER);
                tablaInterna.setSpacingBefore(10);

                //unAspecto.evaluaciones.forEach(t->System.out.println("   "+t.evaluaciontabla.reactivo.id+"  "+   (Objects.equals(t.evaluaciontabla.reactivo.id, a.reactivo.id))   ));


                Evaluacion eg = unAspecto.evaluaciones.stream().filter(f-> Objects.equals(f.evaluaciontabla.reactivo.id, a.reactivo.id)).findFirst().get();

                tablaInterna.addCell(new Phrase("No cumple", (eg.respuesta == 0) ? fontCuerpo : fontCuerpo0));
                tablaInterna.addCell(new Phrase("Cumple parcialmente", (eg.respuesta == 1) ? fontCuerpo : fontCuerpo0));
                tablaInterna.addCell(new Phrase("Si cumple", (eg.respuesta == 2) ? fontCuerpo : fontCuerpo0));
                PdfPCell cellNA = new PdfPCell(new Phrase("No aplica"));
                tablaInterna.addCell(new Phrase("No aplica", (eg.respuesta == -1) ? fontCuerpo : fontCuerpo0));
                cellNA.setHorizontalAlignment(Element.ALIGN_RIGHT);
                celdaCol.addElement(tablaInterna);
                tablaD.addCell(celdaCol);
            }
            tablaD.completeRow();
            doc.add(tablaD);
            // ¿Se tienen observaciones para este aspecto?
            if (unAspecto.observacionEvaluacion!=null) {
                PdfPTable tablaOb = new PdfPTable(4);
                tablaOb.setWidthPercentage(100);
                tablaOb.setSpacingBefore(2);
                tablaOb.getDefaultCell().setBorderColor(BaseColor.LIGHT_GRAY);

                String lasObservaciones = unAspecto.observacionEvaluacion.getObservacion();
                lasObservaciones = lasObservaciones.replace("[saltoDeLinea]","\n");

                PdfPCell celdaOb = new PdfPCell(new Phrase("Observaciones al aspecto: " + aspecto.descripcion+"\n"+lasObservaciones, fontCuerpo));
                celdaOb.setPadding(6);
                celdaOb.setColspan(4);
                celdaOb.setHorizontalAlignment(Element.ALIGN_LEFT);
                celdaOb.setBackgroundColor(BaseColor.WHITE);
                celdaOb.setBorderColor(BaseColor.LIGHT_GRAY);
                tablaOb.addCell(celdaOb);
                doc.add(tablaOb);
            }
        }
        doc.close();
        docWriter.close();
    }


    // Lo mismo que generaImpresionEvaGral pero en detalle son 2 columnas
    public void generaImpresionEvaGral2() throws DocumentException {
        System.out.println("Desde miPdf.generaImpresionEvaGral2");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy kk:mm:ss");
        List<Aspecto> aspectos = Aspecto.find.orderBy("id").findList();
        String[] arrResumen = {"Calificación aspecto", "Total de reactivos", "Si cumple", "No cumple", "Parcialmente", "No aplica"};
        Recurso r = Recurso.find.byId(this.id);
        Document doc = new Document(PageSize.LETTER.rotate(), 40,40,90,40);
        PdfWriter docWriter;
        docWriter = PdfWriter.getInstance(doc, this.baos);

        MyFooter auxPie = new MyFooter();
        auxPie.titulo = "Reporte detalle de ETPRDD del Recurso Didáctico Digital:\n"+r.titulo;
        auxPie.emisor="detalleETPRDD";
        docWriter.setPageEvent(auxPie);

        doc.addTitle("Detalle de evaluación");
        doc.addCreationDate();
        doc.addCreator("SERDD");
        doc.addSubject("Reporte de detalle de la evaluación teórico-práctica del recurso didáctico digital "+r.titulo);
        doc.open();

        // Font fontbold = FontFactory.getFont("Cournier-bold", 10, Font.BOLD);
        Font fontCuerpo = FontFactory.getFont("Cournier",8);
        Font fontCuerpo0 = FontFactory.getFont("Cournier",8, BaseColor.LIGHT_GRAY);
        Font fontLMS = FontFactory.getFont("Cournier",7);
        Font fontLMSItalic = FontFactory.getFont("Cournier",7, Font.ITALIC);

        PdfPTable tablaPrincipal = new PdfPTable(2);
        tablaPrincipal.setWidthPercentage(100);
        tablaPrincipal.setSpacingBefore(0);
        tablaPrincipal.setPaddingTop(0);
        tablaPrincipal.getDefaultCell().setBorder(Rectangle.NO_BORDER);
        //tablaPrincipal.setWidths(new int[]{60, 40});


        PdfPCell celdaPrincipal = new PdfPCell();
        celdaPrincipal.setPadding(0);
        celdaPrincipal.setPaddingTop(0);
        celdaPrincipal.setTop(0);




        // Identificación
        PdfPTable tabla = new PdfPTable(20);
        tabla.setWidthPercentage(100);

        //tabla.setSpacingBefore(20);

        PdfPCell celda = new PdfPCell( new Phrase("Identificación")  );
        celda.setPadding(6);

        celda.setColspan(20);
        celda.setHorizontalAlignment(Element.ALIGN_RIGHT);
        celda.setBackgroundColor(BaseColor.LIGHT_GRAY); celda.setBorderColor(BaseColor.LIGHT_GRAY);
        tabla.addCell(celda);

        celda.setHorizontalAlignment(Element.ALIGN_LEFT);
        celda.setPhrase( new Phrase("Título del recurso", fontCuerpo)  );celda.setBorderColor(BaseColor.LIGHT_GRAY); celda.setBackgroundColor(BaseColor.WHITE);
        celda.setColspan(5);
        tabla.addCell(celda);
        celda.setPhrase(new Phrase(r.titulo, fontCuerpo) );
        celda.setColspan(15);
        tabla.addCell(celda);
        celda.setPhrase(new Phrase("Clave de control", fontCuerpo)  );
        celda.setColspan(5);
        tabla.addCell(celda);
        celda.setPhrase( new Phrase(r.numcontrol, fontCuerpo)  );
        celda.setColspan(15);
        tabla.addCell(celda);



        celda.setPhrase(new Phrase("Dependencia politécnica", fontCuerpo)  );
        celda.setColspan(5);
        tabla.addCell(celda);
        celda.setPhrase( new Phrase(r.unidadacademica.nombre, fontCuerpo)  );
        celda.setColspan(15);
        tabla.addCell(celda);


        //tabla.addCell(celda);

        celda.setPhrase(new Phrase("Calificación general", fontCuerpo)  );
        celda.setColspan(5);
        tabla.addCell(celda);
        celda.setPhrase( new Phrase(r.calificacion.calificacion.toString()+",  "+r.calificacionLetraGral(), fontCuerpo)  );
        celda.setColspan(15);
        tabla.addCell(celda);
        celda.setPhrase(new Phrase("Fecha de evaluación", fontCuerpo)  );
        celda.setColspan(5);
        tabla.addCell(celda);
        celda.setPhrase( new Phrase( sdf.format(r.calificacion.auditinsert), fontCuerpo)  );
        celda.setColspan(15);
        tabla.addCell(celda);
        tabla.completeRow();

       ///////////// doc.add(tabla);

        //  Resumen
        PdfPTable tablaResumen = new PdfPTable(6);
        tablaResumen.setWidthPercentage(100);
        //tablaResumen.setSpacingBefore(20);
        tablaResumen.getDefaultCell().setBorderColor(BaseColor.LIGHT_GRAY);

        PdfPCell celdaResumen = new PdfPCell( new Phrase("Resumen")  );
        celdaResumen.setPadding(6);
        celdaResumen.setColspan(6);
        celdaResumen.setHorizontalAlignment(Element.ALIGN_RIGHT);
        celdaResumen.setBackgroundColor(BaseColor.LIGHT_GRAY); celdaResumen.setBorderColor(BaseColor.LIGHT_GRAY);
        tablaResumen.addCell(celdaResumen);

        celdaResumen.setHorizontalAlignment(Element.ALIGN_LEFT);
        celdaResumen.setPhrase( new Phrase("", fontCuerpo)  );celdaResumen.setBorderColor(BaseColor.LIGHT_GRAY); celdaResumen.setBackgroundColor(BaseColor.WHITE);
        celdaResumen.setColspan(2);
        tablaResumen.addCell(celdaResumen);

        for (Aspecto aspecto: aspectos) {

            celdaResumen.setPhrase(new Phrase(aspecto.descripcion, fontCuerpo) );
            celdaResumen.setHorizontalAlignment(Element.ALIGN_CENTER);
            celdaResumen.setColspan(1);
            tablaResumen.addCell(celdaResumen);
        }

        for (String x : arrResumen){
            celdaResumen.setPhrase(new Phrase(x, fontCuerpo) );
            celdaResumen.setHorizontalAlignment(Element.ALIGN_LEFT);
            celdaResumen.setColspan(2);

            tablaResumen.addCell(celdaResumen);

            for (RecursoCalificacionA calificacionesAspecto : r.calificacionesAspectos){
                celdaResumen.setHorizontalAlignment(Element.ALIGN_CENTER);
                // Calificación del aspecto
                if (  Arrays.asList(arrResumen).indexOf(x) == 0 ) {
                    celdaResumen.setPhrase(new Phrase(calificacionesAspecto.calificacion.toString(), fontCuerpo));
                }
                // Número total reactivos
                if (  Arrays.asList(arrResumen).indexOf(x) == 1 ) {
                    Recursoevaluador unAspecto = r.recursoevaluadores.stream().filter(f1 -> f1.aspecto.id == calificacionesAspecto.aspecto.id).findFirst().get();
                    long tr = unAspecto.evaluaciones.size();
                    celdaResumen.setPhrase(new Phrase( Long.toString(tr), fontCuerpo));
                }
                // Número total de respuestas "Si cumple" valor 2
                if (  Arrays.asList(arrResumen).indexOf(x) == 2 ) {
                    Recursoevaluador unAspecto = r.recursoevaluadores.stream().filter(f1 -> f1.aspecto.id == calificacionesAspecto.aspecto.id).findFirst().get();
                    long respSiCumple = unAspecto.evaluaciones.stream().filter(f->f.respuesta==2).count();
                    celdaResumen.setPhrase(new Phrase( Long.toString(respSiCumple), fontCuerpo));
                }

                // Número total de respuestas "No cumple" valor 0
                if (  Arrays.asList(arrResumen).indexOf(x) == 3 ) {
                    Recursoevaluador unAspecto = r.recursoevaluadores.stream().filter(f1 -> f1.aspecto.id == calificacionesAspecto.aspecto.id).findFirst().get();
                    long respNoCumple = unAspecto.evaluaciones.stream().filter(f->f.respuesta==0).count();
                    celdaResumen.setPhrase(new Phrase( Long.toString(respNoCumple), fontCuerpo));
                }

                // Número total de respuestas "Parcialmente" valor 1
                if (  Arrays.asList(arrResumen).indexOf(x) == 4 ) {
                    Recursoevaluador unAspecto = r.recursoevaluadores.stream().filter(f1 -> f1.aspecto.id == calificacionesAspecto.aspecto.id).findFirst().get();
                    long parcialmente = unAspecto.evaluaciones.stream().filter(f->f.respuesta==1).count();
                    celdaResumen.setPhrase(new Phrase( Long.toString(parcialmente), fontCuerpo));
                }

                // Número total de respuestas "No aplica" valor -1
                if (  Arrays.asList(arrResumen).indexOf(x) == 5 ) {
                    Recursoevaluador unAspecto = r.recursoevaluadores.stream().filter(f1 -> f1.aspecto.id == calificacionesAspecto.aspecto.id).findFirst().get();
                    long noaplica = unAspecto.evaluaciones.stream().filter(f->f.respuesta==-1).count();
                    celdaResumen.setPhrase(new Phrase( Long.toString(noaplica), fontCuerpo));
                }

                celdaResumen.setColspan(1);
                tablaResumen.addCell(celdaResumen);
            }
        }
        //////////////////// doc.add(tablaResumen);

        // La tabla principal contendrá la tabla de identificación (tabla) y la tabla de resumen (tablaResumen)
        celdaPrincipal.addElement(tabla);
        celdaPrincipal.setPaddingLeft(0);
        celdaPrincipal.setPaddingRight(5);
        celdaPrincipal.setBorder(Rectangle.NO_BORDER);


        tablaPrincipal.addCell(celdaPrincipal);
        celdaPrincipal.setPhrase(new Phrase("jajaj"));
        celdaPrincipal.addElement(tablaResumen);
        celdaPrincipal.setPaddingLeft(5);
        celdaPrincipal.setPaddingRight(0);
        tablaPrincipal.addCell(celdaPrincipal);



        doc.add(tablaPrincipal);


        //  Detalle
        for (Aspecto aspecto: aspectos) {

            PdfPTable tablaD = new PdfPTable(4);
            tablaD.setWidthPercentage(100);
            tablaD.setSpacingBefore(20);
            tablaD.getDefaultCell().setBorderColor(BaseColor.LIGHT_GRAY);

            PdfPCell celdaD = new PdfPCell( new Phrase("Detalle del aspecto: "+aspecto.descripcion)  );
            celdaD.setPadding(6);
            celdaD.setColspan(4);
            celdaD.setHorizontalAlignment(Element.ALIGN_RIGHT);
            celdaD.setBackgroundColor(BaseColor.LIGHT_GRAY);celdaD.setBorderColor(BaseColor.LIGHT_GRAY);
            tablaD.addCell(celdaD);

            Recursoevaluador unAspecto = r.recursoevaluadores.stream().filter(f1 -> f1.aspecto.id ==
                    aspecto.id).findFirst().get();

            //////////////
            List<Evaluacion> er = Evaluacion.find.where().eq("recursoevaluador.id", unAspecto.id).findList();
            ArrayList<Long> arrIds = new ArrayList<>();
            for ( Evaluacion a : er){
                arrIds.add(a.evaluaciontabla.id);
            }
            List<EvaluacionTabla> yy = EvaluacionTabla.find.where().idIn(arrIds)
                    .findList();
            //////////////

            for ( EvaluacionTabla a: yy){
                //System.out.println("    id reactivo: "+a.reactivo.id+"  "+a.reactivo.descripcion.substring(0, 10));

                PdfPCell celdaCol = new PdfPCell();
                celdaCol.setPadding(3);
                celdaCol.setPaddingTop(1);
                celdaCol.setColspan(1);
                celdaCol.setBorderColor(BaseColor.LIGHT_GRAY);

                celdaCol.setHorizontalAlignment(Element.ALIGN_RIGHT);
                celdaCol.addElement(new Phrase("Id reactivo: " + a.reactivo.id, fontLMSItalic));

                Paragraph p = new Paragraph(a.reactivo.descripcion, fontCuerpo);
                celdaCol.addElement(p);
                celdaCol.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
                PdfPTable tablaInterna = new PdfPTable(1);
                tablaInterna.setWidthPercentage(100);
                tablaInterna.getDefaultCell().setBorder(Rectangle.NO_BORDER);
                tablaInterna.setSpacingBefore(10);

                //unAspecto.evaluaciones.forEach(t->System.out.println("   "+t.evaluaciontabla.reactivo.id+"  "+   (Objects.equals(t.evaluaciontabla.reactivo.id, a.reactivo.id))   ));


                Evaluacion eg = unAspecto.evaluaciones.stream().filter(f-> Objects.equals(f.evaluaciontabla.reactivo.id, a.reactivo.id)).findFirst().get();

                String laRespuesta = "";
                switch (eg.respuesta) {
                    case 0 : laRespuesta ="No cumple"; break;
                    case 1 : laRespuesta ="Cumple parcialmente"; break;
                    case 2 : laRespuesta ="Si cumple"; break;
                    case -1 : laRespuesta ="No aplica"; break;

                }
                tablaInterna.addCell(new Phrase("Respuesta: "+laRespuesta, fontCuerpo));
                /*
                tablaInterna.addCell(new Phrase("No cumple", (eg.respuesta == 0) ? fontCuerpo : fontCuerpo0));
                tablaInterna.addCell(new Phrase("Cumple parcialmente", (eg.respuesta == 1) ? fontCuerpo : fontCuerpo0));
                tablaInterna.addCell(new Phrase("Si cumple", (eg.respuesta == 2) ? fontCuerpo : fontCuerpo0));
                PdfPCell cellNA = new PdfPCell(new Phrase("No aplica"));
                tablaInterna.addCell(new Phrase("No aplica", (eg.respuesta == -1) ? fontCuerpo : fontCuerpo0));

                 */
                //cellNA.setHorizontalAlignment(Element.ALIGN_RIGHT);
                tablaInterna.completeRow();
                celdaCol.addElement(tablaInterna);
                tablaD.addCell(celdaCol);

            }
            tablaD.completeRow();
            doc.add(tablaD);
            // ¿Se tienen observaciones para este aspecto?
            if (unAspecto.observacionEvaluacion!=null) {
                PdfPTable tablaOb = new PdfPTable(4);
                tablaOb.setWidthPercentage(100);
                tablaOb.setSpacingBefore(2);
                tablaOb.getDefaultCell().setBorderColor(BaseColor.LIGHT_GRAY);

                String lasObservaciones = unAspecto.observacionEvaluacion.getObservacion();
                lasObservaciones = lasObservaciones.replace("[saltoDeLinea]","\n");

                PdfPCell celdaOb = new PdfPCell(new Phrase("Observaciones al aspecto: " + aspecto.descripcion+"\n"+lasObservaciones, fontCuerpo));
                celdaOb.setPadding(6);
                celdaOb.setColspan(4);
                celdaOb.setHorizontalAlignment(Element.ALIGN_LEFT);
                celdaOb.setBackgroundColor(BaseColor.WHITE);
                celdaOb.setBorderColor(BaseColor.LIGHT_GRAY);
                tablaOb.addCell(celdaOb);
                doc.add(tablaOb);
            }
        }







        doc.close();
        docWriter.close();
    }


}
