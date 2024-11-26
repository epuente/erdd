package controllers;

import static play.data.Form.form;

import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

import com.avaje.ebean.*;
import actions.Notificacion;
import actions.miCorreo;
import models.*;

import play.data.DynamicForm;
import play.data.Form;
import play.db.ebean.Model;
import play.db.ebean.Transactional;
import play.mvc.Result;
import views.html.EvaluacionEvaluador.*;


public class EvaluacionEvaluadorController extends ControladorSeguroEvaluador{

	public static Result index(){
		return redirect (routes.EvaluacionEvaluadorController.resumen());
	}


	public static Result listado(int page, String sortBy, String order, String filter, String cf, int sol) {
		System.out.println("page:"+page+"  sortBy:"+sortBy+"   order:"+order+"  Filter:"+filter+"       campoFiltro:"+cf);

		List<Recurso> r = Recurso.find.fetch("recursoevaluadores").where()
				.ge("recursoevaluadores.recurso.estado.id", 6L)
//            	.eq("recursoevaluadores.recurso.estado.id", 100L)
				.ne("recursoevaluadores.recurso.estado.id", 11)
				.ne("recursoevaluadores.recurso.estado.id", 12)
          //  	.ne("recursoevaluadores.recurso.estado.id", 100)
				.in("recursoevaluadores.estadoevaluacion.id",  Arrays.asList(1,2,3,4,5))
				.eq("recursoevaluadores.evaluador.id", play.mvc.Controller.session("idEvaluador") ).setOrderBy("titulo, clasificacion.tiporecurso.descripcion, recursoevaluadores.aspecto.descripcion").findList();
		return ok( listRecursoevaluador.render(r) );
    }

	public static Result resumen(){
		List<Long> edos = new ArrayList<Long>();
		edos.add(6L); edos.add(7L);  edos.add(8L); edos.add(9L);
		edos.add(10L); edos.add(100L); edos.add(110L); edos.add(400L); edos.add(402L);

		int x = Recurso.find.fetch("recursoevaluadores").where()
				.eq("recursoevaluadores.evaluador.id",  session("idEvaluador"))
				.in("recursoevaluadores.estadoevaluacion.id", Arrays.asList(1L,2L,3L,4L,5L, 6L,7L,8L,9L,10L,100L,110L))
				.in("estado.id", edos).findRowCount();


		int r1 =  Recurso.find.fetch("recursoevaluadores").where()
				.not(Expr.in("estado.id", Arrays.asList(400,401,402)))
				.eq("recursoevaluadores.evaluador.id", session("idEvaluador"))
				.eq("recursoevaluadores.estadoevaluacion.id", 1L)
				.findRowCount();
		int r2 = Recurso.find.fetch("recursoevaluadores").where()
				.not(Expr.in("estado.id", Arrays.asList(400,401,402)))
				.eq("recursoevaluadores.evaluador.id", session("idEvaluador"))
				.eq("recursoevaluadores.estadoevaluacion.id", 2L)
				.findRowCount();
		int r3 = Recurso.find.fetch("recursoevaluadores").where()
				.not(Expr.in("estado.id", Arrays.asList(400,401,402)))
				.eq("recursoevaluadores.evaluador.id", session("idEvaluador"))
				.eq("recursoevaluadores.estadoevaluacion.id", 3L)
				.findRowCount();
		int r4 = Recurso.find.fetch("recursoevaluadores").where()
				.not(Expr.in("estado.id", Arrays.asList(400,401,402)))
				.eq("recursoevaluadores.evaluador.id", session("idEvaluador"))
				.eq("recursoevaluadores.estadoevaluacion.id", 4L)
				.findRowCount();
		int r5 = Recurso.find.fetch("recursoevaluadores").where()
				.not(Expr.in("estado.id", Arrays.asList(400,401,402)))
				.eq("recursoevaluadores.evaluador.id", session("idEvaluador"))
				.eq("recursoevaluadores.estadoevaluacion.id", 5L)
				.findRowCount();
		int c400 = Recurso.find.fetch("recursoevaluadores").where()/*.in("estado.id", 402L)*/
				.eq("recursoevaluadores.evaluador.id", session("idEvaluador"))
				.eq("estado.id", 400L)
				.findRowCount();

		return ok ( resumen.render(x, r1, r2, r3, r4, r5, c400 ) );
	}

