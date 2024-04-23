package controllers;

import models.Oficio;
import models.polimedia.Carrusel;
import org.joda.time.DateTime;
import org.joda.time.DateTimeComparator;
import play.Logger;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class WPMCarruselController extends Controller {

    public static Result mostrar(){
        Logger.info("cargando carrusel...");
        List<Carrusel> auxcs = Carrusel.find
                .where().ne("posicion", 0)
                .setOrderBy("posicion")
                .findList();

        List<Carrusel> cs = auxcs.stream()
                .filter(f-> f.estaVigente())
                .collect(Collectors.toList());
        return ok ( views.html.WebPoliMedia.carrusel.render(cs) );
    }

    public static Result verImagen(Long id) {
        Carrusel c = Carrusel.find.byId(id);
        response().setContentType(c.contenttype);
        return ok (c.contenido);
    }
}
