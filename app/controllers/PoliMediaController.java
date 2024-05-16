package controllers;

import com.avaje.ebean.*;
import com.fasterxml.jackson.databind.JsonNode;

import models.polimedia.*;
import org.joda.time.DateTime;
import org.joda.time.DateTimeComparator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import play.Logger;
import play.data.DynamicForm;
import play.data.Form;
import play.db.ebean.Model;

import play.mvc.Http;
import play.mvc.Result;

import views.html.AdminPoliMedia.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

import static play.data.Form.form;

public class PoliMediaController extends ControladorSeguroPM{

    public static Result tablero(){
        return ok (tablero.render());
    }

    public static Result list(){
        return ok (list.render());
    }

    public static Result ajaxListaPoliMediaDTSS() {
        Logger.info("Desde PoliMediaController.ajaxListaPoliMediaDTSS");
        System.out.println( "parametros 0:"+ request() );
        JSONObject json2 = new JSONObject();
        int filtrados = 0;
        int sinFiltro = 0;
        Map<Integer, Integer> columnasOrdenables = new HashMap<Integer, Integer>();
        columnasOrdenables.put(0, 3);   //posicion
        columnasOrdenables.put(1, 4);   //inicio
        columnasOrdenables.put(2, 5);   //fin

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

        Page<Polimedia> carr = null;

        Query<Polimedia> q1 = Polimedia.find;
        Query<Polimedia> q2 = Polimedia.find.where(
                "id like :cadena "+
                        "or recurso.id like :cadena "+
                        "or recurso.titulo like :cadena "+
                        "or habilitado like :cadena "
        ).setParameter("cadena", "%"+filtro+"%");

        q2 = Polimedia.find.where(
                "id like :cadena "+
                        "or recurso like :cadena "+
                        "or recurso.id like :cadena "+
                        "or recurso.titulo like :cadena "+
                        "or habilitado like :cadena "
        ).setParameter("cadena", "%"+filtro+"%");
        //Logger.debug("\n\norderBy: "+ "c"+    (colOrden==0?columnasOrdenables.get(0)  :  columnasOrdenables.get(colOrden)-1)  +" "+tipoOrden );
        Logger.debug("c"+   (columnasOrdenables.get(colOrden)-1)  +" "+tipoOrden);
        carr = Polimedia.find
                .where(
                        "id like :cadena "+
                                "or recurso like :cadena "+
                                "or recurso.id like :cadena "+
                                "or recurso.titulo like :cadena "+
                                "or habilitado like :cadena "
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
        try {
            json2.put("draw",  new Date().getTime()  );
            json2.put("recordsTotal",  sinFiltro );
            json2.put("recordsFiltered", filtrados);
            JSONArray losDatos = new JSONArray();
            DateTime hoy = new DateTime();
            DateTimeComparator dateTimeComparator = DateTimeComparator.getDateOnlyInstance();
            for( Polimedia p : carr.getList()  ){
                JSONObject datoP = new JSONObject();
                datoP.put("id", p.id);
                datoP.put("recursoId", p.recurso.id);
                datoP.put("recursoTitulo", p.recurso.titulo);
                datoP.put("habilitado", p.habilitado);
                datoP.put("tipoRecurso", p.recurso.clasificacion.tiporecurso.descripcion);
                datoP.put("tipoId", p.tipo.id);
                datoP.put("tipo", p.tipo.descripcion);
                datoP.put("calificacion", p.recurso.calificacion.calificacion);
                if (p.tipo.id<=3L  && p.polimediaUrl!=null) {
                    datoP.put("verRecurso", p.polimediaUrl.url);
                }
                if ((p.tipo.id==4 || p.tipo.id==5) && p.archivos!=null && !p.archivos.isEmpty()) {
                    JSONArray jaArchs = new JSONArray();
                    p.archivos.forEach(a->{
                        JSONObject jo = new JSONObject();
                        try {
                            jo.put("id", a.id);
                            jo.put("nombre", a.nombreArchivo);
                            jaArchs.put(jo);
                        } catch (JSONException je){
                            System.out.println("Ocurrió un error de json");
                            System.out.println(je.getMessage());
                            System.out.println(je.getCause());
                        }
                    });
                    datoP.put("verRecurso", jaArchs);
                }


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
        Logger.debug(json2.toString());
        return ok( json2.toString()  );
    }



    public static Result edit(Long id){
        Form<Polimedia> fpm = form(Polimedia.class)
                .fill(Polimedia.find.byId(id));
        List<Tipo> tipos = Tipo.find
                .where()
                .setOrderBy("id")
                .findList();
        return ok (views.html.AdminPoliMedia.edit.render(fpm.get().id, fpm, tipos) );
    }

    public static Result delete() throws JSONException{
        Logger.debug("Desde PoliMediaController.delete");
        JsonNode jsRequest = request().body().asJson();
        Logger.debug(jsRequest.toString());
        JSONObject retorno = new JSONObject();
        retorno.put("estado", "error");
        long id = jsRequest.findValue("id").asLong();
        Polimedia pm = Ebean.find(Polimedia.class).setId(id)
                .fetch("carrusel")
                .fetch("carrusel.imagen")
                .findUnique();
        pm.delete();
        retorno.put("estado", "eliminado");
        return ok(retorno.toString());
    }

    public static Result update(Long id) throws JSONException {
        JSONObject retorno = new JSONObject();
        // Tamaño máximo de archivos a subir (1 mb = 1048576 bytes)
        int tamMaxArchivo = 1048576 * 5;
        Ebean.beginTransaction();
        try {
            Logger.debug("\n\n\nDesde PoliMediaController.update");
            System.out.println("request().body(): "+request().body());
            Form<Polimedia> forma = form(Polimedia.class).bindFromRequest();
            Polimedia pmObj = forma.get();
            Long tipo = pmObj.tipo.id;
            String nombreComp = "";
            Logger.debug("--- 0100");
            retorno.put("estado", "error");
            Polimedia pmDB = Ebean.find(Polimedia.class).setId(id)
                    .fetch("carrusel")
                    .fetch("carrusel.imagen")
                    .fetch("polimediaUrl")
                    .fetch("archivos")
                    .findUnique();
            if (pmDB.polimediaUrl != null) {
                pmDB.polimediaUrl.delete();
                Logger.debug("se fue");
            }

            Logger.debug("--- 0500");

            long[] numeros = null;
            if (tipo==4 || tipo ==5){
                Logger.debug("--- es tipo 4 o 5");
                if (forma.field("archivos.id")!=null && forma.field("archivos.id").value()!=null) {
                    Logger.debug("--- ya tiene archivos");
                    String[] c1 = request().body().toString().split("archivos.id");
                    System.out.println("c1 " + Arrays.toString(c1));
                    String c2 = c1[1].split("->")[1];
                    System.out.println("c2 " + c2);
                    // buscar el indice de 'archivos.id' en la cadena
                    int desde = request().body().toString().indexOf("archivos.id");
                    String sc1 = request().body().toString().substring(desde);
                    System.out.println("sc1 " + sc1);
                    int hasta = sc1.indexOf("),");
                    String sc2 = sc1.substring("archivos.id -> List(".length(), hasta);
                    System.out.println("sc2 " + sc2);
                    String[] ids = sc2.split(", ");

                    numeros = new long[ids.length];

                    for (int i = 0; i < ids.length; i++) {
                        numeros[i] = Long.parseLong(ids[i]);
                        // System.out.println("016 "+  numeros[i]  );
                    }
                }
                for (PolimediaArchivo a : pmDB.archivos ){
                    Logger.debug("----x");
                    boolean aeliminar = true;
                    //Logger.debug("numeros:"+numeros);
                    if (numeros != null) {
                        for (long n : numeros) {
                            if (a.id == n)
                                aeliminar = false;
                            else
                                aeliminar = aeliminar && true;
                        }
                        System.out.println("eliminar id " + a.id + " " + aeliminar);
                        if ((numeros != null) && aeliminar) {
                            Ebean.delete(a);
                        }
                    } else {
                        Ebean.delete(a);
                    }
                }
                Logger.debug("----?");
            }
            Logger.debug("----antes del pmDB.update");
            pmDB.update();

            Polimedia pmNvo = Ebean.find(Polimedia.class).setId(id)
                    .fetch("carrusel")
                    .fetch("carrusel.imagen")
                    .fetch("polimediaUrl")
                    .fetch("archivos")
                    .fetch("tipo")
                    .findUnique();

            Http.MultipartFormData body = request().body().asMultipartFormData();
            //  Http.MultipartFormData.FilePart fp = body.getFile("contenido.nombrearchivo2");


            System.out.println("Tipo: " + pmObj.tipo.id + "  -  " + pmObj.tipo.descripcion);
            System.out.println("Num de archivos: " + body.getFiles().size());

            List<PolimediaArchivo> pmArchivos = new ArrayList<>();

            if (tipo == 1L) {
                Logger.debug("tipo 1 url:" + pmObj.polimediaUrl.url);
                PolimediaUrl pmUrl = new PolimediaUrl();
                pmUrl.polimedia = Polimedia.find.ref(id);
                pmUrl.url = pmObj.polimediaUrl.url;
                pmNvo.polimediaUrl = pmUrl;
                //pmDB.archivos.forEach(Model::delete);
                Ebean.delete(pmDB.archivos);
            }
            if (tipo == 2L) {
                Logger.debug("tipo 2 liha moodle:" + forma.field("ligaMoodle").value());
                PolimediaUrl pmUrl = new PolimediaUrl();
                pmUrl.polimedia = Polimedia.find.ref(id);
                pmUrl.url = forma.field("ligaMoodle").value();
                pmNvo.polimediaUrl = pmUrl;
                //pmDB.archivos.forEach(Model::delete);
                Ebean.delete(pmDB.archivos);
            }
            if (tipo == 3L) {
                Logger.debug("tipo 3 liga youtube:" + forma.field("ligaYouTube").value());
                PolimediaUrl pmUrl = new PolimediaUrl();
                pmUrl.polimedia = Polimedia.find.ref(id);
                pmUrl.url = forma.field("ligaYouTube").value();
                pmNvo.polimediaUrl = pmUrl;
                //pmDB.archivos.forEach(Model::delete);
                Ebean.delete(pmDB.archivos);
            }
            if (tipo == 4L) {
                nombreComp = "filePDF";
                // Puede ser que se haya cambiado de tipo 5 a tipo 4
                // entonces hay que borrar los archivos grales.
                for (PolimediaArchivo a: pmDB.archivos){
                    if (a.polimedia.tipo.id==5)
                        Ebean.delete(a);
                }
            }
            if (tipo == 5L) {
                nombreComp = "fileGral";
                // Puede ser que se haya cambiado de tipo 4 a tipo 5
                // entonces hay que borrar los archivos de url
                for (PolimediaArchivo a: pmDB.archivos){
                    if (a.polimedia.tipo.id==4)
                        Ebean.delete(a);
                }
            }

            Logger.debug("nombreComp:" + nombreComp);

            for (int x = 0; x < body.getFiles().size(); x++) {
                Logger.debug("body.getFiles().get(x).getKey():" + body.getFiles().get(x).getKey());
                if (Objects.equals(body.getFiles().get(x).getKey(), nombreComp)) {
                    Http.MultipartFormData.FilePart fp = body.getFiles().get(x);
                    PolimediaArchivo pma = null;
                    String nombreArchivo = fp.getFilename();
                    Logger.debug("procesando " + nombreArchivo);
                    Logger.debug("   tamaño " + fp.getFile().length());
                    if (fp.getFile().length() > tamMaxArchivo) {
                        retorno.put("limite", "excedido en  " + (fp.getFile().length() - tamMaxArchivo) + " bytes");
                        throw new Exception("excedido");
                    } else {
                        retorno.put("limite", "correcto");

                        // fp.getFile().length() regresan en bytes el tamaño del archivo

                        String contentType = fp.getContentType();
                        File file = fp.getFile();
                        System.out.println();

                        pma = new PolimediaArchivo();
                        pma.polimedia = Polimedia.find.ref(id);
                        try {
                            Path p = Paths.get(file.getPath());
                            byte[] byteFile = Files.readAllBytes(p);
                            pma.nombreArchivo = nombreArchivo;
                            pma.contenido = byteFile;
                            pma.contenttype = contentType;
                            pmArchivos.add(pma);
                        } catch (FileNotFoundException e) {
                            retorno.put("error", "No fué posible agregar el registro, No se encontró el archivo.");
                            System.out.println("Error " + e.toString());
                        } catch (IOException ioe) {
                            retorno.put("error", "No fué posible agregar el registro, error de i/o.");
                            System.out.println("Error " + ioe.toString());
                        }
                        pmNvo.archivos = new ArrayList<>(pmArchivos);
                    }
                }
            }
            pmNvo.habilitado = pmObj.habilitado;
            pmNvo.tipo = Tipo.find.byId(tipo);
            //pmNvo.update();

            /* Carrusel*/
            DateFormat formatter = null;
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");


            if (pmDB.carrusel==null)
                pmNvo.carrusel = new PolimediaCarrusel();
            else
                pmNvo.carrusel = pmDB.carrusel;

            pmNvo.carrusel.polimedia = pmNvo;
            pmNvo.carrusel.posicion = Integer.parseInt(forma.field("carrusel.posicion").value());

            Logger.debug("inicio "+forma.field("carrusel.inicio").value());
            pmNvo.carrusel.inicio =  sdf.parse(forma.field("carrusel.inicio").value());
            pmNvo.carrusel.fin =  sdf.parse(forma.field("carrusel.fin").value());

            if (pmNvo.tipo.id <= 3)
                pmNvo.carrusel.liga = pmNvo.polimediaUrl.url;
            if (pmNvo.tipo.id >= 4)
                pmNvo.carrusel.liga = pmNvo.archivos.get(0).nombreArchivo;
            //PolimediaCarrusel pcr = PolimediaCarrusel.find.byId(pmDB.carrusel.id);
            Http.MultipartFormData.FilePart fp = body.getFile("carrusel.imagen.contenido");
            if (fp != null) {
                if (pmDB.carrusel.imagen==null)
                    pmNvo.carrusel.imagen = new PolimediaCarruselImagen();
                else
                    pmNvo.carrusel.imagen = pmDB.carrusel.imagen;
                pmNvo.carrusel.imagen.polimediacarrusel = pmNvo.carrusel;
                String fileName = fp.getFilename();
                Logger.debug("filename nuevo: "+fileName);
                //Logger.debug("filename Anterior: "+ pmDB.carrusel.nombreArchivo);
                String contentType = fp.getContentType();
                File file = fp.getFile();
                try {
                    Path p = Paths.get(file.getPath());
                    byte[] byteFile = Files.readAllBytes(p);
                    pmNvo.carrusel.nombreArchivo = fileName;
                    pmNvo.carrusel.imagen.contenido =  byteFile;
                    pmNvo.carrusel.imagen.contenttype = contentType;
                } catch (FileNotFoundException e) {
                    flash("error", "No fué posible agregar el registro, No se encontró el archivo.");
                    System.out.println("Error "+e.toString());
                } catch (IOException ioe){
                    flash("error", "No fué posible agregar el registro, error de i/o.");
                    System.out.println("Error "+ioe.toString());
                }
                //pmNvo.carrusel = cr;
            }

            Ebean.update(pmNvo);
            retorno.put("estado", "actualizado");
            Ebean.commitTransaction();
        } catch (Exception e) {
            System.out.println("Ocurrió un error "+e.getMessage()+"\n"+e.getCause());
            Ebean.rollbackTransaction();
            //flash("error", "Ocurrió un error al intentar actualizar la información");
            //return redirect(routes.PoliMediaController.list());
            return ok(retorno.toString());
           // throw new RuntimeException(e);
        } finally {
            Ebean.endTransaction();
        }
        //return ok(retorno.toString());
        flash("success", "Se actualizó el recurso");
        return redirect(routes.PoliMediaController.list());
    }

    // Ver en el navegador el archivo de PoliMediaArchivo
    public static Result verArchivo(Long id) {
        PolimediaArchivo pma = PolimediaArchivo.find.byId(id);
        response().setContentType(pma.contenttype);
        return ok (pma.contenido);
    }


}
