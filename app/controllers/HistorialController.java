package controllers;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

import com.avaje.ebean.Page;
import com.avaje.ebean.Query;
import com.avaje.ebean.annotation.Transactional;
import com.fasterxml.jackson.databind.JsonNode;
import controllers.util.ControladorDefault;
import models.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


import play.libs.Json;
import play.mvc.Result;
//import views.html.Historial.log2;

public class HistorialController extends ControladorDefault {
	
	public static Result ajaxActualizaLog(Integer nitems){
		System.out.println("desde HistorialController.ajaxActualizaLog");
		List<Log> listLog = new ArrayList<>();
		List<Historialestado> he = Historialestado.find.select("id, recurso, estado, auditinsert").orderBy("auditinsert desc").setMaxRows(nitems).findList();
		he.forEach(e ->{
			Log nl = new Log();
			nl.tipo = "e";
 		    nl.recurso = e.recurso;  
 		    nl.estado = e.estado; 
 		    nl.auditinsert = e.auditinsert;
 		    listLog.add(nl);
 		    });
		
		List<HistorialestadoEvaluacion> heEv = HistorialestadoEvaluacion.find.select("id, recurso, estado, auditinsert, recursoevaluador").orderBy("auditinsert desc").setMaxRows(nitems).findList();
		heEv.forEach(e ->{
			Log nl = new Log();
			nl.tipo = "ev";
			nl.recurso = e.recurso;  
 		    nl.estadoevaluacion = e.estado; 
 		    nl.auditinsert = e.auditinsert;
 		    listLog.add(nl);
 		    });		

		
		List<HistorialestadoEncuesta> heEn = HistorialestadoEncuesta.find.select("id, recurso, estado, auditinsert").orderBy("auditinsert desc").setMaxRows(nitems).findList();
		
		heEn.forEach(e ->{
			Log nl = new Log();
			nl.tipo = "en";
			nl.recurso = e.recurso;  
 		    nl.estadoencuesta = e.estado; 
 		    nl.auditinsert = e.auditinsert;
 		    
 		    listLog.add(nl);
 		    
 		    });		

		listLog.sort((o1, o2) -> (o1.auditinsert.before(o2.auditinsert)) ? 1 : -1);
		
		JSONArray jArray = new JSONArray();
		if (nitems > listLog.size())
			nitems = listLog.size();
		int i = 0;
		if (listLog.size()>0) {
			for (Log e : listLog.subList(0, nitems)) {
				JSONObject jObject = new JSONObject();	
				SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd/MM/yyyy kk:mm:ss");
				try {
					jObject.put("consecutivo", i++);
					jObject.put("tipo", e.tipo);				
					jObject.put("recurso", e.recurso.titulo);
					jObject.put("numerocontrol", e.recurso.numcontrol);
					if (e.estado != null)
						jObject.put("estado", e.estado.descripcion);
					if (e.estadoevaluacion != null)
						jObject.put("estadoevaluacion", e.estadoevaluacion.descripcion);
					if (e.estadoencuesta != null)
						jObject.put("estadoencuesta", e.estadoencuesta.descripcion);
					jObject.put("auditinsert", sdf.format(e.auditinsert));
				} catch (JSONException e1) {					
					e1.printStackTrace();
				}
				jArray.put(jObject);
			}
		}
		
	   	 response().setHeader("Access-Control-Allow-Origin", "*");
	   	 response().setHeader("Access-Control-Allow-Origin", "*");
	   	 response().setHeader("Allow", "*");
	   	 response().setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, DELETE, OPTIONS");
	   	 response().setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept, Referer, User-Agent");
        return ok (jArray.toString());
	}


    // Son los logs de acceso del evaluador
    public static Result accesoEvaluador(Long idEvaluador){
        System.out.println("Desde CoordinadorController.accesoEvaluador");
        Personal p = Usuario.find.setId(idEvaluador).findUnique().personal;
        String rol = p.usuario.roles.get(0).rol.descripcion;
        return ok (views.html.Historial.accesoEvaluador.render(idEvaluador, p, rol));
        //return ok (jo.toString());
    }


