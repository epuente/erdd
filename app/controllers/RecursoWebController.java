package controllers;

import static play.Play.application;
import static play.data.Form.form;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

import classes.*;
import com.fasterxml.jackson.databind.JsonNode;
import controllers.util.ControladorDefault;
import models.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.text.json.JsonContext;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.itextpdf.text.DocumentException;

import akka.actor.ActorRef;
import akka.actor.Cancellable;
import akka.actor.Props;
import play.data.DynamicForm;
import play.data.Form;
import play.libs.Akka;
import play.libs.F.Callback0;
import play.libs.Json;
import play.mvc.Result;
import play.mvc.WebSocket;
import scala.concurrent.duration.Duration;
import play.mvc.Http.MultipartFormData;
import play.mvc.Http.MultipartFormData.FilePart;
import views.html.accesoNoAutorizado;
import views.html.index;
import views.html.Recurso.createMaster;
import views.html.Recurso.observaciones;
import views.html.Recurso.editMasterForm;
import views.html.Recurso.recibidoMaster;
import views.html.Recurso.actualizadoMaster;

public class RecursoWebController extends ControladorDefault {


	public static Result index() {
		session().remove("nombre");
		session().remove("rol");
		session().clear();
		return ok(index.render());
	}

	public static Result create() {
		System.out.println("desde RecursoWebController.create");
		Form<Recurso> recursoForm = form(Recurso.class);
		//List<RecursoAutor> autores = null;
		return ok(
				views.html.Recurso.createMaster.render(recursoForm, null, null)
		);
	}