	public static Result list(int page, String sortBy, String order, String filter, String cf) {
		return ok(list.render(Recursoevaluador.page(page,10, sortBy, order, filter, cf ),
                sortBy, order, filter, cf
                )
                );
    }

    
    public static Result create(Long id, Long idAspecto){
		String mensajes ="";
		Recursoevaluador re = Recursoevaluador.find.where().eq("recurso.id", id).eq("aspecto.id", idAspecto).eq("evaluador.id", session("idEvaluador")).findUnique();

		if (re.evaluador.personal.activo.id==1){
			return ok ("Esta acción no esta permitida para una cuenta de evaluador inactiva.");
		}


		try{
			//int VersionReciente = Ebean.createSqlQuery("SELECT VersionActualTerminada() retorno").findUnique().getInteger("retorno");
			// Se eliminó la funcion de db: VersionActualTerminada()

			SqlRow sqlRow = Ebean.createSqlQuery("select max(version) as vt from evaluacion_tabla_version where terminado = 'S'").findUnique();
			SqlRow sqlRow2 = Ebean.createSqlQuery("select max(version) as vt from evaluacion_tabla_version where terminado = 'S'").findUnique();

			int VersionReciente = sqlRow.getInteger("vt");
			Long VersionRecienteID =  EvaluacionTablaVersion.find.where().eq("version", VersionReciente).findUnique().id;


			System.out.println("versionReciente: "+VersionReciente);
			System.out.println("versionRecienteID "+VersionRecienteID);
			Clasificacion c = Clasificacion.find.where().eq("recurso.id",id).findUnique();

			ClasificadorCriterio3 cc3 = ClasificadorCriterio3.find.byId(  c.criterio3.id);


			ArrayList<Long> arrIdsEjemplos = new ArrayList<>();
			cc3.ejemplos.forEach(x->{
				System.out.println("bucle: "+x.id);
				if (x.tiporecurso.id == re.recurso.clasificacion.tiporecurso.id){
					arrIdsEjemplos.add(x.id);
				}
			});

			System.out.println("criterios: "+c.criterio1.id+"  "+c.criterio2.id+"  "+c.criterio3.id+"    (cc3.id)"+cc3.id );
			System.out.println("aspecto: "+idAspecto );
			System.out.println("tipo de recurso: "+re.recurso.clasificacion.tiporecurso.id +" - "+re.recurso.clasificacion.tiporecurso.descripcion);


			List<Object> qevTab2 = EvaluacionTabla.find
					.where()
					.eq("version.id",VersionRecienteID)
					.eq("aspecto.id", idAspecto)
					.eq("criterio1.id", c.criterio1.id)
					.eq("criterio2.id", c.criterio2.id)
					.eq("criterio3.id",  c.criterio3.id)
					.orderBy("reactivo.id")
					.findIds();

			// Encontrar reg en ClasificadorCriterio3Ejemplo
			List<ClasificadorCriterio3Ejemplo> idscc3 = ClasificadorCriterio3Ejemplo.find
					.where().eq("criterio3.id", c.criterio3.id).eq("tiporecurso.id", c.tiporecurso.id)
					.findList();
			System.out.println("idscc3 "+idscc3.size());
			ArrayList<Long> bb = new ArrayList<>();
			idscc3.forEach(x->{
				//bb.add(x.criterio3);
			});
			System.out.println("bb: "+bb);

			List<EvaluacionTablaTipoRecurso> x = EvaluacionTablaTipoRecurso.find
					.where()
					.in("evaluaciontabla.id", qevTab2)
					.in("tiporecurso.id",   c.tiporecurso.id )
					.findList();
			System.out.println("x "+x.size());
			List<Long> xIds = x.stream().map(m1->m1.evaluaciontabla.id).collect(Collectors.toList());

			System.out.println("xIds: "+xIds);

			List<EvaluacionTabla> evTab = EvaluacionTabla.find
					.where().in("id", xIds)
					.orderBy("reactivo.id")
					.findList();

			/* Determinar la fecha máxima, ya sea la inicial estipulada o la otorgada por prórrogas*/
			Recurso r = re.recurso;
			Date hoy = new Date();
			Date fmaxima = r.evaluacionFecha.fechalimite;

			for(EvaluacionProrroga efp : re.prorrogas ){
				if (   efp.fecha.after(fmaxima)  ){
					fmaxima = efp.fecha;
				}
			}


			System.out.println("la fecha mayor: "+fmaxima);

			if ( fmaxima.before(hoy) ){
				mensajes +="Tiempo superado y no tiene prorroga vigente para el aspecto.";
			}
			System.out.println(" mensajes: "+mensajes);
			System.out.println(" evTab.size(): "+evTab.size());


			return ok(views.html.EvaluacionEvaluador.create.render(re, evTab,  mensajes ));
		} catch (NullPointerException npe){
			return ok( views.html.accesoNoAutorizado.render("Actualmente no se encuentra ninguna versión del instrumento de evaluación lista para ser usada.\nReintente más tarde o comuníquese a la extensión"));
		}

    }


