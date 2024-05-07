package actions;

import controllers.routes;
import models.Personal;
import models.RegistroAcceso;
import models.Usuario;
import play.libs.F;
import play.mvc.Action;
import play.mvc.Result;
import play.mvc.Results;

import java.util.Date;

public class ConfirmarAdministradorPM extends Action.Simple {
    public F.Promise<Result> call(play.mvc.Http.Context ctx) throws Throwable {       
        if (play.mvc.Controller.session("cvesRoles").contains("4 ")   ) {
			System.out.println("desde ConfirmarAdministradorPM "+ctx.request().path()+"  "+new Date());
			RegistroAcceso ra = new RegistroAcceso();			
			ra.usuario =  Usuario.find.byId( Personal.find.byId(Long.parseLong(play.mvc.Controller.session("idAdminPM"))  ).id.toString()  );
        	ra.ruta = ctx.request().path();
        	ra.fecha = new Date();
        	ra.ip = ctx.request().remoteAddress();
        	ra.save();
        	return delegate.call(ctx);
        }
        Result unauthorized = Results.redirect(  routes.Application.login()     );
        return F.Promise.pure(unauthorized);
    }
}



