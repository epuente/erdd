package controllers;

import com.avaje.ebean.*;
import models.*;
import models.polimedia.Carrusel;
import models.polimedia.Polimedia;
import models.polimedia.PolimediaCarrusel;
import models.polimedia.PolimediaCarruselImagen;
import org.joda.time.DateTimeComparator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import play.Logger;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

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
import java.util.*;
import java.util.stream.Collectors;

import org.joda.time.DateTime;

public class CarruselController extends ControladorDefault {

    public static Result GO_HOME = redirect(routes.CarruselController.list());



    public static Result list(){
        Logger.info("Desde CarruselController.list");
        return ok(  views.html.poliMedia.list.render()  );
    }


    public static Result carruselDTSS(){
        Logger.info("Desde CarruselController.carruselDTSS");
        JSONObject json2 = new JSONObject();
        int filtrados = 0;
        int sinFiltro = 0;
        Map<Integer, Integer> columnasOrdenables = new HashMap<Integer, Integer>();
        columnasOrdenables.put(0, 3);   //posicion
        columnasOrdenables.put(1, 4);   //inicio
        columnasOrdenables.put(2, 5);   //fin
        columnasOrdenables.put(3, 6);   //titulo
        columnasOrdenables.put(4, 1);   //archivo
        columnasOrdenables.put(5, 2);   //url

        System.out.println( columnasOrdenables.get(0)  );
        System.out.println( columnasOrdenables.get(1)  );

        System.out.println("Desde CarruselController.carruselDTSS............");
        System.out.println( "parametros 0:"+ request() );

        String filtro = request().getQueryString("search[value]");
        Integer colOrden =   Integer.parseInt( request().getQueryString("order[0][column]")   );
        String tipoOrden = request().getQueryString("order[0][dir]");
        System.out.println( "parametro start:"+ Integer.parseInt(request().getQueryString("start")));
        System.out.println( "parametro length:"+ Integer.parseInt(request().getQueryString("length")));
        System.out.println( "parametros order[0][column]:"+ colOrden);
        System.out.println( "parametros order[0][dir]:"+ tipoOrden);
        System.out.println( "filtrando :"+ filtro);
        int numPag = 0;
        if (Integer.parseInt(request().getQueryString("start")) != 0)
            numPag = Integer.parseInt(request().getQueryString("start")) /   Integer.parseInt(request().getQueryString("length"));
        int numRegistros = Integer.parseInt(request().getQueryString("length"));

        System.out.println("**************************************************************************************"       );


        Page<Carrusel> carr = null;

        Query<Carrusel> q1 = Carrusel.find;
        Query<Carrusel> q2 = Carrusel.find.where(
                "nombreArchivo like :cadena "+
                    "or liga like :cadena "+
                    "or posicion like :cadena "+
                    "or inicio like :cadena "+
                    "or fin like :cadena "+
                    "or titulo like :cadena "
        ).setParameter("cadena", "%"+filtro+"%");





        //Logger.debug("\n\norderBy: "+ "c"+    (colOrden==0?columnasOrdenables.get(0)  :  columnasOrdenables.get(colOrden)-1)  +" "+tipoOrden );
        Logger.debug("c"+   (columnasOrdenables.get(colOrden)-1)  +" "+tipoOrden);

        carr = Carrusel.find
                .where(
                        "nombreArchivo like :cadena "+
                                "or liga like :cadena "+
                                "or posicion like :cadena "+
                                "or inicio like :cadena "+
                                "or fin like :cadena "+
                                "or titulo like :cadena "
                ).setParameter("cadena", "%"+filtro+"%")
               // .orderBy( "c"+    (colOrden==0?columnasOrdenables.get(0)  :  columnasOrdenables.get(colOrden)-1)  +" "+tipoOrden )
                .orderBy( "c"+   (columnasOrdenables.get(colOrden)-1)  +" "+tipoOrden )
                .findPagingList(numRegistros)
                .setFetchAhead(false)
                .getPage(numPag);


        filtrados = q2.findList().size();
        sinFiltro = q1.findList().size();



        Logger.debug("\n\nq2: "+ q2.getGeneratedSql()+"\n\n" );



        System.out.println("**************************************************************************************"       );
//System.out.println("tam page: "+serv.getTotalPageCount());


        try {
            json2.put("draw",  new Date().getTime()  );
            json2.put("recordsTotal",  sinFiltro );
            json2.put("recordsFiltered", filtrados);
            JSONArray losDatos = new JSONArray();
            DateTime hoy = new DateTime();
            DateTimeComparator dateTimeComparator = DateTimeComparator.getDateOnlyInstance();
            for( Carrusel p : carr.getList()  ){
                JSONObject datoP = new JSONObject();
                datoP.put("id", p.id);
                datoP.put("nombreArchivo", p.nombreArchivo);
                datoP.put("liga", p.liga);
                datoP.put("posicion", p.posicion);
                datoP.put("inicio", p.inicio);
                datoP.put("fin", p.fin);
                datoP.put("titulo", p.titulo);
                int vigencia = dateTimeComparator.compare(p.fin, hoy);
                System.out.println("------ "+vigencia);
                datoP.put("vigente", vigencia >= 0);
                losDatos.put(datoP);
            }
            if ( carr.getTotalRowCount()>0 ){
                json2.put("data", losDatos);
            } else {
                json2.put("data", new JSONArray() );
                return ok( json2.toString()  );
            }

        } catch (JSONException e) {
            System.out.println("Ocurrio un error: " + e);
            e.printStackTrace();
        }
//System.out.println("retorno "+json2.toString());
        return ok( json2.toString()  );


    }