	public static Result verDetalle(Long id){
		Recurso r = Recurso.find.byId(id);
		return ok( views.html.Reporte.cesoe.render(r) );
	}


	// Graba la evaluación del evaluador
	@Transactional
	public static Result save(Long id, Long idAspecto){
		DateFormatSymbols dfs = new DateFormatSymbols();
		String[] months = dfs.getMonths();


		Form<Recursoevaluador> formaRE = form(Recursoevaluador.class).bindFromRequest();
System.out.println(formaRE);
		Recursoevaluador re = formaRE.get();
System.out.println(re);
		System.out.println("********************");
System.out.println(re.evaluaciones);
re.evaluaciones.forEach(e->{
	System.out.println("      "+e.id+"  "+e.evaluaciontabla.id+"  "+e.respuesta);
});
		System.out.println("********************");
System.out.println(re.observacionEvaluacion);
//System.out.println(re.observacionEvaluacion.recursoevaluador.id);
System.out.println(re.observacionEvaluacion.observacion);
System.out.println("********************");

		System.out.println(" id:   			"+re.id);
		//System.out.println(" aspecto: 		"+re.aspecto.descripcion);
		System.out.println(" evaluaciones: 	"+re.evaluaciones.size());

		Recursoevaluador otro = Recursoevaluador.find.byId(re.id);
		otro.evaluaciones.forEach(Model::delete);
		System.out.println(" id:   			"+otro.id);
		System.out.println(" aspecto: 		"+otro.aspecto.descripcion);
		System.out.println(" evaluaciones: 	"+otro.evaluaciones.size());

		otro.evaluaciones = re.evaluaciones;
        /*
System.out.println("* 1 * * * "+re.evaluador);		
System.out.println("* 2 * * * "+re.evaluador.personal);
System.out.println("* 3 * * * "+re.evaluador.personal.activo);
System.out.println("* 4 * * * "+re.evaluador.personal.activo.id);

    	if (re.evaluador.personal.activo.id==2L){
    		return ok ("Esta acción no esta permitida para una cuenta de evaluador inactiva.");
    	}
		*/
		re.observacionEvaluacion.recursoevaluador = otro;
		if (otro.observacionEvaluacion != null)
			otro.observacionEvaluacion.delete();
		if (re.observacionEvaluacion.observacion.length()>0)
			otro.observacionEvaluacion = re.observacionEvaluacion;
		//otro.observacionEvaluacion.recursoevaluador = re;


		if (formaRE.field("terminado").value().contentEquals("SI")){
			otro.estadoevaluacion = EstadoEvaluacion.find.byId(3L);
			otro.update(re.id);
			HistorialestadoEvaluacion hedoEv = new HistorialestadoEvaluacion();
			hedoEv.estado = otro.estadoevaluacion;
			hedoEv.recurso = otro.recurso;
			hedoEv.recursoevaluador = otro;
			otro.recurso.historialestadoevaluaciones.add(hedoEv);
			otro.recurso.update();

			flash("success", "Se guardó la evaluación. Usted terminó correctamente la evaluación del recurso "+otro.recurso.numcontrol+".");

			// Enviar correo al evaluador indicando que terminó de evaluar el recurso

			miCorreo mc = new miCorreo();
			mc.para = Collections.singletonList(Personal.find.byId(Evaluador.find.byId(Long.parseLong(session("idEvaluador"))).personal.id).correo);

			mc.asunto="Terminada la evaluación del recurso "+otro.recurso.numcontrol+" del aspecto "+otro.aspecto.descripcion;
			mc.mensaje="Usted ha terminado de evaluar el recurso "+otro.recurso.titulo+" con clave de control "+otro.recurso.numcontrol +" para el aspecto "+otro.aspecto.descripcion +".<br><br";

			Calendar cal = Calendar.getInstance();

			mc.mensaje+="<br><br><br>"+cal.get(Calendar.DAY_OF_MONTH)+" de "+months[cal.get(Calendar.MONTH)]+" de "+cal.get(Calendar.YEAR)+", " + cal.get(Calendar.HOUR_OF_DAY)+":"+cal.get(Calendar.MINUTE)+".";
			//mc.enviar();
			mc.run();

			//Enviar notificación al docente indicando que se terminó la evaluacion del aspecto de su recurso
			Notificacion n = new Notificacion();
			System.out.println(otro.aspecto.descripcion+"  "+otro.recurso.titulo);
			n.enviar(otro.recurso.numcontrol, "Evaluación del aspecto "+otro.aspecto.descripcion, "Se ha concluido la evaluación del aspecto "+otro.aspecto.descripcion+ " para el recurso "+otro.recurso.titulo);


			// Enviar correo al administrador indicando que el evaluador terminó de evaluar
			mc.para = Collections.singletonList(Personal.elCoordinador().correo);

			mc.asunto="El evaluador "+ Personal.find.byId(Evaluador.find.byId( Long.parseLong(session("idEvaluador"))).personal.id   ).nombreCompleto();
			mc.asunto+=" ha terminado la evaluación del recurso con clave de control "+otro.recurso.numcontrol;
			mc.mensaje="Apreciable "+Personal.elAdministrador().nombreCompleto()+", administrador(a) del sistema de evaluación de recursos didácticos digitales:<br><br>";
			mc.mensaje+="Se le informa que la evaluación del aspecto "+otro.aspecto.descripcion+" del recurso didáctico digital '"+otro.recurso.titulo+"' con número de folio "+otro.recurso.oficio.folio+", ha finalizado.";


			mc.mensaje+="<br><br><br>"+cal.get(Calendar.DAY_OF_MONTH)+" de "+months[cal.get(Calendar.MONTH)]+" de "+cal.get(Calendar.YEAR)+", " + cal.get(Calendar.HOUR_OF_DAY)+":"+cal.get(Calendar.MINUTE)+".";
			//mc.enviar();
			mc.run();
		} else {

			otro.estadoevaluacion = EstadoEvaluacion.find.byId(2L);
			otro.update(re.id);

			HistorialestadoEvaluacion hedoEv = new HistorialestadoEvaluacion();
			hedoEv.estado = otro.estadoevaluacion;
			hedoEv.recurso = otro.recurso;
			hedoEv.recursoevaluador = otro;
			otro.recurso.historialestadoevaluaciones.add(hedoEv);
			otro.recurso.update();

			// Enviar correo al evaluador indicando que la evaluación ha sido parcial
			miCorreo mc = new miCorreo();
			mc.para = Collections.singletonList(Personal.find.byId(Evaluador.find.byId(Long.parseLong(session("idEvaluador"))).personal.id).correo);

			mc.asunto ="Evaluación parcial del recurso "+otro.recurso.numcontrol+" del aspecto "+otro.aspecto.descripcion;
			mc.mensaje="Usted ha evaluado parcialmente el recurso "+otro.recurso.titulo+" con clave de control "+otro.recurso.numcontrol +" para el aspecto "+otro.aspecto.descripcion +".<br><br>";
			mc.mensaje+="Se le recuerda que deberá realizar la evaluación en su totalidad para poder continuar con el proceso.";

			Calendar cal = Calendar.getInstance();

			mc.mensaje+="<br><br><br>"+cal.get(Calendar.DAY_OF_MONTH)+" de "+months[cal.get(Calendar.MONTH)]+" de "+cal.get(Calendar.YEAR)+", " + cal.get(Calendar.HOUR_OF_DAY)+":"+cal.get(Calendar.MINUTE)+".";
			//mc.enviar();
			mc.run();

			//Enviar correo al administrador indicando que es evaluación parcial
			mc.para = Collections.singletonList(Personal.elCoordinador().correo);

			mc.asunto="El evaluador "+ Personal.find.byId(Evaluador.find.byId( Long.parseLong(session("idEvaluador"))).personal.id   ).nombreCompleto();
			mc.asunto+=" ha realizado la evaluación parcial del recurso con folio "+otro.recurso.oficio.folio;
			mc.mensaje="Apreciable "+Personal.elAdministrador().nombreCompleto()+", administrador(a) del sistema de evaluación de recursos didácticos digitales.<br><br>";
			mc.mensaje+="Se le informa de la evaluación parcial del aspecto "+otro.aspecto.descripcion+" del recurso didáctico digital '"+otro.recurso.titulo+"' con número de folio "+otro.recurso.oficio.folio+".";


			mc.mensaje+="<br><br><br>"+cal.get(Calendar.DAY_OF_MONTH)+" de "+months[cal.get(Calendar.MONTH)]+" de "+cal.get(Calendar.YEAR)+", " + cal.get(Calendar.HOUR_OF_DAY)+":"+cal.get(Calendar.MINUTE)+".";
			//mc.enviar();
			mc.run();

			//Enviar notificación al docente indicando sobre la evaluación parcial
			Notificacion n = new Notificacion();
			System.out.println(otro.recurso.numcontrol);
			n.enviar(otro.recurso.numcontrol, "Evaluación del aspecto "+otro.aspecto.descripcion, "Se ha realizado una evaluación parcial del aspecto "+otro.aspecto.descripcion+ " para el recurso "+otro.recurso.titulo);


			flash("warning", "Se guardó la evaluación parcial. Usted deberá reingresar despues para terminar de evaluar el recurso en su totalidad.");
		}
		otro.update(re.id);


		System.out.println("* * * * * * * * * * * * * * * * *");
		return redirect("/evResumen");
	}


