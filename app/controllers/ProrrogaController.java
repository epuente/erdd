package controllers;

import static play.data.Form.form;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

import actions.miCorreo;
import models.Calendario;
import models.EvaluacionProrroga;
import models.Recursoevaluador;
import play.data.DynamicForm;
import play.mvc.Result;
import views.html.Prorrogas.*;

public class ProrrogaController extends ControladorSeguroCoordinador{
	
    public static Result list(int page, String sortBy, String order, String filter, String cf, int rdioSolicitud) {		

System.out.println(":: "+rdioSolicitud);

System.out.println(">page:"+page+"  sortBy:"+sortBy+"   order:"+order+"  Filter:"+filter+"       campoFiltro:"+cf+"    solicitud:"+rdioSolicitud);    	
    	return ok(
    	list.render(
    			/*
                EvaluacionSolicitudProrroga.page(page, 10, sortBy, order, filter, cf),
                sortBy, order, filter, cf, rdioSolicitud
                */
    			EvaluacionProrroga.page(page, 10, sortBy, order, filter, cf, rdioSolicitud),
                sortBy, order, filter, cf, rdioSolicitud
            )
         );        
    }
    
   /*
    public static Result create(Long idRecEva, int ndias){    	
    	Recursoevaluador re = Recursoevaluador.find.byId(idRecEva);
		return ok (create.render(re, Calendario.find.all(), ndias));
    } 
    */
    public static Result save(Long idRecEva){
    	Calendar cal2  = Calendar.getInstance();
		 DateFormatSymbols dfs = new DateFormatSymbols();
		 String[] months = dfs.getMonths();
		 
    	DynamicForm df = form().bindFromRequest();
System.out.println("desde ProrrogaController.save  "+df);
    	EvaluacionProrroga efp = new EvaluacionProrroga();
    	Recursoevaluador re = Recursoevaluador.find.byId(idRecEva);
    	efp.recursoevaluador = re;
    	efp.ndias = Integer.parseInt(df.get("ndias"));
		DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Calendar cal  = Calendar.getInstance();
		try {
			cal.setTime(formato.parse( df.get("fechalimite") ));
			cal.set(Calendar.HOUR, 23);
			cal.set(Calendar.MINUTE, 59);
			cal.set(Calendar.SECOND, 59);
		} catch (ParseException e) {
			System.out.println("Error de conversión");
			e.printStackTrace();
		}		
    	efp.fecha = cal.getTime();
    	efp.autorizado = true;		
		List<EvaluacionProrroga> aux = EvaluacionProrroga.find.where().eq("recursoevaluador.id", re.id).eq("autorizado", 0).orderBy("auditinsert").findList();
		
		if (aux.size() != 0){
			EvaluacionProrroga esp = aux.get(aux.size()-1);
			esp.recursoevaluador = re;
			esp.ndias = efp.ndias;
			esp.fecha = efp.fecha;
			esp.autorizado = efp.autorizado;
			esp.update();
		} else {
	    	efp.save();
		}
    	flash("success", "Se asignó prórroga al recurso "+efp.recursoevaluador.recurso.titulo+", evaluador "+efp.recursoevaluador.evaluador.personal.nombreCompleto());
		 // Enviar correo al evaluador indicándole que se le ha otorgado prórroga
    		
			miCorreo mc = new miCorreo();
			mc.para = Collections.singletonList(re.evaluador.personal.correo);

			
			mc.asunto="Otorgamiento de prórroga para el recurso "+re.recurso.numcontrol; 

			mc.mensaje="Evaluador "+ re.evaluador.personal.nombreCompleto()+", el administrador ha asignado a usted una prórroga hasta "+formato.format(efp.fecha)+" para que continúe con la evaluación del aspecto ";
			mc.mensaje+=re.aspecto.descripcion+" del recurso "+re.recurso.titulo+" con clave de control "+re.recurso.numcontrol+".<br><br>";
			

			mc.mensaje+="<br><br><br>"+cal2.get(Calendar.DAY_OF_MONTH)+" de "+months[cal2.get(Calendar.MONTH)]+" de "+cal2.get(Calendar.YEAR)+", " + cal2.get(Calendar.HOUR_OF_DAY)+":"+cal2.get(Calendar.MINUTE)+".";				
			mc.enviar();
			//mc.run();
		return  redirect(routes.ProrrogaController.list(0,"titulo","asc","","titulo",-1));	
    	
    }

	public static Result edit(Long idRecEva, int ndias){
		Recursoevaluador re = Recursoevaluador.find.byId(idRecEva);
		return ok (edit.render(re, Calendario.find.all(), ndias));		
	}

	
	 public static Result delete(Long idPro){		 
System.out.println("Desde ProrrogaController.delete......................");		 
		 EvaluacionProrroga.find.byId(idPro).delete();
		 flash("success", "Se eliminó la prórroga");
		 return  redirect(routes.ProrrogaController.list(0,"titulo","asc","","titulo", -1));
	 }
	 
	 

	
}
