package actions;

import java.util.Date;

import controllers.routes;
import models.Personal;
import models.RegistroAcceso;
import models.Usuario;

import play.Play;
import play.libs.F;
import play.mvc.Action;
import play.mvc.Result;
import play.mvc.Results;

public class ConfirmarAdministradorProceso extends Action.Simple {  
    public F.Promise<Result> call(play.mvc.Http.Context ctx) throws Throwable {       
        if (play.mvc.Controller.session("cvesRoles").contains("3 ")   ) {

            System.out.println("desde ConfirmarAdministradorProceso " + ctx.request().path() + "  " + new Date());


            // Time en la sesion del usuario
            String previousTick = play.mvc.Controller.session("userTime");
            if (previousTick != null && !previousTick.isEmpty()) {
                long previousT = Long.parseLong(previousTick);
                long currentT = new Date().getTime();
                long timeout = Long.parseLong(Play.application().configuration().getString("sessionTimeout")) * 1000 * 60;
                if ((currentT - previousT) > timeout) {
                    // session expired
                    play.mvc.Controller.session().clear();
                    //return null;
                    Result timedOut = Results.redirect(routes.Application.timeOut());
                    return F.Promise.pure(timedOut);
                }
            }


            String tickString = Long.toString(new Date().getTime());
            play.mvc.Controller.session("userTime", tickString);

            if (!ctx.request().path().equals("/cuentaRegistrosGeo")){
                RegistroAcceso ra = new RegistroAcceso();
                ra.usuario = Usuario.find.byId(Personal.find.byId(Long.parseLong(play.mvc.Controller.session("idAdminProceso"))).id.toString());
                ra.ruta = ctx.request().path();
                ra.fecha = new Date();
                ra.ip = ctx.request().remoteAddress();
                ra.save();
            }
        	return delegate.call(ctx);
        }
   //     Result unauthorized = Results.unauthorized("Acceso no autorizado, requiere iniciar sesión como usuario autorizado.");
        Result unauthorized = Results.redirect(  routes.Application.login()     );
        return F.Promise.pure(unauthorized);
    }
 

}



