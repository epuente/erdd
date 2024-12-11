package controllers;

import static play.data.Form.form;

import java.util.Collections;
import java.util.List;

import models.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.fasterxml.jackson.databind.JsonNode;

import actions.Notificacion;
import actions.miCorreo;
import play.data.Form;
import play.mvc.Result;
import views.html.Clasificacion.*;


public class ClasificacionController extends ControladorSeguroCoordinador {

    public static Result GO_HOME = redirect(
            routes.ClasificacionController.list()
        );	
	
	
    public static Result list(){    	
    	List<Recurso>  r = Recurso.find.where().eq("estado.id", 5L).findList();
        System.out.println("tamaño r : "+r.size());
    	return ok(list.render(r ));    	
    }
    
    
	public static Result create(Long id){		
		Form<Clasificacion> reForm =	form(Clasificacion.class);
		
		List<ClasificadorCriterio3> tempo = ClasificadorCriterio3.find.fetch("catalogo").findList();
		
		tempo.forEach(a->
		System.out.print(a.id+"    "+a.criterio1.id+"      "+a.criterio2.id+"     " +a.catalogo.descripcion+"\n")
		
		
				
				);
		
		return ok(  create.render(reForm, id, 
						ClasificadorCriterio2.find.all(), 
						ClasificadorCriterio3.find.fetch("catalogo").findList(),
						ClasificadorCancelable.find.all(),
						ClasificadorNoevaluable.find.all(),
						ClasificadorTiporecurso.find.all()
				  	)  
				 );		
	}    

	
	public static Result save(){
		Form<Clasificacion> cForm = form(Clasificacion.class).bindFromRequest();
		Recurso r = Recurso.find.byId(cForm.get().recurso.id);
        Clasificacion c = cForm.get();
        r.clasificacion = c;
        r.estado = Estado.find.byId(5L);
        
        System.out.println("recibidos   "+c.criterio1.id+"   "+c.criterio2.id+"    "+c.criterio3.id+"     tr:"+c.tiporecurso.id);
        
		///ClasificadorCriterio3 cc3 = ClasificadorCriterio3.find.byId(  c.criterio3.catalogo.id);        


		//Es cancelable?
        System.out.println(" *  00000");
        List<ClasificadorCancelable> cancela = ClasificadorCancelable.find.where()
        		.eq("criterio1.id", c.criterio1.id)
        		.eq("criterio2.id", c.criterio2.id)
        		.eq("criterio3.id", c.criterio3.id).findList();
        		//.eq("criterio3.id", cc3.id).findList();
        System.out.println(" *  00010");
        if (  cancela.isEmpty()  ){
			System.out.println("No es cancelable");
			r.clasificacion.observacion = null;        	
        	
        } else {
        	System.out.println("cancelable");	        	
			// Enviar correo al autor responsable para indicarle que se cancela la solicitud
			miCorreo mc = new miCorreo();
			mc.para = Collections.singletonList(r.getResponsable().correo.email);
			mc.asunto="Cancelación del recurso "+r.numcontrol +" - "+r.titulo;
			mc.mensaje ="Estimado(a): "+r.getResponsable().nombreCompleto()+".<br><br>";
			mc.mensaje +="Se determinó que la solicitud de rdd que usted presentó sea cancelada debido que su clasificación...";
			mc.enviar();

            CorreoSalida cs = new CorreoSalida(mc, r);
            cs.save();

            // Enviar correo al coordinador
			mc.para = Collections.singletonList(Personal.elCoordinador().correo);
			mc.mensaje = "Se ha cancelado la solicitud "+r.numcontrol +" - "+ r.titulo +" durante el proceso de clasificación";
			mc.enviar();

            CorreoSalida cs2 = new CorreoSalida(mc, r);
            cs2.save();
			
			
			// Enviar notificacion al celular (docente)
	    	Notificacion n = new Notificacion();
	    	n.enviar(r.numcontrol, "ERDD", "Se determinó que la solicitud que usted presentó sea cancelada debido que su clasificación...");        
			

			if (cForm.field("observacion.observacion").value().length() != 0){
				clasificacionObservacion co = new clasificacionObservacion();
				co.observacion = cForm.field("observacion.observacion").value();
				co.clasificacion = r.clasificacion; 
				r.clasificacion.observacion = co;  				
			}

			
			//Estado de cancelación
			r.estado = Estado.find.byId(401L);        	
        }
		r.update();
        
        
        flash("success", "Se asignó la clasificación del recurso '"+r.titulo+"'");
        return redirect ("/oficios");        
    }
	
	
    public static Result edit(Long id) {
        Form<Clasificacion> cForm = form(Clasificacion.class).fill(
        		Recurso.find.byId(id).clasificacion            
        );
        
        return ok(
            edit.render(id, cForm,
            		ClasificadorCriterio2.find.all(), 
					ClasificadorCriterio3.find.all(),
					ClasificadorCancelable.find.all(),
					ClasificadorNoevaluable.find.all(),
					ClasificadorTiporecurso.find.all()
					)
        );
    }	
    
