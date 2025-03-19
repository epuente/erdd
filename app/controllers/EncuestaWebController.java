package controllers;

import static play.data.Form.form;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import classes.miCorreo;
import controllers.util.ControladorDefault;
import models.*;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Result;
import views.html.Encuesta.*;

public class EncuestaWebController extends ControladorDefault {
	
	public static Result desdeLiga(String ncontrol){
		session("idRecurso", Recurso.searchByNumControl(ncontrol).id.toString()   );
		return redirect( routes.EncuestaWebController.create()  );
	}
	
	public static Result create(){
		System.out.println( session("idRecurso"));		
		EncuestaRespuesta eresp = EncuestaRespuesta.find.where().eq("recurso.id", session("idRecurso")).findUnique();			
		if ( eresp != null ){
			return ok(views.html.Encuesta.previamenteEnviada.render());
		}
		
		
		if ( session("idRecurso") == null ){
			return ok( views.html.accesoNoAutorizado.render("Usted esta intentando responder una encuesta cuando no esta relacionado a una solicitud de recurso."));
		}		
		Form<EncuestaRespuesta> encuestaRForm = form(EncuestaRespuesta.class);
		List<EncuestaReactivo> reactivos = EncuestaReactivo.find.all();		
		return ok(create.render(reactivos,  Unidadacademica.find.all(),  Niveleducativo.find.all(), encuestaRForm  ));		
	}
	
	public static Result save(){
		DynamicForm df = form().bindFromRequest();
System.out.println( df  );				
		
		if ( session("idRecurso") == null ){
			return ok( views.html.accesoNoAutorizado.render("Usted esta intentando responder una encuesta cuando no esta relacionado a una solicitud de recurso."));
		}

		Recurso recurso = Recurso.find.byId( Long.parseLong(session("idRecurso")));
		EncuestaRespuesta er = new EncuestaRespuesta();

		java.util.Vector<String> v1 = new java.util.Vector<>();
		Map<String, String> formData = df.data();
System.out.println(		formData.keySet());

		for (String k   : formData.keySet()){
			/*
			if (k.compareTo("unidadacademica.id")==0)
				er.unidadacademica =  Unidadacademica.find.byId(Long.parseLong(formData.get(k)));
			if (k.compareTo("niveleducativo.id")==0)
				er.niveleducativo = Niveleducativo.find.byId(Long.parseLong(formData.get(k)));
			*/
			if (k.startsWith("respuesta1[")){
				v1.add( formData.get(k)  );
			}
			if (k.compareTo("respuesta1txt")==0)
				er.respuesta1txt = formData.get(k);
            System.out.println(		k  +"  "+formData.get(k)  );
			if (k.compareTo("respuesta2") == 0)
				er.respuesta2 = formData.get(k);
			if (k.compareTo("respuesta2txt") == 0)
				er.respuesta2txt = formData.get(k);
			if (k.compareTo("respuesta3") == 0)
				er.respuesta3 = formData.get(k);
			if (k.compareTo("respuesta3txt") == 0)
				er.respuesta3txt = formData.get(k);		
			if (k.compareTo("respuesta4") == 0)
				er.respuesta4 = formData.get(k);
			if (k.compareTo("respuesta4txt") == 0)
				er.respuesta4txt = formData.get(k);
			if (k.compareTo("respuesta5txt") == 0)
				er.respuesta5txt = formData.get(k);			
		}
		er.respuesta1 = v1.toString();
        System.out.println(v1.toString());
		er.estado = EstadoEncuesta.find.byId(1L);
		er.recurso =  recurso;
		er.save();
		
		HistorialestadoEncuesta heEn = new HistorialestadoEncuesta();
		
		heEn.recurso = er.recurso;
		heEn.estado = er.estado;
	//	heEn.encuestarespuesta = er;
		heEn.save();
		
		//recurso.estado = Estado.find.byId(11L);
	//	recurso.update();
		
		
 /*       
        EncuestaRespuesta  encuesta= encuestaRForm.get();
        encuesta.recurso =  Recurso.find.byId( Long.parseLong(session("idRecurso")));
        encuesta.save();
        */
     //   return redirect("/encuestaRecibida");

        // Envia correo al coordinador indicandole que el autor envió la encuesta;
        miCorreo mc = new miCorreo();
        mc.para =  Collections.singletonList(Personal.elCoordinador().correo);
        mc.asunto = "Encuesta recibida del rdd "+recurso.numcontrol;
        mc.mensaje ="El autor del rdd "+recurso.numcontrol+" ha enviado la encuesta.";
        mc.enviar();

        CorreoSalida cs = new CorreoSalida(mc, recurso);
        cs.save();

		flash("success", "Se envió la encuesta.");
		return redirect ("/recursowebAn");
	}
	
