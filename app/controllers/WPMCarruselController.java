package controllers;

import models.Oficio;
import models.polimedia.Carrusel;
import play.Logger;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

public class WPMCarruselController extends Controller {

    public static Result mostrar(){
        Logger.info("cargando carrusel...");
        List<Carrusel> cs = Carrusel.find
                .where().ne("posicion", 0)
                .setOrderBy("posicion")
                .findList();
        return ok ( views.html.WebPoliMedia.carrusel.render(cs) );
    }


    public static Result verImagen(Long id) {
        Carrusel c = Carrusel.find.byId(id);
        response().setContentType(c.contenttype);
        return ok (c.contenido);
    }


}
