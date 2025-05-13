package controllers;

import static play.data.Form.form;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import controllers.util.ControladorSeguroCoordinador;
import models.Estado;
import models.Oficio;
import models.Recurso;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Result;
import play.mvc.Http.MultipartFormData;
import play.mvc.Http.MultipartFormData.FilePart;
import views.html.Oficio.*;

public class OficioController extends ControladorSeguroCoordinador {
	
    public static Result GO_HOME = redirect( 
            routes.OficioController.list()
        );		
	
	
    
    public static Result list(){    	
    	//List<Recurso>  r = Ebean.find(Recurso.class).fetch("oficio").where().isNotNull("oficio").findList();    
    	List<Recurso>  r = Recurso.find.where().eq("estado.id", 4L).ne("oficio", null).findList(); 
    	return ok(list.render(r ));    	
    }
    
	public static Result create(Long id){
        Form<Recurso> rForm = form(Recurso.class).fill(   Recurso.find.byId(id)     );        
		return ok (asignarOficio.render(id, rForm));		
	}
	
	
	public static Result edit(Long id){
        Form<Oficio> forma = form(Oficio.class).fill(
                Oficio.find.byId(id)
            );
            return ok(edit.render(id, forma) );		
	}

	
    public static Result update(Long id) throws ParseException {
        Form<Oficio> forma = form(Oficio.class).bindFromRequest();
        Recurso r = Recurso.find.byId(id);        
        DateFormat formatter = null;
        formatter = new SimpleDateFormat("yyyy-MM-dd");        
        Oficio o = r.oficio;
        o.numero = forma.field("numero").value();
        o.fechaoficio = (Date) formatter.parse( forma.field("fechaoficio").value()  );        
        o.fecharecepcion = (Date) formatter.parse( forma.field("fecharecepcion").value()  );
         
		MultipartFormData body = request().body().asMultipartFormData();
		FilePart fp = body.getFile("contenido");
		  if (fp != null) {
			    String fileName = fp.getFilename();
			    String contentType = fp.getContentType(); 
			    File file = fp.getFile();
			    try {
					Path p = Paths.get(file.getPath());
					byte[] byteFile = Files.readAllBytes(p);
					o.nombrearchivo = fileName;						 
					o.contenttype = contentType;
					o.contenido =  byteFile;
				} catch (FileNotFoundException ioe) {
                    System.out.println("Error -- No se encontró el archivo");
				} catch (IOException e){
                    System.out.println("Error -- "+e.getMessage()+"\n"+e.getCause());
				}		    
		  }               
        
        r.update();        
        return GO_HOME;        
    }   	
	
	public static Result save(Long id) throws ParseException{
		DynamicForm df = form().bindFromRequest();
System.out.println(df);		
        Recurso r = Recurso.find.byId(id);    
		r.oficio = new Oficio();
        r.oficio.recurso = r;
        r.oficio.numero = df.get("oficio.numero");
        r.oficio.folio = df.get("oficio.folio");

       DateFormat formatter = null;
       formatter = new SimpleDateFormat("yyyy-MM-dd");

	   Date fechaOficio = (Date) formatter.parse(df.get("oficio.fechaoficio"));
       Date fechaRecepcion = (Date) formatter.parse(df.get("oficio.fecharecepcion"));

       r.oficio.fechaoficio = fechaOficio;
       r.oficio.fecharecepcion = fechaRecepcion;


		//Graba los documentos   
		MultipartFormData body = request().body().asMultipartFormData();
			FilePart fp = body.getFile("oficio.contenido");
			  if (fp != null) {
				    String fileName = fp.getFilename();
				    String contentType = fp.getContentType(); 
				    File file = fp.getFile();
				    try {
						Path p = Paths.get(file.getPath());
						byte[] byteFile = Files.readAllBytes(p);
						r.oficio.nombrearchivo = fileName;						 
						r.oficio.contenttype = contentType;
						r.oficio.contenido =  byteFile;
					} catch (FileNotFoundException ioe) {
						ioe.printStackTrace();
					} catch (IOException e){
                        System.out.println("Error -- "+e.getMessage()+"\n"+e.getCause());
					}		    
			  }
		r.estado = Estado.find.byId(4L);
/*		Historialestado he = new Historialestado();
		he.recurso = r;
		he.estado = Estado.find.byId(4L);
		r.historialestados.add(  he  );
		*/
		r.save();
        flash("success", "Al recurso " + r.titulo + " le ha sido asignado el oficio "+r.oficio.numero);		
		return redirect("/recursos/completoList");
		
	}	

    // Muestra el oficio pdf
    // Recibe el id del recurso
	public static Result verOficio(Long id) {
		System.out.println("DEsde OficioController.verOficio");
		Oficio o = Oficio.find.where().eq("recurso.id", id).findUnique();
		response().setContentType(o.contenttype);		 
		return ok (o.contenido);
	} 	
	
}