    public static Result hisEvaluador(Long idEvaluador){
        System.out.println("\n\n\n\nDesde HistorialController.hisEvaluador");
        //System.out.println( "parametros 0:"+ request() );
        String filtro = request().getQueryString("search[value]");
        int filtrados = 0;
        int sinFiltro = 0;
        Map<Integer, Integer> columnasOrdenables = new HashMap<>();
        columnasOrdenables.put(0, 3);
        columnasOrdenables.put(1, 3);
        columnasOrdenables.put(2, 1);
        columnasOrdenables.put(3, 2);
        int colOrden =   Integer.parseInt( request().getQueryString("order[0][column]")   );
        String tipoOrden = request().getQueryString("order[0][dir]");
        System.out.println( "parametro start:"+ Integer.parseInt(request().getQueryString("start")));
        System.out.println( "parametro length:"+ Integer.parseInt(request().getQueryString("length")));
        System.out.println( "parametros order[0][column]:"+ colOrden);
        System.out.println( "parametros order[0][dir]:"+ tipoOrden);
        System.out.println( "filtrando :"+ filtro);
        System.out.println( "columnas ordenables :"+ columnasOrdenables);
        System.out.println( "columnas orden"+ colOrden);
        int numPag = 0;
        if (Integer.parseInt(request().getQueryString("start")) != 0)
            numPag = Integer.parseInt(request().getQueryString("start")) /   Integer.parseInt(request().getQueryString("length"));
        int numRegistros = Integer.parseInt(request().getQueryString("length"));


        //Page<RegistroAcceso> pagRegAcce = null;
        List<RegistroAcceso> listRegAcce = null;
        Query<RegistroAcceso> q1 = RegistroAcceso.find.where("usuario.id = "+idEvaluador);
        Query<RegistroAcceso> q2 = RegistroAcceso.find.where(
                                "usuario.id = "+idEvaluador+" and (fecha like :cadena "+
                                                "or ruta like :cadena "+
                                                "or ip like :cadena) "
                                            )
                                    .orderBy().asc("fecha")
                                    .setParameter("cadena", "%"+filtro+"%");

        Query<RegistroAcceso> q3 = RegistroAcceso.find
                .where(
                        "usuario.id = " + idEvaluador + " and (fecha like :cadena " +
                                "or ruta like :cadena " +
                                "or ip like :cadena) "
                ).setParameter("cadena", "%" + filtro + "%")
                .orderBy("c" + columnasOrdenables.get(colOrden) + " " + tipoOrden);

        listRegAcce = q3
                .findPagingList(numRegistros)
                .setFetchAhead(false)
                .getPage(numPag)
                .getList();

        filtrados = q2.findList().size();
        sinFiltro = q1.findList().size();

        List<RegistroAcceso> t = q3.findList();

        SimpleDateFormat sdfFecha = new java.text.SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat sdfHora = new java.text.SimpleDateFormat("kk:mm:ss");

        JSONObject jo = new JSONObject();
        JSONArray jArray = new JSONArray();


        try {
            for (RegistroAcceso ra : listRegAcce){
                JSONObject jObject = new JSONObject();
                jObject.put("id", ra.id);
                jObject.put("fecha", sdfFecha.format(ra.fecha));
                jObject.put("hora", sdfHora.format(ra.fecha));
                System.out.println(sdfFecha.format(ra.fecha)+"    "+ra.fecha);

                //jObject.put("fecha", ra.fecha);
                //jObject.put("hora", ra.fecha);

                jObject.put("ip", ra.ip);
                jObject.put("ruta", ra.ruta);
                jObject.put("autorId", ra.autor);
                if (1==10) {
                    if (!Objects.equals(ra.ip, "127.0.0.1") && !Objects.equals(ra.ip, "0:0:0:0:0:0:0:1")) {
                        //String geo = lecturaComandoCore(ra.ip);

                        JSONArray jaBloqueos = new JSONArray();
                        String geo = curlIpData(ra.ip);
                        JsonNode jgeo = Json.parse(geo);

                        JSONObject joGeo = new JSONObject();
                        JSONObject joASN = new JSONObject();
                        JSONObject joT = new JSONObject();

                        System.out.println("..." + jgeo);

                        joGeo.put("latitud", jgeo.get("latitude").floatValue());
                        joGeo.put("longitud", jgeo.get("longitude").floatValue());
                        joGeo.put("continenteNombre", jgeo.get("continent_name").textValue());
                        joGeo.put("continenteSiglas", jgeo.get("continent_code").textValue());
                        joGeo.put("paísNombre", jgeo.get("country_name").textValue());
                        joGeo.put("paísSiglas", jgeo.get("country_code").textValue());
                        joGeo.put("paísRegion", jgeo.get("region").textValue());
                        joGeo.put("paísRegionCodigo", jgeo.get("region_code").textValue());
                        joGeo.put("paísRegionTipo", jgeo.get("region_type").textValue());
                        joGeo.put("ciudad", jgeo.get("city").textValue());
                        joGeo.put("cp", jgeo.get("postal").textValue());
                        joGeo.put("is_eu", jgeo.get("is_eu").booleanValue());
                        joGeo.put("flag", jgeo.get("flag").textValue());
                        joGeo.put("emoji_flag", jgeo.get("emoji_flag").textValue());
                        joGeo.put("emoji_unicode", jgeo.get("emoji_unicode").textValue());
                        joGeo.put("calling_code", jgeo.get("calling_code").textValue());




                        joASN.put("asn", jgeo.findPath("asn").findValue("asn").textValue());
                        joASN.put("nombre", jgeo.findPath("asn").findValue("name").textValue());
                        joASN.put("dominio", jgeo.findPath("asn").findValue("domain").textValue());
                        joASN.put("tipo", jgeo.findPath("asn").findValue("type").textValue());
                        joASN.put("ruta", jgeo.findPath("asn").findValue("route").textValue());

                        //jObject.put("hostname", jgeo.get("hostname"));
                        //jObject.put("geolocalizacion.tipo", jgeo.get("type"));
                        //jObject.put("geolocalizacion.conexionTipo", jgeo.get("connection_type"));

                        joT.put("is_tor", jgeo.findPath("threat").findValue("is_tor").booleanValue());
                        joT.put("is_icloud_relay", jgeo.findPath("threat").findValue("is_icloud_relay").booleanValue());
                        joT.put("is_proxy", jgeo.findPath("threat").findValue("is_proxy").booleanValue());
                        joT.put("is_datacenter", jgeo.findPath("threat").findValue("is_datacenter").booleanValue());
                        joT.put("is_anonymous", jgeo.findPath("threat").findValue("is_anonymous").booleanValue());
                        joT.put("is_known_attacker", jgeo.findPath("threat").findValue("is_known_attacker").booleanValue());
                        joT.put("is_known_abuser", jgeo.findPath("threat").findValue("is_known_abuser").booleanValue());
                        joT.put("is_threat", jgeo.findPath("threat").findValue("is_threat").booleanValue());
                        joT.put("is_bogon", jgeo.findPath("threat").findValue("is_bogon").asBoolean());
                        //blocklists
                        jgeo.path("blocklists").forEach(blocklist -> {
                            JSONObject aux = new JSONObject();
                            try {
                                aux.put("name", blocklist.path("name").asText());
                                aux.put("site", blocklist.path("site").asText());
                                aux.put("type", blocklist.path("type").asText());
                                jaBloqueos.put(aux);
                            } catch (JSONException e) {
                                System.out.println("Ocurrió una excepción de json "+e.getMessage()+ e.getCause());
                                throw new RuntimeException(e);
                            }

                        });
                        joT.put("blocklists", jaBloqueos);

                        joGeo.put("asn", joASN);
                        //joGeo.put("threat",  new JSONObject(jgeo.findPath("threat")));
                        joGeo.put("threat", joT );
                        jObject.put("geolocalizacion", joGeo);
                    }
                }

                jArray.put(jObject);

            }
            jo.put("draw",  new Date().getTime()  );
            jo.put("recordsTotal",  sinFiltro );
            jo.put("recordsFiltered", filtrados);
            jo.put("data", jArray);
        } catch (JSONException e) {
            System.out.println("Error, ocurrió una excepción "+e.getMessage());
            throw new RuntimeException(e);
        }
        System.out.println("q1 "+q1.getGeneratedSql());
        System.out.println("sinFiltro "+sinFiltro);

        System.out.println("q2 "+q2.getGeneratedSql());

        System.out.println("q3  "+q3.getGeneratedSql());
        System.out.println("filtrados "+filtrados);

        //System.out.println("pagRegAcce tam pag"+pagRegAcce.getList().size());

        //System.out.println("pagRegAcce total regs"+pagRegAcce.getTotalRowCount()  );

        System.out.println(jo.toString());
        return ok (jo.toString());
    }


