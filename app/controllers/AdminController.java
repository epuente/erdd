package controllers;

import java.util.*;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.SqlRow;
import controllers.util.ControladorSeguro;
import models.*;

import com.avaje.ebean.Expr;

import play.mvc.Result;


public class AdminController extends ControladorSeguro {
	
	
    
	public static Result index(){
		response().setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
		response().setHeader("Pragma", "no-cache"); // HTTP 1.0.
		response().setHeader("Expires", "0"); // Proxies.  
		
		
		Map<String, Object> registros = new HashMap<>();


        List<Recurso> todos = Recurso.find.all();
    	registros.put("rs", todos.size());
		
    	int r1 = Recurso.find.where().eq("estado.id", 1L).findRowCount();
    	int r2 = Recurso.find.where().eq("estado.id", 2L).findRowCount();
    	int r3 = Recurso.find.where().eq("estado.id", 3L).findRowCount();
    	int r4 = Recurso.find.where().eq("estado.id", 4L).findRowCount();
    	int r5 = Recurso.find.where().eq("estado.id", 5L).findRowCount();
    	int r6 = Recurso.find.where().in("estado.id", Collections.singletonList(6L)).findRowCount();
    	int r6p = Recurso.find.where().in("estado.id", Collections.singletonList(100L)).findRowCount();
    	
    	
    	registros.put("rs1", r1);
    	registros.put("rs2", r2);
    	registros.put("rs3", r3);
    	registros.put("rs4", r4);
    	registros.put("rs5", r5);
    	registros.put("rs6", r6);
    	registros.put("rs6p", r6p);
    	
    	int r7 = Recurso.find.where().eq("estado.id", 7L).findRowCount();
    	int r8 = Recurso.find.where().eq("estado.id", 8L).findRowCount();
    	int r9 = Recurso.find.where().eq("estado.id", 9L).findRowCount();
    	int r10 = Recurso.find.where().in("estado.id", Arrays.asList(10L, 11L, 12L, 110L)).findRowCount();
    	int r105 = Recurso.find.where().eq("estado.id", 105L).findRowCount();
    	int r110 = Recurso.find.where().eq("estado.id", 110L).findRowCount();
    	int r12 = Recurso.find.where().eq("estado.id", 12L).findRowCount();
    	
    	registros.put("rs7", r7);
    	registros.put("rs8", r8);
    	registros.put("rs9", r9);
    	registros.put("rs10", r10);
    	registros.put("rs105", r105);
    	registros.put("rs110", r110);
    	registros.put("rs12", r12);
    	
    	
    	int c0 = Recurso.find.where().eq("estado.id", 400L).findRowCount();
    	
    	registros.put("c0", c0);

    	int c1 = Recurso.find.where().eq("estado.id", 401L).findRowCount();
    	int c2 = Recurso.find.where().eq("estado.id", 402L).findRowCount();

    	registros.put("c1", c1);
    	registros.put("c2", c2);

		int msqlFev1 = Recursoevaluador.find.where().not(Expr.in("recurso.estado.id", Arrays.asList(400,401,402))).eq("estadoevaluacion.id", 1L).findRowCount();

		int msqlFev2 = Recursoevaluador.find.where().not(Expr.in("recurso.estado.id", Arrays.asList(400,401,402))).eq("estadoevaluacion.id", 2L).findRowCount();
		int msqlFev3 = Recursoevaluador.find.where().not(Expr.in("recurso.estado.id", Arrays.asList(400,401,402))).eq("estadoevaluacion.id", 3L).findRowCount();
		int msqlFev4 = Recursoevaluador.find.where().not(Expr.in("recurso.estado.id", Arrays.asList(400,401,402))).eq("estadoevaluacion.id", 4L).findRowCount();
		int msqlFev5 = Recursoevaluador.find.where().not(Expr.in("recurso.estado.id", Arrays.asList(400,401,402))).eq("estadoevaluacion.id", 5L).findRowCount();
		
		registros.put("ev1", msqlFev1);
		registros.put("ev2", msqlFev2);
		registros.put("ev3", msqlFev3);
		registros.put("ev4", msqlFev4);
		registros.put("ev5", msqlFev5);
		
		int en1 = EncuestaRespuesta.find.where().eq("estado.id", 1L).findRowCount();
		int en2 = EncuestaRespuesta.find.where().eq("estado.id", 2L).findRowCount();
		int en3 = EncuestaRespuesta.find.where().eq("estado.id", 3L).findRowCount();
		
		registros.put("en1", en1);
		registros.put("en2", en2);
		registros.put("en3", en3);

		// Prórrogas
		int p = EvaluacionProrroga.find.where().eq("autorizado","0").findRowCount();
		registros.put("solPro", p);
		
        System.out.println(		routes.AdminController.index().url()  );


        // info para la grafica Sankey
        List<Recurso> recursos = Recurso.find
                .fetch("recursoevaluadores")
                .fetch("recursoevaluadores.aspecto")
                .where().ge("estado.id", 6)
                .order().asc("titulo")
                .findList();
        List<String> nodos = new ArrayList<>();
        for ( Recurso r : recursos  ){
            nodos.add(r.titulo);
        }

        List<Aspecto> aspectos = Aspecto.find.order().asc("descripcion").findList();
        List<String> cols1 = new ArrayList<>();
        for (Aspecto a : aspectos){
            cols1.add(a.descripcion);
        }

        // Evaluadores
        List<Evaluador> evs = Evaluador.find.fetch("personal").order().asc("personal.nombre").findList();
        List<String> evaluadores = new ArrayList<>();
        for(Evaluador e : evs){
            evaluadores.add( e.personal.nombreCompleto() );
            System.out.println(e.personal.nombreCompleto());
        }



        // paso 1
        // De rdd a aspecto


        Map<String,String> mapaUno = new HashMap<>();
        ArrayList<String[]> paresCadenas = new ArrayList<>();

        for (Recurso r : recursos){
            System.out.println(r.titulo);
            for (Aspecto a : aspectos) {
                mapaUno.put(r.titulo, a.descripcion);
                System.out.println("     "+a.descripcion);
                //OJO AQUI FALTa un array,   solo se queda el último valor de  mapaUno.put(r.titulo, a.descripcion);

                paresCadenas.add(new String[]{r.titulo, a.descripcion});
            }
        }

        for (String[] par : paresCadenas) {
            System.out.println(par[0]+" "+par[1]);

        }

        //paso 2
        // De aspecto a evaluador

        // tocho
        List<Recurso> tch = Recurso.find
                .fetch("recursoevaluadores")
                .fetch("recursoevaluadores.aspecto")
                .fetch("recursoevaluadores.evaluador")
                .fetch("recursoevaluadores.evaluador.personal")
                .where()
                    .ge("estado.id", 6)
                    .ne("estado.id",100)
                    .ne("estado.id", 402)
                .order().asc("titulo")
                .order().asc("recursoevaluadores.aspecto.descripcion")
                .order().asc("recursoevaluadores.evaluador.personal.nombre")
                .order().asc("recursoevaluadores.evaluador.personal.paterno")
                .order().asc("recursoevaluadores.evaluador.personal.materno")
                .findList();


        List<SqlRow> sqrRs = Ebean.createSqlQuery("select distinct  r.titulo,\n" +
                "\t\t\t\t a.descripcion aspecto,\t\t\t\t \n" +
                "\t\t\t\t concat(p.nombre, ' ', p.paterno,' ', p.materno) evaluador\n" +
                "from recurso r \n" +
                "inner join recursoevaluador re on r.id = re.recurso_id \n" +
                "inner join aspecto a on re.aspecto_id = a.id \n" +
                "inner join evaluador e on re.evaluador_id = e.id \n" +
                "inner join personal p on e.personal_id = p.id\n" +
                "where r.estado_id >=6 and r.estado_id <> 100 and r.estado_id <> 402  \n" +
                "order by r.titulo, aspecto, evaluador")
                .findList();

        System.out.println("\n\n\n\n\n");
        System.out.println(sqrRs.size()+" regs ");
        System.out.println(tch.size()+" tch ");
        for ( SqlRow r : sqrRs ){
            System.out.println("-->"+r.getString("titulo")+"  -  "+r.getString("aspecto")+"  -  "+ r.getString("evaluador") );
            System.out.println("-->"+r.getString("titulo")+"  -  "+r.getString("aspecto")+"  -  "+ r.getString("evaluador") );
        }



		
    	return ok(views.html.resumenAdministrador.render(registros, nodos, cols1, evaluadores, mapaUno, paresCadenas));
    }	

}

