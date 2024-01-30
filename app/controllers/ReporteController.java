package controllers;

import models.*;
import play.mvc.Result;

public class ReporteController extends ControladorSeguroCoordinador{
	
	public static Result cesoe(Long id){
		Recurso r = Recurso.find.byId(id);
		return ok( views.html.Reporte.cesoe.render(r) );
	}

	public static Result solicitudFirma(Long id){
		
System.out.println("***");
		return ok("jajajaj");
		
	}	
	
	
}
