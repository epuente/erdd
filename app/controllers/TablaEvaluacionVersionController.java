package controllers;

import static play.data.Form.form;

import java.util.List;

import com.avaje.ebean.SqlRow;
import org.json.JSONException;
import org.json.JSONObject;

import com.avaje.ebean.Ebean;
import models.Aspecto;
import models.ClasificadorCriterio1;
import models.ClasificadorCriterio2;
import models.ClasificadorCriterio3;
import models.Evaluacion;
import models.EvaluacionTabla;
import models.EvaluacionTablaReactivo;
import models.EvaluacionTablaVersion;
import play.data.DynamicForm;
import play.libs.Json;
import play.mvc.Result;

public class TablaEvaluacionVersionController extends ControladorSeguroCoordinador {
	
	public static Result versionCreate(){
System.out.println("desde versionCreate");		
    	DynamicForm df = form().bindFromRequest();  
System.out.println(df);

  			EvaluacionTablaVersion etvr = new EvaluacionTablaVersion();
 			
  			//int VersionReciente = Ebean.createSqlQuery("SELECT VersionActual() retorno").findUnique().getInteger("retorno");
			// Se eliminó la funcion de db: VersionActual()

			SqlRow sqlRow = Ebean.createSqlQuery("select MAX(version) as v from evaluacion_tabla_version").findUnique();

			int VersionReciente = sqlRow.getInteger("v");

System.out.println(VersionReciente);  		
			etvr.version = new Long(VersionReciente+1);
			etvr.terminado = "N";
			etvr.save();
		//	etvr.refresh();
			
System.out.println(etvr.version);
//			etvr.evaluacionTablas = new  ArrayList<EvaluacionTabla>();

			if (df.get("cbxcopia") != null){
				///List<EvaluacionTabla> et = EvaluacionTabla.find.where().eq("version.id", VersionReciente).findList();
				List<EvaluacionTabla> et = EvaluacionTabla.find.where().eq("version.id", Long.parseLong(df.get("versionEnPantalla"))).findList();
System.out.println("copíando "+et.size()+" registros");
				
				et.forEach(aet->{
					EvaluacionTabla x = new EvaluacionTabla();
					x.version = etvr;
					x.reactivo =EvaluacionTablaReactivo.find.byId(aet.reactivo.id);
					x.aspecto = Aspecto.find.byId(aet.aspecto.id);
					x.criterio1 =ClasificadorCriterio1.find.byId( aet.criterio1.id);
					x.criterio2 =ClasificadorCriterio2.find.byId( aet.criterio2.id);
					x.criterio3 =ClasificadorCriterio3.find.byId( aet.criterio3.id);
					etvr.evaluacionTablas.add(x);
				});				
				etvr.save();
			}
System.out.println(" Total en EvaluacionTabla:  "+EvaluacionTabla.find.findRowCount());
	return redirect(controllers.routes.AdminEvaluacionTablaController.listarTabla(etvr.id));   
		
	}
	
	public static Result toggle(Long idVersion){
		EvaluacionTablaVersion etv = EvaluacionTablaVersion.find.byId(idVersion);
		
		//Checar si hay evluaciones de la versión
		int registros = Evaluacion.find.where().eq("evaluaciontabla.version.id", etv.id).findRowCount();
		
System.out.print("de "+etv.terminado+" a ");		
		if (etv.terminado.toString().compareTo("S") == 0  &&   registros == 0   ){
			etv.terminado = "N";
		} else {
			if (etv.terminado.toString().compareTo("N") == 0   &&  registros == 0 ){
				etv.terminado = "S";
			}
		}
		etv.update();
		etv.refresh();
System.out.println(etv.terminado);		
		JSONObject objeto = new JSONObject();    ;
		try {
			objeto.put("terminado", etv.terminado);
			objeto.put("registros", registros);
		} catch (JSONException e) {			
			System.out.println("error al asignar json "+e);
			e.printStackTrace();
		}
		
		
		return ok( Json.parse(objeto.toString()) );
		
	}
	

}