	@play.db.ebean.Transactional
	public static Result mastersave() {
		String urlSitio= application().configuration().getString("urlSitio");
        urlSitio = application().isDev()?"http://"+urlSitio:"https://"+urlSitio;
		//String puerto = Play.application().configuration().getString("http.port");
		//String direccionPuerto = direccion+":"+puerto;
		Form<Recurso> recursoForm = form(Recurso.class).bindFromRequest();
		DynamicForm requestData = form().bindFromRequest();
		System.out.println("*************************************    RecursoWebController.mastersave dynamic ");
		System.out.println(requestData);
		System.out.println("************************************* recursoForm");
		System.out.println(recursoForm);


		Recurso r =  recursoForm.get();
		System.out.println("***  Creado el objeto Recurso");
		int i = 0;
		System.out.println("   "+(requestData.get("autor.paterno["+i) != null));
		System.out.println("   "+(requestData.get("autor.materno["+i) != null));
		System.out.println("   "+(requestData.get("autor.nombre["+i) != null));
		//System.out.println("   "+requestData.get("autor.autorfuncion["+i) != null);

		while (  ((requestData.get("autor.paterno["+i) != null) && (requestData.get("autor.materno["+i) != null) && (requestData.get("autor.nombre["+i) != null))
				&&  requestData.get("autor.autorfuncion["+i) != null){
			RecursoAutor a = new RecursoAutor();
			a.recurso = r;
			a.paterno = requestData.get("autor.paterno["+i);
			a.materno = requestData.get("autor.materno["+i);
			a.nombre = requestData.get("autor.nombre["+i);
			a.autorfuncion = Autorfuncion.find.byId(  Long.parseLong( requestData.get("autor.autorfuncion["+i),10) );
			if ( a.autorfuncion.id == 9L  ){
				a.otrafuncion = requestData.get("autor.otroTipoAutoria["+i);
			}
			if (a.autorfuncion.id == 1L){
				a.correo = new CorreoAutor();
				a.correo.autor = a;
				a.correo.email = requestData.get("autor.correo0");
				a.correo.telefono = requestData.get("autor.telefono0");
			}
			r.autores.add(a);
			System.out.println("agregando autor: "+a.nombre+" "+a.paterno+" "+a.materno);
			i++;
		}
		System.out.println("***  Se agregaron "+r.autores.size()+" autores");

		int j=0;
		while(requestData.get("palabra.descripcion["+j) != null){
			Palabraclave pc = new Palabraclave();
			pc.recurso = r;
			pc.descripcion = requestData.get("palabra.descripcion["+j);
			r.palabrasclave.add(pc);
			j++;
		}
		System.out.println("***  Se agregaron "+r.palabrasclave.size()+" palabras clave");
		if (!requestData.get("webUsuario").isEmpty() && !requestData.get("webPassword").isEmpty()){
			Recursoenweb rw = new Recursoenweb();
			rw.usuario = requestData.get("webUsuario");
			rw.password = requestData.get("webPassword");
			r.recursosenweb.add(rw);
			System.out.println("***  Se agregaron "+r.recursosenweb.size()+" recursos en web");
		}

		if (requestData.get("dirigidoa.id[0")!=null){
			if( !requestData.get("dirigidoa.id[0").isEmpty()  ){

				int x=0;
				while (requestData.get("dirigidoa.id["+x)!= null){
					recursoDirigidoa rd = new recursoDirigidoa();
					rd.dirigidoa =  Dirigidoa.find.byId( Long.parseLong(requestData.get("dirigidoa.id["+x)) );
					rd.recurso = r;
					r.dirigidoa.add(rd);
					x++;
				}
				System.out.println("***  Se agregaron "+r.dirigidoa.size()+" a RecursoDirigidosa");
			}
		}

		if(recursoForm.hasErrors() ||  requestData.hasErrors()  ) {
			System.out.println("ERORRRRRRRRRRRRRRRRR "+recursoForm.errors().toString());
			return badRequest(createMaster.render(recursoForm, r.autores, r));
		}

		r.estado =  Estado.find.byId(1L);

		//Graba los documentos
		MultipartFormData body = request().body().asMultipartFormData();
		System.out.println("Num de doctos: "+body.getFiles().size());

		int k = 0;
		while (body.getFile("documento.nombrearchivo["+k+"]") != null) {
			FilePart fp = body.getFile("documento.nombrearchivo["+k+"]");

			//requestData.get("documento.archivo0") != null){
			Documento d = new Documento();
			d.tipodocumento =  Tipodocumento.find.byId( Long.parseLong(requestData.get("documento.tipodocumento["+k)));
			//MultipartFormData body = request().body().asMultipartFormData();
			//FilePart fp = body.getFile("documento.archivo0");
			if (fp != null) {
				String fileName = fp.getFilename();
				String contentType = fp.getContentType();
				File file = fp.getFile();

				try {
					Path p = Paths.get(file.getPath());
					byte[] byteFile = Files.readAllBytes(p);

					d.nombrearchivo = fileName;
					d.contenttype = contentType;
					d.contenido =  byteFile;
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException ioe){
                    System.out.println("Error -- "+ioe.getMessage()+"\n"+ioe.getCause());
				}
				d.recurso = r;
				r.documentos.add(d);
			}
			k++;
		}
		System.out.println("***  Se agregaron "+r.documentos.size()+" documentos");

		System.out.println("***  Se trata de actualización del recurso????   "+requestData.get("version.id"));
		if (  requestData.get("version.id").contains("2") && requestData.get("extra1").contains("S")  ){
			System.out.println("***  Si se trata de actualización");
			r.versionanterior = new Versionanterior();
			r.versionanterior.recurso = r;
			r.versionanterior.recursoanterior = Recurso.searchByNumControl( requestData.get("versionanterior.recursoanterior_id"));
			System.out.println("***  Se agregó "+r.versionanterior.recursoanterior.numcontrol+" como version anterior");
		} else {
			r.versionanterior = null;
		}

		System.out.println("***  Se agregó el historial de estados");
        r.auditinsert = new Date();
		r.save();


		System.out.println("***  Se grabó a las tablas correspondientes");
		r.refresh();
		System.out.println("\n\n\n\n***  Num Control generado "+r.numcontrol+"\n\n\n\n");
		RegistroAcceso ra = new RegistroAcceso();
		ra.autor = Recurso.searchByNumControl(r.numcontrol).getResponsable();
		ra.ruta = request().path();
		ra.ip = request().remoteAddress();
		ra.fecha = new Date();
		ra.save();


        miCorreo mc = new miCorreo();


        // Envio de correo a autores
        List<String> listaDirecciones = new ArrayList<>();
        for (RecursoAutor a : r.autores) {
            if (a.autorfuncion.id == 1L) {
                listaDirecciones.add(a.correo.email);
            }
        }

        mc.asunto = "Solicitud de ETPRDD (correo al Docente)";
        mc.para = listaDirecciones;
        mc.mensaje = "Estimado usuario:<br><br>" +
                "Su solicitud de evaluación de Recurso Didáctico Digital se recibió correctamente.<br>En caso de existir observaciones sobre la información y/o documentos registrados, recibirá una notificación por correo electrónico para realizar las modificaciones conducentes, en un plazo máximo de 72 horas. En caso de no recibirla, por favor comuníquese a la Ext. 57405.<br><br>" +
                "La clave de control para el seguimiento de su solicitud es:<br><br>" +
                "<big>" + r.numcontrol + "</big>" +
                "<br>(" + r.ncLetras() + ")<br><br>" +
                "Ingrese a la dirección <a href='" + urlSitio + "'>" + urlSitio + "</a> y utilizando su clave de control realice su seguimiento.<br><br>" +
                "O ingrese directamente <a href='" + urlSitio + "/seguimiento/" + r.numcontrol + "'>Aqui</a>  ";
        mc.enviar();

        CorreoSalida cs = new CorreoSalida(mc, r);
        cs.save();


		// Enviar notificacion al celular (docente)
		Notificacion n = new Notificacion();
		n.enviar(r.numcontrol, "ERDD", "Su solicitud de evaluación de Recurso Didáctico Digital se recibió correctamente");

		//Envío de correo al coordinador de ERDD
		mc.asunto = "Solicitud de ETPRDD (correo al coordinador del proceso)";
		mc.mensaje="Ha ingresado una nueva solicitud de Recurso con la clave de control: "+r.numcontrol+"<br><br>";
		mc.mensaje+="Para revisarla, por favor ingrese al Sistema de Evaluación de Recursos Didácticos Digitales: ";
		mc.mensaje+="<a href='"+urlSitio+"/login'>"+urlSitio+"/login</a>";
        mc.para =  Collections.singletonList(Personal.elCoordinador().correo);
        mc.enviar();

		CorreoSalida aux2 = new CorreoSalida(mc, r);
        aux2.save();


		// Enviar notificacion al celular del coordinador(administrador e2)
		Notificacion n2 = new Notificacion();
		n2.enviar("fbErddAdmin", "ERDD", mc.mensaje);
		return redirect("/solRecibida/"+r.numcontrol);
	}


