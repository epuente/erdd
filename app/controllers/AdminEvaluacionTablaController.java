package controllers;
import static play.data.Form.form;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import models.Aspecto;
import models.ClasificadorCriterio1;
import models.ClasificadorCriterio2;
import models.ClasificadorCriterio3;
import models.ClasificadorCriterio3Ejemplo;
import models.ClasificadorEjemplo;
import models.Evaluacion;
import models.EvaluacionTabla;
import models.EvaluacionTablaReactivo;
import models.EvaluacionTablaTipoRecurso;
import models.EvaluacionTablaVersion;

import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Result;
import views.html.AdminEvaluacionTabla.*;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Expr;
import com.avaje.ebean.ExpressionList;
import com.avaje.ebean.Page;
import com.avaje.ebean.annotation.Transactional;
import com.avaje.ebean.text.json.JsonContext;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;


public class AdminEvaluacionTablaController extends ControladorSeguroCoordinador {
	
	
	
    public static Result listarReactivos(int page, String sortBy, String order, String filter) {
    	return ok(
    	reactivoListar.render(
                EvaluacionTablaReactivo.page(page, 10, sortBy, order, filter),
                sortBy, order, filter,
                EvaluacionTablaVersion.find.all()
            )
         );        
    }	

    public static Result createReactivo(){
    	Form<EvaluacionTablaReactivo> forma = form(EvaluacionTablaReactivo.class);
            return ok( reactivoCreate.render(forma));	
    }
    
    public static Result saveReactivo(){
        Form<EvaluacionTablaReactivo> forma = form(EvaluacionTablaReactivo.class).bindFromRequest();
        if( forma.hasErrors()){
        	flash("success", "Se encintraron errores, no se guardó el reactivo.");
        	return badRequest(reactivoCreate.render(forma));
        } else {
        	forma.get().save();
        	flash("success", "Se ha guardado el reactivo.");
            return redirect(controllers.routes.AdminEvaluacionTablaController.listarReactivos(0,"id","asc",""))  ;
            	
        }
    }      
    
    public static Result editReactivo(Long id){
        Form<EvaluacionTablaReactivo> forma = form(EvaluacionTablaReactivo.class).fill(
        		EvaluacionTablaReactivo.find.byId(id)
            );
            return ok(
                reactivoEdit.render(id, forma)
            );	
    }    

    
    public static Result updateReactivo(Long id){
        Form<EvaluacionTablaReactivo> forma = form(EvaluacionTablaReactivo.class).bindFromRequest();
        if(forma.hasErrors()) {
            return badRequest(reactivoEdit.render(id, forma));
        }
        forma.get().update(id);
        flash("success", "Se ha actualizado el reactivo.");
        return redirect(controllers.routes.AdminEvaluacionTablaController.listarReactivos(0,"id","asc",""));
    }     

    public static Result deleteReactivo(Long id){
    	try{
    		EvaluacionTablaReactivo.find.byId(id).delete();
    	} catch(Exception e){
    		flash("error", "No se puede eliminar un reactivo que este en alguna versión del instrumento de evaluación.");
            return redirect(controllers.routes.AdminEvaluacionTablaController.listarReactivos(0,"id","asc",""));    		
    	}
        flash("success", "Se ha eliminado el reactivo.");
        return redirect(controllers.routes.AdminEvaluacionTablaController.listarReactivos(0,"id","asc",""));
    }    
    
