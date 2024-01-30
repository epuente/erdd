package actions;

import java.util.Date;

import controllers.routes;
import models.Evaluador;
import models.RegistroAcceso;
import models.Usuario;
import play.libs.F;
import play.mvc.Action;
import play.mvc.Result;
import play.mvc.Results;

public class ConfirmarEvaluador extends Action.Simple {
    public F.Promise<Result> call(play.mvc.Http.Context ctx) throws Throwable {
        if (play.mvc.Controller.session("cvesRoles").contains("2 ")   ) {

        	Usuario eva = Evaluador.getUsuario(Long.parseLong(play.mvc.Controller.session("idEvaluador")));
System.out.println("desde ConfirmarEvaluador "+ctx.request().path());
			RegistroAcceso ra = new RegistroAcceso();
			ra.usuario =  eva;
        	ra.ruta = ctx.request().path();
        	ra.fecha = new Date();
        	ra.ip = ctx.request().remoteAddress();
        	ra.save();
        	return delegate.call(ctx);

        }
   //     Result unauthorized = Results.unauthorized("Acceso no autorizado, requiere iniciar sesión como usuario autorizado.");
        Result unauthorized = Results.redirect(  routes.Application.login()     );
        return F.Promise.pure(unauthorized);
    }


}
