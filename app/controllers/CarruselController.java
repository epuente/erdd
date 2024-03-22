package controllers;

import com.avaje.ebean.Page;
import com.avaje.ebean.Query;
import controllers.ControladorSeguro;
import models.Areaconocimiento;
import models.Unidadacademica;
import models.polimedia.Carrusel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import play.Logger;
import play.data.DynamicForm;
import play.data.Form;
import play.db.ebean.Model;
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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CarruselController extends Controller {

    public static Result GO_HOME = redirect(routes.CarruselController.list());

    public static Result list(){
        Logger.info("Desde CarruselController.list");
        return ok(  views.html.poliMedia.list.render()  );
    }


    public static Result carruselDTSS(){
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




        //AQUI ME QUEDÉ
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
//			json2.put("recordsFiltered", ppre3.getTotalRowCount());
            json2.put("recordsFiltered", filtrados);

            JSONArray losDatos = new JSONArray();

            for( Carrusel p : carr.getList()  ){
                JSONObject datoP = new JSONObject();
                datoP.put("id", p.id);
                datoP.put("nombreArchivo", p.nombreArchivo);
                datoP.put("liga", p.liga);
                datoP.put("posicion", p.posicion);
                datoP.put("inicio", p.inicio);
                datoP.put("fin", p.fin);
                datoP.put("titulo", p.titulo);
                losDatos.put(datoP);
            }
            if ( carr.getTotalRowCount()>0 ){
                json2.put("data", losDatos);
            } else {
                json2.put("data", new JSONArray() );
                return ok( json2.toString()  );
            }

        } catch (JSONException e) {
            System.out.println("Ocurrio un error: "+e);
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
                e.printStackTrace();
            } catch (IOException ioe){
                flash("error", "No fué posible agregar el registro, error de i/o.");
                System.out.println("Error "+ioe.toString());
                ioe.printStackTrace();
            }
        }
        cr.save();
        flash("success", "Se agregó el registro.");
        return GO_HOME;
    }


}
