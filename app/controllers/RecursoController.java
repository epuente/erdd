package controllers;
import static play.data.Form.form;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.persistence.PersistenceException;
import com.avaje.ebean.Ebean;
import play.data.DynamicForm;
import play.data.Form;
import play.db.ebean.Model;
import play.mvc.*;
import views.html.Recurso.*;
import models.RecursoAutor;
import models.ObservacionCancelacion;
import models.Oficio;
import models.OficioValoracion;
import models.SolicitudCancelacion;
import models.Versionanterior;
import models.Clasificacion;
import models.ClasificadorCriterio3;
import models.CorreoSalida;
import models.Documento;
import models.EncuestaRespuesta;
import models.Estado;
import models.EvaluacionObservacion;
import models.EvaluacionObservacionGral;
import models.Evaluacion;
import models.EvaluacionFecha;
import models.EvaluacionTabla;
import models.EvaluacionTablaTipoRecurso;
import models.Historialestado;
import models.HistorialestadoEncuesta;
import models.HistorialestadoEvaluacion;
import models.Observacion;
import models.Recurso;
import models.Recursoevaluador;
import actions.Notificacion;
import actions.miCorreo;


public class RecursoController extends ControladorSeguroCoordinador {
	
    public static Result GO_HOME = redirect( 
            routes.RecursoController.list(0, "titulo", "asc", "", "titulo")
        );	
   
	
    public static Result list(int page, String sortBy, String order, String filter, String cf) {		
System.out.println("page:"+page+"  sortBy:"+sortBy+"   order:"+order+"  Filter:"+filter+"       campoFiltro:"+cf);
		
		
		response().setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
		response().setHeader("Pragma", "no-cache"); // HTTP 1.0.
		response().setHeader("Expires", "0"); // Proxies.
    	return ok(
    			list.render(  Recurso.page(page, 10, sortBy, order, filter, cf),
                sortBy, order, filter, cf
            )
         );        
    }
    
    public static Result ajaxListTabla(int page, String sortBy, String order, String filter, String cf) {		
System.out.println("page:"+page+"  sortBy:"+sortBy+"   order:"+order+"  Filter:"+filter+"       campoFiltro:"+cf);
		response().setHeader(CACHE_CONTROL, "no-cache");
    	return ok(
    	ajaxListTabla.render(
                Recurso.page(page, 10, sortBy, order, filter, cf),
                sortBy, order, filter, cf
            )
         );        
    }
    
    
    
    
    public static Result edit(Long id) {
    	System.out.println("Desde REcursoController.edit");
        Form<Recurso> recursoForm = form(Recurso.class).fill(
            Recurso.find.fetch("documentos").where().eq("id", id).findUnique()
        );        
        Recurso r = recursoForm.get();        
        return ok(observaciones.render(id, recursoForm,  r) );
    }
    
    
    public static Result delete(Long id) {
    	try{
	        Recurso r = Recurso.find.byId(id);
	        String t = r.titulo;
	        r.delete();
	        flash("success", "El recurso '"+t+"' ha sido eliminado");
System.out.println("************* Seliminó el recurso '"+t+"'");	        
	        
	    } catch (PersistenceException pe) {	   	 
		   	 System.out.println("***************************"+pe+"\n"+pe.getCause());
		   	 if (   pe.getCause().toString().contains("IntegrityConstraint")){
		   		 flash("error", "No se puede eliminar puesto que se hace uso de la misma en otros registros. Por ejemplo, si tiene actualizaciones.  ");	
		   	 }
	    }
	    return redirect(routes.RecursoController.list(0, "titulo", "asc", "", "titulo")); 	
    }    