    @Transactional
    public static Result editTablaEvaluacion(Long idVersion){
System.out.println("-------------------------desde AdminEvaluacionTablaController.editTablaEvaluacion");    	
    	DynamicForm df = form().bindFromRequest();  
System.out.println(df);

    	
    	
    	
    	
    	List<EvaluacionTabla> existentes = EvaluacionTabla.find.where().eq("version.id", idVersion).findList();
    	// ¿Es posible editar?, esto solo se puede si no hay registros en Evaluacion
    	 ExpressionList<Evaluacion>  ids = Evaluacion.find.where().in("evaluaciontabla.id", EvaluacionTabla.find.where().eq("version.id", idVersion).findIds() );    	
    	 if ( ids.findIds().size()!=0 ){
    		 flash("warning", "La versión "+idVersion+" ya ha sido usada para evaluar, por tanto no puede eliminarse o modificarse.");
    		 //return ok("No se puede eliminar, ni modificar.  La versión "+idVersion+" ya ha sido usada para evaluar, por tanto no puede eliminarse o modificarse.");
    		 return redirect(controllers.routes.AdminEvaluacionTablaController.listarTabla(idVersion));
    	 }
    	
 		EvaluacionTablaVersion bbb = EvaluacionTablaVersion.find.byId(idVersion);
System.out.println("******************************************* ");
		bbb.evaluacionTablas.removeAll(existentes);
 		
		try {
		Map<String, String> m = df.data();
		for(Object key : m.keySet()) {
System.out.println("key: "+key.toString()+"   valor: "+m.get(key));			
			if ( key.toString().substring(0,7).contains("aspecto")  ){
				Long num = Long.parseLong(key.toString().substring(7));
				if (  df.get("cbxEliminarReactivo"+num) == null){
//System.out.println(num);					
							for( int ii= 0; ii<m.size();ii++){
//System.out.println(" existe? "+"criterio_"+num.toString()+"["+  ii +"   :   "+df.get("criterio_"+num.toString()+"["+  ii ));
								if ((df.get("criterio_"+num.toString()+"["+  ii ) != null)    ){			
System.out.println(" SIIII");										
									String[] aux = df.get("criterio_"+num.toString()+"["+  ii ).split("_");
											EvaluacionTabla nuevo = new EvaluacionTabla();
											nuevo.version = bbb;
											nuevo.reactivo = EvaluacionTablaReactivo.find.byId( num  );
											nuevo.aspecto = Aspecto.find.byId(  Long.parseLong(m.get(key)) );
											
											nuevo.criterio1 = ClasificadorCriterio1.find.byId( Long.parseLong(aux[0]) );
											nuevo.criterio2 = ClasificadorCriterio2.find.byId( Long.parseLong(aux[1]) );
											nuevo.criterio3 = ClasificadorCriterio3.find.byId( Long.parseLong(aux[2]) );
											
											

											
											
											
											bbb.evaluacionTablas.add(nuevo);
									}
								}
				}
				else {
					// Eliminar reactivo del instrumento
					EvaluacionTabla.find.where().eq("version.id", bbb.id).eq("reactivo.id", num).findList().forEach( g->g.delete());
					System.out.println("Se eliminó el reactivo.id "+num+" del instrumento version "+bbb.id);					
				}
			}
		}	
		
		bbb.save();		

		} catch(Exception e){
			System.out.println("error  "+e.getMessage());
		}
		flash("success","Se aplicaron los cambios.");
		
		
		System.out.println("***************FINALIZADO editTablaEvaluacion*************************************************** \n\n\n\n\n\n\n");		
		
		return redirect(controllers.routes.AdminEvaluacionTablaController.listarTabla(idVersion));
    }

    
    @Transactional
    public static Result removeTablaEvaluacion(Long idVersion, Long idReactivo){
    	System.out.println("desde AdminEvaluacionTablaController.removeTablaEvaluacion");
		for(EvaluacionTabla ren : EvaluacionTabla.searchByVersionReactivo(idVersion, idReactivo)){	
System.out.println("Eliminando reactivo "+idReactivo+" de la versión id "+idVersion);
			try{
				ren.delete();
			} catch(Exception e){
				System.out.println("e "+ e);
				return ok(" No se puede eliminar");
			}
		};    		
    	flash("success","Se eliminó el reactivo de la versión.");		
		return redirect("/evaluacionTablaEvaluacionList?v="+idVersion);    	
    }    
    
    
    public static Result listarTabla(Long version){
System.out.println("Llegando a AdminEvaluacionTablaController.listarTabla");    	
	
    	List<EvaluacionTablaVersion> versiones = EvaluacionTablaVersion.find.all();
		List<Aspecto> aspectos = Aspecto.find.all();
		List<ClasificadorCriterio1> cc1 =  ClasificadorCriterio1.find.all();
		List<ClasificadorCriterio2> cc2 =  ClasificadorCriterio2.find.all();
		List<ClasificadorCriterio3> cc3 =  ClasificadorCriterio3.find.fetch("catalogo").findList();
		EvaluacionTablaVersion letv = EvaluacionTablaVersion.find.byId(version);
		

    	List<EvaluacionTabla> et = EvaluacionTabla.find
    			.where().eq("version.id", version).orderBy("reactivo.id").findList();
System.out.println("tam et; "+et.size());    	
//et.forEach(a->{System.out.print("  "+a.reactivo.id+" "+a.reactivo);});    	
    	
    	
    	TreeSet<Long>  snr = new TreeSet<Long>();
    	List<Long> ids = new ArrayList<Long>();
    	et.forEach(x->{
    		// Ids reactivos
    		snr.add(x.reactivo.id);
    		
    		// Ids EvaluacionTabla
    		ids.add(x.id);
    	});
    	
    	int registros = Evaluacion.find.where().in("evaluaciontabla.id", ids).findRowCount();

/*
    	List<EvaluacionTabla> listaX = EvaluacionTabla.find
    			.fetch("reactivo")
    			.fetch("aspecto")
    			.where().eq("version.id", version).orderBy("id").findList();
  */  	
    	List<ClasificadorEjemplo> tiposrecursos = ClasificadorEjemplo.find.fetch("tiporecurso").orderBy("tiporecurso.descripcion").findList();
    	
	///	return ok(tablaListar3.render( 	snr, aspectos, cc1, cc2, cc3, letv,  versiones, listaX, registros, tiposrecursos	));
    	System.out.println("snr: "+snr);
    	System.out.println("aspectos");
    		aspectos.forEach(g->System.out.println("    "+g.descripcion));
    	System.out.println("cc1");
    		cc1.forEach(g->System.out.println("    "+g.id+"  "+g.descripcion));
    	System.out.println("cc2");
    		cc2.forEach(g->System.out.println("    "+g.id+"  "+g.descripcion));
    	System.out.println("cc3");
    		cc3.forEach(g->System.out.println("    "+g.id+"  "+g.catalogo.descripcion));
    	System.out.println("letv: "+letv);
    	System.out.println("versiones: "+versiones);
   // 	System.out.println("tam listaX: "+listaX.size());
    	System.out.println("registros: "+registros);
    	System.out.println("tam tiposrecursos: "+tiposrecursos.size());
    	
    	
		return ok(tablaListarDTSS.render( 	snr, aspectos, cc1, cc2, cc3, letv,  versiones, /*listaX, */registros, tiposrecursos	));
		
		
    }

    
    
    
    public static Result listarTablaDTSS(){
System.out.println("Llegando a AdminEvaluacionTablaController.listarTablaDTSS");
		JSONObject json2 = new JSONObject();		
		int filtrados = 0;
		int sinFiltro = 0;
		Map<Integer, Integer> columnasOrdenables = new HashMap<Integer, Integer>();
		columnasOrdenables.put(0, 1);
		columnasOrdenables.put(1, 19);
		columnasOrdenables.put(2, 9);
		//Page<Folio> otro = null;
System.out.println( "parametros 0:"+ request() );


		//request().getQueryString("columns[2][search][value]");
	String filtroAspecto = request().getQueryString("filtroAspecto");
	
System.out.println( "\ncolumns 2:" + filtroAspecto   );
System.out.println( "\nfiltroAspecto:" + request().getQueryString("filtroAspecto")   );
		





		String filtro = request().getQueryString("search[value]");
		
		
		Long version =   Long.parseLong( request().getQueryString("version"));
		Integer colOrden =   Integer.parseInt( request().getQueryString("order[0][column]")   );
		String tipoOrden = request().getQueryString("order[0][dir]");
System.out.println( "parametro start:"+ Integer.parseInt(request().getQueryString("start")));
System.out.println( "parametro length:"+ Integer.parseInt(request().getQueryString("length")));
System.out.println( "parametros order[0][column]:"+ colOrden);
System.out.println( "parametros order[0][dir]:"+ tipoOrden);		
System.out.println( "filtrando :"+ filtro);
		int numPag = 0;
		if (Integer.parseInt(request().getQueryString("start")) != 0)
			numPag = Integer.parseInt(request().getQueryString("start")) /   Integer.parseInt(request().getQueryString("length"));		
		int numRegistros = Integer.parseInt(request().getQueryString("length"));
		
System.out.println( "numRegistros :"+ numRegistros);
System.out.println( "numPag :"+ numPag);


		// Se hace la búsqueda en  Evaluacion tabla, incluyendo los filtros especificados en la vista

		List<EvaluacionTabla> evts = null;

		if (filtroAspecto.contentEquals("*"))
			evts = EvaluacionTabla.find
				.where("version.id = "+version+"  and  (reactivo.descripcion  like :cadena  or aspecto.descripcion like :cadena)" )
				.setParameter("cadena", "%"+filtro+"%")		
				.findList();
		else
			evts = EvaluacionTabla.find
			.where("version.id = "+version+"  and  (aspecto.id = "+filtroAspecto+"  )  and  (reactivo.descripcion  like :cadena  or aspecto.descripcion like :cadena)" )
			.setParameter("cadena", "%"+filtro+"%")		
			.findList();			

System.out.println("Registros en EvaluacionTabla: "+evts.size());
		TreeSet<Long>  idsReactivos = new TreeSet<Long>();
		TreeSet<Long>  idsEvaluacionTabla = new TreeSet<Long>();
		
		// Se toman los ids de los reactivos y de la tabla EvaluacionTabla
		evts.forEach(evt->{ 
//System.out.print(evt.id+"->"+evt.reactivo.id+"          ");			
			idsReactivos.add(evt.reactivo.id);
			idsEvaluacionTabla.add(evt.id);
		});
		
		Page<EvaluacionTablaReactivo> evtR = EvaluacionTablaReactivo.find
				.where().in("id",idsReactivos)
			 	//.orderBy( "c"+    (colOrden==0?columnasOrdenables.get(0)  :  columnasOrdenables.get(colOrden)-1)  +" "+tipoOrden )
				.orderBy("id")
				.findPagingList(numRegistros)
				.setFetchAhead(false)
				.getPage(numPag);				
		
		
		
System.out.println("");		
System.out.println("Núm reactivos en el instrumento: "+idsReactivos.size());		
		sinFiltro = idsReactivos.size();
		filtrados = idsReactivos.size();
		JSONArray losDatos = new JSONArray();
		try {
			json2.put("draw",  new Date().getTime()  );
			json2.put("recordsTotal",  sinFiltro );
			json2.put("recordsFiltered",  filtrados );

			List<EvaluacionTabla> paginaEVT = null;
			
			for (EvaluacionTablaReactivo r : evtR.getList()){
				JSONObject datos = new JSONObject();				
				datos.put("reactivoId",  r.id );
				datos.put("reactivo",  r.descripcion );
				datos.put("aspectoId",  EvaluacionTabla.find.where().eq("version.id", version).eq("reactivo.id", r.id).findList().get(0).aspecto.id  );
				datos.put("aspecto",  EvaluacionTabla.find.where().eq("version.id", version).eq("reactivo.id", r.id).findList().get(0).aspecto.descripcion);
				
				for ( ClasificadorCriterio3 crit: ClasificadorCriterio3.find
					.fetch("criterio1").fetch("criterio2").fetch("catalogo")
					.order().desc("criterio1.id")
					.order().desc("criterio2.id")
					.order().desc("catalogo.id")
					.findList()){
						JSONObject aux = new JSONObject();
						aux.put("c1", crit.criterio1.id);
						aux.put("c2", crit.criterio2.id);
						//aux.put("c3", crit.catalogo.id);
						aux.put("c3", crit.id);
						aux.put("c3Descripcion", crit.catalogo.descripcion);
						
						/*
						Collections.sort(crit.ejemplos, new Comparator<ClasificadorCriterio3Ejemplo>() {
							@Override
							public int compare(ClasificadorCriterio3Ejemplo o1, ClasificadorCriterio3Ejemplo o2) {
								return o1.tiporecurso.descripcion.compareTo(o2.tiporecurso.descripcion);
							}
						});						
						*/
						for(ClasificadorCriterio3Ejemplo ej : crit.ejemplos
									
						){	
							//System.out.println("ejemplo_: "+ej.tiporecurso.descripcion);
								JSONObject auxC3Ej = new JSONObject();
								//auxC3Ej.put("id", ej.id);
								auxC3Ej.put("tiporecurso", ej.tiporecurso.descripcion);
								auxC3Ej.put("id", ej.tiporecurso.id);
								aux.append("ejemplos", auxC3Ej);
						}
						// En 'todosLosCriterios' se alamacenan TODOS criterios y tipos de recursos QUE PUDIERAN APLICAR para el reactivo en el instrumento
						datos.append("todosLosCriterios", aux);
					}
				paginaEVT =
						EvaluacionTabla.find
						.fetch("tiposrecursos")
					//	.fetch("tiposrecursos.criterio3ejemplo")
					//	.fetch("tiposrecursos.criterio3ejemplo.tiporecurso")
						.where().eq("reactivo.id", r.id).eq("version.id", version)
						.findList();
				for(EvaluacionTabla abc : paginaEVT)
				{					
					// En 'criterios' se alamacenan los criterios y tipos de recursos que aplican para el reactivo en el instrumento
					JSONObject criterios = new JSONObject();						
					criterios.put("c1",abc.criterio1.id);
					criterios.put("c2",abc.criterio2.id);
					criterios.put("c3",abc.criterio3.id );
					criterios.put("c3Descripcion",abc.criterio3.catalogo.descripcion );
					
					abc.tiposrecursos.forEach(t->{
								try {
									//criterios.append("trecursos", new JSONObject().put("id", t.id).put("c3CEId", t.criterio3ejemplo.id) );
									criterios.append("trecursos", new JSONObject().put("id", t.tiporecurso.id) );
									
								} catch (JSONException e) {
									System.out.println("Ocurrio un error: "+e);
									e.printStackTrace();
								}
							});
					 
					datos.append("criterios", criterios);
				}
			losDatos.put(datos);				
			}

	    	System.out.println("tam paginaEVT: "+evtR.getList().size());		
	
System.out.println("-->>LOSDATOS\n"+losDatos);    	
	    	
	    	
				if ( evtR.getList().size()>0 ){
					json2.put("data", losDatos);
					System.out.println(".... 2");				
				} else {
					json2.put("data", new JSONArray() );
					System.out.println(".... 3");				
					return ok( json2.toString()  );
				}			
		}catch (JSONException e) {
			System.out.println("Ocurrio un error: "+e);
			e.printStackTrace();
		}
		//System.out.println(json2.toString());
		return ok( json2.toString()  );
    }    
    
    
    public static Result listarReactivosInstrumento(){
    	
    	System.out.println("...... (ajax) desde AdminEvaluacionTablaController.listarReactivosInstrumento");
    	System.out.println( "parametros 0:"+ request() );
    	System.out.println( "parametros 10:"+ request().body());
    	System.out.println( "parametros 20:"+ request().body().asJson() );

    	System.out.println( "parametros ?:"+ request().queryString()  );

    	System.out.println( "parametros draw:"+ request().getQueryString("draw"));
    	System.out.println( "parametros start:"+ request().getQueryString("start"));
    	System.out.println( "parametros length:"+ request().getQueryString("length"));
    	System.out.println( "parametros seach[value]:"+ request().getQueryString("search[value]"));

    	System.out.println( "parametros order[0][column]:"+ request().getQueryString("order[0][column]"));
    	System.out.println( "parametros order[0][dir]:"+ request().getQueryString("order[0][dir]"));    	

		String filtro = request().getQueryString("search[value]");
		String colOrden =  request().getQueryString("order[0][column]");
		String tipoOrden = request().getQueryString("order[0][dir]");    	
		String nombreColOrden = request().getQueryString("columns["+colOrden+"][data]");
    	
    	
    	response().setContentType("application/json");
    	List<EvaluacionTabla> ps = EvaluacionTabla.find.where().eq("version.id", 1).findList();
		int numPag = 0;
		if (Integer.parseInt(request().getQueryString("start")) != 0)
			numPag = Integer.parseInt(request().getQueryString("start")) /   Integer.parseInt(request().getQueryString("length"));
		Page<EvaluacionTabla> pagp = EvaluacionTabla.page(numPag , 
							Integer.parseInt(request().getQueryString("length"))
							, filtro
							, nombreColOrden
							, tipoOrden
							);    	
		JSONObject json2 = new JSONObject();
		
		try {
			json2.put("draw",  request().getQueryString("draw")+1  );
			json2.put("recordsTotal", ps.size());
			json2.put("recordsFiltered", pagp.getTotalRowCount());

			JSONArray losDatos = new JSONArray();			
			for( EvaluacionTabla p : pagp.getList()  ){
				JSONObject datoP = new JSONObject();
				datoP.put("id", p.id);
				datoP.put("version", p.version.version);
				datoP.put("reactivo", p.reactivo.descripcion);
				datoP.put("aspecto", p.aspecto.descripcion);
				datoP.put("criterio1", p.criterio1.descripcion);
				datoP.put("criterio2", p.criterio2.descripcion);
				datoP.put("criterio3", p.criterio3.catalogo.descripcion);
				losDatos.put(datoP);
			}
			if ( pagp.getTotalRowCount()>0 ){
				json2.put("data", losDatos);
			} else {
				json2.put("data", new JSONArray() );
				return ok( json2.toString()  );
			}			

		} catch (JSONException e) {
			System.out.println("Ocurrio un error: "+e);
			e.printStackTrace();
		}	    	
    	
		return ok( json2.toString()  );
    	
    }
    
    
    public static Result listaEvaluacionTablaAjax( Long idVersion, Long desde, Long hasta){
System.out.println("desde: "+desde +"    hasta: "+hasta+" para la version "+idVersion);    	
    	///List<Object>listaIds = EvaluacionTabla.find.where().eq("version.id", idVersion).orderBy("id").findIds();	
		List<Object>listaIds = EvaluacionTabla.find.where().eq("version.id", idVersion).orderBy("id").findIds();
		Long ultimo = (Long) listaIds.get( listaIds.size()-1  );
		
		if(hasta > ultimo  ){
			hasta = ultimo;
System.out.println("'hasta' ajustado en "+hasta);			
		}
    	List<Object>rango = listaIds.subList( desde.intValue() , hasta.intValue());
		JsonContext jsonContext = Ebean.createJsonContext();
		List<EvaluacionTabla> ets = EvaluacionTabla.find.fetch("aspecto").where().idIn(rango).findList();
		return ok(   jsonContext.toJsonString(ets)  );	
    }
    
    
    public static Result listaReactivos(Long idVersion){
    	List<EvaluacionTablaReactivo> reactivos = null;
    	List<EvaluacionTabla> idsR = EvaluacionTabla.find.where().eq("version.id", idVersion).findList();
		Set<Long> setId = new HashSet<Long>();  
		idsR.forEach(c->{			
			setId.add(c.reactivo.id);
		});
		
    	String cadena = "";
    	if (!idsR.isEmpty()){
    		reactivos = EvaluacionTablaReactivo.find.where().not(Expr.in("id", setId) ).orderBy("id").findList();
    	} else {
    		reactivos = EvaluacionTablaReactivo.find.orderBy("id").findList();
    	}
    		    				    	
    	if(!reactivos.isEmpty()){
	    	for(EvaluacionTablaReactivo r:reactivos){
	    		cadena += "<option value="+r.id+">"+r.id+".- "+r.descripcion+"</option>";
	    	}
    	}
//System.out.println("ajax - options "+ cadena );
		return ok("<option value='-1'>Seleccione un reactivo del catálogo....</option><option value='0'>No existe, crear un nuevo reactivo</option>"+cadena);
    }
    
