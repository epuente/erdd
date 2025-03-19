package controllers;
import static play.data.Form.form;

import javax.persistence.PersistenceException;

import controllers.util.ControladorSeguro;
import models.Niveleducativo;
import play.data.Form;
import play.mvc.*;
import views.html.catalogos.Niveleducativo.*;

public class NiveleducativoController extends ControladorSeguro {
	
    public static Result GO_HOME = redirect(
            //routes.NiveleducativoController.list(0, "descripcion", "asc", "")
    		routes.NiveleducativoController.listDT()
        );	
	
    public static Result list(int page, String sortBy, String order, String filter) {
    	return ok("");        
    }
    
    public static Result listDT() {
    	return ok(list.render(Niveleducativo.find.all()));
    }
    public static Result create() {
        Form<Niveleducativo> niveleducativoForm = form(Niveleducativo.class);
        return ok(
            createForm.render(niveleducativoForm)
        );
    }    
    
    public static Result save() {
        Form<Niveleducativo> niveleducativoForm = form(Niveleducativo.class).bindFromRequest();
        if(niveleducativoForm.hasErrors()) {
            return badRequest(createForm.render(niveleducativoForm));
        }
        niveleducativoForm.get().save();
        flash("success",  niveleducativoForm.get().descripcion + " ha sido creado");
        return GO_HOME;                 
    }    
    
    
    public static Result edit(Long id) {
System.out.println("desde edit...."+id);     	
        Form<Niveleducativo> niveleducativoForm = form(Niveleducativo.class).fill(
            Niveleducativo.find.byId(id)
        );
        return ok(editForm.render(id, niveleducativoForm)
        );
    }
    
    
    public static Result delete(Long id) {
        Niveleducativo n = Niveleducativo.find.ref(id);
        String nn = n.descripcion;
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
System.out.println("desde update...."+id);     	
        Form<Niveleducativo> niveleducativoForm = form(Niveleducativo.class).bindFromRequest();
        if(niveleducativoForm.hasErrors()) {
            return badRequest(editForm.render(id, niveleducativoForm));
        }
        niveleducativoForm.get().update(id);
        flash("success","'"+ niveleducativoForm.get().descripcion + "' ha sido actualizado.");
        return GO_HOME;        
    }    
    
}