    @play.db.ebean.Transactional
    public static Result ajaxDelete(Long id) {
    	try{
    		System.out.println("desde ajaxDelete");


			System.out.println(" CorreoSalida ");
			CorreoSalida.find.fetch("para").where().eq("recurso.id",id).findList().forEach(d->{
				d.para.forEach(Model::delete);
				d.delete();
			});
			
			
			System.out.println(" Historiales ");
			HistorialestadoEncuesta.find.where().eq("recurso.id", id).findList().forEach(Model::delete);
				
			HistorialestadoEvaluacion.find.where().eq("recurso.id", id).findList().forEach(Model::delete);
			
			Historialestado.find.where().eq("recurso.id", id).findList().forEach(Model::delete);
				//d.historialestadoevaluaciones.forEach(heeva->{HistorialestadoEvaluacion.find.byId(heeva.id).delete();});
				//d.historialestados.forEach(hedos->{Historialestado.find.byId(hedos.id).delete();});
			
			
			System.out.println(" REcursoEvaluador ");
			Recursoevaluador.find.where().eq("recurso.id",id).findList().forEach(Model::delete);
			
			System.out.println(" Clasificacion ");
			Clasificacion.find.where().eq("recurso.id",id).findList().forEach(Model::delete);
			
			System.out.println(" Oficio ");
			Oficio.find.where().eq("recurso.id",id).findList().forEach(Model::delete);

			System.out.println(" Oficiovaloracion ");
			OficioValoracion.find.where().eq("recurso.id",id).findList().forEach(Model::delete);

			System.out.println(" Observacioncancelacion ");
			ObservacionCancelacion.find.where().eq("recurso.id",id).findList().forEach(Model::delete);
			
			System.out.println(" EvaluacionFecha ");
			EvaluacionFecha.find.where().eq("recurso.id",id).findList().forEach(Model::delete);

			System.out.println(" EncuestaRespuesta ");
			EncuestaRespuesta.find.where().eq("recurso.id",id).findList().forEach(Model::delete);
			
			System.out.println(" Versionanterior ");
			Versionanterior.find.where().eq("recurso.id",id).findList().forEach(Model::delete);

			Recurso r = Recurso.find.byId(id);
			//Recurso r = Ebean.find(Recurso.class, id);
			
			//SqlUpdate tangoDown = Ebean.createSqlUpdate("DELETE FROM recurso WHERE id = "+id);
			//tangoDown.execute();			
			
			
			
System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");			
			r.delete();
System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");	
	        flash("success", "El recurso  ha sido eliminado");
System.out.println("************* Seliminó el recurso ");	        
	        
	    } catch (PersistenceException pe) {	   	 
		   	 if (   pe.getCause().toString().contains("IntegrityConstraint")){
		   		 flash("error", "No se puede eliminar puesto que se hace uso de la misma en otros registros. Por ejemplo, si tiene actualizaciones.  ");	
		   	 }
		   	 
	    } catch (Exception e){
	    	flash("error", "No se pudo eliminar.  ");
	    }
	    return redirect(routes.RecursoController.ajaxListTabla(0, "titulo", "asc", "", "titulo")); 	
    }   


    public static Result update(Long id) {
        Form<Recurso> recursoForm = form(Recurso.class).bindFromRequest();

        Recurso r =  form(Recurso.class).bindFromRequest().get();  
        if(recursoForm.hasErrors()) {
            return badRequest(observaciones.render(id, recursoForm,  r));
        }
        recursoForm.get().update(id);
        flash("success", "El recurso " + recursoForm.get().titulo + " ha sido actualizado "+ r.autores.size());
        return GO_HOME;        
    }    


    public static Result porObservarList(){
    	List<Recurso> r = Recurso.find.where().eq("estado.id", "1").findList();
    	return ok (views.html.Recurso.porObservarList.render(r, " por revisar"));
    }

    public static Result porReObservarList(){
    	List<Recurso> r = Recurso.find.where().in("estado.id", Arrays.asList("2", "105")).findList();
    	return ok (views.html.Recurso.conObservacionesList.render(r," con observaciones"));
    }    

    public static Result completoList(){
    	List<Recurso> r = Recurso.find.where().eq("estado.id", "3").findList();
    	return ok (views.html.Recurso.completoList.render(r));
    }    
    
    
    public static Result observar(Long id) {
        Form<Recurso> recursoForm = form(Recurso.class).fill(
            Recurso.find.byId(id)
        );
        Recurso r = recursoForm.get();        
        if (r.estado.id == 1L || r.estado.id == 2L || r.estado.id == 105L)
        	return ok(observaciones.render(id, recursoForm, r));
    	else
    		return ok("No es válida esta operación para el estado del recurso");
    }
    
    
    
