package controllers;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


import models.HistorialestadoEncuesta;
import models.HistorialestadoEvaluacion;
import models.Log;
import models.Historialestado;
import play.mvc.Result;
//import views.html.Historial.log2;

public class HistorialController extends ControladorDefault{
	
	public static Result ajaxActualizaLog(Integer nitems){
		System.out.println("desde HistorialController.ajaxActualizaLog");
		List<Log> listLog = new ArrayList<>();
		List<Historialestado> he = Historialestado.find.select("id, recurso, estado, auditinsert").orderBy("auditinsert desc").setMaxRows(nitems).findList();
		he.forEach(e ->{
			Log nl = new Log();
			nl.tipo = "e";
 		    nl.recurso = e.recurso;  
 		    nl.estado = e.estado; 
 		    nl.auditinsert = e.auditinsert;
 		    listLog.add(nl);
 		    });
		
		List<HistorialestadoEvaluacion> heEv = HistorialestadoEvaluacion.find.select("id, recurso, estado, auditinsert, recursoevaluador").orderBy("auditinsert desc").setMaxRows(nitems).findList();
		heEv.forEach(e ->{
			Log nl = new Log();
			nl.tipo = "ev";
			nl.recurso = e.recurso;  
 		    nl.estadoevaluacion = e.estado; 
 		    nl.auditinsert = e.auditinsert;
 		    listLog.add(nl);
 		    });		

		
		List<HistorialestadoEncuesta> heEn = HistorialestadoEncuesta.find.select("id, recurso, estado, auditinsert").orderBy("auditinsert desc").setMaxRows(nitems).findList();
		
		heEn.forEach(e ->{
			Log nl = new Log();
			nl.tipo = "en";
			nl.recurso = e.recurso;  
 		    nl.estadoencuesta = e.estado; 
 		    nl.auditinsert = e.auditinsert;
 		    
 		    listLog.add(nl);
 		    
 		    });		

		listLog.sort((o1, o2) -> (o1.auditinsert.before(o2.auditinsert)) ? 1 : -1);
		
		JSONArray jArray = new JSONArray();
		if (nitems > listLog.size())
			nitems = listLog.size();
		int i = 0;
		if (listLog.size()>0) {
			for (Log e : listLog.subList(0, nitems)) {
				JSONObject jObject = new JSONObject();	
				SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd/MM/yyyy kk:mm:ss");
				try {
					jObject.put("consecutivo", i++);
					jObject.put("tipo", e.tipo);				
					jObject.put("recurso", e.recurso.titulo);
					jObject.put("numerocontrol", e.recurso.numcontrol);
					if (e.estado != null)
						jObject.put("estado", e.estado.descripcion);
					if (e.estadoevaluacion != null)
						jObject.put("estadoevaluacion", e.estadoevaluacion.descripcion);
					if (e.estadoencuesta != null)
						jObject.put("estadoencuesta", e.estadoencuesta.descripcion);
					jObject.put("auditinsert", sdf.format(e.auditinsert));
				//	jObject.put("auditlastupdate", sdf.format(e.auditlastupdate));				
				//	jObject.put("auditinsert", e.auditinsert);
				//	jObject.put("auditlastupdate", e.auditlastupdate);
				} catch (JSONException e1) {					
					e1.printStackTrace();
				}
				jArray.put(jObject);
			}
		}
		
	   	 response().setHeader("Access-Control-Allow-Origin", "*");
	   	 response().setHeader("Access-Control-Allow-Origin", "*");
	   	 response().setHeader("Allow", "*");
	   	 response().setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, DELETE, OPTIONS");
	   	 response().setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept, Referer, User-Agent");
	   			
		/*
		if ( listLog.size() <= 10 ){
			 return ok (jArray.toString());
		} else {
			return ok (jArray.toString());
		}
		 */
        return ok (jArray.toString());
	}

}
