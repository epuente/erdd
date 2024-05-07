package controllers;

import com.avaje.ebean.*;
import com.avaje.ebean.annotation.Transactional;
import com.fasterxml.jackson.databind.JsonNode;
import models.polimedia.*;
import org.joda.time.DateTime;
import org.joda.time.DateTimeComparator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import play.Logger;
import play.data.Form;
import play.mvc.Result;

import views.html.AdminPoliMedia.*;

import java.io.IOException;
import java.util.*;

import static play.data.Form.form;

public class PoliMediaController extends ControladorSeguroPM{

    public static Result tablero(){
        return ok (tablero.render());
    }

    public static Result list(){
        return ok (list.render());
    }

    public static Result ajaxListaPoliMediaDTSS(){
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
                datoP.put("calificacion", p.recurso.calificacion.calificacion);
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
        return ok( json2.toString()  );
    }



    public static Result edit(Long id){
        Form<Polimedia> fpm = form(Polimedia.class).fill(
                Polimedia.find.byId(id)
        );
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


}
