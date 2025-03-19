package controllers;

import static play.data.Form.form;

import java.util.List;

import javax.persistence.PersistenceException;

import controllers.util.ControladorSeguro;
import models.Autorfuncion;
import play.data.Form;
import play.mvc.Result;
import views.html.catalogos.Autorfuncion.*;


public class AutorfuncionController  extends ControladorSeguro {

    public static Result list(){
System.out.println("-list-");    	
    	List<Autorfuncion> r = Autorfuncion.find.all();
    	return ok (list.render(r));
    }
    
    
    public static Result create() {
        Form<Autorfuncion> afForm = form(Autorfuncion.class);
        flash("success", "Se ha creado el tipo de autoría.");        
        return ok(    createForm.render(afForm) );
    }    
    
    
    public static Result save() {
        Form<Autorfuncion> afForm = form(Autorfuncion.class).bindFromRequest();
        if(afForm.hasErrors()) {
            return badRequest(createForm.render(afForm));
        }
        afForm.get().save();
        flash("success", afForm.get().descripcion + " ha sido creado");
        return GO_HOME;                 
    }    
    
    
    public static Result edit(Long id) {   
System.out.println("-edit-");    	
        Form<Autorfuncion> afForm = form(Autorfuncion.class).fill(
        		Autorfuncion.find.ref(id)
        );
        return ok(editForm.render(id, afForm) );
    }
    
    
    public static Result delete(Long id) {
        Autorfuncion n = Autorfuncion.find.ref(id);
        String nn = n.descripcion;
System.out.println("eliminando: "+n.descripcion);        
        try{
        n.delete();
        flash("success", "'"+nn+"' se eliminó.");
        return GO_HOME;         
         } catch (PersistenceException pe) {
        	 if (   pe.getCause().toString().contains("IntegrityConstraint")){
        		 flash("error", "'"+nn+"' no se puede eliminar puesto que se hace uso del mismo en otros registros.");

        	 }
    		 return GO_HOME;
         }        
    }    
    
    public static Result update(Long id) {    	
        Form<Autorfuncion> afForm = form(Autorfuncion.class).bindFromRequest();
        if(afForm.hasErrors()) {
            return badRequest(editForm.render(id, afForm));
        }
        afForm.get().update(id);
        flash("success","'"+ afForm.get().descripcion + "' ha sido actualizado.");
        return GO_HOME;        
    }     

    public static Result GO_HOME = redirect(
            routes.AutorfuncionController.list() );    
    
}
