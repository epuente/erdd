package controllers;

import models.Director;
import play.data.Form;
import play.mvc.Result;


import static play.data.Form.form;

public class DirectoresController extends ControladorSeguro{
    public static Result edit(String ur) {
        Form<Director> dForm = form(Director.class).fill(
                Director.find.where().eq("ur", ur).findUnique()
        );
        switch (ur){
            case "DEV":
                return ok( views.html.catalogos.Directores.DirectorDEV.editForm.render(dForm.get().id,  dForm)  );
            case "EMS":
                return ok( views.html.catalogos.Directores.DirectorEMS.editForm.render(dForm.get().id,  dForm)  );
            case "ES":
                return ok( views.html.catalogos.Directores.DirectorES.editForm.render(dForm.get().id,  dForm)  );
            case "PGD":
                return ok( views.html.catalogos.Directores.DirectorPGD.editForm.render(dForm.get().id,  dForm)  );
            default:
                throw new IllegalStateException("Unexpected value: " + ur);
        }
        //return ok(  editForm.render(1L, dForm)  );
    }

    public static Result update(String ur) {
        Form<Director> aForm = form(Director.class).bindFromRequest();
        /*
        if(aForm.hasErrors()) {
            return badRequest(editForm.render(1L, aForm));
        }
         */
        Director d = Director.find.where().eq("ur", ur).findUnique();
        aForm.get().update(d.id);
        flash("success", "Se actualizó la información del director.");
        //return redirect ( routes.DirectoresController.edit(ur)  );
        switch (ur){
            case "DEV":
                return redirect (routes.DirectoresController.edit(ur));
            default:
                throw new IllegalStateException("Unexpected value: " + ur);
        }
    }



}