	// El evaluador edita su evaluación
	public static Result edit(Long id, Long aspecto){
		System.out.println("desde EvaluacionEvaluadorController.edit");
		StringBuilder mensajes = new StringBuilder();
		Recurso recurso = Recurso.find.byId(id);
		Recursoevaluador re = Recursoevaluador.find.where().eq("recurso.id",recurso.id).eq("aspecto.id", aspecto).eq("evaluador.id", session("idEvaluador")).findUnique();


		if (re.evaluador.personal.activo.id == 1){
			return ok ("Esta acción no esta permitida para una cuenta de evaluador inactiva");
		}

		Clasificacion c = Clasificacion.find.where().eq("recurso.id",id).findUnique();
		int VersionReciente = re.evaluaciones.get(0).evaluaciontabla.version.id.intValue();

		//	ClasificadorCriterio3 cc3 = ClasificadorCriterio3.find.byId(  c.criterio3.id);

		//System.out.println("criterios"+ c.criterio1.id+"  "+c.criterio2.id+"  "+c.criterio3.id + "       "+cc3.id    );

		List<EvaluacionTabla> evTab = Ebean.find(EvaluacionTabla.class).where()
				.eq("version.id",VersionReciente)
				.eq("aspecto.id", aspecto)
				.eq("criterio1.id", c.criterio1.id)
				.eq("criterio2.id", c.criterio2.id)
				.eq("criterio3.id", c.criterio3.id)
				.eq("tiposrecursos.tiporecurso.id", c.tiporecurso.id)
				.orderBy("reactivo.id")
				//		.eq("criterio3.id", cc3.id)
				.findList();

		// Determinar si  esta en fecha
		if (recurso.evaluacionFecha.fechalimite.compareTo(new Date()) < 0 ){
			if (re.evaluador.id == Long.parseLong(session("idEvaluador"))){
				if (re.prorrogas.isEmpty()){
					mensajes.append("Tiempo superado y no tiene prorroga para el aspecto ").append(re.aspecto.descripcion).append("\n");
				} else {
					for(EvaluacionProrroga p : re.prorrogas){
						if (p.fecha.compareTo(new Date()) < 0){
							mensajes.append("Se terminó la prorroga para el aspecto ").append(re.aspecto.descripcion).append("\n");
						}
					}
				}
			}
		}
		return ok(views.html.EvaluacionEvaluador.create.render(re,  evTab, mensajes.toString()));
	}