    // Son los logs de acceso del autor
    public static Result accesoAutor(Long idAutor){
        System.out.println("Desde CoordinadorController.accesoAutor");
        RecursoAutor a = RecursoAutor.find.setId(idAutor).findUnique();
        List<RegistroAcceso> logs = RegistroAcceso.find.where().eq("autor.id", a.id).orderBy("fecha").findList();
        SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd/MM/yyyy kk:mm:ss");
        System.out.println("n "+logs.size());

        JSONArray jArray = new JSONArray();
        for (RegistroAcceso ra :logs){
            JSONObject jObject = new JSONObject();
            try {
                jObject.put("id", ra.id);
                jObject.put("fecha", sdf.format(ra.fecha));
                jObject.put("ip", ra.ip);
                jObject.put("ruta", ra.ruta);
                jArray.put(jObject);
            } catch (JSONException e) {
                System.out.println("Error, ocurrió una excepción "+e.getMessage());
                throw new RuntimeException(e);
            }

        }

        return ok (jArray.toString());

    }



    private static String lecturaComandoCore(String ip){
        String aux="";
        try {
            //https://api.ipstack.com/189.157.60.59?access_key=6cbd49c31305ce6ef849e8f2ff65bb0c
            //String cmd = "curl  https://api.ipstack.com/"+ip+"?access_key=6cbd49c31305ce6ef849e8f2ff65bb0c&hostname=1";
            String cmd = "curl  https://api.ipstack.com/"+ip+"?access_key=6cbd49c31305ce6ef849e8f2ff65bb0c";
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


    // Obtiene la info de geolocalización del evaluador
    @Transactional(readOnly = true)
    public static Result getLocaciones() throws JSONException {



        System.out.println("\n\n\n\n\n"+session().get("idEvaluador"));


        Evaluador e = Evaluador.find.setId(session().get("idEvaluador")).findUnique();

        System.out.println("personal id: "+e.personal.id);
        List<Object> ids = RegistroAcceso.find.select("id").where().eq("usuario.id", e.personal.id).setMapKey("id").findIds();
        System.out.println("tam "+ids.size());
        List<RegistroAccesoGeo> x = RegistroAccesoGeo.find.where().in("registroacceso.id", ids).findList();

        JSONObject joRetorno = new JSONObject();
        JSONArray ja = new JSONArray();
        for ( RegistroAccesoGeo rag: x){
            JSONObject aux = new JSONObject();
            JsonNode jn = Json.parse(rag.propiedades);
            aux.put("longitud", jn.findValue("longitude").floatValue());
            aux.put("latitud", jn.findValue("latitude").floatValue());
            aux.put("id", rag.id);
            ja.put(aux);
        }
        joRetorno.put("geo",ja);
        //List<RegistroAccesoGeo> locations =    .em().createQuery("SELECT l FROM Location l", Location.class).getResultList();
        //return ok(Json.toJson(x));
        System.out.println(ja.toString());
        return ok (ja.toString());
    }

}
