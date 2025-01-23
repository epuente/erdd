package controllers;

import static play.Play.application;
import static play.data.Form.form;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

import javax.persistence.PersistenceException;

import actions.Notificacion;
import actions.miCorreo;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.JsonObject;
import models.*;
import org.json.JSONException;
import org.json.JSONObject;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Http;
import play.mvc.Result;
import views.html.Evaluador.*;


public class EvaluadorController extends ControladorSeguro{
    public static Result GO_HOME = redirect(
            routes.EvaluadorController.list() );   
    
	public static Result list(){
		//List<P> e = Evaluador.find.all();
		List<Personal> e = Personal.losEvaluadores();
		return ok( list.render(e));	
	}

	public static Result create(){
		Form<Personal> personalForm =	form(Personal.class);	
		return ok( views.html.Evaluador.create.render(personalForm,null)  );	
	}	
	
	public static Result save(){
		String urlSitio= application().configuration().getString("urlSitio");
        urlSitio = application().isDev()?"http://"+urlSitio:"https://"+urlSitio;
		//String puerto = Play.application().configuration().getString("http.port");
		//String direccionPuerto = direccion+":"+puerto;
        DynamicForm formaGral = form().bindFromRequest();        
        Personal p = new Personal();
        p.nombre = formaGral.get("nombre");
        p.paterno= formaGral.get("paterno");
        p.materno= formaGral.get("materno");
        p.correo= formaGral.get("correo");
        
        p.usuario = new Usuario();
        p.usuario.personal = p;
        p.usuario.usuario = formaGral.get("usuario.usuario");
        p.usuario.password = formaGral.get("usuario.password");
        
        p.evaluador = new Evaluador();
        p.activo  =  EstadoActivo.find.byId(  Long.parseLong(formaGral.get("activo.id"))  );
        p.evaluador.personal = p;
        

        // Modelo Usuario
        UsuarioRol ur = new UsuarioRol();
        ur.usuario = p.usuario;
        ur.rol = Rol.find.byId(2L);
        p.usuario.roles.add(ur);
        
        // Los aspectos del evaluador        
        List<Aspecto> asp = Aspecto.find.all();
        for(Aspecto aux : asp){    	
        	for(int i=0; i < asp.size(); i++){
				if (formaGral.get("aspecto["+i) != null){
		            if (  formaGral.get("aspecto["+i).compareTo(aux.id.toString()) == 0 ){  	           	
						EvaluadorAspecto ea = new EvaluadorAspecto();			
						ea.evaluador = p.evaluador;
					  	ea.aspecto = aux;					  	
			        	p.evaluador.evaluadoraspectos.add(ea);

                        // Imagen de la firma escaneada del evaluador
                        Http.MultipartFormData body = request().body().asMultipartFormData();
                        Http.MultipartFormData.FilePart fp = body.getFile("imagenfirma");
                        System.out.println("......+++"+fp);
                        if (fp != null) {
                            String fileName = fp.getFilename();
                            String contentType = fp.getContentType();
                            File file = fp.getFile();
                            System.out.println("....archivo.." + file + "    tamaño   " + file.length() + "   contentype:  " + contentType);
                            try {
                                Path path = Paths.get(file.getPath());
                                byte[] byteFile = Files.readAllBytes(path);
                                //EvaluadorFirma evf = new EvaluadorFirma();
                                p.evaluador.firma = new EvaluadorFirma();
                                p.evaluador.firma.evaluador = p.evaluador;
                                p.evaluador.firma.nombrearchivo = fileName;
                                p.evaluador.firma.contenttype = contentType;
                                p.evaluador.firma.contenido = byteFile;
                            } catch (IOException ioe) {
                                ioe.printStackTrace();
                            }
                        }

                            //	ea.save();
			        }
				}
        	}        	
    	}
        p.save();
        //Enviar correo al evaluador
        miCorreo mc = new miCorreo();
        mc.asunto = "Se ha agregado como Evaluador";
        mc.para = Collections.singletonList(p.correo);
        		
        mc.mensaje="Usted ha sido asignado como evaluador para el sistema ERDD.<br><br>Su nombre de usuario es: "+p.usuario.usuario+" y su clave de acceso es: "+p.usuario.password+"<br><br>";
        mc.mensaje+="<br>Evaluará el(los) aspectos:<br>";
        StringBuilder losAspectos= new StringBuilder();
        for (EvaluadorAspecto ea : p.evaluador.evaluadoraspectos) {        	
        	losAspectos.append(ea.aspecto.descripcion).append("<br>");
        }
        mc.mensaje+=losAspectos;
        mc.mensaje+="<br>";
        mc.mensaje+="Ingrese a la dirección "+urlSitio+"/login para conocer las solicitudes que le fueron asignadas para evaluar.<br><br>Acceso <a href='"+urlSitio+"/login'>Login</a>" ;
        mc.enviar();
        //mc.run();
        
        
		// Enviar notificacion al celular del coordinador (administrador e2) que el administrador (e1) dio de alta a un evaluador.
    	Notificacion n = new Notificacion();
    	String notifica= "El administrador ha dado de alta a "+p.nombreCompleto()+" como evaluador(a) ";
    	if (p.evaluador.evaluadoraspectos.size() > 1)
    		notifica+="de los aspectos: ";
    	else 
    		notifica+="del aspecto ";
    	losAspectos = new StringBuilder(losAspectos.toString().replace("<br>", ", "));
    	losAspectos = new StringBuilder(losAspectos.substring(0, losAspectos.length() - 2) + ".");
    	//notifica.replace("<br>", ", ");
    	notifica+=losAspectos;
    	n.enviar("fbErddAdmin", "ERDD", notifica);   
        
        return ok(list.render( Personal.losEvaluadores()  ) ); 	
	}
	
