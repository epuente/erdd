package controllers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.*;

import classes.AuxGeo;
import classes.SqlRowPage;
import com.avaje.ebean.*;
import com.fasterxml.jackson.databind.JsonNode;
import controllers.util.ControladorSeguroCoordinador;
import models.*;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import play.libs.Json;
import play.mvc.Result;


public class CoordinadorController extends ControladorSeguroCoordinador {
	
	
    
	public static Result index(){
		response().setHeader("Cache-Control", "max-age=0, private, no-store, no-cache, must-revalidate"); // HTTP 1.1.
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
		
        //System.out.println(		routes.AdminController.index().url()  );

        //RegistroAcceso aux = new RegistroAcceso();





        return ok(views.html.resumenCoordinador.render(registros));
    }	


    public static Result accesosGeo() throws JSONException {
        return ok (  views.html.accesosGeo.render());
    }


    // Obtiene la info de geolocalización de la tabla RegistroAccesoGeo
    // Omite las ips 0:0:0:0:0:0:0:1
    // Regresa en formato JSON
    public static Result auxAccesosGeo() throws JSONException {
        // Obtener los registros únicos de ip y las fechas más recientes de los mismos
        String sql = "select ip, reciente from (" +
                "select distinct ip, max(fecha) reciente from registro_acceso r " +
                "where ip != '0:0:0:0:0:0:0:1' "+
                "group by ip " +
                ") otro " +
                "order by reciente desc";
        List<SqlRow> distintos = Ebean.createSqlQuery(sql).findList();

        JSONArray ja = new JSONArray();
        for (SqlRow sqlr : distintos){
            RegistroAcceso ra = RegistroAcceso.find.where().eq("ip", sqlr.getString("ip")).eq("fecha", sqlr.getString("reciente")).findList().get(0);
            JSONObject aux = new JSONObject();

            if (ra.geolocalizacion.propiedades!=null) {
                JsonNode jn = Json.parse(ra.geolocalizacion.propiedades);
                //JsonNode jn = ;
                //System.out.println(jn);

                if ( !jn.has("message")  ) {
                    aux.put("longitud", jn.findValue("longitude").floatValue());
                    aux.put("latitud", jn.findValue("latitude").floatValue());
                    aux.put("ciudad", jn.findValue("city").textValue());
                    aux.put("region", jn.findValue("region").textValue());
                    aux.put("pais", jn.findValue("country_name").textValue());
                    aux.put("cp", jn.findValue("postal").textValue());
                    aux.put("id", ra.id);
                    aux.put("ip", jn.findValue("ip").textValue());
                    if (jn.has("asn")) {
                        JSONObject jo = new JSONObject();
                        jo.put("id", jn.findPath("asn").findValue("asn").textValue());
                        jo.put("nombre", jn.findPath("asn").findValue("name").textValue());
                        jo.put("tipo", jn.findPath("asn").findValue("type").textValue());
                        jo.put("dominio", jn.findPath("asn").findValue("domain").textValue());
                        jo.put("ruta", jn.findPath("asn").findValue("route").textValue());
                        aux.put("asn", jo);
                    }
                    ja.put(aux);
                }
            }
        }
        return ok (ja.toString());
    }