    public static Result create(){
        Logger.info("Desde CarruselController.create");
        Form<Carrusel> c = form(Carrusel.class);
        return ok(  views.html.poliMedia.create.render(c)  );
    }


    public static Result save() throws ParseException {
        Logger.info("Desde CarruselController.save");
        DynamicForm df = form().bindFromRequest();
        System.out.println(df);
        Http.MultipartFormData body = request().body().asMultipartFormData();
        Http.MultipartFormData.FilePart fp = body.getFile("contenido");

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Carrusel cr = new Carrusel();
        cr.posicion = Integer.parseInt(df.get("posicion"));
        cr.inicio =  sdf.parse(df.get("inicio"));
        cr.fin =  sdf.parse(df.get("fin"));
        cr.titulo = df.get("titulo");
        cr.liga = df.get("liga");

        if (fp != null) {
            String fileName = fp.getFilename();
            String contentType = fp.getContentType();
            File file = fp.getFile();
            try {
                Path p = Paths.get(file.getPath());
                byte[] byteFile = Files.readAllBytes(p);
                cr.nombreArchivo = fileName;
                cr.contenido =  byteFile;
                cr.contenttype = contentType;
            } catch (FileNotFoundException e) {
                flash("error", "No fué posible agregar el registro, No se encontró el archivo.");
                System.out.println("Error "+e.toString());
            } catch (IOException ioe){
                flash("error", "No fué posible agregar el registro, error de i/o.");
                System.out.println("Error "+ioe.toString());
            }
        }
        cr.save();
        flash("success", "Se agregó el registro.");
        return GO_HOME;
    }

    public static Result edit(Long id){
        Form<Carrusel> c = form(Carrusel.class).fill(
                Carrusel.find.byId(id)
        );
        return ok (views.html.poliMedia.edit.render(id, c) );
    }

