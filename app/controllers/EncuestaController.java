package controllers;

import static play.data.Form.form;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import actions.Notificacion;
import actions.miCorreo;
import actions.miCorreo2;
import models.RecursoAutor;
import models.EncuestaObservacion;
import models.EncuestaReactivo;
import models.EncuestaRespuesta;
import models.Estado;
import models.EstadoEncuesta;
import models.HistorialestadoEncuesta;
import models.Niveleducativo;
import models.OficioValoracion;
import models.Recurso;
import models.Unidadacademica;
import play.data.DynamicForm;
import play.data.Form;
import play.db.ebean.Model;
import play.db.ebean.Transactional;
import play.mvc.Result;
import views.html.Encuesta.*;


public class EncuestaController extends ControladorSeguroCoordinador{
	public static Result encuestasPorRevisar(){
		return ok( porRevisar.render(  EncuestaRespuesta.find.where().eq("estado.id", 1).findList() ) );
	}

	
	public static Result encuestaPorRevisar(Long id){
		EncuestaRespuesta respuestas = EncuestaRespuesta.find.byId(id);			
		
		Form<EncuestaRespuesta> encuestaRForm = form(EncuestaRespuesta.class);
		List<EncuestaReactivo> reactivos = EncuestaReactivo.find.all();		
		return ok(encuestaPorRevisar.render(reactivos,  Unidadacademica.find.all(),  Niveleducativo.find.all(), encuestaRForm, respuestas ));			
	}
	
	@Transactional
	public static Result agregarObservaciones(Long idEnc){
		String urlSitio= play.Play.application().configuration().getString("urlSitio");
		//String puerto = Play.application().configuration().getString("http.port");
		//String direccionPuerto = direccion+":"+puerto;
		DynamicForm df = form().bindFromRequest();
		EncuestaRespuesta enResp = EncuestaRespuesta.find.byId(idEnc);
		enResp.observaciones.forEach(Model::delete);
		List<EncuestaObservacion> eobs = new ArrayList<EncuestaObservacion>();
		int numObservaciones = 0;
		for(int w=1; w<=2;w++){
			for(int x=1; x<=5;x++){
				String xcadena = String.valueOf(x);
				if (w == 2)
					xcadena+="txt";
				if ( df.get("observacion_respuesta"+xcadena) != null ){
					if ( df.get("observacion_respuesta"+xcadena).length() != 0 ){			
						EncuestaObservacion eo = new EncuestaObservacion();
						eo.respuesta = "respuesta"+xcadena;
						eo.descripcion = df.get("observacion_respuesta"+xcadena);
						eo.encuesta = enResp;
						eobs.add(eo);
						numObservaciones++;
					}
				}
			}
		}
System.out.println("   num observa   "+numObservaciones);		
		if(numObservaciones == 0){
			enResp.estado = EstadoEncuesta.find.byId(3L);
System.out.println("dentro.................");
System.out.println("id "+idEnc);
			// Enviar oficio de valoración si existe
			//Enviar email al autor responsable
			//OficioValoracion aux = OficioValoracion.find.where().eq("recurso.id", idRecurso).findUnique();
			
			if (enResp.recurso.oficiovaloracion != null){			
				enviarOficioValoracion(enResp.recurso.oficiovaloracion);
			}
		} else{
			enResp.estado = EstadoEncuesta.find.byId(2L);
			enResp.observaciones = eobs;
			
			// Enviar correo al autor para indicarle que tiene observaciones la encuesta
			RecursoAutor responsable = enResp.recurso.getResponsable();
			miCorreo mc = new miCorreo();
			mc.asunto = "Observaciones a la encuesta correspondiente al recurso "+enResp.recurso.titulo;
			mc.mensaje = "Estimado(a)"+ responsable.nombreCompleto() +", la encuesta realizada por usted tiene algunas observaciones .....";
			mc.mensaje += "<br>Ingrese a <a href=https://'"+urlSitio+"'>Atender observaciones</a>";
			mc.para = Collections.singletonList(responsable.correo.email);

			// Enviar notificacion al celular
	    	Notificacion n = new Notificacion();
	    	n.enviar(enResp.recurso.numcontrol, "ERDD", "La encuesta realizada por usted tiene algunas observaciones .....");        
						
			
			try {
				//mc.enviar();
				mc.run();
			} catch (Exception e) {
				System.out.println("Ocurrio un error: "+e);
				e.printStackTrace();
			}			
			
		}
		
		enResp.update();
		
		HistorialestadoEncuesta hen = new HistorialestadoEncuesta();
		
		hen.recurso = enResp.recurso;
		//hen.encuestarespuesta = enResp;
		hen.estado = enResp.estado;
		hen.save();	

		return redirect(routes.EncuestaController.encuestasPorRevisar());
	}
	
	
	public static Result conObservacionesList(){
		return ok( conObservacionesList.render(  EncuestaRespuesta.find.where().eq("estado.id", 2).findList() ) );			
	}
	
	public static Result terminadasList(){
		return ok( terminadasList.render(  EncuestaRespuesta.find.where().eq("estado.id", 3).findList() ) );
		
	}

	public static Result conObservaciones(Long id){
		EncuestaRespuesta respuestas = EncuestaRespuesta.find.byId(id);			
		
		Form<EncuestaRespuesta> encuestaRForm = form(EncuestaRespuesta.class);
		List<EncuestaReactivo> reactivos = EncuestaReactivo.find.all();		
		return ok(conObservaciones.render(reactivos,  Unidadacademica.find.all(),  Niveleducativo.find.all(), encuestaRForm, respuestas ));			
	}	
	
	public static Result conEncuestasAceptadas(){
		return ok( views.html.Evaluaciones.ConEncuestasAceptadas.list.render(Recurso.find.where().eq("estado.id", 12L).findList())  );
	}
	
	
	public static void enviarOficioValoracion(OficioValoracion ofv){
		RecursoAutor responsable = ofv.recurso.getResponsable();
		miCorreo2 mc = new miCorreo2();
		mc.asunto = "Oficio de valoración del recurso "+ofv.recurso.titulo;
		mc.mensaje = "Estimado(a)"+ responsable.nombreCompleto() +", le agradecemos la encuesta que contestó, para nosotros es iportante .......\nLe enviamos el oficio de valoración ........";
		
		mc.para = Collections.singletonList(responsable.correo.email);
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream(ofv.contenido.length);
		baos.write(ofv.contenido, 0, ofv.contenido.length);		
		
		if (ofv.recurso.encuesta != null){
	        if (ofv.recurso.encuesta.estado.id == 3 &&  (ofv.recurso.estado.id == 11  ||  ofv.recurso.estado.id == 110)){
	        	ofv.recurso.estado =  Estado.find.byId(12L);
	        	ofv.recurso.update();
	        }
		}		
		
		mc.adjuntos = Collections.singletonList(baos);
		mc.nombresAdjuntos = Collections.singletonList("Oficio valoración recurso " + ofv.recurso.numcontrol);
		
		try {
			//mc.enviar();
			mc.run();
			
			// Enviar notificacion al celular
	    	Notificacion n = new Notificacion();
	    	n.enviar(ofv.recurso.numcontrol, "ERDD", mc.mensaje);        
			
			
		} catch (Exception e) {
			System.out.println("Ocurrio un error: "+e);
			e.printStackTrace();
		}		
	}
	
	
}


