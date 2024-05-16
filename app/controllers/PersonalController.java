package controllers;

import static play.data.Form.form;

import models.Personal;
import models.Rol;
import models.Usuario;
import models.UsuarioRol;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Result;
import views.html.ctaAdminEdit;
import views.html.ctaCoordEdit;
import views.html.ctaAdminPMEdit;


public class PersonalController  extends ControladorSeguro{
    
    public static Result AdminEdit() {    	
    	UsuarioRol c = UsuarioRol.find.where().eq("rol.id", 1).findUnique();    	
        Form<Personal> pForm = form(Personal.class).fill(
            c.usuario.personal
        );
        return ok(ctaAdminEdit.render(pForm) );
    } 
    
    public static Result AdminUpdate(){
    	UsuarioRol c = UsuarioRol.find.where().eq("rol.id", 1 ).findUnique();
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

    public static Result CtaAdminPMEdit() {
        UsuarioRol c = UsuarioRol.find.where().eq("rol.id", 4).findUnique();
        Form<Personal> pForm;
        if (c!=null) {
            pForm = form(Personal.class).fill(
                    c.usuario.personal
            );
        } else {
            // No existe ningun administradoer de polimedia
            pForm = form(Personal.class);
        }
        return ok(ctaAdminPMEdit.render(pForm));
    }

    public static Result AdminPMSave(){
        DynamicForm df = form().bindFromRequest();
        System.out.println(df);
        Personal p = new Personal();
        p.setNombre(df.field("nombre").value());
        p.paterno = df.field("paterno").value();
        p.materno = df.field("materno").value();
        p.correo = df.field("correo").value();

        Usuario u = new Usuario();
        u.personal = p;
        u.usuario = df.field("usuario.usuario").value();
        u.password = df.field("usuario.password").value();

        /*p.usuario.personal = p;
        p.usuario.usuario = df.field("usuario.usuario").value();
        p.usuario.password = df.field("usuario.password").value();
        */


        UsuarioRol ur = new UsuarioRol();
        ur.usuario = u;
        ur.rol = Rol.find.byId(4L);

        u.roles.add(ur);
        p.usuario = u;
        p.save();
        flash("success", "Se agregaron los datos del administrador de PoliMedia");
        return redirect(   routes.PersonalController.CtaAdminPMEdit()  );
    }


    public static Result AdminPMUpdate(){
        UsuarioRol c = UsuarioRol.find.where().eq("rol.id", 4 ).findUnique();
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
        flash("success", "Se actualizaron los datos del administrador de PoliMedia");
        return redirect(   routes.PersonalController.CtaAdminPMEdit()  );
    }
    
}
