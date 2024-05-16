package controllers;

import static play.data.Form.form;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


import com.avaje.ebean.Expr;
import com.avaje.ebean.annotation.Transactional;
import com.itextpdf.text.DocumentException;
import actions.miCorreo;
import actions.miCorreo2;
import actions.miPdf;
import models.Aspecto;
import models.Calendario;
import models.Estado;
import models.EstadoEvaluacion;
import models.EvaluacionFecha;
import models.Evaluador;
import models.HistorialestadoEvaluacion;
import models.Recurso;
import models.Recursoevaluador;
import play.data.DynamicForm;
import play.data.Form;
import play.db.ebean.Model;
import play.mvc.Result;
//import views.html.Recurso.list;
import views.html.Recursoevaluador.*;

public class RecursoevaluadorController  extends ControladorSeguroCoordinador {

    public static Result asignarEvaluadoresList(){
        List<Long> edos = new ArrayList<Long>();
        edos.add(6L);
        edos.add(7L);
        edos.add(8L);
        edos.add(9L);
//		edos.add(10L);
//		edos.add(11L);
        edos.add(100L);
        edos.add(400L);


        System.out.println("desde REcursoevaluadorController.asignarEvaluadoresList");
        return ok(list.render( Recurso.find.where().in("estado.id", edos).findList() ));
    }





    public static Result asignarEvaluadoresCreate(Long id){
        Form<Recursoevaluador> reForm =	form(Recursoevaluador.class);
        List<Recursoevaluador> re = Recurso.find.byId(id).recursoevaluadores;
        return ok( create.render(reForm, id, Calendario.find.all(), re   ));
    }

    @play.db.ebean.Transactional
    public static Result asignarEvaluadoresSave(Long id, String tipo) {
        DynamicForm df = form().bindFromRequest();
        System.out.println(df);

        Recurso r = Recurso.find.byId(id);
        EvaluacionFecha ef = new EvaluacionFecha();
        DateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal  = Calendar.getInstance();
        if (  r.estado.id == 5L){
            try {
                cal.setTime(formato.parse( df.get("fechalimite") ));
            } catch (ParseException e) {
                System.out.println("************************* error en conversión de fecha");
                e.printStackTrace();
            }
        }
        Calendar fi = Calendar.getInstance();
        fi.add(Calendar.DAY_OF_YEAR, 1);
        while (fi.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY && fi.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){
            fi.add(Calendar.DATE, 1);
            response().setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
            response().setHeader("Pragma", "no-cache"); // HTTP 1.0.
            response().setHeader("Expires", "0"); // Proxies.

        }
        ef.fechainicio = fi.getTime();
        if ( EvaluacionFecha.find.where().eq("recurso.id", id).findUnique() == null  ){
            ef.recurso = r;
            ef.ndias = Integer.parseInt(df.get("ndias"));
            ef.fechalimite =   cal.getTime();
            ef.save();
        }


        List<Long> listaDestinatarios = new ArrayList<Long>();
        int numeroEvaluadores = 0;
        for(long d = 1L; d<=4L;d++){
            Recursoevaluador actual = Recursoevaluador.find.where().eq("recurso.id", id).eq("aspecto.id", d).findUnique();
            String propuesto = df.get("evaluador"+d);
            // Ya existe el evaluador del aspecto para ese recurso?
            if (actual != null) {
                // Ya existe
                if (propuesto!="")
                    if ( actual.evaluador.id != Long.parseLong(propuesto) ){
                        //Si existe y el evaluador es diferente
                        reasignarEvaluador(actual.id, propuesto);
                        listaDestinatarios.add( actual.evaluador.id );
                        numeroEvaluadores++;
                    } else {
                        //Ya existe, pero el evaluador es el mismo
                        numeroEvaluadores++;
                    }
            } else {
                // No existe, es nuevo, se agrega
                if (propuesto!=""){
                    Recursoevaluador re = new Recursoevaluador();
                    re.recurso = r;
                    re.aspecto = Aspecto.find.byId( Long.parseLong(df.get("aspecto"+d)   ));
                    re.evaluador = Evaluador.find.byId( Long.parseLong( propuesto ) );
                    re.estadoevaluacion = EstadoEvaluacion.find.byId(1L);
                    r.recursoevaluadores.add(re);
                    numeroEvaluadores++;
                    listaDestinatarios.add( re.evaluador.id );
                }
            }
        }

        System.out.println("numeroEvaluadores: " + numeroEvaluadores);
        if (numeroEvaluadores == 4)
            r.estado = Estado.find.byId(6L);
        else {
            r.estado = Estado.find.byId(100L);
        }
        r.update();
        r.refresh();


        // Enviar correo a los evaluadores

        DateFormatSymbols dfs = new DateFormatSymbols();
        String[] months = dfs.getMonths();

        miCorreo mc = new miCorreo();
        mc.asunto = "Asignación de recurso a evaluar";
        String m1 = "Se le informa que el día ";
        String m3 = " fue asignado(a) como evaluador(a) del recurso didáctico digital '"+r.titulo+"', con número de folio "+r.oficio.folio+" y clasificado como "+r.clasificacion.criterio2.descripcion+" de tipo "+r.clasificacion.criterio3.catalogo.descripcion+".";

        String m4 = "<br><br>El equipo de evaluación está integrado por:<br><br>";
        StringBuilder listaEvaluadores = new StringBuilder();
        String enWeb="";
        String credenciales = "";

        int u = 1;

        for(Recursoevaluador linea : r.recursoevaluadores){
            listaEvaluadores.append((u++)).append(". ").append(linea.evaluador.personal.nombreCompleto()).append(" (evaluador del aspecto: ").append(linea.aspecto.descripcion).append(").<br>");

        }
        listaEvaluadores.append("<br><br>");

        String m6="";
        if (r.formatoentregaotro.isEmpty()){
            m6 = "El formato de entrega fue en "+r.formatoentrega.descripcion+", el cual será entregado de forma personal. ";
        } else {
            m6 = "El formato de entrega fue en "+r.formatoentregaotro;
        }


        if ( !r.url.isEmpty() ){
            enWeb = "<br>Podrá consultar el contenido en línea, a través del explorador Mozilla, en la siguiente dirección:<br>"+r.url+"<br>";
            if ( r.recursosenweb.isEmpty() ){
                credenciales = "<br>No se requieren datos de acceso ya que está abierto.<br><br>";
            } else {
                credenciales = "<br>Los datos para ingresar son:<br>Usuario:"+r.recursosenweb.get(0).usuario+"<br>Clave de acceso:"+r.recursosenweb.get(0).password+"<br><br>";
            }
        }


        cal.setTime(r.evaluacionFecha.fechalimite);
        String m7 = "<br><br>La fecha programada para la conclusión de su evaluación es el día " + cal.get(Calendar.DAY_OF_MONTH)+" de "+ months[cal.get(Calendar.MONTH)]+".";

        for(Recursoevaluador linea : Recursoevaluador.find.where().eq("recurso.id",r.id).in("evaluador.id", listaDestinatarios).findList()){
            mc.para = Collections.singletonList(linea.evaluador.personal.correo);
            mc.mensaje="Apreciable "+linea.evaluador.personal.nombreCompleto()+":<br><br>";
            cal.setTime(linea.recurso.auditinsert);


            String m2 = cal.get(Calendar.DAY_OF_MONTH)+" de "+ months[cal.get(Calendar.MONTH)];
            mc.mensaje += m1+m2+m3+m4+listaEvaluadores+m6+enWeb+credenciales+m7+"<br><br>El Departamento de Investigación e Innovación agradece de antemano su colaboración en este proceso.";
            mc.run();
        }


        flash("success","Se asignaron evaluadores al recurso '"+r.titulo+"'");
        return redirect(routes.ClasificacionController.list());
        /* ************************************************************************************************************************************ */



    }