    // Obtiene los datos de acceso de todos los usuarios
    // Regresa JSON
    public static Result accesos() throws JSONException {
        String filtro = request().getQueryString("search[value]");
        //SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy kk:mm:ss");
        int numPag = 0;
        if (Integer.parseInt(request().getQueryString("start")) != 0)
            numPag = Integer.parseInt(request().getQueryString("start")) /   Integer.parseInt(request().getQueryString("length"));
        int numRegistros = Integer.parseInt(request().getQueryString("length"));
        JSONObject retorno = new JSONObject();
        JSONArray ja = new JSONArray();
        Query<RegistroAcceso> query = RegistroAcceso.find
                                        .where().ne("ip", "0:0:0:0:0:0:0:1")
                                        .orderBy().asc("fecha");

        long sinFiltro = query.findList().size();
        List<RegistroAcceso> filtrados = query
                .where()
                        .or(
                                Expr.ilike("ip", "%" + filtro + "%"), Expr.ilike("usuario.personal.nombre", "%"+filtro+"%")
                        )
                //.or().ilike("fecha", "%"+filtro+"%").
                .findList();


                //SEGUIR CHECANDO EL FILTRADO

                /*.where(
                        "ip like :cadena "+
                                "or usuario.personal.nombre like :cadena "
                ).setParameter("cadena", "%"+filtro+"%")
                 */
                //.findList().size();


        Page<RegistroAcceso> pTochos = query
                .where()
                //.ilike("ip", "%" + filtro + "%")
                //.eq("ip", "148.204.111.41")
                .findPagingList(numRegistros)
                .setFetchAhead(false)
                .getPage(numPag);

        System.out.println("Filtro "+filtro);
        System.out.println("Page (tam) "+pTochos.getList().size());


        for (RegistroAcceso ra : pTochos.getList()){
            JSONObject aux = new JSONObject();
            /*
            if (ra.geolocalizacion.propiedades!=null) {
                JsonNode jn = Json.parse(ra.geolocalizacion.propiedades);
                //JsonNode jn = ;
                System.out.println(jn);

                aux.put("longitud", jn.findValue("longitude").floatValue());
                aux.put("latitud", jn.findValue("latitude").floatValue());
                aux.put("ciudad", jn.findValue("city").textValue());
                aux.put("region", jn.findValue("region").textValue());
                aux.put("pais", jn.findValue("country_name").textValue());
                aux.put("cp", jn.findValue("postal").textValue());
                aux.put("id", ra.id);
                aux.put("ip", jn.findValue("ip").textValue());

                if (jn.has("asn")) {
                    JSONObject jo = new JSONObject();
                    jo.put("id", jn.findPath("asn").findValue("asn").textValue());
                    jo.put("nombre", jn.findPath("asn").findValue("name").textValue());
                    jo.put("tipo", jn.findPath("asn").findValue("type").textValue());
                    jo.put("dominio", jn.findPath("asn").findValue("domain").textValue());
                    jo.put("ruta", jn.findPath("asn").findValue("route").textValue());
                    aux.put("asn", jo);
                }
                ja.put(aux);
            }
            */

            if (ra.usuario != null)
                aux.put("usuario", ra.usuario.personal.nombreCompleto());
            if (ra.autor != null)
                aux.put("usuario", ra.autor.nombreCompleto());
            aux.put("ip", ra.ip);
            System.out.println(ra.fecha.toString());
            aux.put("fecha",    sdf.format(ra.fecha));
            ja.put(aux);

        }
        retorno.put("draw",  new Date().getTime()  );
        retorno.put("recordsTotal",  query.findList().size() );
        //retorno.put("recordsFiltered", query.findList().size());
        retorno.put("recordsFiltered", filtrados.size());

        retorno.put("data", ja);

        System.out.println(retorno.toString());
        return ok (retorno.toString());
    }


