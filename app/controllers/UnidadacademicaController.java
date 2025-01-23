package controllers;
import static play.data.Form.form;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import javax.persistence.PersistenceException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.avaje.ebean.Page;
import com.avaje.ebean.Query;
import models.Areaconocimiento;
import models.Niveleducativo;
import models.Unidadacademica;
import models.UnidadacademicaAreaconocimiento;
import models.UnidadacademicaNiveleducativo;
import play.data.Form;
import play.mvc.*;
import views.html.catalogos.Unidadacademica.*;

public class UnidadacademicaController extends ControladorSeguro {
	
    public static Result GO_HOME = redirect(
            routes.UnidadacademicaController.list(0, "nombre", "asc", "")
        );	
	
    public static Result list(int page, String sortBy, String order, String filter) {
System.out.println("Unidadacademica.list");    	
    	return ok(
    	list.render(
                Unidadacademica.page(page, 10, sortBy, order, filter),
                sortBy, order, filter
            )
         );        
    }

    
    
    public static Result create() {
        Form<Unidadacademica> unidadacademicaForm = form(Unidadacademica.class);
        return ok(
            createForm.render(unidadacademicaForm)
        );
    }    
    
    public static Result save() {
        Form<Unidadacademica> unidadacademicaForm = form(Unidadacademica.class).bindFromRequest();
        if(unidadacademicaForm.hasErrors()) {
        	flash("error", "tiene errores.");
            return badRequest(createForm.render(unidadacademicaForm));
        }
        
        Unidadacademica ua = unidadacademicaForm.get();
        unidadacademicaForm.data().entrySet().forEach(x->{
			if (x.getKey().startsWith("nivel[")){
		        UnidadacademicaNiveleducativo uan = new UnidadacademicaNiveleducativo();
		        uan.unidadacademica = ua;
		        uan.nivel = Niveleducativo.find.byId( Long.parseLong(x.getValue())  );
		        ua.niveles.add( uan  );		
			}        
			if (x.getKey().startsWith("area[")){
		        UnidadacademicaAreaconocimiento uaa = new UnidadacademicaAreaconocimiento();
		        uaa.unidadacademica = ua;
		        uaa.area = Areaconocimiento.find.byId( Long.parseLong(x.getValue())  );
		        ua.areas.add( uaa  );		
			} 			
        });        
        
        
        
        unidadacademicaForm.get().save();
        flash("success", "'"+unidadacademicaForm.get().nombre +"' ha sido creada.");
        return GO_HOME;                 
    }    
    
    
    public static Result edit(Long id) {
        Form<Unidadacademica> unidadacademicaForm = form(Unidadacademica.class).fill(
            Unidadacademica.find.ref(id)
        );
        return ok(editForm.render(id, unidadacademicaForm)
        );
    }
    
    
    public static Result delete(Long id) {
System.out.println("**** id: "+id);    	
        Unidadacademica ua = Unidadacademica.find.ref(id);
        String nua = ua.nombre;
System.out.println("**** ua: "+ua);        
        try{
        ua.delete();
        flash("success", "'"+nua+"' se eliminó.");
        return GO_HOME;         
         } catch (PersistenceException pe) {
        	 
        	 System.out.println("***************************"+pe+"\n"+pe.getCause());
        	 if (   pe.getCause().toString().contains("IntegrityConstraint")){
        		 flash("error", "'"+nua+"' no se puede eliminar puesto que se hace uso de la misma en otros registros.");

        	 }
    		 return GO_HOME;
         }        
    }    

    
    
    
    