	public static Result recibido(String nc){
		Recurso r = Recurso.searchByNumControl(nc);
		return ok(recibidoMaster.render(r) );
	}

	public static Result masteredit(Long id) {
		Form<Recurso> recursoForm = form(Recurso.class).fill(
				Recurso.find.byId(id)
		);
		Recurso r = recursoForm.get();
		Documento.searchByRecurso(r.id);

		switch ( r.estado.id.intValue()) {
			case 2:
				return ok(editMasterForm.render(id, recursoForm, r) );
			case 3:
				return ok( views.html.Reporte.solicitudFirma.render(r) );
		}
		return null;
	}

	public static Result mastereditAn() {
		if (session("idRecurso") == null){
			return ok( views.html.accesoNoAutorizado.render("Usted esta intentando acceder a una operación relacionada a una solicitud de recurso sin contar con la misma."));
		}
		Long rid = Long.parseLong(session("idRecurso"));
		Form<Recurso> recursoForm = form(Recurso.class).fill(
				Recurso.find.byId(rid)
		);
		Recurso r = recursoForm.get();
		for(Historialestado he : r.historialestados){
			System.out.println(he.id+" "+he.estado+" "+he.estado.descripcion );
		}
		return ok(views.html.Historial.index.render(  r  ));
	}

	public static Result conObservacionesAn(){
		Recurso r = Recurso.find.byId( Long.parseLong(session("idRecurso"))    );

		Form<Recurso> recursoForm = form(Recurso.class).fill( r );
		return ok(editMasterForm.render(r.id, recursoForm, r) );
	}



	public static Result imprimirSolicitudAceptada()throws DocumentException, IOException{
		ByteArrayOutputStream baosPDF = new ByteArrayOutputStream();
		miPdf mipdf = new miPdf(Long.parseLong(session("idRecurso")));
		//mipdf.id = Long.parseLong(session("idRecurso"));
		mipdf.baos = baosPDF;
		mipdf.generarSolicitudEvaluacion();
		response().setContentType("application/pdf");
		return ok (  mipdf.baos.toByteArray() );
	}


    public static Result imprimirSolicitudAceptadaWord()throws DocumentException, IOException{
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        miWord miword = new miWord(Long.parseLong(session("idRecurso")));
        miword.baos = baos;
        miword.generarSolicitudEvaluacionWord();
        response().setContentType("application/vnd.openxmlformats-officedocument.wordprocessingml.document");
        return ok (  miword.baos.toByteArray() );
    }


