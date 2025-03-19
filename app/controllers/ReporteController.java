package controllers;

import controllers.util.ControladorSeguroCoordinador;
import models.*;
import play.mvc.Result;

public class ReporteController extends ControladorSeguroCoordinador {
	
	public static Result cesoe(Long id){
		Recurso r = Recurso.find.byId(id);
		return ok( views.html.Reporte.cesoe.render(r) );
	}

	public static Result solicitudFirma(Long id){
		
System.out.println("***");
		return ok("jajajaj");
		
	}


    public static Result verLogo(Long id){
        ReporteLogo rl = ReporteLogo.find.byId(id);
        response().setContentType(rl.contenttype);
        System.out.println("Visualizando logo "+id);
        return ok (rl.contenido);
    }




}
