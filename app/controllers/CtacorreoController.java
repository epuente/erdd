package controllers;

import static play.data.Form.form;

import javax.persistence.Entity;

import classes.Encriptacion2;
import com.avaje.ebean.Ebean;
import controllers.util.ControladorSeguro;
import models.Ctacorreo;

import org.json.JSONException;
import org.json.JSONObject;
import play.data.Form;
import play.mvc.Result;

import java.util.List;
import java.util.Objects;

@Entity
public class CtacorreoController extends ControladorSeguro {

    public static Result list(){
        List<Ctacorreo> retorno = Ctacorreo.find
                .orderBy().asc("prioridad")
                .findList();

        return ok(views.html.CtaCorreo.list.render(retorno) );
    }


    public static Result create(){
        Form<Ctacorreo> ccForm = form(Ctacorreo.class);
        return ok(views.html.CtaCorreo.create.render(ccForm) );
    }

    public static Result save(){
        System.out.println("Desde CtacorreoController.save");
        Form<Ctacorreo> ccForm = form(Ctacorreo.class).bindFromRequest();
        System.out.println("forma "+ccForm);
        if (ccForm.hasErrors()){
            return badRequest(views.html.CtaCorreo.create.render(ccForm));
        }
        Ctacorreo cc = ccForm.get();
        boolean estaActivo = Objects.equals(ccForm.field("activo").value(), "true");
        System.out.println("activo "+ccForm.field("activo").value());
        System.out.println("activo "+ estaActivo );

        if (estaActivo){
            String sql = "update ctacorreo c set activo=false where activo=true";
            int row = Ebean.createSqlUpdate(sql).execute();
        }




        cc.activo = estaActivo;
        Encriptacion2 e2 = new Encriptacion2(cc.contrasenia);
        cc.contrasenia = e2.encrypt();


        cc.save();
        return redirect(routes.CtacorreoController.list());
    }

    public static Result edit(Long id) {    	
        Form<Ctacorreo> ccForm = form(Ctacorreo.class).fill(
            Ctacorreo.find.byId(id)
        );
        Ctacorreo o = ccForm.get();
        Encriptacion2 e2 = new Encriptacion2(o.contrasenia);
        String textoPlano = e2.decrypt();
        return ok(views.html.CtaCorreo.ctaCorreoEdit.render(ccForm, textoPlano) );
    }
    
    


    // Usando encriptación para guardar los passwords
    public static Result update2(Long id) {
        Form<Ctacorreo> ccForm = form(Ctacorreo.class).bindFromRequest();
        String textoPlano = ccForm.field("contrasenia").value();
        if(ccForm.hasErrors()) {
            return badRequest(views.html.CtaCorreo.ctaCorreoEdit.render(ccForm, textoPlano));
        }
        Ctacorreo cta = ccForm.get();
        // Crea un objeto Encriptacion2 con texto plano en su propiedad contrasenia
        Encriptacion2 e2 = new Encriptacion2( textoPlano );
        cta.id = id;
        cta.contrasenia = e2.encrypt();

        boolean estaActivo = Objects.equals(ccForm.field("activo").value(), "true");
        System.out.println("activo "+ccForm.field("activo").value());
        System.out.println("activo "+ estaActivo );

        if (estaActivo){
            String sql = "update ctacorreo c set activo=false where activo=true";
            int row = Ebean.createSqlUpdate(sql).execute();
        }

        cta.activo = estaActivo;

        System.out.println("id "+cta.id);
        System.out.println("id "+cta.contrasenia);

        cta.update();
        flash("success", "Se actualizó la información de la cuenta de correo");
        //return redirect(   routes.CtacorreoController.edit(1L)  );
        return redirect(routes.CtacorreoController.list());
    }

    public static Result delete(Long id) throws JSONException {
        JSONObject jObject = new JSONObject();
        Ebean.find(Ctacorreo.class).setId(id).findUnique().delete();
        System.out.println("Se eliminó la cuenta de salida");
        jObject.put("estado", "ok");
        return ok (jObject.toString());
    }


}
