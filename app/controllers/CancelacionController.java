package controllers;

import java.util.Collections;
import java.util.Date;

import actions.miCorreo;
import models.*;
import play.data.DynamicForm;
import play.mvc.*;

public class CancelacionController extends ControladorSeguroEvaluador{
	
	// El evaluador solicita sea cancelado el recurso
	public static Result solicitudCancelacion(Long id){
		DynamicForm df = DynamicForm.form().bindFromRequest();
        System.out.println(df);
		Recurso recurso = Recurso.find.byId(id);
		SolicitudCancelacion sc = new SolicitudCancelacion();
		sc.recurso = recurso;
		sc.evaluador = Evaluador.find.byId( Long.parseLong(session("idEvaluador")));
		sc.recursoestadoanterior = recurso.estado;
		sc.motivoCancelacion = df.get("motivo");
	//	sc.observacion = df.get("observacion");
		sc.fechaSolicitud = new Date();
//System.out.println(sc.recurso+" :  "+sc.evaluador+"  :  "+sc.motivoCancelacion+"  :  "+sc.observacion+"  :  "+sc.fechaSolicitud);		
		sc.save();
		
		
		recurso.estado = Estado.find.byId(400L);
		recurso.update();

        // Enviar correo al coordinador
        miCorreo mc = new miCorreo();
        mc.para =  Collections.singletonList(Personal.elCoordinador().correo);
        mc.asunto ="Solicitud de cancelación para el recurso "+recurso.numcontrol;
        mc.mensaje = "El evaluador "+session("nombre")+" ha solicitado la cancelación del recurso con número de control <strong>"+recurso.numcontrol+"</strong><br><br>Motivo de cancelación: <strong>"+df.get("motivo")+"</strong>";
        mc.enviar();

        CorreoSalida cs = new CorreoSalida(mc, recurso);
        cs.save();


		flash("warning","Se ha solicitado la cancelación del recurso '"+recurso.titulo+"'");
		return redirect("/evList");
		
	}
	

}