    public static Result update(Long id) throws ParseException {
        System.out.println("Desde uppdate");
        Form<Carrusel> forma = form(Carrusel.class).bindFromRequest();
        System.out.println("id "+id);
        System.out.println(forma);
        Carrusel cr = Carrusel.find.byId(id);
        DateFormat formatter = null;
        formatter = new SimpleDateFormat("yyyy-MM-dd");


        Http.MultipartFormData body = request().body().asMultipartFormData();
        Http.MultipartFormData.FilePart fp = body.getFile("contenido");
        if (fp != null) {
            String fileName = fp.getFilename();
            Logger.debug("filename nuevo: "+fileName);
            Logger.debug("filename Anterior: "+cr.nombreArchivo);
            String contentType = fp.getContentType();
            File file = fp.getFile();
            try {
                Path p = Paths.get(file.getPath());
                byte[] byteFile = Files.readAllBytes(p);
                cr.nombreArchivo = fileName;
                cr.contenido =  byteFile;
                cr.contenttype = contentType;
            } catch (FileNotFoundException e) {
                flash("error", "No fué posible agregar el registro, No se encontró el archivo.");
                System.out.println("Error "+e.toString());
            } catch (IOException ioe){
                flash("error", "No fué posible agregar el registro, error de i/o.");
                System.out.println("Error "+ioe.toString());
            }
        }
        cr.update();
        return GO_HOME;
    }

    public static Result delete(Long id) throws ParseException {
        Carrusel.find.byId(id).delete();
        flash("success", "Se eliminó el registro.");
        return GO_HOME;
    }



    //////////////////////////////////////////////////////////////

    public static Result list2(){
        Logger.info("Desde CarruselController.list");
        return ok(  views.html.poliMedia.list2.render()  );
    }


    public static Result carruselDTSS2(){
        Logger.info("Desde CarruselController.carruselDTSS2");
        System.out.println( "parametros 0:"+ request() );
        JSONObject json2 = new JSONObject();
        int filtrados = 0;
        int sinFiltro = 0;
        Map<Integer, Integer> columnasOrdenables = new HashMap<Integer, Integer>();
        columnasOrdenables.put(0, 3);   //posicion
        columnasOrdenables.put(1, 4);   //inicio
        columnasOrdenables.put(2, 5);   //fin
        columnasOrdenables.put(3, 6);   //titulo
        columnasOrdenables.put(4, 1);   //archivo
        columnasOrdenables.put(5, 2);   //url

        System.out.println( columnasOrdenables.get(0)  );
        System.out.println( columnasOrdenables.get(1)  );

        String filtro = request().getQueryString("search[value]");
        Integer colOrden =   Integer.parseInt( request().getQueryString("order[0][column]")   );
        String tipoOrden = request().getQueryString("order[0][dir]");
        System.out.println( "parametro start:"+ Integer.parseInt(request().getQueryString("start")));
        System.out.println( "parametro length:"+ Integer.parseInt(request().getQueryString("length")));
        System.out.println( "parametros order[0][column]:"+ colOrden);
        System.out.println( "parametros order[0][dir]:"+ tipoOrden);
        System.out.println( "filtrando :"+ filtro);
        int numPag = 0;
        if (Integer.parseInt(request().getQueryString("start")) != 0)
            numPag = Integer.parseInt(request().getQueryString("start")) /   Integer.parseInt(request().getQueryString("length"));
        int numRegistros = Integer.parseInt(request().getQueryString("length"));

        System.out.println("**************************************************************************************"       );


        Page<PolimediaCarrusel> carr = null;

        Query<PolimediaCarrusel> q1 = PolimediaCarrusel.find;
        Query<PolimediaCarrusel> q2 = PolimediaCarrusel.find.where(
                "nombreArchivo like :cadena "+
                        "or liga like :cadena "+
                        "or posicion like :cadena "+
                        "or inicio like :cadena "+
                        "or fin like :cadena "+
                        "or titulo like :cadena "
        ).setParameter("cadena", "%"+filtro+"%");

        q2 = PolimediaCarrusel.find.where(
                "nombreArchivo like :cadena "+
                        "or liga like :cadena "+
                        "or posicion like :cadena "+
                        "or inicio like :cadena "+
                        "or fin like :cadena "+
                        "or polimedia.recurso.titulo like :cadena "
        ).setParameter("cadena", "%"+filtro+"%");



        //Logger.debug("\n\norderBy: "+ "c"+    (colOrden==0?columnasOrdenables.get(0)  :  columnasOrdenables.get(colOrden)-1)  +" "+tipoOrden );
        Logger.debug("c"+   (columnasOrdenables.get(colOrden)-1)  +" "+tipoOrden);

        carr = PolimediaCarrusel.find
                .where(
                        "nombreArchivo like :cadena "+
                                "or liga like :cadena "+
                                "or posicion like :cadena "+
                                "or inicio like :cadena "+
                                "or fin like :cadena "+
                                "or polimedia.recurso.titulo like :cadena "
                ).setParameter("cadena", "%"+filtro+"%")
                // .orderBy( "c"+    (colOrden==0?columnasOrdenables.get(0)  :  columnasOrdenables.get(colOrden)-1)  +" "+tipoOrden )
                .orderBy( "c"+   (columnasOrdenables.get(colOrden)-1)  +" "+tipoOrden )
                .findPagingList(numRegistros)
                .setFetchAhead(false)
                .getPage(numPag);


        filtrados = q2.findList().size();
        sinFiltro = q1.findList().size();



        Logger.debug("\n\nq2: "+ q2.getGeneratedSql()+"\n\n" );



        System.out.println("**************************************************************************************"       );
//System.out.println("tam page: "+serv.getTotalPageCount());


        try {
            json2.put("draw",  new Date().getTime()  );
            json2.put("recordsTotal",  sinFiltro );
            json2.put("recordsFiltered", filtrados);
            JSONArray losDatos = new JSONArray();
            DateTime hoy = new DateTime();
            DateTimeComparator dateTimeComparator = DateTimeComparator.getDateOnlyInstance();
            for( PolimediaCarrusel p : carr.getList()  ){
                JSONObject datoP = new JSONObject();
                datoP.put("id", p.id);
                datoP.put("nombreArchivo", p.nombreArchivo);
                datoP.put("liga", p.liga);
                datoP.put("posicion", p.posicion);
                datoP.put("inicio", p.inicio);
                datoP.put("fin", p.fin);
                datoP.put("titulo", p.polimedia.recurso.titulo);
                int vigencia = dateTimeComparator.compare(p.fin, hoy);
                System.out.println("------ "+vigencia);
                datoP.put("vigente", vigencia >= 0);
                losDatos.put(datoP);
            }
            if ( carr.getTotalRowCount()>0 ){
                json2.put("data", losDatos);
            } else {
                json2.put("data", new JSONArray() );
                return ok( json2.toString()  );
            }
        } catch (JSONException e) {
            System.out.println("Ocurrio un error: " + e);
            e.printStackTrace();
        }
//System.out.println("retorno "+json2.toString());
        return ok( json2.toString()  );


    }

