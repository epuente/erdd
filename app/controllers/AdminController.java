package controllers;

import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.EncuestaRespuesta;
import models.EvaluacionProrroga;
import models.Recurso;
import models.Recursoevaluador;

import com.avaje.ebean.Expr;

import play.mvc.Result;


public class AdminController extends ControladorSeguro {
	
	
    
	public static Result index() throws UnknownHostException, SocketException{
		response().setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
		response().setHeader("Pragma", "no-cache"); // HTTP 1.0.
		response().setHeader("Expires", "0"); // Proxies.  
		
		
		Map<String, Object> registros = new HashMap<String, Object>();

    	List<Recurso> todos = Recurso.find.all();
    	registros.put("rs", todos.size());
		
    	int r1 = Recurso.find.where().eq("estado.id", 1L).findRowCount();
    	int r2 = Recurso.find.where().eq("estado.id", 2L).findRowCount();
    	int r3 = Recurso.find.where().eq("estado.id", 3L).findRowCount();
    	int r4 = Recurso.find.where().eq("estado.id", 4L).findRowCount();
    	int r5 = Recurso.find.where().eq("estado.id", 5L).findRowCount();
    	int r6 = Recurso.find.where().in("estado.id", Arrays.asList(6L)).findRowCount();
    	int r6p = Recurso.find.where().in("estado.id", Arrays.asList(100L)).findRowCount();
    	
    	
    	registros.put("rs1", r1);
    	registros.put("rs2", r2);
    	registros.put("rs3", r3);
    	registros.put("rs4", r4);
    	registros.put("rs5", r5);
    	registros.put("rs6", r6);
    	registros.put("rs6p", r6p);
    	
    	int r7 = Recurso.find.where().eq("estado.id", 7L).findRowCount();
    	int r8 = Recurso.find.where().eq("estado.id", 8L).findRowCount();
    	int r9 = Recurso.find.where().eq("estado.id", 9L).findRowCount();
    	int r10 = Recurso.find.where().in("estado.id", Arrays.asList(10L, 11L, 12L, 110L)).findRowCount();
    	int r105 = Recurso.find.where().eq("estado.id", 105L).findRowCount();
    	int r110 = Recurso.find.where().eq("estado.id", 110L).findRowCount();
    	int r12 = Recurso.find.where().eq("estado.id", 12L).findRowCount();
    	
    	registros.put("rs7", r7);
    	registros.put("rs8", r8);
    	registros.put("rs9", r9);
    	registros.put("rs10", r10);
    	registros.put("rs105", r105);
    	registros.put("rs110", r110);
    	registros.put("rs12", r12);
    	
    	
    	int c0 = Recurso.find.where().eq("estado.id", 400L).findRowCount();
    	
    	registros.put("c0", c0);

    	int c1 = Recurso.find.where().eq("estado.id", 401L).findRowCount();
    	int c2 = Recurso.find.where().eq("estado.id", 402L).findRowCount();

    	registros.put("c1", c1);
    	registros.put("c2", c2);

		int msqlFev1 = Recursoevaluador.find.where().not(Expr.in("recurso.estado.id", Arrays.asList(400,401,402))).eq("estadoevaluacion.id", 1L).findRowCount();

		int msqlFev2 = Recursoevaluador.find.where().not(Expr.in("recurso.estado.id", Arrays.asList(400,401,402))).eq("estadoevaluacion.id", 2L).findRowCount();
		int msqlFev3 = Recursoevaluador.find.where().not(Expr.in("recurso.estado.id", Arrays.asList(400,401,402))).eq("estadoevaluacion.id", 3L).findRowCount();
		int msqlFev4 = Recursoevaluador.find.where().not(Expr.in("recurso.estado.id", Arrays.asList(400,401,402))).eq("estadoevaluacion.id", 4L).findRowCount();
		int msqlFev5 = Recursoevaluador.find.where().not(Expr.in("recurso.estado.id", Arrays.asList(400,401,402))).eq("estadoevaluacion.id", 5L).findRowCount();
		
		registros.put("ev1", msqlFev1);
		registros.put("ev2", msqlFev2);
		registros.put("ev3", msqlFev3);
		registros.put("ev4", msqlFev4);
		registros.put("ev5", msqlFev5);
		
		int en1 = EncuestaRespuesta.find.where().eq("estado.id", 1L).findRowCount();
		int en2 = EncuestaRespuesta.find.where().eq("estado.id", 2L).findRowCount();
		int en3 = EncuestaRespuesta.find.where().eq("estado.id", 3L).findRowCount();
		
		registros.put("en1", en1);
		registros.put("en2", en2);
		registros.put("en3", en3);

		// Prórrogas
		int p = EvaluacionProrroga.find.where().eq("autorizado","0").findRowCount();
		registros.put("solPro", p);
		
System.out.println(		routes.AdminController.index().url()  );	
		
		
    	return ok(views.html.resumenAdministrador.render(registros));
    }	

}

