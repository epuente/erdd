package controllers;

import static play.data.Form.form;

import models.Personal;
import models.UsuarioRol;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Result;
import views.html.ctaAdminEdit;
import views.html.ctaCoordEdit;


public class PersonalController  extends ControladorSeguro{
    
    public static Result AdminEdit() {    	
    	UsuarioRol c = UsuarioRol.find.where().eq("rol.id", 1).findUnique();    	
        Form<Personal> pForm = form(Personal.class).fill(
            c.usuario.personal
        );
        return ok(ctaAdminEdit.render(pForm) );
    } 
    
    public static Result AdminUpdate(){    	
    	UsuarioRol c = UsuarioRol.find.where().eq("rol.id", 1).findUnique();    	
        Form<Personal> pForm = form(Personal.class).fill(
        		c.usuario.personal        		 
        		).bindFromRequest();
        DynamicForm df = form().bindFromRequest();
        if(pForm.hasErrors()) {
            return badRequest(ctaAdminEdit.render(pForm));
        }
        Personal p = c.usuario.personal;
        p.setNombre(df.field("nombre").value());
        p.paterno = df.field("paterno").value();
        p.materno = df.field("materno").value();
        p.correo = df.field("correo").value();
        
        p.usuario.personal = p;
        p.usuario.usuario = df.field("usuario.usuario").value();
        p.usuario.password = df.field("usuario.password").value();
        
        p.update();
        flash("success", "Se actualizaron los datos del administrador");
        return redirect(   routes.PersonalController.AdminEdit()  );  
    }
    
    public static Result CoordEdit() {    	
    	System.out.println("Desde  PersonalController.CoordEdit");
    	UsuarioRol c = UsuarioRol.find.where().eq("rol.id", 3).findUnique();
        Form<Personal> pForm = form(Personal.class).fill(
        		c.usuario.personal
        );
        return ok(ctaCoordEdit.render(pForm) );
    } 
    
    public static Result CoordUpdate(){  
    	UsuarioRol c = UsuarioRol.find.where().eq("rol.id", 3).findUnique();
        Form<Personal> pForm = form(Personal.class).fill(c.usuario.personal).bindFromRequest();
        DynamicForm df = form().bindFromRequest();
        if(pForm.hasErrors()) {
            return badRequest(ctaAdminEdit.render(pForm));
        }
        Personal p = c.usuario.personal;
        p.setNombre(df.field("nombre").value());
        p.paterno = df.field("paterno").value();
        p.materno = df.field("materno").value();
        p.correo = df.field("correo").value();
        
        p.usuario.personal = p;
        p.usuario.usuario = df.field("usuario.usuario").value();
        p.usuario.password = df.field("usuario.password").value();
        
        p.update();
        flash("success", "Se actualizaron los datos del coordinador");
        return redirect(   routes.PersonalController.CoordEdit()  );  
    }    
    
    
    
}
