import java.util.Calendar;

import play.Application;
import play.GlobalSettings;
import play.api.db.DB;
import play.api.mvc.EssentialFilter;
import play.filters.csrf.CSRFFilter;
import play.filters.gzip.GzipFilter;
import play.libs.F.Promise;
import play.mvc.Http.RequestHeader;
import play.mvc.Result;


import views.html.errorPage;
import views.html.notFoundPage;

public class Global extends GlobalSettings {
    
	@SuppressWarnings("unchecked")
	@Override
    public <T extends EssentialFilter> Class<T>[] filters() {        
        return new Class[]{CSRFFilter.class, GzipFilter.class };
    }
	
	
	
	@Override
	public void beforeStart(Application app) {
		Calendar actual = Calendar.getInstance();
		
		System.out.println("...iniciando el servidor        -        "+String.format("%02d/%02d/%4d a las %02d:%02d:%02d", actual.get(Calendar.DAY_OF_MONTH), (actual.get(Calendar.MONTH)+1), actual.get(Calendar.YEAR), actual.get(Calendar.HOUR_OF_DAY), actual.get(Calendar.MINUTE), actual.get(Calendar.SECOND)   )  );
		System.out.print("...modo:");
		if (app.isDev()){
			System.out.println(" Desarrollo");
		}
		if (app.isProd()){
			System.out.println(" Producción");
		}
		if (app.isTest()){
			System.out.println(" Prueba");
		}		
		System.out.print("...DB:"+DB.getDataSource$default$1());
		System.out.print(" >>>>>> "+		DB.getConnection$default$1()  );
		
	}
	
	
    public Promise<Result> onError(RequestHeader request, Throwable t) {
        return Promise.<Result>pure(play.mvc.Results.internalServerError(
            errorPage.render(t)
        ));
    }
    
    public Promise<Result> onHandlerNotFound(RequestHeader request) {
        return Promise.<Result>pure(play.mvc.Results.notFound(
            notFoundPage.render(request.uri())
        ));
    }    
	
}