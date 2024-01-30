package controllers;

import static play.data.Form.form;

import java.util.List;

import javax.persistence.PersistenceException;

import models.Tipodocumento;
import play.data.Form;
import play.mvc.Result;
import views.html.Tipodocumento.*;

public class TipodocumentoController extends ControladorSeguro{

    public static Result GO_HOME = redirect(
            routes.TipodocumentoController.list() );   
    
	public static Result list(){
		List<Tipodocumento> a = Tipodocumento.find.all();
		return ok( list.render(a)  );	
	}

	public static Result create(){
		Form<Tipodocumento> aForm =	form(Tipodocumento.class);	
		return ok( views.html.Tipodocumento.createForm.render(aForm)  );	
	}
	
    public static Result delete(Long id) {
        Tipodocumento an = Tipodocumento.find.ref(id);
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
        Form<Tipodocumento> afForm = form(Tipodocumento.class).bindFromRequest();
System.out.println(afForm);        

        if(afForm.hasErrors()) {
            return badRequest(createForm.render(afForm));
        }
        Tipodocumento a = afForm.get();
        a.save();
        flash("success", a.descripcion+" ha sido creado");
        return GO_HOME;                 
    }      
	
    public static Result edit(Long id) {   	
        Form<Tipodocumento> aForm = form(Tipodocumento.class).fill(
            Tipodocumento.find.byId(id)
        );
        
        
        Tipodocumento tdoc = Tipodocumento.find.byId(id);
        System.out.println(tdoc.estado.descripcion);
      //  return ok (editForm.render(id, TipoDocumentoForm.fill(tdoc)));
        return ok(editForm.render(id, aForm) );
    }     
    

    public static Result update(Long id) {
        Form<Tipodocumento> aForm = form(Tipodocumento.class).bindFromRequest();
        if(aForm.hasErrors()) {
            return badRequest(editForm.render(id, aForm));
        }
        aForm.get().update(id);
        flash("success", "'" + aForm.get().descripcion + "' ha sido actualizado.");
        return GO_HOME;        
    }        
	

}
