package controllers;

import java.util.Date;
import models.Estado;
import models.Evaluador;
import models.Recurso;
import models.SolicitudCancelacion;
import play.data.DynamicForm;
import play.mvc.*;

public class CancelacionController extends ControladorSeguroEvaluador{
	
	
	public static Result solicitudCancelacion(Long id){
		DynamicForm df = DynamicForm.form().bindFromRequest();
System.out.println(df);
		Recurso recurso = Recurso.find.byId(id);
		SolicitudCancelacion sc = new SolicitudCancelacion();
		sc.recurso = recurso;
		sc.evaluador = Evaluador.find.byId( Long.parseLong(session("idEvaluador")));
		sc.recursoestadoanterior = recurso.estado;
		sc.observacion = df.get("motivo");
	//	sc.observacion = df.get("observacion");
		sc.fechaSolicitud = new Date();
//System.out.println(sc.recurso+" :  "+sc.evaluador+"  :  "+sc.motivoCancelacion+"  :  "+sc.observacion+"  :  "+sc.fechaSolicitud);		
		sc.save();
		
		
		recurso.estado = Estado.find.byId(400L);
		recurso.update();
				
		flash("warning","Se ha solicitado la cancelación del recurso '"+recurso.titulo+"'");
		return redirect("/evList");
		
	}
	

}