	public static Result porAtenderAdmin(){
		List<Recursoevaluador> re = Recursoevaluador.find.where()
				.not(Expr.in("recurso.estado.id", Arrays.asList(400, 401, 402)))
				.eq("evaluador.id", session("idEvaluador")).eq("estadoevaluacion.id", 3).findList();
		return ok(comun.render(re, "Para revisar por el administrador"));

	}


	public static Result porEvaluar(){
		List<Recursoevaluador> retorno = Recursoevaluador.find.where()
				.not(Expr.in("recurso.estado.id", Arrays.asList(400, 401, 402)))
				.eq("estadoevaluacion.id", 1)
				.eq("evaluador.id", play.mvc.Controller.session("idEvaluador") ).findList();
		//return ok(views.html.EvaluacionEvaluador.porEvaluar.render( retorno	));
		return ok(comun.render( retorno, "Mis asignaciones por evaluar"));
	}


	public static Result enProceso(){
		List<Recursoevaluador> retorno = Recursoevaluador.find.where()
				.not(Expr.in("recurso.estado.id", Arrays.asList(400, 401, 402)))
				.eq("estadoevaluacion.id", 2)
				.eq("evaluador.id", play.mvc.Controller.session("idEvaluador") ).findList();
		return ok(comun.render(retorno,"Mis asignaciones en proceso"));
	}

