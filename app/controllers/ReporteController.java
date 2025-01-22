package controllers;

import models.*;
import play.mvc.Result;
import views.html.accesoNoAutorizado;

public class ReporteController extends ControladorSeguroCoordinador{
	
	public static Result cesoe(Long id){
		Recurso r = Recurso.find.byId(id);
		return ok( views.html.Reporte.cesoe.render(r) );
	}

	public static Result solicitudFirma(Long id){
		
System.out.println("***");
		return ok("jajajaj");
		
	}


    public static Result verFirma(Long id) {
        System.out.println("    id evaluador:"+id);

        Evaluador e = Evaluador.find.setId(id).findUnique();
        EvaluadorFirma ef = e.firma;

                response().setContentType(ef.contenttype);
                System.out.println("Visualizando firma del evaluador");
                return ok (ef.contenido);
    }




}