	@play.db.ebean.Transactional
	public static Result masterupdate(Long id) {
		DynamicForm requestData = form().bindFromRequest();
		System.out.println(requestData);
		Form<Recurso> recursoForm = form(Recurso.class).bindFromRequest();
		System.out.println("................. "+form(Recurso.class).bindFromRequest());
		Recurso r =  form(Recurso.class).bindFromRequest().get();

		if(recursoForm.hasErrors()) {
			return badRequest(observaciones.render(id, recursoForm,  r));
		}

//        recursoForm.get().update(id);


		// AUTORES
		int i = 0;
		while (  (requestData.get("autor.paterno["+i) != null) || (requestData.get("autor.materno["+i) != null) || (requestData.get("autor.nombre["+i) != null)
				||  requestData.get("autor.autorfuncion["+i) != null){
			RecursoAutor a = new RecursoAutor();
			a.recurso = r;
			a.paterno = requestData.get("autor.paterno["+i);
			a.materno = requestData.get("autor.materno["+i);
			a.nombre = requestData.get("autor.nombre["+i);
			a.autorfuncion = Autorfuncion.find.byId(  Long.parseLong( requestData.get("autor.autorfuncion["+i),10) );
			if (a.autorfuncion.id == 1L){
				a.correo = new CorreoAutor();
				a.correo.autor = a;
				a.correo.email = requestData.get("autor.correo0");
				a.correo.telefono = requestData.get("autor.telefono0");
			}
			r.autores.add(a);
			i++;
		}


		// PALABRAS CLAVE
		int j=0;
		while(requestData.get("palabra.descripcion["+j) != null){
			Palabraclave pc = new Palabraclave();
			pc.recurso = r;
			pc.descripcion = requestData.get("palabra.descripcion["+j);
			r.palabrasclave.add(pc);
			j++;
		}

		// Dirigido a
		if (requestData.get("dirigidoa.id[0")!=null){
			if( !requestData.get("dirigidoa.id[0").isEmpty()  ){

				int x=0;
				while (requestData.get("dirigidoa.id["+x)!= null){
					recursoDirigidoa rd = new recursoDirigidoa();
					rd.dirigidoa =  Dirigidoa.find.byId( Long.parseLong(requestData.get("dirigidoa.id["+x)) );
					rd.recurso = r;
					r.dirigidoa.add(rd);
					x++;
				}
				System.out.println("***  Se agregaron "+r.dirigidoa.size()+" a RecursoDirigidosa");
			}
		}

		// Borrar documentos

		List<String> items = Arrays.asList(requestData.get("documentosBorrar").split("\\s*,\\s*"));
		List<String> observaItems = Arrays.asList(requestData.get("observacionesDocumentosBorrar").split("\\s*,\\s*"));
		System.out.println("Num doctos a eliminar:"+items.size());
		System.out.println("docto eliminar:"+items.get(0).toString());
		//	r.estado = Estado.find.byId(1L);

		System.out.println("***  Se trata de actualización del recurso????   "+requestData.get("version.id"));
		if (  requestData.get("version.id").contains("2")  && !requestData.get("versionanterior.recursoanterior_id").isEmpty()    ){
			System.out.println("***  Si se trata de actualización");
			r.versionanterior = new Versionanterior();
			r.versionanterior.recurso = r;
			r.versionanterior.recursoanterior = Recurso.searchByNumControl( requestData.get("versionanterior.recursoanterior_id"));
			System.out.println("***  Se agregó "+r.versionanterior.recursoanterior.numcontrol+" como version anterior");
		} else {
			r.versionanterior = null;
		}



		r.estado = Estado.find.byId(105L);
		r.update(id);
		r.update();

		r.refresh();
		//Envía correo a administrador indicando que el profesor ha atendido a las observaciones.
		miCorreo mc = new miCorreo();
		mc.asunto ="Se han atendido las observaciones a la solicitud "+r.numcontrol;
		mc.mensaje="Las observaciones a la solicitud con clave de control "+r.numcontrol+" han sido atendidas por el usuario.";
		mc.para = Collections.singletonList(Personal.elCoordinador().correo);
		//mc.start();
        mc.enviar();

		try{
			if (items!= null){
                for (String item : items) {
                    if (!item.isEmpty()) {
                        System.out.println("Eliminando docto: " + item);
                        Documento.find.byId(Long.valueOf(item)).delete();
                    }
                }
			}
			if (observaItems!= null){
                for (String observaItem : observaItems) {
                    if (!observaItem.isEmpty()) {
                        System.out.println("Eliminando obs docto: " + observaItem);
                        Observacion ona = Observacion.searchByRecursoNombreCampo(r.id, observaItem);
                        System.out.println(ona);
                        if (ona != null)
                            ona.delete();
                        System.out.println("Eliminando obs docto: " + observaItem);
                        Observacion otd = Observacion.searchByRecursoNombreCampo(r.id, observaItem);
                        System.out.println(otd);
                        if (otd != null)
                            otd.delete();
                    }
                }
			}
		}
		catch (NumberFormatException e) {
			System.out.println("NumberFormatException: " + e.getMessage());
		}
		catch (NullPointerException npe){
			System.out.println("NullPointerException: " + npe.getMessage());
		}

		//DOCUMENTOS
		MultipartFormData body = request().body().asMultipartFormData();
		// Documentos recien agregados
		int k = 0;
		System.out.println("Num de doctos: "+body.getFiles().size());
		while (body.getFile("documento.nombrearchivo["+k+"]") != null           ) {
			System.out.println(k);
			FilePart fp = body.getFile("documento.nombrearchivo["+k+"]");
			Documento d = new Documento();
			d.tipodocumento =  Tipodocumento.find.byId( Long.parseLong(requestData.get("documento.tipodocumento["+k)));
			if (fp != null) {
				String fileName = fp.getFilename();
				System.out.println("    nombre archivo: "+fileName);
				String contentType = fp.getContentType();
				File file = fp.getFile();
				try {
					Path p = Paths.get(file.getPath());
					byte[] byteFile = Files.readAllBytes(p);
					r.refresh();
					System.out.println("el recurso r: "+r);
					d.recurso = r;
					d.nombrearchivo = fileName;
					d.contenttype = contentType;
					d.contenido =  byteFile;
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException ioe){
                    System.out.println("Error -- "+ioe.getMessage()+"\n"+ioe.getCause());
				}
				d.save();
			}
			k++;
		}
		return ok(actualizadoMaster.render(r));
	}