    public static Result mostrarEvaluadores(Long id) {
        List<Recursoevaluador> re =  Recursoevaluador.find.where().eq("recurso.id", id).findList();
        return ok (mostrarEvaluadores.render(re) );
    }

    public static Result mostrarEvaluacionesSinAtender(int tipo){
        List<Recursoevaluador> re = null;
        if (tipo == 0){
            re =  Recursoevaluador.find.where()
                    .eq("recurso.estado.id", 6L).findList();
        }
        if (tipo == 1){
            re =  Recursoevaluador.find.where()
                    .not(Expr.in("recurso.estado.id", Arrays.asList(400, 401,402)))
                    .eq("estadoevaluacion.id", 1L).findList();
        }
        return ok(listarEvaluacionesSinAtender.render(re, tipo));
    }

    public static Result mostrarEvaluacionesEnProceso(int tipo){
        List<Recursoevaluador> re = null;
        if (tipo == 0){
            re =  Recursoevaluador.find.where()
                    .eq("recurso.estado.id", 7).findList();
        }
        if (tipo == 1){
            re =  Recursoevaluador.find.where()
                    .not(Expr.in("recurso.estado.id", Arrays.asList(400, 401,402)))
                    .eq("estadoevaluacion.id", 2L).findList();
        }

        return ok(listarEvaluacionesEnProceso.render(re, tipo));
    }

    public static Result mostrarEvaluacionesPorRevisar(int tipo){
        List<Recursoevaluador> re = null;
        if (tipo == 0){
            re = Recursoevaluador.find.where()
                    .eq("recurso.estado.id", 8).findList();
        }
        if (tipo == 1){
            re = Recursoevaluador.find.where()
                    .not(Expr.in("recurso.estado.id", Arrays.asList(400, 401,402)))
                    .eq("estadoevaluacion.id", 3).findList();
        }
        //System.out.println("REcurso con todas sus evaluaciones por revisar: "+re.size());
        return ok(listarEvaluacionesPorRevisar.render(re, tipo));
    }