    public static Result observacionessave(){
    	String urlSitio= play.Play.application().configuration().getString("urlSitio");
		//String puerto = Play.application().configuration().getString("http.port");
		//String direccionPuerto = urlSitio+":"+puerto;
		DynamicForm requestData = form().bindFromRequest();
		
		String id = requestData.get("elId");		
		Recurso r = Recurso.find.byId( Long.parseLong(id));
		Long edoAnterior = r.estado.id;		
		
		
		for(Observacion tmp: r.observaciones){
			tmp.delete();
		}
		r.observaciones.clear();		
		
		// Se pasan los campos y sus valores a un mapa
		Map<String,String> mapa = form().bindFromRequest().data();

		// Se filtra el mapa
		Map<String, String> otro =  mapa.entrySet()
					.stream().filter(map -> !map.getValue().isEmpty() &&  map.getKey().startsWith("observacion_")    )
					.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));





System.out.println("-----------despues---------------------------");
for (Map.Entry<String, String> entry : otro.entrySet())
{
    System.out.println(entry.getKey() + "/" + entry.getValue());
	Observacion o =  new Observacion();
    o.recurso = r;		                
    if (entry.getKey().compareTo("observacion_dirigidoa.id[0]") == 0){
    	System.out.println("   ??????????????????????????????????????????");		                	
    	o.campo="dirigidoa.id[]";
    } else
    	o.campo =entry.getKey().substring(12);
    o.observacion = entry.getValue().replace("\n", "").replace("\r", "");;
    r.observaciones.add(o);	    
}
System.out.println("---------------------------------------");

