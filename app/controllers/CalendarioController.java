package controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import models.Calendario;

import play.mvc.Result;
import views.html.Calendario.*;

public class CalendarioController extends ControladorSeguroCoordinador {
	
	public static Result inicio(){
		List<Calendario> c = Calendario.find.all();		
		return ok(calendario.render(c));
		
	}
	
	
	public static Result agregarFechaCalendario(String desde, String hasta, String titulo, String id) throws ParseException{
		Calendario c = new Calendario();
		if ( id.length() != 0){
			c = Calendario.find.byId(Long.parseLong(id));
		}
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date date = formatter.parse(desde);
		c.desde = date;
		c.hasta = formatter.parse(hasta);
		c.descripcion = titulo;
		c.save();
		c.refresh();
		return ok(c.id.toString());		
	}
	
	public static Result eliminarFechaCalendario(String id) throws ParseException{
		Calendario.find.byId( Long.parseLong(id)).delete();
		return ok("oki");
	};
	
	public static Result hoyMasDias(int ndias ){
System.out.println("****************desde hoyMasDias");		
		
		Calendar ini = Calendar.getInstance();		
		ini.set(Calendar.HOUR_OF_DAY, 0);
		ini.set(Calendar.MINUTE, 0);
		ini.set(Calendar.SECOND, 0);
		ini.set(Calendar.MILLISECOND, 0);
		
		ini.add(Calendar.DAY_OF_YEAR, 1);
		
		Calendar calculado = ini;

		int ndAplicados = 0;
		
		while ( ndAplicados < ndias  ){
			calculado.add(Calendar.DAY_OF_YEAR, 1);
			if (   (calculado.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY)  &&  (calculado.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) ){			
				if ( diaHabil(calculado)){
				ndAplicados++;
				}
			}
		}
	
		
System.out.println("*********************************aplicados: "+ndAplicados);
System.out.println("*********************************calculado: "+calculado.getTime());

		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
		
		return ok(formato.format(calculado.getTime()));
		
	} 
	
	
	public static Result fechaMasDias(int ndias, String fecha ) throws ParseException{
	
		return ok( prueba(ndias, fecha)  );
		
	} 	
	
	
	public static  String prueba(int ndias, String fecha ){
		System.out.println(": "+fecha);		
		Calendar fecha_calendar = Calendar.getInstance(); 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
 
			try
			{
			 Date fecha_date = sdf.parse(fecha);
			 fecha_calendar.setTime(fecha_date);
			     
			} catch (ParseException e) {
			 
			 System.out.println("ERROR!: can not parsing! ");
		}
	
		
		Calendar calculado = fecha_calendar;

		int ndAplicados = 0;
		
		while ( ndAplicados < ndias  ){
			calculado.add(Calendar.DAY_OF_YEAR, 1);
			if (   (calculado.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY)  &&  (calculado.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) ){			
				if ( diaHabil(calculado)){
				ndAplicados++;
				}
			}
		}
	
		
System.out.println("*********************************aplicados: "+ndAplicados);
System.out.println("*********************************calculado: "+calculado.getTime());

		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");


		String retorno = formato.format(calculado.getTime());
System.out.println("::: "+retorno);			
		return retorno;
		
	}
	
	
	private static boolean  diaHabil(Calendar dia){
		List<Calendario> noHabiles = Calendario.find.all();
		if (!noHabiles.isEmpty()){
			for (Calendario c : noHabiles){				
				Calendar desde = Calendar.getInstance(); desde.setTime(c.desde);
				desde.set(Calendar.HOUR_OF_DAY, 0);
				desde.set(Calendar.MINUTE, 0);
				desde.set(Calendar.SECOND, 0);
				desde.set(Calendar.MILLISECOND, 0);				
				Calendar hasta = Calendar.getInstance(); hasta.setTime(c.hasta); hasta.add(Calendar.DATE, -1);
				hasta.set(Calendar.HOUR_OF_DAY, 0);
				hasta.set(Calendar.MINUTE, 0);
				hasta.set(Calendar.SECOND, 0);
				hasta.set(Calendar.MILLISECOND, 0);
				if ( (dia.after(desde) && dia.before(hasta))   ||  dia.equals(desde) || dia.equals(hasta) ){
					return false;
				}
			}
		} 
		return true;
	}

}