    public static Result mostrarEvaluacionesConObservaciones(int tipo){
        List<Recursoevaluador> re = null;
        if (tipo == 0){
            re = Recursoevaluador.find.where()
                    .eq("recurso.estado.id", 9).findList();
        }
        if (tipo == 1){
            re = Recursoevaluador.find.where()
                    .not(Expr.in("recurso.estado.id", Arrays.asList(400, 401,402)))
                    .eq("estadoevaluacion.id", 4).findList();
        }
        return ok(listarEvaluacionesConObservaciones.render(re, tipo));
    }

    public static Result mostrarEvaluacionesConcluidas(int tipo, String device){
        List<Recursoevaluador> re = null;
        //  0   Para recursos con todos sus aspectos evaluados
        if (tipo == 0){
            re = Recursoevaluador.find.where()
                    .in("recurso.estado.id", Arrays.asList(10, 11, 12, 110))
                    .findList();
        }
        //  1   Para evaluación incompleta  (algunos aspectos evaluados, pero no todos)
        if (tipo == 1){
            re = Recursoevaluador.find.where()
                    .not(Expr.in("recurso.estado.id", Arrays.asList(400, 401,402)))
                    .eq("estadoevaluacion.id", 5L).findList();
        }
        return ok(listarEvaluacionesConcluidas.render(re, tipo));
    }



    public static Result reporteEvaluacion(Long id) throws DocumentException, MalformedURLException, IOException{
        ByteArrayOutputStream baosPDF = new ByteArrayOutputStream();
        miPdf mipdf = new miPdf(id);
        //  mipdf.id = id;
        mipdf.baos = baosPDF;
        try {
            mipdf.generarReporteFinal("admin");
        } catch (Exception e) {
            e.printStackTrace();
        }
        response().setContentType("application/pdf");
        return ok (  mipdf.baos.toByteArray() );
    }







    public static Result pruebaCorreo() throws Exception{
        System.out.println("****************************************************************************************************");
        miCorreo2 mc2 = new miCorreo2();
        mc2.asunto = "abcdef";
        mc2.mensaje= "12345";
        mc2.para = Collections.singletonList("epuente_72@yahoo.com");

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        miPdf mipdf = new miPdf(1L);
        //  mipdf.id = 1L;
        mipdf.baos = outputStream;
        mipdf.generarReporteFinal("otro");

        mc2.adjuntos = Collections.singletonList(mipdf.baos);
        mc2.nombresAdjuntos = Collections.singletonList("Oficio X ");

        mc2.run();



        return ok ("Se envió");
    }


    @Transactional
    @play.db.ebean.Transactional
    private static void reasignarEvaluador(Long idRE, String propuesto){
        System.out.println("desde reasignarEvaluador "+idRE+" "+propuesto);
        Recursoevaluador registro = Recursoevaluador.find.byId(idRE);
        Recursoevaluador nuevo = new Recursoevaluador();
        nuevo.recurso =   Recurso.find.byId(registro.recurso.id);
        nuevo.evaluador = Evaluador.find.byId( Long.parseLong(propuesto) );
        nuevo.aspecto = Aspecto.find.byId(registro.aspecto.id);
        nuevo.estadoevaluacion = EstadoEvaluacion.find.byId(1L);
        nuevo.save();
        List<HistorialestadoEvaluacion> h = HistorialestadoEvaluacion.find.where().eq("recurso.id", registro.recurso.id).eq("recursoevaluador.id", registro.id).findList();
        if (h !=null)
            h.forEach(Model::delete);
        registro.delete();
    }


    public static Result evaluada(Long idRe, String idAspecto){
        if (idAspecto.isEmpty() || idAspecto.contentEquals("0")){
            System.out.println("............  cero");
            List<Recursoevaluador> t = Recursoevaluador.find.where().eq("recurso.id", idRe).findList();
            return ok ( views.html.Evaluaciones.evaluada.render(t, idAspecto, t.get(0).recurso )  );
        } else {
            System.out.println("............  NO cero");
            List<Recursoevaluador> aux = Recursoevaluador.find.where().eq("id",idRe).findList();
            return ok ( views.html.Evaluaciones.evaluada.render(aux, idAspecto, aux.get(0).recurso)  );
        }
    }


    public static Result evaluadas(Long idRecurso, String tipo){
        Recurso r = Recurso.find.byId(idRecurso);
        return ok ( views.html.Evaluaciones.evaluada.render( r.recursoevaluadores, tipo, r)  );
    }


    public static Boolean concluida(){
        System.out.println('x');
        return (true);
    }


}

