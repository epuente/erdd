package controllers;

import static play.data.Form.form;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import models.Estado;
import models.OficioValoracion;
import models.Recurso;
import play.data.DynamicForm;
import play.data.Form;
import play.db.ebean.Transactional;
import play.mvc.Result;
import play.mvc.Http.MultipartFormData;
import play.mvc.Http.MultipartFormData.FilePart;
import views.html.OficioValoracion.*;

public class OficioValoracionController extends ControladorSeguroCoordinador{
	
    public static Result GO_HOME = redirect( 
            routes.OficioValoracionController.list()
        );		
	
	
    
    public static Result list(){    	
    	//List<Recurso>  r = Ebean.find(Recurso.class).fetch("oficio").where().isNotNull("oficio").findList();    
    	List<Recurso>  r = Recurso.find.where().eq("estado.id", 110L).ne("oficio", null).findList(); 
    	return ok(list.render(r ));    	
    }
    
	public static Result create(Long id){
        Form<Recurso> rForm = form(Recurso.class).fill(   Recurso.find.byId(id)     );        
		return ok (asignarOficioValoracion.render(id, rForm));		
	}	
	
	@Transactional
	public static Result save(Long id) throws Exception{
		DynamicForm df = form().bindFromRequest();
		System.out.println("\n\nDesde OficioValoracionController.save");
		System.out.println(df);
        Recurso r = Recurso.find.byId(id);    
        r.estado = 	Estado.find.byId(110L);
		r.update(r.id); 
		r.refresh();
System.out.println("................................  "+r.oficiovaloracion);        
        if (r.oficiovaloracion == null){
        	r.oficiovaloracion = new OficioValoracion();
        } else {
        	r.oficiovaloracion = OficioValoracion.searchByRecurso(id);
        }
        r.oficiovaloracion .recurso = Recurso.find.byId(id);
        r.oficiovaloracion .numero = df.get("oficiovaloracion.numero");
       DateFormat formatter = null;
       formatter = new SimpleDateFormat("yyyy-MM-dd");
        r.oficiovaloracion .fechaoficio = (Date) formatter.parse(df.get("oficiovaloracion.fechaoficio"));
		//Graba los documentos   
		MultipartFormData body = request().body().asMultipartFormData();
			FilePart fp = body.getFile("oficiovaloracion.contenido");
			  if (fp != null) {
				    String fileName = fp.getFilename();
				    String contentType = fp.getContentType(); 
				    File file = fp.getFile();
				    try {
						Path p = Paths.get(file.getPath());
						byte[] byteFile = Files.readAllBytes(p);
						r.oficiovaloracion .nombrearchivo = fileName;						 
						r.oficiovaloracion .contenttype = contentType;
						r.oficiovaloracion .contenido =  byteFile;
					} catch (FileNotFoundException e) {
						System.out.println("error, archivo no encontrado "+e);
						e.printStackTrace();
					} catch (IOException ioe){
						System.out.println("error, excepcion de entrada/salida "+ioe);
						ioe.printStackTrace();
					}		    
			  }
		
		if ( OficioValoracion.searchByRecurso(id) == null  ){
			r.oficiovaloracion.save();
			
		} else {
			r.oficiovaloracion.update(OficioValoracion.searchByRecurso(id).id);
		}
		
		if (r.encuesta != null){
	        if (r.encuesta.estado.id == 3 &&  r.estado.id == 110){
	        	EncuestaController.enviarOficioValoracion(r.oficiovaloracion);
	        	r.estado =  Estado.find.byId(12L);
	        	r.update();
	        }
		}
		
        flash("success", "Al recurso " + r.oficiovaloracion .recurso.titulo + " le ha sido asignado el oficio de valoración "+r.oficiovaloracion .numero);		
		return redirect(routes.RecursoController.completoList());
		
	}	
}
