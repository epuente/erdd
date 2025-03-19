package controllers;

import static play.data.Form.form;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.PersistenceException;

import controllers.util.ControladorSeguro;
import models.Formatoentrega;
import play.data.Form;
import play.mvc.Result;
import views.html.catalogos.Formatoentrega.*;

@Entity
public class FormatoentregaController extends ControladorSeguro {
    public static Result GO_HOME = redirect(
            routes.FormatoentregaController.list() );   
    
	public static Result list(){
		List<Formatoentrega> a = Formatoentrega.find.all();
		return ok( list.render(a)  );	
	}

	public static Result create(){
		Form<Formatoentrega> aForm =	form(Formatoentrega.class);	
		return ok( createForm.render(aForm)  );
	}
	
    public static Result delete(Long id) {
        Formatoentrega an = Formatoentrega.find.ref(id);
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
        Form<Formatoentrega> feForm = form(Formatoentrega.class).bindFromRequest();
System.out.println(feForm);        

        if(feForm.hasErrors()) {
            return badRequest(createForm.render(feForm));
        }
        Formatoentrega a = feForm.get();
        a.save();
        flash("success", a.descripcion+" ha sido creado");
        return GO_HOME;                 
    }      
	
    public static Result edit(Long id) {   	
        Form<Formatoentrega> aForm = form(Formatoentrega.class).fill(
            Formatoentrega.find.byId(id)
        );
        return ok(editForm.render(id, aForm) );
    }     
    

    public static Result update(Long id) {
        Form<Formatoentrega> aForm = form(Formatoentrega.class).bindFromRequest();
        if(aForm.hasErrors()) {
            return badRequest(editForm.render(id, aForm));
        }
        aForm.get().update(id);
        flash("success", "'" + aForm.get().descripcion + "' ha sido actualizado.");
        return GO_HOME;        
    }        
	

}