/*		
		// Existe observacion al numcontrol de revision anterior?
		if (  requestData.get("observacion_versionanterior.recursoanterior_id") != null ){
			if (  requestData.get("observacion_versionanterior.recursoanterior_id").toString().length() != 0  ){
				String aux67 = Recurso.searchByNumControl(requestData.get("observacion_versionanterior.recursoanterior_id").toString());
				if (r.versionanterior == null){
					r.versionanterior = new Versionanterior();
				}
				r.versionanterior.recurso = r;
				r.versionanterior.recursoanterior = aux67; 
			}
		}
	*/	
    //    Historialestado he = new Historialestado();
        if (otro.isEmpty()){       	
        	r.estado = Estado.find.byId(3L);
        	flash("success", "El recurso '" + r.titulo + "' no tiene observaciones, la solicitud se ha aceptado.");
        }
        else {       	
        	r.estado = Estado.find.byId(2L);
        	flash("success", "Se le hicieron observaciones al recurso '" + r.titulo + ".");
        }

        r.update();
        
        
		
        // Enviar correo a autores
        miCorreo mc = new miCorreo();
        mc.asunto = "ERDD";
		for (RecursoAutor a : r.autores) {
			if (a.autorfuncion.id == 1L){
System.out.println(a.nombre);				
System.out.println(a.correo.email);				
				mc.para =  Arrays.asList(a.correo.email);
				mc.mensaje = "Estimado usuario:<br><br>";
				mc.mensaje+="Su solicitud en línea del recurso con clave de control "+r.numcontrol+" ha sido revisada por la UPEV";
		    	if (otro.size() > 0){
					mc.mensaje+=" y tiene "+otro.size()+" observaciones, las cuales deberá atender en un plazo máximo de 5 días hábiles; de lo contrario su solicitud se cancelará y deberá iniciar nuevamente el proceso.<br><br>Favor de ingresar a la dirección <a href='https://"+urlSitio+"'>https://"+urlSitio+"</a> y utilizando su clave de control acceda a su solicitud para revisar y atender las observaciones que se realizaron. ";			
		    	} else {
		    		mc.mensaje+=", favor de enviar el oficio de solicitud dirigido al director de la UPEV y los documentos originales de su solicitud.";
		    	}
			}
			mc.run();      
			
			// Enviar notificacion al celular
	    	Notificacion n = new Notificacion();
	    	n.enviar(r.numcontrol, "ERDD", mc.mensaje.replace("<br>", "\n"));        
			
			
		}
        if (edoAnterior == 1L){
        	return redirect("/recursos/observarList");
        }
        else {
        	return redirect("/recursos/reObservarList");
        }
        
		 
    }

    
    
    public static Result masterlist(int page, String sortBy, String order, String filter) {
    	List<Recurso> rs = Recurso.find.all();
    	return ok(
    			listMaster.render(rs)
    			);     	
    }    
    
    
    public static Result eliminarSolicitud(String id){   	
    	Recurso r = Recurso.find.byId( Long.parseLong(id)  );
    	r.delete();
    	return ok("Se eliminó la solicitud.");
    }      
    
	public static Result ver(Long id) {
		Documento d = Documento.find.byId( id );
		response().setContentType(d.contenttype);		 
		return ok (d.contenido);
	}    

	public static Result verOficioValoracion(Long id) {
		//OficioValoracion ov = OficioValoracion.searchByRecurso(3L);
		OficioValoracion ov = OficioValoracion.find.byId(id);
		response().setContentType(ov.contenttype);		 
		return ok (ov.contenido);
	}	
	
	public static Result canceladosList(){		
		return ok (views.html.Cancelados.list.render(  Recurso.find.where().in("estado.id", Arrays.asList(401, 402))
				.findList()  ));
	}
	

	// Cuando se cancela en la etapa de clasificación
	public  static Result cambio(Long id, String observacion){
		DynamicForm df =  DynamicForm.form().bindFromRequest();	
		
System.out.println("desde cancelar... "+df);		
		Recurso r = Recurso.find.byId(id);
		r.estado = Estado.find.byId(401L);
		r.observacioncancelacion = new ObservacionCancelacion();
		r.observacioncancelacion.recurso = r;
		r.observacioncancelacion.observacion = df.get("observacion"); 
		/*
		SolicitudCancelacion co = new SolicitudCancelacion();
		
		
		co.observacion = observacion;
		
		co.fechaSolicitud =  new Date();			
		
		
		
		co.recurso = r;
		co.observacion = observacion;
		
		r.cancelacionobservacion = co;		
		*/
		r.update(id);
		
		miCorreo mc = new miCorreo();
		
		mc.para =  Arrays.asList(r.getResponsable().correo.email);
		mc.asunto = "Se ha cancelado el recurso "+r.numcontrol;
		mc.mensaje ="Se determinó que ............ por tanto ha sido cancelado";
		mc.run();
		// Enviar notificacion al celular
    	Notificacion n = new Notificacion();
    	n.enviar(r.numcontrol, "ERDD", mc.mensaje);        
		
		return ok("");
	}
	

	
	
	public static Result revisar(Long id, Long aspecto){
		System.out.println("desde REcursoController.revisar");
System.out.println("recibiendo "+id+",   "+aspecto);		
	    Recurso r = Recurso.find.byId(id);	
	    List<Recursoevaluador> re = Ebean.find(Recursoevaluador.class).fetch("recurso").where().eq("recurso.id",id).eq("aspecto.id", aspecto).findList();
	    List<Object> auxIds = Recursoevaluador.find.where().eq("recurso.id", id).eq("aspecto.id", aspecto).findIds();
	    

	    
	    
	    
System.out.print("auxIds: ");	    
auxIds.forEach(d->System.out.println("    "+ d));	    
	    
System.out.println("r: "+r);	    
		List<Evaluacion> er = Evaluacion.find.where().in("recursoevaluador.id", auxIds).findList();
		
System.out.println("respuestas: "+er.size());		
//System.out.println(er.get(0).evaluaciontabla.version.id+"    "+aspecto);

List<Long> auxIds2 = er.stream().map(m1->m1.evaluaciontabla.id).collect(Collectors.toList());
System.out.println(" auxIds2   ");
	auxIds2.forEach(d->System.out.println("    "+d));



System.out.println("c1:"+r.clasificacion.criterio1.id);
System.out.println("c2:"+r.clasificacion.criterio2.id);
System.out.println("c3:"+r.clasificacion.criterio3.id);
Long cc3 = ClasificadorCriterio3.find.byId(r.clasificacion.criterio3.id).catalogo.id ;
System.out.println("c3 c3:"+ cc3  );
		

System.out.println("antes del antes");
	  List<EvaluacionTablaTipoRecurso> x = EvaluacionTablaTipoRecurso.find
			  .where()
				.eq("evaluaciontabla.version.id",er.get(0).evaluaciontabla.version.id)
				.eq("evaluaciontabla.aspecto.id", aspecto)
				.eq("evaluaciontabla.criterio1.id", r.clasificacion.criterio1.id)
				.eq("evaluaciontabla.criterio2.id", r.clasificacion.criterio2.id)			  
				.eq("evaluaciontabla.criterio3.id", r.clasificacion.criterio3.id)
			  .eq("tiporecurso.id",   cc3 )
			  .findList();
	  
	  
System.out.println("x "+x.size());	  
	  
	  
	  List<Long> xIds = x.stream().map(m1->m1.evaluaciontabla.id).collect(Collectors.toList());
	    
System.out.print("xIds "+xIds.size());	    
xIds.forEach(d->System.out.println("    "+ d));		  
		List<EvaluacionTabla> evt = Ebean.find(EvaluacionTabla.class).where()
				.in("id", auxIds2   )
				.orderBy("aspecto.id")
				.orderBy("reactivo.id")
				.findList();		
		List<EvaluacionObservacion> eo = new ArrayList<EvaluacionObservacion>();
		
		for( Evaluacion auxER : er  ){		
			EvaluacionObservacion auxEO = EvaluacionObservacion.find.where().eq("respuesta.id",auxER.id).findUnique();			
			if ( auxEO != null  ){
				eo.add(auxEO);
			}
		}		
		EvaluacionObservacionGral eog = EvaluacionObservacionGral.find.where().eq("recursoevaluador.id", re.get(0).id).findUnique();
		System.out.println("evt "+evt.size());
		System.out.println("er "+er.size());
		System.out.println("eo "+eo.size());
		

		return ok(views.html.EvaluacionObservacion.edit.render(Recurso.find.byId(id), evt, er, eo, re.get(0).evaluador.id, eog ));		
	}
		

	
	public static Result solicitudCanceladoList(){
		List<SolicitudCancelacion> sc = SolicitudCancelacion.find.fetch("recurso").where().eq("recurso.estado.id", 400L).eq("aceptada", null).findList();	
		return ok(views.html.Cancelados.solicitudCancelacionList.render(sc));
	}	

	public static Result solicitudCancelado(Long id){
		SolicitudCancelacion sc = SolicitudCancelacion.find.fetch("recurso").where().eq("recurso.id",id).eq("recurso.estado.id", 400L).eq("aceptada",null).findUnique();
		return ok(views.html.Cancelados.solicitudCancelacion.render(sc));
	}	
	
	public static Result canceladosEvaluacionList(){
		List<Recurso> r = Recurso.find.where().eq("estado.id", 402).findList();			
		return ok(views.html.Cancelados.canceladosEvaluacionList.render(r));
	}	
	

	public static Result canceladosClasificacionList(){
		List<Recurso> r = Recurso.find.where().eq("estado.id", 401).findList();			
		return ok(views.html.Cancelados.canceladosClasificacionList.render(r));
	}	
	
	
	
	public static Result cancelarRecursoEvaluacion(Long idSocitituCancelacion){
System.out.println("Desde cancelarRecursoEvaluacion");				
		SolicitudCancelacion sc = SolicitudCancelacion.find.byId(idSocitituCancelacion);
		Recurso r = Recurso.find.byId(sc.recurso.id);		
		r.estado = Estado.find.byId(402L);
		r.update();
		sc.aceptada = true;
		sc.fechaAceptacion = new Date();
		sc.update();
	//	return ok("oki".toString());	
		flash("success","Se canceló el recurso "+sc.recurso.numcontrol);
		return redirect ("/solicitudCanceladoList");		
	}
	
	public static Result reactivarRecursoEvaluacion(Long id){
		System.out.println("Desde reactivarRecursoEvaluacion");	
		
		//Recurso r = Recurso.find.fetch("solicitudcancelacion").where().eq("id",id).eq("estado.id", 400L).eq("solicitudcancelacion.aceptada", null).findUnique();
		SolicitudCancelacion sc = SolicitudCancelacion.find.byId(id);
		Recurso r = Recurso.find.byId(sc.recurso.id);		
		r.estado = Estado.find.byId(  sc.recursoestadoanterior.id  );
		r.update();		


		sc.aceptada = false;
		sc.fechaAceptacion = null;
		sc.fechaReactivacion = new Date();
		//sc.update();
		sc.recurso.estado = sc.recursoestadoanterior;
		sc.update(id);
		sc.recurso.update();
		
		//return ok("oki".toString());
		flash("success","Se reactivó el recurso "+sc.recurso.numcontrol);
		return redirect ("/solicitudCanceladoList");
	}	
	
}