	public static Result buscarNC(String nc){
		System.out.println("nc:  "+nc);
		Recurso r = Recurso.find.where().eq("numcontrol",nc.toString().toUpperCase() ).findUnique();
		System.out.println(r);
		if ( r == null){
			System.out.println(".... NO   existe");
			ObjectNode result = Json.newObject();
			result.put("estado", "error");
			System.out.println("json: "+result);
			return ok( result );
		}
		else {
			System.out.println(".... Existe");
			session("idRecurso", r.id.toString());
			RegistroAcceso ra = new RegistroAcceso();
			ra.autor = Recurso.searchByNumControl(nc).getResponsable();
			ra.ruta = request().path();
			ra.ip = request().remoteAddress();
			ra.fecha = new Date();
			ra.save();
			ObjectNode result = Json.newObject();
			result.put("estado", "success");
			result.put("titulo", r.titulo);
			result.put("autor", r.getResponsable().nombreCompleto());
			return ok( result );
		}
	}


	public static Result verAn(Long id) {
		System.out.println("    id:"+id);
		System.out.println("    idRecurso:"+session("idRecurso"));
		System.out.println("    cvesRoles:"+session("cvesRoles")+"...");

		// Es docente con idRecurso en session		
		if (session("cvesRoles")== null && session("idRecurso")!=null) {
			Recurso r = Recurso.find.byId( Long.parseLong(session("idRecurso")));

			//Recurso r = Recurso.find.byId( id );
			boolean seEncuentra = false;
			for(Documento aux : r.documentos){
				if (aux.id == id){
					seEncuentra |=true;
					System.out.println("El id del docto pertenece a la solicitud");
				}
			}
			if (seEncuentra){
				Documento d = Documento.find.byId( id );
				response().setContentType(d.contenttype);
				System.out.println("Docente visualizando docto");
				return ok (d.contenido);
			} else {
				return ok (accesoNoAutorizado.render("El documento que intenta visualizar no pertenece a la solicitud"));
			}
		} else {
			//System.out.println(Arrays.asList('1 ', '2 ','3 ').contains("cvesRoles"));
//			System.out.println(  session("cvesRoles").equalsIgnoreCase("1 ") ||  session("cvesRoles").equalsIgnoreCase("2 ") || session("cvesRoles").equalsIgnoreCase("3 "));
			//Es coordinador de proceso ERDD
			if (  session("cvesRoles").equalsIgnoreCase("1 ") ||  session("cvesRoles").equalsIgnoreCase("2 ") || session("cvesRoles").equalsIgnoreCase("3 ")  ) {
				System.out.println("Evaluador, Admin o Coordinador visualizando docto");
				Documento d = Documento.find.byId( id );
				response().setContentType(d.contenttype);
				return ok (d.contenido);
			}
		}
		return ok("???");

	}



	public static Result verDatosEnviados(){
		Recurso r = Recurso.find.byId( Long.parseLong(session("idRecurso"))   );
		return ok( views.html.Reporte.cesoe.render(r) );
	}



    // Esta es un prueba de correo
	public static Result Correo() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy kk:mm:ss");
        System.out.println("Desde RecursowebController.Correo");

        Ctacorreo cc =Ctacorreo.find.where().eq("activo", true).findUnique();

		miCorreo mc = new miCorreo();
        List<String> lista = new ArrayList<>();
        lista.add("epuente_72@yahoo.com");
        lista.add("epuente@ipn.mx");
        lista.add("eduardo.puente72@gmail.com");
        lista.add("epgu72@gmail.com");
        //lista.add("aperezg@ipn.mx");
		mc.para =lista;
        mc.asunto="Prueba. Se recibió correctamente";
		mc.mensaje="Este es un correo de prueba.<br>Se recibió <strong>correctamente</strong>!!!<br><br>";

        mc.mensaje+="&emsp;Host: <strong>"+cc.hostname+"</strong><br>";
        mc.mensaje+="&emsp;Cuenta: <strong>"+cc.cuenta+"</strong><br>";
        mc.mensaje+="&emsp;Puerto: <strong>"+cc.puerto+"</strong><br>";

        mc.mensaje+="<br><br><br><small>Enviado a las "+sdf.format(new Date())+"</small>";

        //mc.start();
		mc.enviar();

        while (mc.isAlive()){
            System.out.println("correo vivo !!!!");
        }

