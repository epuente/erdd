package controllers;

import static play.data.Form.form;

import java.util.List;

import javax.persistence.PersistenceException;

import models.Dirigidoa;

import play.data.Form;
import play.mvc.Result;
import views.html.catalogos.Dirigidoa.*;

public class DirigidoaController extends ControladorSeguro{
	
    public static Result GO_HOME = redirect(
            routes.DirigidoaController.list() );   
    
	public static Result list(){
		List<Dirigidoa> a = Dirigidoa.find.all();
		return ok( list.render(a)  );	
	}

	public static Result create(){
		Form<Dirigidoa> aForm =	form(Dirigidoa.class);	
		return ok( views.html.catalogos.Dirigidoa.createForm.render(aForm)  );
	}
	
    public static Result delete(Long id) {
    	Dirigidoa an = Dirigidoa.find.ref(id);
        String nn = an.descripcion;        
        try{
        an.delete();
        flash("success", "'"+nn+"' se eliminó.");
        return GO_HOME;         
         } catch (PersistenceException pe) {
        	 if (   pe.getCause().toString().contains("IntegrityConstraint")){
        		 flash("error", "'"+nn+"' no se puede eliminar puesto que se hace uso del mismo en otros registros.");

        	 }
    		 return GO_HOME;
         }        
    }   
    
    public static Result save() {
        Form<Dirigidoa> afForm = form(Dirigidoa.class).bindFromRequest();
System.out.println(afForm);        

        if(afForm.hasErrors()) {
            return badRequest(createForm.render(afForm));
        }
        Dirigidoa a = afForm.get();
        a.save();
        flash("success", a.descripcion+" ha sido creado");
        return GO_HOME;                 
    }      
	
    public static Result edit(Long id) {   	
        Form<Dirigidoa> aForm = form(Dirigidoa.class).fill(
        		Dirigidoa.find.byId(id)
        );
        return ok(editForm.render(id, aForm) );
    }     
    

    public static Result update(Long id) {
        Form<Dirigidoa> aForm = form(Dirigidoa.class).bindFromRequest();
        if(aForm.hasErrors()) {
            return badRequest(editForm.render(id, aForm));
        }
        aForm.get().update(id);
        flash("success", "'" + aForm.get().descripcion + "' ha sido actualizado.");
        return GO_HOME;        
    }  	

}
