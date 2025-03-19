package controllers;
import static play.data.Form.form;

import javax.persistence.PersistenceException;

import controllers.util.ControladorSeguro;
import models.Areaconocimiento;
import play.data.Form;
import play.mvc.*;
import views.html.catalogos.Areaconocimiento.*;

public class AreaconocimientoController extends ControladorSeguro {
	
    public static Result GO_HOME = redirect(
            routes.AreaconocimientoController.list()
        );	
	
    public static Result list() {
    	return ok(
    	list.render(
                Areaconocimiento.find.all()
            )
         );        
    }
    
    
    public static Result create() {
        Form<Areaconocimiento> areaconocimientoForm = form(Areaconocimiento.class);
        return ok(
            createForm.render(areaconocimientoForm)
        );
    }    
    
    public static Result save() {
        Form<Areaconocimiento> areaconocimientoForm = form(Areaconocimiento.class).bindFromRequest();
        if(areaconocimientoForm.hasErrors()) {
            return badRequest(createForm.render(areaconocimientoForm));
        }
        areaconocimientoForm.get().save();
        flash("success", areaconocimientoForm.get().descripcion + " ha sido creado");
        return GO_HOME;                 
    }    
    
    
    public static Result edit(Long id) {
        Form<Areaconocimiento> areaconocimientoForm = form(Areaconocimiento.class).fill(
            Areaconocimiento.find.byId(id)
        );
        return ok(editForm.render(id, areaconocimientoForm)
        );
    }
    
    
    public static Result delete(Long id) {    	
        Areaconocimiento a = Areaconocimiento.find.ref(id);
        
        String na = a.descripcion;
        try{
        a.delete();
        flash("success", "'"+na+"' se eliminó.");
        return GO_HOME;         
         } catch (PersistenceException pe) {
        	 if (   pe.getCause().toString().contains("IntegrityConstraint")){
        		 flash("error", "'"+na+"' no se puede eliminar puesto que se hace uso de la misma en otros registros.");

        	 }
    		 return GO_HOME;
         }         
    }    
    
    public static Result update(Long id) {
        Form<Areaconocimiento> areaconocimientoForm = form(Areaconocimiento.class).bindFromRequest();
        if(areaconocimientoForm.hasErrors()) {
            return badRequest(editForm.render(id, areaconocimientoForm));
        }
        areaconocimientoForm.get().update(id);
        flash("success", "'" + areaconocimientoForm.get().descripcion + "' ha sido actualizada.");
        return GO_HOME;        
    }    
    
}