	public static Result porObservar(){
		List<Recursoevaluador> retorno = Recursoevaluador.find.where()
				.not(Expr.in("recurso.estado.id", Arrays.asList(400, 401, 402)))
				.eq("estadoevaluacion.id", 4)
				.eq("evaluador.id", play.mvc.Controller.session("idEvaluador") ).findList();
		return ok(comun.render(retorno, "Mis asignaciones por observar" ));
	}

	public static Result concluidas(){
		List<Recursoevaluador> retorno = Recursoevaluador.find.where()
				.not(Expr.in("recurso.estado.id", Arrays.asList(400, 401, 402)))
				.eq("estadoevaluacion.id", 5)
				.eq("evaluador.id", play.mvc.Controller.session("idEvaluador") ).findList();
		return ok(comun.render(retorno, "Mis asignaciones concluidas" ));
	}

	public static Result solicitudesCancelacion(){
		List<Recursoevaluador> retorno = Recursoevaluador.find.where()
				.eq("recurso.estado.id",400)
				.eq("evaluador.id", play.mvc.Controller.session("idEvaluador") ).findList();
		return ok(comun.render(retorno, "Mis recursos con solicitud de cancelación" ));
	}

	public static Result canceladasEvaluacion(){
		List<Recursoevaluador> retorno = Recursoevaluador.find.where()
				.eq("recurso.estado.id",402)
				.eq("evaluador.id", play.mvc.Controller.session("idEvaluador") ).findList();
		return ok(comun.render(retorno, "Mis recursos cancelados en evaluación" ));
	}

	public static Result canceladaEvaluacion(Long id){
		return TODO;
	}

	public static Result atenderObservaciones(Long id, Long aspecto){
		System.out.println("desde EvaluacionEvaluadorController.atenderObservaciones");
		Recurso recurso = Recurso.find.byId(id);
		List<Object> reIds = Recursoevaluador.find.where().eq("recurso.id", id).eq("aspecto.id", aspecto).findIds();
		List<Evaluacion> er = Evaluacion.find.where().in("recursoevaluador.id", reIds).findList();
		List<EvaluacionTabla> evt = EvaluacionTabla.find.where()
				.eq("version.id", er.get(0).evaluaciontabla.version.id)
				.eq("aspecto.id", aspecto)
				.eq("criterio1.id", recurso.clasificacion.criterio1.id)
				.eq("criterio2.id", recurso.clasificacion.criterio2.id)
				.eq("criterio3.id", recurso.clasificacion.criterio3.id)
				.eq("tiposrecursos.tiporecurso.id", recurso.clasificacion.tiporecurso.id)
				.orderBy("reactivo.id")
				.findList();
		List<EvaluacionObservacion> eo = new ArrayList<EvaluacionObservacion>();
		for( Evaluacion auxER : er  ){
			EvaluacionObservacion auxEO = EvaluacionObservacion.find.where().eq("respuesta.id",auxER.id).findUnique();
			if ( auxEO != null  ){
				eo.add(auxEO);
			}
		}
		EvaluacionObservacionGral eog = EvaluacionObservacionGral.find.where().in("recursoevaluador.id", reIds.get(0)).findUnique();
		System.out.println("retornando....  \n\nRECURSO:"+recurso+"\n\nEVT:"+evt+"\n\nER:"+er+"\n\nEO:"+eo+"\n\nEOG:"+eog);


		er.forEach(resp->System.out.println("   "+resp.id+"   "+resp.recursoevaluador.id+"  "+resp.evaluaciontabla.id+"  "+resp.respuesta));


		return ok(views.html.EvaluacionObservacion.atender.render(recurso, evt, er, eo, eog));
	}


