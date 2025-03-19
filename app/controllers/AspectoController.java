package controllers;

import static play.data.Form.form;

import java.util.List;

import javax.persistence.PersistenceException;

import controllers.util.ControladorSeguro;
import models.Aspecto;
import play.data.Form;
import play.mvc.Result;
import views.html.Aspecto.*;



public class AspectoController extends ControladorSeguro {
    public static Result GO_HOME = redirect(
            routes.AspectoController.list() );   
    
	public static Result list(){
		List<Aspecto> a = Aspecto.find.all();
		return ok( list.render(a)  );	
	}

	public static Result create(){
		Form<Aspecto> aForm =	form(Aspecto.class);	
		return ok( views.html.Aspecto.createForm.render(aForm)  );	
	}
	
    public static Result delete(Long id) {
        Aspecto an = Aspecto.find.ref(id);
        String nn = an.descripcion;
System.out.println("eliminando: "+an.descripcion);        
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
        Form<Aspecto> afForm = form(Aspecto.class).bindFromRequest();
System.out.println(afForm);        

        if(afForm.hasErrors()) {
            return badRequest(createForm.render(afForm));
        }
        Aspecto a = afForm.get();
        a.save();
        flash("success", a.descripcion+" ha sido creado");
        return GO_HOME;                 
    }      
	
    public static Result edit(Long id) {   	
        Form<Aspecto> aForm = form(Aspecto.class).fill(
            Aspecto.find.byId(id)
        );
        return ok(editForm.render(id, aForm) );
    }     
    

    public static Result update(Long id) {
        Form<Aspecto> aForm = form(Aspecto.class).bindFromRequest();
        if(aForm.hasErrors()) {
            return badRequest(editForm.render(id, aForm));
        }
        aForm.get().update(id);
        flash("success", "'" + aForm.get().descripcion + "' ha sido actualizado.");
        return GO_HOME;        
    }        
    
    
}