    public static Result update(Long id) {
    	System.out.println("Desde UnidadacademicaController.update");
        Form<Unidadacademica> unidadacademicaForm = form(Unidadacademica.class).bindFromRequest();
        System.out.println(unidadacademicaForm);
        if(unidadacademicaForm.hasErrors()) {
            return badRequest(editForm.render(id, unidadacademicaForm));
        }
        //unidadacademicaForm.get().update(id);
        
        Unidadacademica ua = unidadacademicaForm.get();
        
        System.out.println("Objeto nombre: "+ua.nombre);
        System.out.println("Objeto nivel: "+ua.niveles);
        
        
        
        unidadacademicaForm.data().entrySet().forEach(x->{
			if (x.getKey().startsWith("nivel[")){
		        UnidadacademicaNiveleducativo uan = new UnidadacademicaNiveleducativo();
		        uan.unidadacademica = ua;
		        uan.nivel = Niveleducativo.find.byId( Long.parseLong(x.getValue())  );
		        ua.niveles.add( uan  );		
			}
			if (x.getKey().startsWith("area[")){
		        UnidadacademicaAreaconocimiento uaa = new UnidadacademicaAreaconocimiento();
		        uaa.unidadacademica = ua;
		        uaa.area = Areaconocimiento.find.byId( Long.parseLong(x.getValue())  );
		        ua.areas.add( uaa  );		
			} 			
        });
        
        
        
        ua.update(id);
        flash("success", "'"+unidadacademicaForm.get().nombre + "' ha sido actualizada");
        return GO_HOME;        
    }    


    
	public static Result ajaxListaDTSS(){
		JSONObject json2 = new JSONObject();		
		int filtrados = 0;
		int sinFiltro = 0;
		Map<Integer, Integer> columnasOrdenables = new HashMap<>();
		columnasOrdenables.put(0, 1);
		columnasOrdenables.put(1, 19);
		columnasOrdenables.put(2, 9);
System.out.println( columnasOrdenables.get(0)  );		
System.out.println( columnasOrdenables.get(1)  );
		//Page<Folio> otro = null;
System.out.println("Desde UnidadacademicaController.ajaxListDTSS............");
System.out.println( "parametros 0:"+ request() );
		
		String filtro = request().getQueryString("search[value]");
		int colOrden =   Integer.parseInt( request().getQueryString("order[0][column]")   );
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
		
System.out.println("**************************************************************************************"       );

		 
		 Page<Unidadacademica> ua = null;

			 Query<Unidadacademica> q1 = Unidadacademica.find;
			 Query<Unidadacademica> q2 = Unidadacademica.find.where(
						"nombre like :cadena "+
						"or niveles.nivel.descripcion like :cadena "+
						"or areas.area.descripcion like :cadena "
					    ).setParameter("cadena", "%"+filtro+"%");
			 
			 ua = Unidadacademica.find
					 .fetch("niveles")
					 .fetch("niveles.nivel")
					 .fetch("areas")
					 .fetch("areas.area")
					 .where(
								"nombre like :cadena "+
										"or niveles.nivel.descripcion like :cadena "+
										"or areas.area.descripcion like :cadena "
									    ).setParameter("cadena", "%"+filtro+"%")			 
					 	.orderBy( "c"+    (colOrden==0?columnasOrdenables.get(0)  :  columnasOrdenables.get(colOrden)-1)  +" "+tipoOrden )
						.findPagingList(numRegistros)
						.setFetchAhead(false)
						.getPage(numPag);

			 
			filtrados = q2.findList().size();
			sinFiltro = q1.findList().size();	
		 
		 
			
               


		
		System.out.println("**************************************************************************************"       );		
//System.out.println("tam page: "+serv.getTotalPageCount());

		
		try {
			json2.put("draw",  new Date().getTime()  );
			json2.put("recordsTotal",  sinFiltro );
//			json2.put("recordsFiltered", ppre3.getTotalRowCount());
			json2.put("recordsFiltered", filtrados);

			JSONArray losDatos = new JSONArray();
			
			for( Unidadacademica p : ua.getList()  ){
				JSONObject datoP = new JSONObject();
				datoP.put("id", p.id);
				datoP.put("nombre", p.nombre);
				datoP.put("niveles", p.niveles.stream().map(m->m.nivel.descripcion).collect(Collectors.toList()));
				datoP.put("areas", p.areas.stream().map(m->m.area.descripcion).collect(Collectors.toList()));
				losDatos.put(datoP);
			}
			if ( ua.getTotalRowCount()>0 ){
				json2.put("data", losDatos);
			} else {
				json2.put("data", new JSONArray() );
				return ok( json2.toString()  );
			}			

		} catch (JSONException e) {
			System.out.println("Ocurrio un error: "+e);
			e.printStackTrace();
		}
//System.out.println("retorno "+json2.toString());
		return ok( json2.toString()  );

		
	}

    
}