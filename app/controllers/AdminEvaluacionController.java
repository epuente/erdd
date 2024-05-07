package controllers;

import java.io.ByteArrayOutputStream;
import java.text.DateFormatSymbols;
import java.util.*;
import java.util.stream.Collectors;

import com.avaje.ebean.annotation.Transactional;

import actions.Notificacion;
import actions.miCorreo;
import actions.miCorreo2;
import actions.miPdf;
import models.RecursoAutor;
import models.ClasificadorCriterio3;
import models.Estado;
import models.EstadoEvaluacion;
import models.EvaluacionObservacion;
import models.EvaluacionObservacionGral;
import models.EvaluacionObservacionObservacionGral;
import models.Evaluacion;
import models.EvaluacionTabla;
import models.HistorialestadoEvaluacion;
import models.Recurso;
import models.Recursoevaluador;
import play.data.DynamicForm;
import play.mvc.Result;


public class AdminEvaluacionController extends ControladorSeguroCoordinador {

	// El coordinador actualiza las observaciones de la evaluacion
	@Transactional	
	public static Result saveObservaciones(Long id, Long aspecto) throws Exception{
		DateFormatSymbols dfs = new DateFormatSymbols();
		String[] months = dfs.getMonths();
		int numObserva = 0;
		String urlSitio= play.Play.application().configuration().getString("urlSitio");
	//	String puerto = Play.application().configuration().getString("http.port");
		//String direccionPuerto = direccion+":"+puerto;
        System.out.println("AdminEvaluacionController.saveObservaciones");
		DynamicForm df = DynamicForm.form().bindFromRequest();
		Recurso r = Recurso.find.byId(id);

		List<Evaluacion> aux = Evaluacion.find.where().in("recursoevaluador.id",  Recursoevaluador.find.where().eq("recurso.id", r.id).findIds() ).findList();
		
		List<Evaluacion> er = aux.stream().filter(f->f.recursoevaluador.recurso.id == id && f.recursoevaluador.aspecto.id == aspecto).collect(Collectors.toList());

//er.forEach(z->{  System.out.println( z.recursoevaluador.id );  });

		ClasificadorCriterio3 cc3 = ClasificadorCriterio3.find.byId(  r.clasificacion.criterio3.id);		
		
		
		List<EvaluacionTabla> evt = EvaluacionTabla.find.where()
				.eq("version.id", er.get(0).evaluaciontabla.version.id)
				.eq("aspecto.id", aspecto)
				.eq("criterio1.id", r.clasificacion.criterio1.id)
				.eq("criterio2.id", r.clasificacion.criterio2.id)
			//	.eq("criterio3.id", r.clasificacion.criterio3.id)			
				.eq("criterio3.id", cc3.id)
				.findList();



System.out.println("tam evaluacionTabla "+evt.size());

		for(EvaluacionTabla et :  evt  ){
			Evaluacion err = Evaluacion.find.where().eq("evaluaciontabla.id", et.id).eq("recursoevaluador.id", er.get(0).recursoevaluador.id).findUnique();
			if(err!=null){
				if (EvaluacionObservacion.find.where().eq("respuesta.id", err.id).findUnique() != null)
					EvaluacionObservacion.find.where().eq("respuesta.id", err.id).findUnique().delete();
			
				if (!df.get("observacion"+et.id).isEmpty()){
					EvaluacionObservacion eo = new EvaluacionObservacion();
					eo.respuesta = err;
					eo.Observacion = df.get("observacion"+et.id);
					eo.save();					
					numObserva++;
				}
			}
		}
		
		
		
		//Tiene Observación general?
		EvaluacionObservacionGral aux2 = EvaluacionObservacionGral.find.where().eq("recursoevaluador.id", er.get(0).recursoevaluador.id).findUnique();
System.out.println(" aux2: "+aux2);
		if (aux2 != null){
			EvaluacionObservacionObservacionGral eoog = EvaluacionObservacionObservacionGral.find.where().eq("evaluacionobservaciongral.id", aux2.id ).findUnique();
			System.out.println("eoog   "+eoog);		
			if(!df.get("observacionobservacionGral").isEmpty()){
				if (eoog != null){
					System.out.println("no nulo");
					eoog.observacion = df.get("observacionobservacionGral");
					System.out.println("0001");
					eoog.update();
					System.out.println("0002");
				} else {
					System.out.println("nulo");
					eoog = new EvaluacionObservacionObservacionGral();
					System.out.println("100");
					eoog.evaluacionobservaciongral = aux2;
					System.out.println("200");
					eoog.observacion = df.get("observacionobservacionGral");
					System.out.println("300");
					eoog.save();			
					System.out.println("400");
				}
				numObserva++;
			}
		}
		
System.out.println("Terminado? "+df.get("terminado"));		 
		Recursoevaluador re = Recursoevaluador.find.where().eq("recurso.id", id).eq("aspecto.id", aspecto).findUnique();
System.out.println("re  "+re);		
		if (df.get("terminado").contentEquals("si")){
System.out.println("si");			
			re.estadoevaluacion = EstadoEvaluacion.find.byId(5L);
		}
		else {
System.out.println("no");			
			re.estadoevaluacion = EstadoEvaluacion.find.byId(4L);
		}
		re.update();
		
		HistorialestadoEvaluacion hedoEv = new HistorialestadoEvaluacion();
		hedoEv.estado = re.estadoevaluacion;
		hedoEv.recurso = r;
		hedoEv.recursoevaluador = re; 
		r.historialestadoevaluaciones.add(hedoEv);
		r.update();		
		// ¿todas las evaluaciones terminadas para el recurso?
		
		boolean terminadosTodos = true;
		for (Recursoevaluador x :  Recursoevaluador.find.where().eq("recurso.id", id).findList() ){
			terminadosTodos &= (x.estadoevaluacion.id == 5L);
		}
		
		
		
		
System.out.println("terminadosTodos:  "+terminadosTodos);	
System.out.println("numObserva:  "+numObserva);

		if (terminadosTodos && numObserva==0){
			r.estado = Estado.find.byId(10L);
			r.update();
			
			// Enviar correo al autor responsable del recurso			
	        List<String> listaDirecciones = new ArrayList<String>();	        
			for (RecursoAutor a : r.autores) {
				if (a.autorfuncion.id == 1L){
					listaDirecciones.add(a.correo.email); 
				}
			}
			miCorreo2 mc = new miCorreo2();
	        mc.asunto = "Evaluación del recurso "+r.titulo+" completada satisfactoriamente";
	        mc.para = listaDirecciones;
			mc.mensaje = "Apreciable docente:\n\n";
			mc.mensaje +="La evaluación del recurso '"+r.titulo+"' ha finalizado. Adjunto a este correo encontrará el reporte con sus resultados.\n";
			mc.mensaje +="Si desea que le hagamos llegar dentro de las próximas 48 horas la copia del oficio de respuesta que se envía de manera formal a su unidad académica, sólo responda, por favor, la encuesta de satisfacción dando clic en el siguiente vínculo.\n\n";
			//mc.mensaje +="Responder encuesta <a href='http://"+direccionPuerto+"'>Responder encuesta</a> \n\n\n";
			mc.mensaje +="Responder encuesta <a href='https://"+urlSitio+"'>Responder encuesta</a> \n\n\n";
			mc.mensaje +="Si tiene alguna duda o comentario, estamos a sus órdenes a través del correo electrónico evaluardd@ipn.mx y en la extensión 57405.";
			
	        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
	        
	        miPdf mipdf = new miPdf(id);
	       // mipdf.id = id;
	        mipdf.baos = outputStream;
	        mipdf.generarReporteFinal("admin");
	        //controllers.RecursoevaluadorController.writePdf(id, outputStream);
	        
	        //mc.adjuntos = Arrays.asList(outputStream);
	        mc.adjuntos = Collections.singletonList(mipdf.baos);
	        mc.nombresAdjuntos = Collections.singletonList("Reporte de Evaluación Técnico Pedagógica del recurso " + r.numcontrol);
			//mc.enviar();
	        mc.run();
			
			// Enviar notificacion al celular 
	    	Notificacion n = new Notificacion();
	    	n.enviar(r.numcontrol, "ERDD", mc.mensaje);
			
			
		} else {
			// Se envía correo al evaluador indicando que hay observaciones
			miCorreo mc = new miCorreo();
			mc.para = Collections.singletonList(er.get(0).recursoevaluador.evaluador.personal.correo);
			if (numObserva!=0){
				mc.asunto ="Observaciones al recurso "+r.numcontrol;
				mc.mensaje="El administrador hizo "+numObserva+" observaciones al aspecto "+re.aspecto.descripcion+" referentes al recurso con clave de control "+r.numcontrol+". Sírvase atenderlas.";
			} else {
				mc.mensaje="El administrador ha aprobado la evaluación del recurso "+re.recurso.numcontrol;
				mc.asunto="Aprobado el recurso "+re.recurso.numcontrol;
			}
			Calendar cal = Calendar.getInstance();
			mc.mensaje+="<br><br><br>"+cal.get(Calendar.DAY_OF_MONTH)+" de "+months[cal.get(Calendar.MONTH)]+" de "+cal.get(Calendar.YEAR)+", " + cal.get(Calendar.HOUR_OF_DAY)+":"+cal.get(Calendar.MINUTE)+".";
	        //mc.enviar();
			mc.run();
	        
			// Enviar notificacion al celular 
	    	Notificacion n = new Notificacion();
	    	n.enviar(r.numcontrol, "ERDD", mc.mensaje);
		}
		return redirect("/mostrarEvaluacionesPorRevisar/1");
	}	
	

}
