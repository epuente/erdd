package actions;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import controllers.MyFooter;
import models.Aspecto;
import models.RecursoAutor;
import models.Dirigidoa;
import models.Formatoentrega;
import models.Modalidad;
import models.Recurso;
import models.Recursoevaluador;
import models.Version;
import models.recursoDirigidoa;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Objects;
import java.util.stream.Collectors;

public class miPdf {
	public Long id;
	private String numControl;
	public ByteArrayOutputStream baos;
	
	
	public miPdf(Long id) {
		this.id = id;
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
		List<Modalidad> modalidades = models.Modalidad.find.all();
		List<Dirigidoa> dirigidoa =models.Dirigidoa.find.all();
		ArrayList<Long> rdir = new ArrayList<Long>(); 
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
	        if ( (r.formatoentrega.id == 3 && f.id == r.formatoentrega.id) && (!r.formatoentregaotro.isEmpty())){
	        	celda.setPhrase(new Phrase("X  "+r.formatoentregaotro, fontCuerpo));
	        	celda.setHorizontalAlignment(Element.ALIGN_CENTER);
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
	
	
	public void generarSolicitudEvaluacion() throws DocumentException, MalformedURLException, IOException{
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
	        doc.add(tablaPC);
	        doc.add(tablaAut);
	        doc.add(tablaOa);
	        
	        
	       
	        
	        
	        doc.close();
	        docWriter.close();			
	}

}