    public static Result agregarReactivo(){
    	EvaluacionTablaReactivo auxReactivo = new EvaluacionTablaReactivo();
    	String[] aux;
System.out.println("desde agregarReactivo...");    	
    	DynamicForm df = form().bindFromRequest();  
System.out.println(df); 
		 Map<String, String> m = df.data();
		 
		 //Es un nuevo reactivo, habrá que crearlo en el catálogo de reactivos
		 if (df.get("reactivo").compareTo("0") == 0){
			 EvaluacionTablaReactivo nuevo = new EvaluacionTablaReactivo();
			 nuevo.descripcion = df.get("nuevoReactivo");
			 nuevo.save();
			 nuevo.refresh();
			 auxReactivo = nuevo;
		 } else {
			auxReactivo = EvaluacionTablaReactivo.find.byId( Long.parseLong(df.get("reactivo")));
		 }
		 
		 
		for(Object key : m.keySet()) {
System.out.println("key: "+key+" valor: "+m.get(key));	
			
			if(key.toString().startsWith("criterio_")){
				//aux = key.toString().split("_");
				aux = m.get(key).split("_");
System.out.println("      "+aux[0]);				
System.out.println("      "+aux[1]);
System.out.println("      "+aux[2]);
				EvaluacionTabla nuevo = new EvaluacionTabla();						
				nuevo.version = EvaluacionTablaVersion.find.byId(Long.parseLong(df.get("version")));
				//nuevo.reactivo = EvaluacionTablaReactivo.find.byId( Long.parseLong(m.get("reactivo")));
				nuevo.reactivo = auxReactivo;
				nuevo.aspecto = Aspecto.find.byId( Long.parseLong( df.get("aspecto0")) );
				/*
				nuevo.criterio1 = ClasificadorCriterio1.find.byId(Long.parseLong(aux[2]));
				nuevo.criterio2 = ClasificadorCriterio2.find.byId(Long.parseLong(aux[3]));
				nuevo.criterio3 = ClasificadorCriterio3.find.byId(Long.parseLong(aux[4]));
				*/
				nuevo.criterio1 = ClasificadorCriterio1.find.byId(Long.parseLong(aux[0]));
				nuevo.criterio2 = ClasificadorCriterio2.find.byId(Long.parseLong(aux[1]));
				nuevo.criterio3 = ClasificadorCriterio3.find.byId(Long.parseLong(aux[2]));
				
System.out.println("    grabado");				
				nuevo.save();
			}			
		}
		flash("success","Se agregó el reactivo a la versión.");
		return redirect("evaluacionTablaEvaluacionList?v="+df.get("version"));
    	
    }
    