    public static Result delete(Long id) {
    	try{
            /*
            Evaluador evaluador = models.Evaluador.find.where().eq("personal.id", id).findUnique();
            if (evaluador!=null) {
                if (evaluador.firma!=null)
                    evaluador.firma.delete();
            }

             */

    		Personal p = Personal.find.byId(id);
    		p.delete();	        
    		flash("success", "Se eliminó el evaluador " +p.nombreCompleto()+".");
	    } catch (PersistenceException pe) {	   	 
		   	 System.out.println("***************************"+pe+"\n"+pe.getCause());
		   	 if (   pe.getCause().toString().contains("IntegrityConstraint")){
		   		 flash("error", "No se puede eliminar al evaluador, lo mas probable es que ya hay evaluaciones realizadas, edite y establezca el evaluador como 'inactivo'.");
		   	 }
	    }
	    return GO_HOME;	
    }    	
    
    
    public static Result edit(Long id) {    	
        Form<Personal> pForm = form(Personal.class).fill(
            Personal.find.byId(id)
        );        
        return ok(editForm.render(id, pForm, pForm.get()) );
    }    


    public static Result update2(Long id){
    	String urlSitio= application().configuration().getString("urlSitio");
        urlSitio = application().isDev()?"http://"+urlSitio:"https://"+urlSitio;
		//String puerto = Play.application().configuration().getString("http.port");
		//String direccionPuerto = direccion+":"+puerto;
    	DynamicForm requestData = form().bindFromRequest();
    	
		Personal y =  Personal.find.byId(id);
		Long estadoActivoAnterior = y.activo.id;
		y.nombre = requestData.field("nombre").value();
		y.paterno = requestData.field("paterno").value();
		y.materno = requestData.field("materno").value();
		y.correo = requestData.field("correo").value();
		
		y.usuario.personal = y;
		y.usuario.usuario = requestData.field("usuario.usuario").value();
		y.usuario.password = requestData.field("usuario.password").value();
		
		y.activo  =  EstadoActivo.find.byId(  Long.parseLong(requestData.field("activo.id").value())  );

		
		for (EvaluadorAspecto borra : y.evaluador.evaluadoraspectos){
			borra.delete();
		}		
		y.evaluador.evaluadoraspectos.clear();
        // Los aspectos del evaluador
        List<Aspecto> asp = Aspecto.find.all();
        for(Aspecto aux : asp){
        	for(int i=0; i < asp.size(); i++){
				if (requestData.get("aspecto["+i) != null){
		            if (  requestData.get("aspecto["+i).compareTo(aux.id.toString()) == 0 ){  	           	
						EvaluadorAspecto ea = new EvaluadorAspecto();			
						ea.evaluador = y.evaluador;
					  	ea.aspecto = aux;
			        	y.evaluador.evaluadoraspectos.add(ea);
			        }
				}
        	}        	
    	}

        // Imagen de la firma escaneada del evaluador
        Http.MultipartFormData body = request().body().asMultipartFormData();
        Http.MultipartFormData.FilePart fp = body.getFile("imagenfirma");
        System.out.println("......+++"+fp);
        if (fp != null) {
            String fileName = fp.getFilename();
            String contentType = fp.getContentType();
            File file = fp.getFile();
            System.out.println("....archivo.." + file + "    tamaño   " + file.length() + "   contentype:  " + contentType);
            try {
                Path path = Paths.get(file.getPath());
                byte[] byteFile = Files.readAllBytes(path);
                //EvaluadorFirma evf = new EvaluadorFirma();
                if (y.evaluador.firma==null)
                    y.evaluador.firma = new EvaluadorFirma();
                y.evaluador.firma.evaluador = y.evaluador;
                y.evaluador.firma.nombrearchivo = fileName;
                y.evaluador.firma.contenttype = contentType;
                y.evaluador.firma.contenido = byteFile;
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }

		y.update();		
		y.refresh();
        //Enviar correo al evaluador
        miCorreo mc = new miCorreo();
        
        mc.asunto = "Se ha modificado su perfil de Evaluador";
        mc.para = Collections.singletonList(y.correo);
        System.out.println("activo: "+y.activo.id+"    activo anterior: "+estadoActivoAnterior);
        if (y.activo.id == 2  && y.activo.id == estadoActivoAnterior){
	        mc.mensaje="Se le informa que su perfil como evaluador para el Sistema de Evaluación de Recursos Didácticos Digitales se ha modificado.<br><br>Su nombre de usuario es: "+y.usuario.usuario+" y su clave de acceso es: "+y.usuario.password+"<br><br>";
	        mc.mensaje+="<br>Evaluará el(los) aspectos:<br>";

            String aux1= "";
            StringBuilder strBuilder1 = new StringBuilder(aux1);
	        for (EvaluadorAspecto ea : y.evaluador.evaluadoraspectos)
                strBuilder1.append(ea.aspecto.descripcion).append("<br>");
            aux1 = strBuilder1.toString();
            mc.mensaje+=aux1;
	        mc.mensaje+="<br>";
	        mc.mensaje+="Ingrese a la dirección "+urlSitio+"/login para conocer las solicitudes que le fueron asignadas para evaluar.<br><br>Acceso <a href='"+urlSitio+"/login'>Login</a>" ;
        } else {
        	if (y.activo.id == 1){
	        	mc.mensaje="Se ha modificado su estado de 'Activo' a 'Inactivo'.<br>";
	        	mc.mensaje+="Esto significa que su cuenta al sistema como evaluador aún existe, pero no podrá evaluar recursos.";
        	}
        	if (y.activo.id == 2){
	        	mc.mensaje="Se ha modificado su estado de 'Inactivo' a 'Activo'.<br>";
	        	mc.mensaje+="Esto significa que su cuenta al sistema como evaluador se encuentra activa y que podrá evaluar recursos.  <br><br>Acceso <a href='"+urlSitio+"/login'>Login</a>";
        	}        	
        }
        mc.enviar();
        //mc.run();
		return GO_HOME;    	
    } 


    // Recibe el email a verificar y el id del Personal.
    // En caso de que se trate de edición debe buscar los registros que coincidan con el email pero que no tengan el mismo id del personal que se esta editando.
    // Regresa json indicando la existencia
    public static Result existeMail() throws JSONException {
        System.out.println("Desde EvaluadorController.existeMail");
        JsonNode json = request().body().asJson();
        JSONObject retorno = new JSONObject();
        String email = json.get("email").asText();
        long id = json.get("id").asLong();
        int aux=0;
        if (id==0)
            aux = Evaluador.find.fetch("personal").where().eq("personal.correo", email).findRowCount();
        if (id>0)
            aux = Evaluador.find.fetch("personal").where().eq("personal.correo", email).ne("personal.id", id).findRowCount();
        retorno.put("existe",  aux==0?"no":"si" );
        return ok (retorno.toString());
    }

    public static Result verFirma(Long id) {
        System.out.println("    id evaluador:"+id);

        Evaluador e = Evaluador.find.setId(id).findUnique();
        EvaluadorFirma ef = e.firma;

        response().setContentType(ef.contenttype);
        System.out.println("Visualizando firma del evaluador");
        return ok (ef.contenido);
    }
    
}
	
