package actions;

import controllers.routes;
import play.libs.F;
import play.mvc.Action;
import play.mvc.Result;
import play.mvc.Results;

public class Autenticar extends Action.Simple {  
    public F.Promise<Result> call(play.mvc.Http.Context ctx) throws Throwable {
    	String token = play.mvc.Controller.session("nombre");       
        if (token != null ) {
        	return delegate.call(ctx);
        }
        //Result unauthorized = Results.unauthorized("Acceso no autorizado, requiere iniciar sesión como usuario autorizado.");
        Result unauthorized = Results.redirect(  routes.Application.errorInicioSesion()     );
        return F.Promise.pure(unauthorized);
    }
 

}