	@Transactional
	public static Result ajaxEditTablaEvaluacionAspecto(){
System.out.println("   ...........................   desde AdminEvaluacionTablaController.ajaxEditTablaEvaluacionAspecto ");		
		EvaluacionTabla obj = null; 
		JsonNode json = request().body().asJson();
System.out.println(json);

			  try {
				ObjectMapper mapper = new ObjectMapper();				
				obj = mapper.readValue(json.findPath("evaluaciontabla").traverse(), EvaluacionTabla.class);		
System.out.println("de json a objeto oki!!!");

				List<EvaluacionTabla> evts = EvaluacionTabla.find.where()
						.eq("version.id", obj.version.id)
						.eq("reactivo.id", obj.reactivo.id)
						.findList();
System.out.println("001");		
System.out.println("     "+obj.aspecto.id);

				if (evts != null){
					for ( EvaluacionTabla  f: evts) {
						f.aspecto = Aspecto.find.byId(obj.aspecto.id);
						f.update();
					}
					System.out.println("001 - 001");
				}
				System.out.println("002");
				
			} catch (JsonParseException e) {
				e.printStackTrace();
			} catch (JsonMappingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch ( Exception e){
				System.out.println("Error!!!!!!!!!!!!!   "+e.getMessage());
				e.printStackTrace();
			}
			return ok( "{\"estado\":\"ok\"}" );
		
	}    
    
    
	@Transactional
	public static Result ajaxEditTablaEvaluacionCriterio(){
System.out.println("   ...........................   desde AdminEvaluacionTablaController.ajaxEditTablaEvaluacionCriterio ");		
		EvaluacionTabla obj = null; 
		JsonNode json = request().body().asJson();
System.out.println(json);
		String borrado = json.findPath("borrado").toString();
		
		for (JsonNode personNode : json) {
		    if (personNode instanceof ObjectNode) {
		        ObjectNode object = (ObjectNode) personNode;
		        object.remove("borrado");
		    }
		}
		System.out.println("se eliminó el nodo borrado.");


			  try {
				ObjectMapper mapper = new ObjectMapper();				
				obj = mapper.readValue(json.findPath("evaluaciontabla").traverse(), EvaluacionTabla.class);		
System.out.println("de json a objeto oki!!!");

				EvaluacionTabla evt = EvaluacionTabla.find.where()
						.eq("version.id", obj.version.id)
						.eq("reactivo.id", obj.reactivo.id)
						.eq("criterio1.id", obj.criterio1.id)
						.eq("criterio2.id", obj.criterio2.id)
						.eq("criterio3.id", obj.criterio3.id)
						.findUnique();
System.out.println("001");		
System.out.println("     "+obj.aspecto.id);

				if (evt != null){
					obj.id = evt.id;
					evt.delete();
					System.out.println("001 - 001");
				}
				//obj.update();
				System.out.println("002");
				EvaluacionTablaVersion evtv = EvaluacionTablaVersion.find.where().eq("version", obj.version.id).findUnique();
				System.out.println("002 - 001");
				
				
				
				System.out.println("003");
				if (borrado=="false")
					evtv.evaluacionTablas.add(obj);
				evtv.update();
				System.out.println("004");
				System.out.println("005");
				//Quitar nodo 'id'
				
			} catch (JsonParseException e) {
				e.printStackTrace();
			} catch (JsonMappingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch ( Exception e){
				System.out.println("Error!!!!!!!!!!!!!   "+e.getMessage());
				e.printStackTrace();
			}			
			return ok( "{\"estado\":\"ok\"}" );
		
	}
    
	
	@Transactional
	public static Result ajaxEditTablaEvaluacionTipoRecurso(){
System.out.println("   ...........................   desde AdminEvaluacionTablaController.ajaxEditTablaEvaluacionTipoRecurso ");		
		EvaluacionTablaTipoRecurso obj = null; 
		JsonNode json = request().body().asJson();
System.out.println(json);
		String borrado = json.findPath("borrado").toString();
		Long version =  Long.parseLong( json.findPath("version").findPath("id").asText() );
		Long reactivo = Long.parseLong(json.findPath("reactivo").findPath("id").asText());
		Long c1 = Long.parseLong(json.findPath("criterio1").findPath("id").asText());
		Long c2 = Long.parseLong(json.findPath("criterio2").findPath("id").asText());
		Long c3 = Long.parseLong(json.findPath("criterio3").findPath("id").asText());
		
		Long tiporecurso = Long.parseLong(json.findPath("tiporecurso").findPath("id").asText());
		
		
		//Long c3ejemplo = Long.parseLong(json.findPath("criterio3ejemplo").findPath("id").asText());
		
		 
		
System.out.println("previo......." + version);			
	   EvaluacionTabla evt = EvaluacionTabla.find.where()
			   .eq("version.id", version)
			   .eq("reactivo.id", reactivo )
			   .eq("criterio1.id", c1)
			   .eq("criterio2.id", c2)
			   .eq("criterio3.id", c3)
			   .findUnique();
System.out.println("posterior.......");	   
System.out.println("id EvaluacionTabla "+evt.id);

		//Long tr = EvaluacionTablaTipoRecurso.find.where().eq("evaluaciontabla.id", evt.id).eq("tiporecurso.id", tiporecurso).findUnique().id;
		
		for (JsonNode personNode : json) {
		    if (personNode instanceof ObjectNode) {
		        ObjectNode object = (ObjectNode) personNode;
		        object.remove("borrado");
		        object.remove("version");
		        object.remove("reactivo");
		        object.remove("criterio1");object.remove("criterio2");object.remove("criterio3");
		        
		    }
		}
		System.out.println("se eliminó el nodo borrado");


			  try {
				ObjectMapper mapper = new ObjectMapper();				
				obj = mapper.readValue(json.findPath("evaluaciontabla").traverse(), EvaluacionTablaTipoRecurso.class);		
System.out.println("de json a objeto oki!!!");


				EvaluacionTablaTipoRecurso evttr = EvaluacionTablaTipoRecurso.find.where()
						.eq("evaluaciontabla.id", evt.id)
						//.eq("criterio3ejemplo.id", c3ejemplo)
						.eq("tiporecurso.id", tiporecurso)
						.findUnique();
						
						if (evttr != null){
System.out.println("    ya existia ");							
							evttr.delete();
							
						} else {
System.out.println("    es nuevo ");							
							if (borrado=="false"){
								evt.tiposrecursos.add(obj);
								evt.update();
							}
							obj.save();
						}

				System.out.println("002");
				
				
				System.out.println("004");
				System.out.println("005");
				//Quitar nodo 'id'
				
			} catch (JsonParseException e) {
				e.printStackTrace();
			} catch (JsonMappingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch ( Exception e){
				System.out.println("Error!!!!!!!!!!!!!   "+e.getMessage());
				e.printStackTrace();
			}
			return ok( "{\"estado\":\"ok\"}" );
		
	}	
	
	
	@Transactional
	public static Result ajaxEliminaReactivoTablaEvaluacion(){
System.out.println("   ...........................   desde AdminEvaluacionTablaController.ajaxEliminaReactivoTablaEvaluacion ");		
		JsonNode json = request().body().asJson();
System.out.println(json);
		Long version =  Long.parseLong( json.findPath("version").findPath("id").asText() );
		Long reactivo = Long.parseLong(json.findPath("reactivo").findPath("id").asText());


		
		
				 List<EvaluacionTabla> evts = EvaluacionTabla.find.where()
						.eq("version.id", version)
						.eq("reactivo.id", reactivo)
						.findList();
				 
				 
					List<Evaluacion> evaluacion = Evaluacion.find.where().in("evaluaciontabla", evts).findList();
System.out.println("000  Hay evaluaciones con ese criterio? "+evaluacion.size());	
					if (!evaluacion.isEmpty()){
						return ok( "{\"eliminado\":"+ false+", \"mensaje\":\"El reactivo forma parte de un instrumento que ha sido usado en una o mas evaluaciones.\"}" );
					}


System.out.println("001");				
					evts.forEach(t->t.delete());
					List<EvaluacionTabla> r = EvaluacionTabla.find.where()
							.eq("version.id", version)
							.eq("reactivo.id", reactivo)
							.findList();
System.out.println("002 "+r.size());				
			return ok( "{\"eliminado\":"+ Boolean.parseBoolean(""+(r.size()==0)+"")+"}" );
		
	}	
	
    public static Result ajaxAgregarReactivoTablaEvaluacionAnterior(){
    	EvaluacionTablaReactivo auxReactivo = new EvaluacionTablaReactivo();
    	JsonNode json = request().body().asJson();
		System.out.println(json);
		Long reactivo = Long.parseLong(json.findPath("reactivo").asText());  
		String descripcion = json.findPath("descripcion").asText();
 
		 
		 
		 //Es un nuevo reactivo, habrá que crearlo en el catálogo de reactivos
		 if (reactivo == 0){
			 EvaluacionTablaReactivo nuevo = new EvaluacionTablaReactivo();
			 nuevo.descripcion = descripcion;
			 nuevo.save();
			 nuevo.refresh();
			 auxReactivo = nuevo;
		 } else {
			auxReactivo = EvaluacionTablaReactivo.find.byId( reactivo );
		 }
		 
		 
		 

		flash("success","Se agregó el reactivo a la versión.");
		//return redirect("evaluacionTablaEvaluacionList?v="+df.get("version"));
		 return ok( "{\"agregado\":"+ Boolean.parseBoolean(""+(auxReactivo==null)+"")+"}" );
    	
    }	



	@play.db.ebean.Transactional
    public static Result ajaxAgregarReactivoTablaEvaluacion(){
    	EvaluacionTablaReactivo auxReactivo = new EvaluacionTablaReactivo();
    	JsonNode json = request().body().asJson();
		System.out.println(json);
		boolean retorno = false;
System.out.println("0001");		 


for (int x = 0; x< json.size(); x++){
		    JsonNode i = json.get(x); 
		
			System.out.println(" - - - -    "+i);

			
			///*************************************     continuar el loop de json
			
			
			Long reactivo = Long.parseLong(i.findPath("reactivo").findPath("id").asText());  
			String descripcion = i.findPath("nuevoReactivo").asText();
			
			
		
			
			
				 //Es un nuevo reactivo, habrá que crearlo en el catálogo de reactivos
				 if (reactivo == 0){
					 EvaluacionTablaReactivo busca = EvaluacionTablaReactivo.find.where().eq("descripcion", descripcion).findUnique();
					 if (busca == null){
						 EvaluacionTablaReactivo nuevo = new EvaluacionTablaReactivo();
						 nuevo.descripcion = descripcion;
						 nuevo.save();
						 nuevo.refresh();
						 auxReactivo = nuevo;
					 }
					 else {
						 auxReactivo = busca;
					 }
				 } else {
					auxReactivo = EvaluacionTablaReactivo.find.byId( reactivo );
				 }
				 
				 
				 
				 // Ademas dee agregar el reactivo, se especifican aspecto y criterios, y tiposreducros
				 

					ObjectMapper mapper = new ObjectMapper();				
					try {
						
						
						
						for (JsonNode unNodo : i) {
							System.out.println("001");
										    if (unNodo instanceof ObjectNode) {
							System.out.println("    001   -   001");
										        ObjectNode object = (ObjectNode) unNodo;
							System.out.println("                                        "   +  object  );
										        object.remove("nuevoReactivo");
										    }
										}		
							System.out.println("se eliminó el nodo nuevoReactivo  "+i);							
						
System.out.println("antes del mapper");				 
System.out.println("           "+i.findPath("evaluacionTabla"));

						EvaluacionTabla obj = mapper.readValue(i.findPath("evaluacionTabla").traverse(), EvaluacionTabla.class);
System.out.println("despues del mapper");
						obj.reactivo = auxReactivo;
						obj.save();
						retorno = true;
					} catch (IOException e) {
						System.out.println("Ocurrio un error: "+e);
						e.printStackTrace();
					}		
			}
		 return ok( "{\"agregado\":"+ retorno +"}" );
    	
    }


    
}