    public static Result create2(){
        Logger.info("Desde CarruselController.create2");
        Form<PolimediaCarrusel> c = form(PolimediaCarrusel.class);
        // List de los recursos que ya estan en polimediacarrusel
        List<Long> enCarrusel = PolimediaCarrusel.find.all().stream().map(m->m.polimedia.recurso.id).collect(Collectors.toList());
        // List de los recursos que esten en polimedia
        List<Polimedia> polis = Polimedia.find
                                    .where()
                                    .not(Expr.in("recurso.id", enCarrusel))
                                        .eq("habilitado", true)
                                    .findList();

        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(Polimedia op: polis) {
            options.put(op.recurso.id.toString(), op.recurso.titulo);
        }





        Recurso recurso = Recurso.find.byId(4L);
        recurso.estado = Estado.find.byId(10L);
        recurso.update();



        /*
        // Prueba de calificacionPorcentajeAspectos en la tabla Recurso

            Recurso recurso = Recurso.find.byId(1L);
            RecursoCalificacion rCal = new RecursoCalificacion();
            rCal.recurso = recurso;
            float calGeneral = 0;
            for (Recursoevaluador res :  recurso.recursoevaluadores  ){
                int acum = 0;
                int numNA = 0;
                int calMaxima = 0;
                calMaxima = res.evaluaciones.size();
                System.out.println("\n\ncalMaxima "+calMaxima);
                for  ( Evaluacion eva : res.evaluaciones){
                    if (eva.respuesta != -1){
                        acum+=eva.respuesta;
                    } else {
                        numNA++;
                    }
                    System.out.println("acum "+acum);
                    System.out.println("numNA "+numNA);
                }
                float cal = ((float) (acum * 25) / ((calMaxima - numNA) * 2) );
                calGeneral+=cal;
                System.out.println("cal "+cal);
                RecursoCalificacionAspecto rca = new RecursoCalificacionAspecto();
                rca.recursocalificacion = rCal;
                rca.aspecto = res.aspecto;
                // Se redondea a 1 decimal
                rca.calificacion = (float) (Math.round(cal * 10.0) / 10.0);;
                rCal.calificacionesAspectos.add(rca);
            }

            rCal.calificacion = calGeneral;
            recurso.calificacion = rCal;
            recurso.update();
            */
/*
        System.out.println("Iniciando update manual desde CarruselController.create2.....................................");
        Recurso r = Recurso.find.byId(2L);
        r.estado = Estado.find.byId(10L);
        r.update();

 */
        return ok(  views.html.poliMedia.create2.render(c, options)  );
    }