        System.out.println("enviado? "+mc.enviado);
        if (mc.enviado==false) {
            System.out.println("error " + mc.mensajeError);
            return ok(views.html.correoEnviado.render("No se pudo enviar el correo") );
        } else {
            return ok(views.html.correoEnviado.render("correo oki"));
        }
	}

    // Esta es un prueba de correo desde la admin de la CtaCorreo
    public static Result Correo2() throws JSONException {
        JsonNode json = request().body().asJson();
        JSONObject retorno = new JSONObject();
        retorno.put("estado","indefinido");
        retorno.put("otro", "este es otro valor");
        System.out.println( "parametros "+ json );

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy kk:mm:ss");
        System.out.println("Desde RecursowebController.Correo2");

        //Ctacorreo cc =Ctacorreo.find.where().eq("activo", true).findUnique();

        miCorreo mc = new miCorreo();
        mc.setHost(json.findValue("host").asText() );
        mc.setPuerto(json.findValue("puerto").asText());
        mc.setDe(json.findValue("de").asText());
        mc.setContrasenia(json.findValue("contrasenia").asText());

        List<String> lista = new ArrayList<>();
        //lista.add("epuente_72@yahoo.com");
        //lista.add("epuente@ipn.mx");
        //lista.add("eduardo.puente72@gmail.com");
        //lista.add("epgu72@gmail.com");

        lista.add( json.findValue("para").asText()  );
        //lista.add("aperezg@ipn.mx");
        mc.para =lista;
        mc.asunto="Prueba. Se recibió correctamente";
        mc.mensaje="Este es un correo de prueba.<br>Se recibió <strong>correctamente</strong>!!!<br><br>";

        mc.mensaje+="&emsp;Host: <strong>"+mc.getHost()+"</strong><br>";
        mc.mensaje+="&emsp;Cuenta: <strong>"+mc.getDe()+"</strong><br>";
        mc.mensaje+="&emsp;Puerto: <strong>"+mc.getPuerto()+"</strong><br>";

        mc.mensaje+="<br><br><br><small>Enviado a las "+sdf.format(new Date())+"</small>";






        //mc.start();
        mc.enviar();

        while (mc.isAlive()){
            System.out.println("correo vivo !!!!");
        }

        System.out.println("enviado? "+mc.enviado);

        if (mc.enviado == false) {
            retorno.put("estado", "errorrrrr");
            retorno.put("seEnvio", false);
            System.out.println("error " + mc.mensajeError + "   " + retorno.toString());
            return ok(retorno.toString());
        } else {
            retorno.put("estado", "enviado");
            retorno.put("seEnvio", true);
            System.out.println("ok " + "   " + retorno.toString());
            return ok(retorno.toString());
        }
    }

	// REPORTE PDF con objeto miPdf
	public static Result reporteEvaluacion(){
		System.out.println("Desde REcursoWebController.reporteEvaluscion2");

		Recurso r = Recurso.find.byId(Long.parseLong(session("idRecurso")));
		ByteArrayOutputStream baosPDF = new ByteArrayOutputStream();

		miPdf mipdf = new miPdf(r.id);
		//	mipdf.id = r.id;
		mipdf.baos = baosPDF;
		try {
			mipdf.generarReporteFinal("otro");
		} catch (Exception e) {
			e.printStackTrace();
		}

		response().setContentType("application/pdf");

		return ok (  mipdf.baos.toByteArray() );
	}


	public static Result ajaxUnidadAcademicaFiltrada(Long nivel){
		System.out.println("   ...........................   desde UnidadacademicaController.ajaxUnidadAcademicaFiltrada ");
		JsonContext jsonContext = Ebean.createJsonContext();
/*		
		List<Unidadacademica> ua = Unidadacademica.find
				.where().eq("niveles.nivel.id", nivel).eq("areas.area.id", area).orderBy("nombre")
				.findList();
	*/
		List<Unidadacademica> ua = Unidadacademica.find
				.where().eq("niveles.nivel.id", nivel).orderBy("nombre")
				.findList();


		System.out.println("Unidades despues del filtro: "+ua.size());
		return ok ( jsonContext.toJsonString(ua) );
	}


	public static Result WSBuscarNC2(String nct) throws JSONException{
		System.out.println("desde REcursoWebCXontroller.WSBuscarNC2");
		Recurso r = Recurso.find.setAutofetch(false).where().eq("numcontrol",nct.toUpperCase() ).findUnique();



		new RetornoWSRecurso();
		Ebean.createJsonContext();

		new ArrayList<Long>();

		JSONObject result = new JSONObject();
		Json.newObject();


		Niveleducativo.find.all();


		//	System.out.println(r);
		if ( r == null){
			System.out.println(".... NO   existe");

			result.put("ajaxEstado", "error");
			result.put("mensaje", "No se localizó el número de control");
			//   	System.out.println("json: "+result);
			response().setHeader("Access-Control-Allow-Origin", "148.204.111.41:8000");
			response().setHeader("Allow", "*");
			response().setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, DELETE, OPTIONS");
			response().setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept, Referer, User-Agent");

			response().setHeader("Access-Control-Allow-Headers", "X-Requested-With");
			response().setHeader("Access-Control-Allow-Origin","X-Requested-With");

		}
		else {
			System.out.println(".... Existe");
			session("idRecurso", r.id.toString());
			RegistroAcceso ra = new RegistroAcceso();
			ra.autor = Recurso.searchByNumControl(nct).getResponsable();
			ra.ruta = request().path();
			ra.ip = request().remoteAddress();
			ra.fecha = new Date();
			ra.save();
			//ret.recurso=r;
			result.put("idRecurso", r.id);
			result.put("mensaje", "Localizado");
			result.put("ajaxEstado", "success");
			result.put("estado", r.estado.id);
			result.put("estadoDescripcion", r.estado.descripcion);
			result.put("titulo", r.titulo);
			result.put("claveControl", r.numcontrol);
			result.put("autorResponsable", r.getResponsable().nombreCompleto());
			if (r.oficio != null) {
				result.put("oficio", r.oficio.numero);
				result.put("folio", r.oficio.folio);
			}
			if (r.clasificacion != null) {
				result.put("clasificacion", r.clasificacion.nombreCompletoClasificacion());
				result.put("tipoRecurso", r.clasificacion.tiporecurso.descripcion);
			}

			result.put("encuesta", !(r.encuesta == null));



			JSONArray jsa = new JSONArray();
			r.historialestados.forEach(he->{
				JSONObject nodo = new JSONObject();

				try {
					nodo.put("id", he.id);
					nodo.put("estado", he.estado.id);
					nodo.put("estadoDescripcion", he.estado.descripcion);

					nodo.put("insert", he.auditinsert.toString());
					nodo.put("update", he.auditinsert.toString());

				} catch (JSONException e) {
					e.printStackTrace();
				}
				jsa.put(nodo);
			});
			result.put("datos", jsa);
			System.out.println("tam recursoevaluadores:   "+r.recursoevaluadores.size());
			JSONArray jsa2 = new JSONArray();
			r.recursoevaluadores.forEach(re->{
				JSONObject nodo = new JSONObject();

				try {
					nodo.put("id", re.id);
					nodo.put("aspecto", re.aspecto.descripcion);
					nodo.put("evaluador", re.evaluador.personal.nombreCompleto());
					nodo.put("estado", re.estadoevaluacion.descripcion);

					nodo.put("insert", re.auditinsert.toString());
					nodo.put("update", re.auditinsert.toString());

				} catch (JSONException e) {
					e.printStackTrace();
				}
				jsa2.put(nodo);
			});
			result.put("rescursoEvaluadores", jsa2);

			JSONArray jsa3 = new JSONArray();
			r.historialestadoevaluaciones.forEach(he->{
				JSONObject nodo = new JSONObject();
				try {
					nodo.put("id", he.id);
					nodo.put("aspecto", he.recursoevaluador.aspecto.descripcion);
					nodo.put("evaluador", he.recursoevaluador.evaluador.personal.nombreCompleto());
					nodo.put("estadoDescripcion", he.estado.descripcion);

					nodo.put("insert", he.auditinsert.toString());
					nodo.put("update", he.auditinsert.toString());

				} catch (JSONException e) {
					e.printStackTrace();
				}
				jsa3.put(nodo);
			});
			result.put("historialEstadoEvaluaciones", jsa3);

			JSONArray jsa4 = new JSONArray();
			r.historialestadoencuesta.forEach(henc->{
				JSONObject nodo = new JSONObject();
				try {
					nodo.put("id", henc.id);
					nodo.put("estado", henc.estado.id);
					nodo.put("estadoDescripcion", henc.estado.descripcion);
					nodo.put("insert", henc.auditinsert.toString());
					nodo.put("update", henc.auditinsert.toString());

				} catch (JSONException e) {
					e.printStackTrace();
				}
				jsa4.put(nodo);
			});
			result.put("historialestadoencuesta", jsa4);

		}
		System.out.println("retornando: "+result);
		System.out.println("retornando json: " +  new JSONObject(result.toString() ) );
		response().setHeader("Access-Control-Allow-Origin", "*");
		response().setHeader("Allow", "*");
		response().setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, DELETE, OPTIONS");
		response().setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept, Referer, User-Agent");
		return ok(     result.toString()     );
	}

	public static Result WSAjaxImprimirSolicitudAceptada(Long idRecurso)throws DocumentException, IOException{
		ByteArrayOutputStream baosPDF = new ByteArrayOutputStream();
		miPdf mipdf = new miPdf(idRecurso);
		//mipdf.id = idRecurso;
		mipdf.baos = baosPDF;
		mipdf.generarSolicitudEvaluacion();
		response().setContentType("application/pdf");
		response().setHeader("Content-Disposition", "attachment; filename=SolERDD_" + mipdf.getClaveControl()+".pdf");

		response().setHeader("Access-Control-Allow-Origin", "*");
		response().setHeader("Allow", "*");
		response().setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, DELETE, OPTIONS");
		response().setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept, Referer, User-Agent");


		return ok (  mipdf.baos.toByteArray() );
	}

	public static Result WSAjaxImprimirReporteETP(Long idRecurso)throws Throwable{
		ByteArrayOutputStream baosPDF = new ByteArrayOutputStream();
		miPdf mipdf = new miPdf(idRecurso);
		//mipdf.id = idRecurso;
		mipdf.baos = baosPDF;
		mipdf.generarReporteFinal("appMovil");
		response().setContentType("application/pdf");
		response().setHeader("Content-Disposition", "attachment; filename=RepETPERDD_" + mipdf.getClaveControl()+".pdf");
		return ok (  mipdf.baos.toByteArray() );
	}



	public static WebSocket<String> pingWs() {
		return new WebSocket<String>() {
			public void onReady(WebSocket.In<String> in, WebSocket.Out<String> out) {
				final ActorRef pingActor = Akka.system().actorOf(Props.create(Pinger.class, in, out));
				final Cancellable cancellable = Akka.system().scheduler().schedule(Duration.Zero(),
						Duration.create(5, TimeUnit.SECONDS),
						pingActor,
						"Tick",
						Akka.system().dispatcher(),
						null
				);

				in.onMessage(System.out::println);



				in.onClose(new Callback0() {
					@Override
					public void invoke() {
						cancellable.cancel();
						System.out.println("websocket cerrado ");
					}
				});
			}

		};
	}



	public static WebSocket<String> socket() {
		return WebSocket.whenReady((in, out) -> {
			// For each event received on the socket,
			in.onMessage(System.out::println);

			// When the socket is closed.
			in.onClose(() -> System.out.println("Disconnected"));

			// Send a single 'Hello!' message
			out.write("Hello!");
		});
	}

	public static Result enviarSocket() {
    	/*
    	try {
    		FileInputStream serviceAccount = new FileInputStream("/home/epuente/playFramework/erdd/public/fberdd-57e76-firebase-adminsdk-4j6o8-5639cfd7aa.json");

    		FirebaseOptions options = new FirebaseOptions.Builder()
    		    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
    		    .setDatabaseUrl("https://fberdd-57e76.firebaseio.com/")
    		    .build();

    		FirebaseApp.initializeApp(options);

		if (FirebaseApp.getInstance() == null)	
				FirebaseApp.initializeApp(options);
    	System.out.println("Se ha agregado e inicializado el SDK de firebase admin al servidor");
    	
			
    	} catch (FileNotFoundException fnfe) {
    		System.out.println("FNF");
    	}
    	
    	catch (Exception e) {
			System.out.println("NOP "+e);
		}  
    	
    	// Tema
    	// The topic name can be optionally prefixed with "/topics/".
    	String topic = "5OEWFIQYDT4H";

    	// See documentation on defining a message payload.
    	Message message = Message.builder()
        	    .setNotification(new Notification("ERDD", "Esta es una prueba del uso de notificaciones mediante firebase admin sdk"))
        	    .setTopic(topic)
        	    .build(); 
    	try {
    		String response = FirebaseMessaging.getInstance().send(message);
    		System.out.println("Se envió exitosamente la notificación: " + response);
    	} catch (Exception e) {
    		System.out.println("Errrrror   "+e);
    	}
    	 
    	
    	*/

		//System.out.println("creando objeto Notificacion");

		System.out.println("enviar a todos (notificaciones celular)");
		Recurso.find.all().forEach(r->{
			Notificacion n = new Notificacion();
			n.enviar(r.numcontrol, "Prueba", "Prueba de notificaciones del Sistema de ERDD");
		});
		return ok ("oki");
	}



    public static Result seguimiento(String nc){
        Recurso recurso = models.Recurso.find.where().eq("numcontrol", nc).findUnique();
        if (recurso != null) {
            session("idRecurso", recurso.id.toString());
            Long rid = recurso.id;
            Form<Recurso> recursoForm = form(Recurso.class).fill(
                    Recurso.find.byId(rid)
            );

            for (Historialestado he : recurso.historialestados) {
                System.out.println(he.id + " " + he.estado + " " + he.estado.descripcion);
            }
            return ok(views.html.Historial.index.render(recurso));
        } else
            return ok(views.html.errores.noExisteRecurso.render());
    }










}





