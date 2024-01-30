package controllers;
import static play.data.Form.form;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


import models.Documento;
import play.data.Form;
import play.mvc.*;
import play.mvc.Http.MultipartFormData;
import play.mvc.Http.MultipartFormData.FilePart;


public class DocumentoController extends ControladorSeguro {
	public static Result create() {
	    Form<Documento> documentoForm = form(Documento.class);
	    return ok(
	    		views.html.Documento.createForm.render(documentoForm)
	    );
	}
	
	public static Result upload() {
        Form<Documento> documentoForm = form(Documento.class).bindFromRequest();
        if(documentoForm.hasErrors()) {
            return ok("ERRRRORRR");
        }				
		 Documento d = documentoForm.get();		
		
		  MultipartFormData body = request().body().asMultipartFormData();
		  FilePart fp = body.getFile("contenido");
  System.out.println("......+++"+fp);		  
		  if (fp != null) {
		    String fileName = fp.getFilename();
		    String contentType = fp.getContentType(); 
		    File file = fp.getFile();
		    System.out.println("....archivo.."+file+ "    tamaño   "+file.length()+"   contentype:  "+contentType);
		    try {
				Path p = Paths.get(file.getPath());
				 byte[] byteFile = Files.readAllBytes(p);
				 
				 d.nombrearchivo = fileName;
				 d.contenttype = contentType;
				 d.contenido =  byteFile;
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException ioe){
				
			}		    
		    
	        
System.out.println("......"+d.recurso);	
System.out.println("......"+d.contenido);
System.out.println("......"+d.tipodocumento.descripcion);
	        
	        //documentoForm.get().save();
			d.save();
		    
		    
		    
		    
		    return ok("File uploaded");
		  } else {
		    flash("error", "Missing file");
		    return redirect(routes.RecursoWebController.index());    
		  }
	} 	
	
	

	
	
	

	
}