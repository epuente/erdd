package controllers;

import static play.data.Form.form;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


import com.avaje.ebean.SqlRow;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import models.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.avaje.ebean.Ebean;
import play.Logger;
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
					// agrega los tipos de recursos
					for ( EvaluacionTablaTipoRecurso ettr : aet.tiposrecursos  ) {
						EvaluacionTablaTipoRecurso y = new EvaluacionTablaTipoRecurso();
						y.evaluaciontabla = x;
						y.tiporecurso = ettr.tiporecurso;
						x.tiposrecursos.add(y);
					}
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


	public static Result versionCreateAjax() throws JSONException{
		System.out.println("desde versionCreateAjax");
		JsonNode json = request().body().asJson();
		JSONObject retorno = new JSONObject();
		String cbxcopia = json.get("cbxcopia").textValue();
		long versionEnPantalla = json.get("versionEnPantalla").longValue();
		retorno.put("conCopia", cbxcopia);
		retorno.put("vp", versionEnPantalla);
		Logger.debug(retorno.toString());
		if (Objects.equals(cbxcopia, "si")) {
			Long versionId = EvaluacionTablaVersion.find.where().eq("version", versionEnPantalla).findUnique().id;
			List<EvaluacionTabla> et = EvaluacionTabla.find.where().eq("version.id", versionId).findList();
			List<Object> ids = EvaluacionTabla.find.where().eq("version.id", versionId).findIds();
			JSONArray jsonArray = new JSONArray(new ArrayList<>(ids));
			retorno.put("nregistros", et.size());
			retorno.put("ids", jsonArray);

			// Obtiene ids de los reactivos del origen

			List<SqlRow> sqrRs = Ebean.createSqlQuery("select et.reactivo_id from evaluacion_tabla et where et.version_id ="+versionId +
					" GROUP by et.reactivo_id").findList();
			Logger.debug("sqrRs tam: "+sqrRs.size());
			retorno.put("reactivosIds", new JSONArray(new ArrayList<>(sqrRs)));
		}

		EvaluacionTablaVersion etvr = new EvaluacionTablaVersion();
		SqlRow sqlRow = Ebean.createSqlQuery("select MAX(version) as v from evaluacion_tabla_version").findUnique();
		int VersionReciente = sqlRow.getInteger("v");
		System.out.println(VersionReciente);
		etvr.version = (long) (VersionReciente + 1);
		etvr.terminado = "N";
		etvr.save();
		etvr.refresh();
		retorno.put("etvId", etvr.id);
		Logger.debug("Se agregó a la tabla de versiones");
		return ok( retorno.toString());
	}


	public static Result auxVersionCreateAjax() throws JSONException {
		JsonNode json = request().body().asJson();
		JSONObject retorno = new JSONObject();
		System.out.println("---> "+json.toString());
		long vdestino = json.get("vdestino").longValue();


		long vorigen =  EvaluacionTablaVersion.find.where().eq("version", json.get("vorigen").longValue()).findUnique().id;

		EvaluacionTablaVersion etvdestino = EvaluacionTablaVersion.find.byId(vdestino);
		//List<EvaluacionTabla> ets = EvaluacionTabla.find.where().eq("version.id", vorigen).eq("reactivo.id", reactivoId).findList();
		List<EvaluacionTabla> ets = EvaluacionTabla.find.where().eq("version.id", vorigen).findList();

		Logger.debug("\t\tets tam: "+ets.size());
		System.out.println("\n\n\n\n\nhaciendo copia de "+ets.size()+" registros ................");

		EvaluacionTabla x;
		EvaluacionTablaTipoRecurso y;
		for (EvaluacionTabla et : ets) {
			x = new EvaluacionTabla();
			x.version = etvdestino;
			x.reactivo = EvaluacionTablaReactivo.find.byId(et.reactivo.id);
			x.aspecto = Aspecto.find.byId(et.aspecto.id);
			x.criterio1 = ClasificadorCriterio1.find.byId(et.criterio1.id);
			x.criterio2 = ClasificadorCriterio2.find.byId(et.criterio2.id);
			x.criterio3 = ClasificadorCriterio3.find.byId(et.criterio3.id);

			for (EvaluacionTablaTipoRecurso ettr : et.tiposrecursos) {
				y = new EvaluacionTablaTipoRecurso();
				y.evaluaciontabla = x;
				y.tiporecurso = ettr.tiporecurso;
				x.tiposrecursos.add(y);
			}
			etvdestino.evaluacionTablas.add(x);
			etvdestino.update();
		}
		retorno.put("estado", "ok");
		return ok (retorno.toString());
	}



	// recibe un array con los ids EvaluacionTabla y genera la copia parcial
	public static Result versionCreateAjaxParcial() throws JSONException {
		//System.out.println("Desde versionCreateAjaxParcial...");
		JsonNode json = request().body().asJson();
		JSONObject retorno = new JSONObject();
		//System.out.println("---> "+json.toString());
		long vdestino = json.get("vdestino").longValue();
		long vorigen =  EvaluacionTablaVersion.find.where().eq("version", json.get("vorigen").longValue()).findUnique().id;
		JsonNode idsReactivosArray = json.get("ids");
		List<Long> ids = new ObjectMapper().convertValue(idsReactivosArray, new TypeReference<List<Long>>() {});
		EvaluacionTablaVersion etvdestino = EvaluacionTablaVersion.find.byId(vdestino);
		//List<EvaluacionTabla> ets = EvaluacionTabla.find.where().eq("version.id", vorigen).eq("reactivo.id", reactivoId).findList();
		//List<EvaluacionTabla> ets = EvaluacionTabla.find.where().eq("version.id", vorigen).findList();
		List<EvaluacionTabla> ets = EvaluacionTabla.find.where().eq("version.id", vorigen).in("id",ids).findList();

		//Logger.debug("\t\tets tam: "+ets.size());
		//System.out.println("\n\n\n\n\nhaciendo copia de "+ets.size()+" registros ................");

		EvaluacionTabla x;
		EvaluacionTablaTipoRecurso y;
		for (EvaluacionTabla et : ets) {
			x = new EvaluacionTabla();
			x.version = etvdestino;
			x.reactivo = EvaluacionTablaReactivo.find.byId(et.reactivo.id);
			x.aspecto = Aspecto.find.byId(et.aspecto.id);
			x.criterio1 = ClasificadorCriterio1.find.byId(et.criterio1.id);
			x.criterio2 = ClasificadorCriterio2.find.byId(et.criterio2.id);
			x.criterio3 = ClasificadorCriterio3.find.byId(et.criterio3.id);

			for (EvaluacionTablaTipoRecurso ettr : et.tiposrecursos) {
				y = new EvaluacionTablaTipoRecurso();
				y.evaluaciontabla = x;
				y.tiporecurso = ettr.tiporecurso;
				x.tiposrecursos.add(y);
			}
			etvdestino.evaluacionTablas.add(x);
			etvdestino.update();
		}
		retorno.put("estado", "ok");
		return ok (retorno.toString());
	}


	public static Result conteoVersion() throws JSONException {
		//Logger.debug("Desde TablaEvaluacionVersionController.conteoVersion");
		JsonNode json = request().body().asJson();
		//System.out.println("conteoVersion "+json);
		long versionId = json.get("versionId").longValue();
		//Logger.debug("versionId:"+versionId);
		JSONObject joRetorno = new JSONObject();
		int x = EvaluacionTabla.find.where().eq("version.id", versionId).findList().size();
		joRetorno.put("registros", x);
		//System.out.println("retorno de conteoVersion "+ joRetorno  );
		return ok( joRetorno.toString() );
	}




}