    public static Result accesos2() throws JSONException {
        System.out.println("Desde CoordinadorController.accesos2");
        String filtro = request().getQueryString("search[value]");
        //SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy kk:mm:ss");
        int numPag = 0;
        if (Integer.parseInt(request().getQueryString("start")) != 0)
            numPag = Integer.parseInt(request().getQueryString("start")) /   Integer.parseInt(request().getQueryString("length"));
        int numRegistros = Integer.parseInt(request().getQueryString("length"));
        JSONObject retorno = new JSONObject();
        JSONArray ja = new JSONArray();


        Query<RegistroAcceso> query = RegistroAcceso.find.setQuery(
                "where (upper(concat(usuario.personal.nombre,\" \", paterno ,\" \", materno)) like upper('%"+filtro+"%') " +
                "or fecha like '%"+filtro+"%' " +
                "or upper(ruta) like upper('%"+filtro+"%') " +
                        ") ").where().ne("ip","0:0:0:0:0:0:0:1").query();
        /*
        query = RegistroAcceso.find.setQuery(
                "select t0.id, " +
                        "IF(t0.usuario_id IS NOT NULL, concat(t2.nombre , \" \",t2.paterno , \" \", t2.materno ), concat(ra.nombre ,\" \",ra.paterno,\" \",ra.materno)) nombreCompleto, " +
                        " r.descripcion , " +
                        "IF(t0.autor_id IS NOT NULL, 'Autor', r.descripcion ) as rol, " +
                        "t0.ip, t0.ruta , t0.fecha , t3.id idGeo " +
                        "from registro_acceso t0 " +
                        "left outer join registro_acceso_geo t3 on t3.registroacceso_id = t0.id " +
                        "left outer join usuario t1 on t1.id = t0.usuario_id " +
                        "left outer join personal t2 on t2.id = t1.personal_id " +
                        "left outer join recurso_autor ra on ra.id = t0.autor_id " +
                        "left outer join usuario_rol ur on ur.usuario_id = t1.id " +
                        "left outer join rol r on r.id = ur.rol_id " +
                        "where t0.ip != '0:0:0:0:0:0:0:1' " +
                        "and t0.id in (select t0.id " +
                        "from registro_acceso t0  " +
                        "where upper(concat(t2.nombre,\" \", t2.paterno ,\" \", t2.materno)) like upper('%.41%') " +
                        "or t0.fecha like '%.41%' " +
                        "or upper(t0.ruta) like upper('%.41%') " +
                        "or t0.ip like '%.41%' " +
                        ") "
        );

         */

        // Inicia con sqlrows

        System.out.println("USANDO SQLROWS");
        String qBase = "select t0.id, " +
                "IF(t0.usuario_id IS NOT NULL, concat(t2.nombre , \" \",t2.paterno , \" \", t2.materno ), concat(ra.nombre ,\" \",ra.paterno,\" \",ra.materno)) nombreCompleto, " +
                "r.descripcion , " +
                "IF(t0.autor_id IS NOT NULL, 'Autor', r.descripcion ) as rol, " +
                "t0.ip, t0.ruta , t0.fecha , t3.id idGeo, " +
                "JSON_EXTRACT(propiedades, '$.latitude') lat, " +
                "JSON_EXTRACT(propiedades, '$.longitude') lon "+
                "from registro_acceso t0 " +
                "    left outer join registro_acceso_geo t3 on t3.registroacceso_id = t0.id " +
                "    left outer join usuario t1 on t1.id = t0.usuario_id " +
                "    left outer join personal t2 on t2.id = t1.personal_id " +
                "    left outer join recurso_autor ra on ra.id = t0.autor_id " +
                "    left outer join usuario_rol ur on ur.usuario_id = t1.id " +
                "    left outer join rol r on r.id = ur.rol_id " +
                "where t0.ip != '0:0:0:0:0:0:0:1' " +
                "    and t0.id in (select t0.id " +
                "    from registro_acceso t0  " +
                "    where upper(concat(t2.nombre,\" \", t2.paterno ,\" \", t2.materno)) like upper('%"+filtro+"%') " +
                "        or upper(concat(ra.nombre,\" \", ra.paterno ,\" \", ra.materno)) like upper('%"+filtro+"%') " +
                "        or upper(IF(t0.autor_id IS NOT NULL, 'Autor', r.descripcion )) like upper('%"+filtro+"%') "+
                "        or t0.fecha like '%"+filtro+"%' " +
                "        or upper(t0.ruta) like upper('%"+filtro+"%') " +
                "        or t0.ip like '%"+filtro+"%' " +
                " ) ";

        int sinFiltro = Ebean.find(RegistroAcceso.class).where().ne("ip", "0:0:0:0:0:0:0:1").findList().size();

        // Obtener el conteo total (El total de registros despues de aplicar el filtro a los campos)
        int totalCount = Ebean.createSqlQuery(qBase).findList().size();

        String sql = qBase+" LIMIT :limit OFFSET :offset";

        List<SqlRow> rows = Ebean.createSqlQuery(sql)
                .setParameter("limit", (numRegistros==-1)?totalCount: numRegistros  )
                .setParameter("offset", numPag * numRegistros)
                .findList();

        // Crear la página
        Page<SqlRow> sqlRowPage = new SqlRowPage(rows, totalCount, numPag, numRegistros);

        for (SqlRow row : sqlRowPage.getList()){
            JSONObject aux = new JSONObject();
            aux.put("usuario", row.getString("nombreCompleto"));
            aux.put("rol", row.getString("rol"));
            aux.put("ip", row.getString("ip"));
            //System.out.println(ra.fecha.toString());
            aux.put("ruta", row.getString("ruta"));
            //aux.put("fecha",    sdf.format(row.getString("fecha")));
            aux.put("fecha",    row.getString("fecha"));
            aux.put("idGeo", row.getLong("idGeo"));
            aux.put("lon", row.getString("lon"));
            aux.put("lat", row.getString("lat"));
            ja.put(aux);
        }
        retorno.put("draw",  new Date().getTime()  );
        retorno.put("recordsTotal",  sinFiltro );
        retorno.put("recordsFiltered", totalCount);

        retorno.put("data", ja);

        // Termina con sqlrows

        //System.out.println("retorno "+retorno.toString());
        return ok (retorno.toString());

    }