	// El evaluador actualiza sus respuestas al atender las observaciones realizadas por el administrador
	public static Result saveObservaciones(Long id, Long aspecto){
		DynamicForm df = DynamicForm.form().bindFromRequest();
System.out.println(df);
		Map<String, String> x = df.data();
System.out.println(x);

		Recurso r = Recurso.find.byId(id);
/*
		EvaluacionTabla.find.where()
				.eq("version.id", er.get(0).evaluaciontabla.version.id)
				.eq("aspecto.id", aspecto)
				.eq("criterio1.id", r.clasificacion.criterio1.id)
				.eq("criterio2.id", r.clasificacion.criterio2.id)
				.eq("criterio3.id", r.clasificacion.criterio3.id)				
				.findList();
*/

		Recursoevaluador re = Recursoevaluador.find.where().eq("recurso.id", id).eq("aspecto.id", aspecto).findUnique();

		for (Map.Entry<String, String> entry : x.entrySet()){
System.out.println(entry.getKey() + "/" + entry.getValue());
			if (entry.getKey().startsWith("califica")){
				String i = entry.getKey().substring(8);
				Evaluacion a = Evaluacion.find.where().eq("evaluaciontabla.id", i ).eq("recursoevaluador.id",re.id).findUnique();
				a.respuesta = Integer.parseInt(entry.getValue());
				a.update();
			}
			// Actualizar observación de la observación general
			if (entry.getKey().contentEquals("observacionGral")){
System.out.println("..............................entrando");
				EvaluacionObservacionGral eog = EvaluacionObservacionGral.find.where().eq("recursoevaluador.id", re.id).findUnique();
				if (eog != null){
					eog.observacion = entry.getValue();
					eog.update();
				}
			}
		}

		re.estadoevaluacion = EstadoEvaluacion.find.byId(3L);
		re.update();
		/*
		HistorialestadoEvaluacion hedoEv = new HistorialestadoEvaluacion();
		hedoEv.estado = re.estadoevaluacion;
		hedoEv.recurso = r;
		hedoEv.recursoevaluador = re;

		 */

		flash("success","Se enviaron las correcciones del recurso "+r.numcontrol);

		//return ok(views.html.EvaluacionObservacion.observacionCorregida.render());
		return redirect("/evPorObservar");

	}

