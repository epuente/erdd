package controllers;

import static play.data.Form.form;

import javax.persistence.Entity;

import models.Ctacorreo;

import play.data.Form;
import play.mvc.Result;

@Entity
public class CtacorreoController extends ControladorSeguro{
    public static Result edit(Long id) {    	
        Form<Ctacorreo> ccForm = form(Ctacorreo.class).fill(
            Ctacorreo.find.byId(1L)
        );
        return ok(views.html.ctaCorreoEdit.render(ccForm) );
    }	
    
    
    public static Result update(Long id) {
        Form<Ctacorreo> ccForm = form(Ctacorreo.class).bindFromRequest();
        if(ccForm.hasErrors()) {
            return badRequest(views.html.ctaCorreoEdit.render(ccForm));
        }
        ccForm.get().update(id);
        flash("success", "Se actualizó la información de la cuenta de correo");
        return redirect(   routes.CtacorreoController.edit(1L)  );  
       

}
}
