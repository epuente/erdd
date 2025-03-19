package controllers;

import static play.data.Form.form;

import java.util.ArrayList;
import java.util.List;

import controllers.util.ControladorSeguroCoordinador;
import models.Recurso;
import models.Versionanterior;
import play.data.Form;
import play.mvc.Result;
import views.html.Versionanterior.*;
import classes.Actualizacion;


public class VersionanteriorController extends ControladorSeguroCoordinador {
	
	
	
	public static Result listaActualizaciones(){
		// Seleccionar todos los recursos que sean 'obra nueva'
		List<Recurso> obrasNuevas = Recurso.find.where().eq("version.id", 1L).findList();
		List<Actualizacion> lac = new ArrayList<>();
		Actualizacion a = null;
		
		for (Recurso r: obrasNuevas){ 
			boolean masDatos;			
			List<Versionanterior> va = Versionanterior.find.where().eq("recursoanterior", r).findList();
			masDatos = !va.isEmpty();
			
			a = new Actualizacion();
			a.recurso =  Recurso.find.byId( r.id  );
			a.actualizacion = new ArrayList<>();
			while (masDatos){
												
				for(Versionanterior h : va){
					a.actualizacion.add( Recurso.find.byId(h.recurso.id)  );				
				}
				va = Versionanterior.find.where().eq("recursoanterior", va.get(0).recurso).findList();
				masDatos = !va.isEmpty();
			}
			lac.add(a);
		}
		for(Actualizacion e : lac){
System.out.println(" ***  ");
System.out.println(" ***   recurso   id:"+e.recurso.id+"   nc:"+e.recurso.numcontrol);
			for (  Recurso oo : e.actualizacion   ){
System.out.println(" ***  actualizacion        id:"+oo.id+"   nc:"+oo.numcontrol);
			}

		}		
		return ok(listaActualizaciones.render(lac));		
	}
	
	
	public static Result eliminarActualizaciones(Long id){
System.out.println("ajax............  eliminarActualizaciones   id:"+id);
		Versionanterior va = Versionanterior.find.where().eq("recurso_id", id).findUnique();
		Recurso x = Recurso.find.byId(va.recurso.id);
		x.versionanterior.delete();
	//	x.update();		
		return ok("ok");
	}	
	
	
	public static Result create(Long id){	
System.out.println(id);		
        Form<Versionanterior> vaForm = form(Versionanterior.class);
        
		Recurso obraNueva = Recurso.find.where().eq("version.id", 1L).eq("id", id).findUnique();
		List<Actualizacion> lac = new ArrayList<>();
		
		Actualizacion a = null;
		boolean masDatos;			
		List<Versionanterior> va = Versionanterior.find.where().eq("recursoanterior", obraNueva).findList();
System.out.println(" tam::::  "+va.size());		
		masDatos = !va.isEmpty();
		
		a = new Actualizacion();
		a.recurso =  Recurso.find.byId( obraNueva.id  );
		a.actualizacion = new ArrayList<>();
		while (masDatos){
											
			for(Versionanterior h : va){
				a.actualizacion.add( Recurso.find.byId(h.recurso.id)  );				
			}
			va = Versionanterior.find.where().eq("recursoanterior", va.get(0).recurso).findList();
			masDatos = !va.isEmpty();
		}
		lac.add(a);
	
        return ok( createForm.render(vaForm,  Recurso.find.byId(id),  lac ) );		
	}
	
	public static Result save(Long id){		
        Form<Versionanterior> vaForm = form(Versionanterior.class).bindFromRequest();
        vaForm.get().save();
        flash("success", "Se asoció el recurso ");
//		return redirect(  routes.VersionanteriorController.listaActualizaciones()  );		
		return redirect(  routes.VersionanteriorController.create(id)  );
	}

}