    public static Result update(Long id) {
        System.out.println("entrando a update....");
        Form<Clasificacion> cForm = form(Clasificacion.class).bindFromRequest();
        System.out.println(cForm);
        if(cForm.hasErrors()) {
        	flash("warning","No se pudo actualizar");
            return badRequest(edit.render(id, cForm, 
            		ClasificadorCriterio2.find.all(), 
					ClasificadorCriterio3.find.all(),
					ClasificadorCancelable.find.all(),
					ClasificadorNoevaluable.find.all(),
					ClasificadorTiporecurso.find.all()
				));
        }
        Clasificacion Clasifica = cForm.get();
        Clasifica.update();
        flash("success","Se actualizó la clasificación");
        return GO_HOME;
       
    }    
    
    
    public static Result ejemplos(Long c1, Long c2, Long c3){
        System.out.println(c1+" - "+c2+" - "+c3);
		JSONArray losDatos = new JSONArray();
    	List<ClasificadorEjemplo> ejemplos = ClasificadorEjemplo.find.where()
    			.eq("criterio1.id", c1)
    			.eq("criterio2.id", c2)
    			.eq("criterio3.id",   ClasificadorCriterio3
    					.find.byId(c3).catalogo.id)
    			.orderBy("tiporecurso.descripcion")
    			.findList();
    	for(ClasificadorEjemplo ejemplo : ejemplos){
    		//aux+="<tr><td>"+ejemplo.tiporecurso.descripcion+"</td></tr>";
    		try {
    			JSONObject dato = new JSONObject();
				dato.put("id", ejemplo.tiporecurso.id);
				dato.put("descripcion", ejemplo.tiporecurso.descripcion);
				System.out.println(  dato  );
				losDatos.put(dato);
			} catch (JSONException e) {
				System.out.println("Ocurrio un error: "+e.getMessage()+"\n\n"+e.getCause());
			}
    	}    
        System.out.println("retornano:"+losDatos.toString());
		return ok ( losDatos.toString() );
    }

    
    public static Result clasificacionRestricciones(){
    	JsonNode json = request().body().asJson();
    	long c1 = json.findPath("c1").asLong();
    	long c2 = json.findPath("c2").asLong();
    	long c3 = json.findPath("c3").asLong();
    	System.out.println(c1+"  "+c2+"  "+c3+"       "+ClasificadorCriterio3.find.byId(c3).catalogo.id);
    	List<ClasificadorNoevaluable> r = ClasificadorNoevaluable.find.where()
    		.eq("criterio1.id", c1).eq("criterio2.id", c2).eq("criterio3.id", ClasificadorCriterio3
					.find.byId(c3).catalogo.id)
    		.findList();
    	List<ClasificadorCancelable> rc = ClasificadorCancelable.find.where()
        		.eq("criterio1.id", c1).eq("criterio2.id", c2).eq("criterio3.id", ClasificadorCriterio3
    					.find.byId(c3).catalogo.id)
        		.findList();    	
    	System.out.println(  "{\"noevaluable\":"+  (r.size()>0)+", \"cancelable\":"+  (rc.size()>0)+" }"   );
    	return ok ( "{\"noevaluable\":"+  (r.size()>0)+", \"cancelable\":"+  (rc.size()>0)+" }" );
    }
    
    
    public static Result descripcionCriterio(){
    	JsonNode json = request().body().asJson();
    	long criterio = json.findPath("criterio").asLong();
    	long id = json.findPath("id").asLong();
    	String aux = "";
    	if (criterio == 2L){
    		ClasificadorCriterio2 d = ClasificadorCriterio2.find.byId(id);
     		aux = d.informacion;  
    	}
    	if (criterio == 3L){
    		ClasificadorCriterio3 d = ClasificadorCriterio3.find.byId(id);
    		aux = d.catalogo.informacion;    		
    	}    	
		return ok(  "{\"descripcion\":\""+  aux +"\"}");    	
    }    
    
}