    //REVISAE EL CÓDIGO Y BUSCAR USAR UN ARREGLO QUE EVITE LA BUSQUEDA EN LA TABLA

    // Este método se usa para generar por primera vez los registros en la tabla RegistroAccesoGeo
    // Se puede usar desde cualquier controlador con RegistroAcceso.tempoGeo();
    public static Result generaGeoX(){
        System.out.println("Desde RegistroAcceso.tempGeo");

        List<AuxGeo> lstAuxGeo = new ArrayList<>();

        Ebean.createSqlUpdate("truncate table registro_acceso_geo").execute();
/*
        for ( RegistroAccesoGeo rag :   RegistroAccesoGeo.find.all()){
            rag.delete();
        }*/
        System.out.println("Se ha truncado la tabla RegistroAccesoGeo");
        for (RegistroAcceso ra : RegistroAcceso.find.findList()){
            System.out.println("ip "+ra.ip);
            if (!Objects.equals(ra.ip, "127.0.0.1") && !Objects.equals(ra.ip, "0:0:0:0:0:0:0:1")){
                // Buscar si existe registro de la ip en RegistroAccesoGeo
                //RegistroAccesoGeo rag = RegistroAccesoGeo.find.where().eq("registroacceso.id", ra.id).findUnique();
                System.out.println(ra.id+"   "+ra.ip);
                if (RegistroAccesoGeo.find.all().size()==0){
                    System.out.println("inicando la tabla........");
                    RegistroAccesoGeo nuevo = new RegistroAccesoGeo();
                    nuevo.registroacceso = ra;
                    nuevo.propiedades = curlIpData(ra.ip);
                    nuevo.save();

                    lstAuxGeo.add( new AuxGeo(nuevo) );

                } else {

                    //RegistroAccesoGeo aux = ra.ipEnGeo();

                    //Optional<AuxGeo> aux = lstAuxGeo.stream().filter(f-> Objects.equals(f.ip, ra.ip)).findFirst();

                    System.out.println("\n\nlstAuxGeo: "+lstAuxGeo+"\n\n");

                    RegistroAccesoGeo aux = null;
                    for(int x=0; x<lstAuxGeo.size(); x++){
                        if (Objects.equals(lstAuxGeo.get(x).ip, ra.ip)){
                            aux =  Ebean.find(RegistroAccesoGeo.class).setId(  lstAuxGeo.get(x).id ).findUnique();
                        }
                    }


                    //Optional<AuxGeo> aux = Optional.empty();
                    if ( aux == null ){
                        System.out.println("nuevo en reg geo");
                        RegistroAccesoGeo nuevo = new RegistroAccesoGeo();
                        nuevo.registroacceso = ra;
                        nuevo.propiedades = curlIpData(ra.ip);
                        nuevo.save();
                        lstAuxGeo.add( new AuxGeo(nuevo) );
                    } else {
                        //System.out.println("ya existe en reg geo");
                        RegistroAccesoGeo nuevo = new RegistroAccesoGeo();
                        nuevo.registroacceso = ra;
                        nuevo.propiedades = aux.propiedades;
                        nuevo.save();
                    }
                }
            }
        }
        return ok("ok");
    }







    public static Result generaGeo(){
        int totalRegistro = RegistroAcceso.find.findRowCount();
        int totalRegistroGeo = RegistroAccesoGeo.find.findRowCount();
        return ok (views.html.generaGeo.render(totalRegistro, totalRegistroGeo));
    }

    public static Result cuentaRegistrosGeo(){
        return ok(String.valueOf(RegistroAccesoGeo.find.findRowCount()));
    }


    // Método que regresa la info de geolocalización desde la api de ipdata
    private static String curlIpData(String laIp){
        String aux="";
        try {
            String cmd = "curl https://api.ipdata.co/"+laIp+"?api-key=d7e4898879f3611abf477af356ef48041da05256399664cda5b02cdc";
            System.out.println("comando:"+cmd);
            Process process = Runtime.getRuntime().exec(cmd);
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            StringBuilder output = new StringBuilder();
            String line2;
            while ((line2 = reader.readLine()) != null) {
                output.append(line2);
            }
            aux = output.toString();
        } catch(IOException e) {
            System.out.print(e.getMessage());
        }
        return aux;
    }








}