    //Recibe el id de Recurso, el id de Aspecto y el número de días
	public static Result solicitarProrroga(Long idRecurso, Long idAspecto, Integer ndias){
		Date fechainicial = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("**********************************************************");
        System.out.println("****  idRecurso "+idRecurso +"  idAspecto: "+ idAspecto+"    ndias: "+ndias+"    idEvaluador: "+session("idEvaluador"));
        System.out.println("**********************************************************");
		Calendar cal = Calendar.getInstance();
		DateFormatSymbols dfs = new DateFormatSymbols();
		String[] months = dfs.getMonths();

		EvaluacionProrroga esp = new EvaluacionProrroga();


        Recurso r = Recurso.find.fetch("recursoevaluadores").setId(idRecurso).findUnique();
        System.out.println("recurso r "+r);
        esp.recursoevaluador = r.recursoevaluadores.stream().filter(f -> f.aspecto.id == idAspecto && f.evaluador.id == Long.parseLong(session("idEvaluador"))).findFirst().get();


        /*
		esp.recursoevaluador = Recursoevaluador.find
                    .fetch("recurso")
                    .where().eq("recurso.id", idRecurso)
                        .eq("aspecto.id", idAspecto)
                        .eq("evaluador.id", session("idEvaluador"))
                    .findUnique();

         */
		esp.ndias =  ndias;
		esp.autorizado = false;

        System.out.println("idRe: "+idRecurso);
        System.out.println("idAspecto: "+idAspecto);
        System.out.println("idEvaluador: "+session("idEvaluador"));

        System.out.println("uno: "+esp.recursoevaluador);

        System.out.println(esp.recursoevaluador.prorrogas==null);
        System.out.println(esp.recursoevaluador.prorrogas.size());


		// Sin prorroga previa
		//if ( esp.recursoevaluador.prorrogas == null || esp.recursoevaluador.prorrogas.size() == 0 )
		fechainicial = esp.recursoevaluador.recurso.evaluacionFecha.fechalimite;
		// Con prorrogas anteriores
		if ( esp.recursoevaluador.prorrogas.size() != 0 )
			fechainicial = esp.recursoevaluador.prorrogas.stream().map(m->m.fecha).max(Date::compareTo).get();

        System.out.println("fechainicial: "+fechainicial);
		String este = CalendarioController.prueba(ndias, sdf.format(fechainicial));


		try {
			esp.fecha =    sdf.parse(este);
		} catch (ParseException e) {
			System.out.println("Ocurrio un error: "+e);
			e.printStackTrace();
		}


		System.out.println(esp.fecha);
		System.out.println(esp.recursoevaluador);
		System.out.println(esp.recursoevaluador.recurso);
System.out.println(esp.recursoevaluador.recurso.numcontrol);
		esp.save();
System.out.println("............................");
		flash("success","Se solicitó prórroga para el recurso " + esp.recursoevaluador.recurso.numcontrol );

		// Enviar correo al administrador indicándole que se le solicitó una prórroga
		miCorreo mc = new miCorreo();
		mc.para = Collections.singletonList(Personal.elCoordinador().correo);

		String evaluador = Personal.find.byId(Evaluador.find.byId( Long.parseLong(session("idEvaluador"))).personal.id   ).nombreCompleto();

		mc.asunto="Solicitud de prórroga para evaluador " + evaluador ;

		mc.mensaje="Apreciable "+Personal.elAdministrador().nombreCompleto()+", administrador(a) del sistema de evaluación de recursos didácticos digitales:<br><br>";
		mc.mensaje+="El evaluador "+ evaluador +" ha solicitado prórroga para continuar con la evaluación del aspecto "+esp.recursoevaluador.aspecto.descripcion+" del recurso '"+esp.recursoevaluador.recurso.titulo+ "' con clave de control "+esp.recursoevaluador.recurso.numcontrol+".";


		mc.mensaje+="<br><br><br>"+cal.get(Calendar.DAY_OF_MONTH)+" de "+months[cal.get(Calendar.MONTH)]+" de "+cal.get(Calendar.YEAR)+", " + cal.get(Calendar.HOUR_OF_DAY)+":"+cal.get(Calendar.MINUTE)+".";
		mc.run();


		return redirect("/evList");
	}


	// El evaluador puede ver oficios, pero solo los oficios relacionados a sus RDDs
	public static Result verOficioE(Long id) {

		Recurso rdd = Recurso.find.where().eq("id", id).findUnique();
		if (  (rdd != null)  &&
				(rdd.recursoevaluadores.stream().filter(f -> f.evaluador.id == Long.parseLong(session("idEvaluador"))).collect(Collectors.toList()).size()!=0 )) {
			response().setContentType(rdd.oficio.contenttype);
			return ok(rdd.oficio.contenido);
		} else {
			return ok (views.html.errores.errorRecurso.render());
		}

	}


	public static Result verOficioValoracionE(Long id) {
		//OficioValoracion ov = OficioValoracion.searchByRecurso(3L);
		OficioValoracion ov = OficioValoracion.find.byId(id);
		if ( ov != null &&
			(ov.recurso.recursoevaluadores.stream().filter(f -> f.evaluador.id == Long.parseLong(session("idEvaluador"))).collect(Collectors.toList()).size()!=0 )) {
			response().setContentType(ov.contenttype);
			return ok(ov.contenido);
		} else {
			return ok (views.html.errores.errorRecurso.render());
		}
	}




}

