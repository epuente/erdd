package controllers;

import static play.data.Form.form;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.persistence.PersistenceException;

import actions.Notificacion;
import actions.miCorreo;
import models.Evaluador;
import models.EvaluadorAspecto;
import models.Personal;
import models.Aspecto;
import models.EstadoActivo;
import models.Rol;
import models.Usuario;
import models.UsuarioRol;
import play.data.DynamicForm;
import play.data.Form;
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
		String urlSitio= play.Play.application().configuration().getString("urlSitio");
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
        mc.mensaje+="Ingrese a la dirección https://"+urlSitio+"/login para conocer las solicitudes que le fueron asignadas para evaluar." ;
       // mc.enviar();
        mc.run();
        
        
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
    		Personal p = Personal.find.byId(id);
    		p.delete();	        
    		flash("success", "Se eliminó el evaluador.");
	    } catch (PersistenceException pe) {	   	 
		   	 System.out.println("***************************"+pe+"\n"+pe.getCause());
		   	 if (   pe.getCause().toString().contains("IntegrityConstraint")){
		   		 flash("error", "No se puede eliminar puesto que ya hay evaluaciones realizadas, edite y establezca el evaluador como 'inactivo'.");	
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
    	String urlSitio= play.Play.application().configuration().getString("urlSitio");
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
	       
	        for (EvaluadorAspecto ea : y.evaluador.evaluadoraspectos)
	        	mc.mensaje+=ea.aspecto.descripcion+"<br>";
	        mc.mensaje+="<br>";
	        mc.mensaje+="Ingrese a la dirección https://"+urlSitio+"/login para conocer las solicitudes que le fueron asignadas para evaluar." ;
        } else {
        	if (y.activo.id == 1){
	        	mc.mensaje="Se ha modificado su estado de 'Activo' a 'Inactivo'.<br>";
	        	mc.mensaje+="Esto significa que su cuenta al sistema como evaluador aún existe, pero no podrá evaluar recursos.";
        	}
        	if (y.activo.id == 2){
	        	mc.mensaje="Se ha modificado su estado de 'Inactivo' a 'Activo'.<br>";
	        	mc.mensaje+="Esto significa que su cuenta al sistema como evaluador se encuentra activa y que podrá evaluar recursos.";
        	}        	
        }
        //mc.enviar();
        mc.run();
		return GO_HOME;    	
    } 
 
    public static Result existeMail(String mail){
    	int aux = Evaluador.find.fetch("personal").where().eq("personal.correo", mail).findRowCount();   	
        System.out.println("\n\n\nexisteMail ("+mail+"): "+aux);
		if (aux != 0){
			return badRequest(); 
		}
		else {
			return ok();
		}
    }


    public static Result existeUserPass(String user, String pass){
    	int aux = Usuario.find.fetch("roles").where().eq("usuario",user).eq("password",pass).eq("roles.rol.id",2).findRowCount();   	
        System.out.println("\n\n\nexisteUserPass ("+user+", "+pass+"): "+aux);
		if (aux != 0)
			return ok("1");
		else
			return ok("0");
    }    
    
}
	
