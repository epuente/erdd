package controllers;

import com.avaje.ebean.Expr;
import models.polimedia.Polimedia;
import models.polimedia.PolimediaCarrusel;
import models.polimedia.PolimediaCarruselImagen;
import play.Logger;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;
import java.util.stream.Collectors;

public class WPMCarruselController extends ControladorDefault {

    public static Result mostrar(){
        Logger.info("cargando carrusel...");

        // Lista de los recursos en polimedia que no esta habilitados
        List<Polimedia> aux = Polimedia.find
                        .where()
                                .eq("habilitado", false)
                        .findList();

        Logger.debug("aux.size: "+aux.size());
        List<Long> noHab = aux.stream().map(m->m.recurso.id).collect(Collectors.toList());
        noHab.forEach(v->{
            System.out.println("id "+v);
        });


        List<PolimediaCarrusel> auxcs = PolimediaCarrusel.find
                .where()
                    .ne("posicion", 0)
                    .not(Expr.in("recurso.id", noHab ))
                .setOrderBy("posicion")
                .findList();

        List<PolimediaCarrusel> cs = auxcs.stream()
                .filter(f-> f.estaVigente())
                .collect(Collectors.toList());
        return ok ( views.html.WebPoliMedia.carrusel.render(cs) );
    }

    public static Result verImagen(Long id) {
        PolimediaCarruselImagen c = PolimediaCarruselImagen.find.byId(id);
        response().setContentType(c.contenttype);
        return ok (c.contenido);
    }


}