	public static Result recibida(){
		return ok( recibida.render()  );		
	}
	
	public static Result atiendeObservaciones(){
		Recurso recurso = Recurso.find.byId( Long.parseLong(session("idRecurso")));
System.out.println("estado encuesta "+recurso.encuesta.estado.id);		
		if (recurso.encuesta.estado.id != 2L ){
			return ok( views.html.accesoNoAutorizado.render("Usted esta intentando atender observaciones de una encuesta que esta en proceso de revisión por el administrador."));
		}
		
		List<EncuestaReactivo> reactivos = EncuestaReactivo.find.all();		
		Form<EncuestaRespuesta> encuestaRForm = form(EncuestaRespuesta.class);
		recurso.encuesta.observaciones.forEach(x->{
			System.out.println( x.id+"  "+x.respuesta+"  "+x.descripcion  );			
		}); 		
		
		return ok(atiendeObservaciones.render( reactivos, Unidadacademica.find.all(), Niveleducativo.find.all(), encuestaRForm,  recurso.encuesta,   recurso.encuesta.observaciones  ));
		
	}
	
	public static Result update(){
		/*
        Form<EncuestaRespuesta> forma = form(EncuestaRespuesta.class).bindFromRequest();
System.out.println(forma);
System.out.println(  Long.parseLong(  session("idRecurso")  )  );
        
        
        EncuestaRespuesta encResp = forma.get();
        Recurso recurso = Recurso.find.byId(Long.parseLong(session("idRecurso")));
        encResp.estado = EstadoEncuesta.find.byId(1L);
        encResp.recurso = recurso;
        encResp.auditlastupdate = null;
        encResp.update( recurso.encuesta.id );

		HistorialestadoEncuesta heEn = new HistorialestadoEncuesta();
		
System.out.println(" recurso "+encResp.recurso);		
		
		heEn.recurso = encResp.recurso;
		heEn.estado = encResp.estado;
//		heEn.encuestarespuesta = encResp;
		heEn.save();        
        */
	//	return redirect("/encuestaRecibida");
		
		
		
		DynamicForm df = form().bindFromRequest();
System.out.println( df  );				
		
		if ( session("idRecurso") == null ){
			return ok( views.html.accesoNoAutorizado.render("Usted esta intentando responder una encuesta cuando no esta relacionado a una solicitud de recurso."));
		}

		Recurso recurso = Recurso.find.byId( Long.parseLong(session("idRecurso")));
		EncuestaRespuesta er = recurso.encuesta;

		java.util.Vector<String> v1 = new java.util.Vector<>();
		Map<String, String> formData = df.data();
System.out.println(		formData.keySet());

		for (String k   : formData.keySet()){
			/*
			if (k.compareTo("unidadacademica.id")==0)
				er.unidadacademica =  Unidadacademica.find.byId(Long.parseLong(formData.get(k)));
			if (k.compareTo("niveleducativo.id")==0)
				er.niveleducativo = Niveleducativo.find.byId(Long.parseLong(formData.get(k)));
			*/
			if (k.startsWith("respuesta1[")){
				v1.add( formData.get(k)  );
			}
			if (k.compareTo("respuesta1txt")==0)
				er.respuesta1txt = formData.get(k);
System.out.println(		k  +"  "+formData.get(k)  );
			if (k.compareTo("respuesta2") == 0)
				er.respuesta2 = formData.get(k);
			if (k.compareTo("respuesta2txt") == 0)
				er.respuesta2txt = formData.get(k);
			if (k.compareTo("respuesta3") == 0)
				er.respuesta3 = formData.get(k);
			if (k.compareTo("respuesta3txt") == 0)
				er.respuesta3txt = formData.get(k);		
			if (k.compareTo("respuesta4") == 0)
				er.respuesta4 = formData.get(k);
			if (k.compareTo("respuesta4txt") == 0)
				er.respuesta4txt = formData.get(k);
			if (k.compareTo("respuesta5txt") == 0)
				er.respuesta5txt = formData.get(k);			
		}
		er.respuesta1 = v1.toString();
System.out.println(v1.toString());
		er.estado = EstadoEncuesta.find.byId(1L);
		er.recurso =  recurso;
		er.update();
		
		HistorialestadoEncuesta heEn = new HistorialestadoEncuesta();
		
		heEn.recurso = er.recurso;
		heEn.estado = er.estado;
	//	heEn.encuestarespuesta = er;
		heEn.save();		
		
		
		flash("success","Se enviaron las correcciones.");
		return redirect("/recursowebAn");
		
	}
}