    public static Result save2() throws ParseException {
        Logger.info("Desde CarruselController.save2");
        DynamicForm df = form().bindFromRequest();
        System.out.println(df);
        Http.MultipartFormData body = request().body().asMultipartFormData();
        Http.MultipartFormData.FilePart fp = body.getFile("contenido");

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Logger.debug(df.get("recurso.id"));
        long recursoId = Long.parseLong( df.get("recurso.id") );

            Polimedia pm = new Polimedia();
            PolimediaCarrusel carrusel = new PolimediaCarrusel();
            PolimediaCarruselImagen imagen = new PolimediaCarruselImagen();

            pm.recurso = Recurso.find.byId(recursoId);
            pm.carrusel = carrusel;

            carrusel.polimedia = pm;
            carrusel.posicion = Integer.parseInt(df.get("posicion"));
            carrusel.inicio = sdf.parse(df.get("inicio"));
            carrusel.fin = sdf.parse(df.get("fin"));
            carrusel.polimedia.recurso = Recurso.find.byId(recursoId);
            carrusel.liga = df.get("liga");

            if (fp != null) {
                Logger.debug("fp != null");
                String fileName = fp.getFilename();
                String contentType = fp.getContentType();
                File file = fp.getFile();
                try {
                    Path p = Paths.get(file.getPath());
                    byte[] byteFile = Files.readAllBytes(p);
                    carrusel.nombreArchivo = fileName;
                    carrusel.imagen = imagen;
                    imagen.polimediacarrusel = carrusel;
                    imagen.contenido = byteFile;
                    imagen.contenttype = contentType;
                } catch (FileNotFoundException e) {
                    flash("error", "No fué posible agregar el registro, No se encontró el archivo.");
                    System.out.println("Error " + e.toString());
                    e.printStackTrace();
                } catch (IOException ioe) {
                    flash("error", "No fué posible agregar el registro, error de i/o.");
                    System.out.println("Error " + ioe.toString());
                    ioe.printStackTrace();
                }
            }
            pm.save();
            flash("success", "Se agregó el registro.");
       return redirect(routes.CarruselController.list2());
    }

    public static Result edit2(Long id){
        Form<PolimediaCarrusel> c = form(PolimediaCarrusel.class).fill(
                PolimediaCarrusel.find.byId(id)
        );

        List<Long> enCarrusel = PolimediaCarrusel.find.all().stream().map(m->m.polimedia.recurso.id).collect(Collectors.toList());
        // List de los recursos que esten en polimedia
        List<Polimedia> polis = Polimedia.find
                .where()
                .not(Expr.in("recurso.id", enCarrusel))
                .eq("habilitado", true)
                .findList();

        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(Polimedia op: polis) {
            options.put(op.recurso.id.toString(), op.recurso.titulo);
        }


        return ok (views.html.poliMedia.edit2.render(id, c, options) );
    }



    public static Result delete2(Long id) throws ParseException {
        PolimediaCarrusel.find.byId(id).delete();
        flash("success", "Se eliminó el registro.");
        return redirect(routes.CarruselController.list2());
    }


}
