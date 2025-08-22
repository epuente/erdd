package models;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.*;

import javax.persistence.*;

import classes.AuxGeo;
import com.avaje.ebean.Ebean;
import com.avaje.ebean.SqlRow;
import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;

import com.fasterxml.jackson.databind.JsonNode;
import org.json.JSONException;
import org.json.JSONObject;
import play.data.validation.Constraints;
import play.db.ebean.Model;
import play.libs.Json;

@Entity
public class RegistroAcceso extends Model{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	
	@Id
    public Long id;
	@Constraints.Required
	
	@ManyToOne
	public Usuario usuario;
	
	@ManyToOne
	public RecursoAutor autor;
	
	public String ruta;
	
	public String ip;
	public Date fecha;
	
	@CreatedTimestamp
    public Date auditinsert;
	@UpdatedTimestamp
    public Date auditlastupdate;

    public static Model.Finder<Long,RegistroAcceso> find = new Model.Finder<>(Long.class, RegistroAcceso.class);

    @OneToOne (mappedBy = "registroacceso", cascade = CascadeType.ALL, orphanRemoval = true)
    public RegistroAccesoGeo geolocalizacion;

    @PrePersist
    public void prePersist() throws ParseException {
        LocalDateTime dtHoy= new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println("Desde el prePersist de RegistroAcceso "+ this.ip);
        this.geolocalizacion =  new RegistroAccesoGeo();


        //Primero verifica si existe la ip con datos de geolocalización; si existe y es menor 24 horas toma la info de RegistroAccesoGeo, sino existe o si es mayor a 24 horas hace una llamada a la api de ipdata
        int nIds = RegistroAcceso.find.where().eq("ip", this.ip).findList().size();

       // Cambiar la linea anterior a sqlrows



        if (  nIds == 0  ){
            // No existe registro de la ip en RegistroAcceso así que hay que crear el registro para RegistroAccesoGeo
            this.geolocalizacion.registroacceso = this;
            this.geolocalizacion.propiedades= curlIpData(this.ip);

        } else {
            System.out.println("\n\n\n--------------------->");

            // Registro con la fecha mas reciente de la ip
            //SqlRow sqlrowX = Ebean.createSqlQuery("select id from registro_acceso where fecha  = ( select max(fecha) from registro_acceso where ip = \"" + this.ip + "\")").findUnique();

            //String qJson = "select max(propiedades->>\"$.time_zone.current_time\") fecha from registro_acceso_geo             where propiedades->>\"$.ip\" = \""+this.ip+"\"";

            //SqlRow x = Ebean.createSqlQuery(qJson).findUnique();



            //System.out.println("??: "+x);

            //Long xId = x.getLong("id");

            // Obtener el id de RegistroAcceso que tenga la ip recibida y que sea la fecha más reciente
            //  select id, fecha from registro_acceso where ip = "148.204.111.41" ORDER by fecha desc LIMIT 1
            RegistroAcceso masActual = RegistroAcceso.find.where().eq("ip", this.ip).order().desc("fecha").setMaxRows(1).findUnique();
            Long xId = masActual.id;
            //System.out.println("fecha: "+x.getString("fecha"));

            //SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            SimpleDateFormat formatter = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.US);

            //Date xFecha = formatter.parse(x.getString("fecha"));
            Date xFecha = formatter.parse(masActual.fecha.toString());
                    //Date xFecha = x.getString("fecha");

            System.out.println("fecha: "+xFecha.toString());

            LocalDateTime dtReciente =     xFecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
            long horasDiferencia = ChronoUnit.HOURS.between(dtReciente, dtHoy);

            System.out.println("diferencia en horas "+horasDiferencia);

            if (horasDiferencia >= 24){
                this.geolocalizacion.registroacceso = this;
                this.geolocalizacion.propiedades= curlIpData(this.ip);
            } else {
                //this.geolocalizacion.registroacceso = this;
                System.out.println("antes");
                System.out.println("xId "+xId);
                RegistroAccesoGeo y = RegistroAccesoGeo.find.where().eq("registroacceso.id", xId).findUnique();
                //System.out.println(y);
                this.geolocalizacion.registroacceso = this;
                if (y.propiedades!=null)
                    this.geolocalizacion.propiedades = y.propiedades;
                System.out.println("despues");
            }



            //RegistroAcceso d = RegistroAcceso.find.where().eq("fecha", "MAX(fecha) FROM registro_acceso where ip = " + this.ip).findUnique();


            /*RegistroAcceso reciente = RegistroAcceso.find
                    .select("max(fecha)")
                    .where().eq("ip", this.ip)
                    .findUnique();*/
            System.out.println("<---------------------\n\n\n");

            /*
            LocalDateTime dtReciente =     reciente.fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
            long horasDiferencia = ChronoUnit.HOURS.between(dtReciente, dtHoy);
            System.out.println("horasDiferencia "+horasDiferencia);
            if (horasDiferencia >= 24){
                String x = curlIpData(this.ip);
                this.geolocalizacion.propiedades=x;
            } else {
                this.geolocalizacion.propiedades=reciente.geolocalizacion.propiedades;
            }
*/
        }





        //this.geolocalizacion.propiedades="{\"uno\":\"jajaja\"}";


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





    /*
    public static void tempoGeo2() throws JSONException {
        System.out.println("Desde RegistroAcceso.tempGeo2");
        //List<RegistroAccesoGeo> lstIps = new ArrayList<>();
        //Map<Long, String> mapa = new HashMap<>();
        List<AuxGeo> lstGeo = new ArrayList<>();
        for ( RegistroAccesoGeo rag :   RegistroAccesoGeo.find.all()){
            rag.delete();
        }
        try {
            for (RegistroAcceso ra : RegistroAcceso.find.findList()) {
                if (!Objects.equals(ra.ip, "127.0.0.1") && !Objects.equals(ra.ip, "0:0:0:0:0:0:0:1")) {
                    // Buscar si existe registro de la ip en RegistroAccesoGeo
                    //RegistroAccesoGeo rag = RegistroAccesoGeo.find.where().eq("registroacceso.id", ra.id).findUnique();
                    //System.out.println(ra.id+"   "+ra.ip);
                    if (RegistroAccesoGeo.find.all().isEmpty()) {
                        System.out.println("inicando la tabla........");
                        RegistroAccesoGeo nuevo = new RegistroAccesoGeo();
                        nuevo.registroacceso = ra;
                        nuevo.propiedades = curlIpData(ra.ip);
                        nuevo.save();
                        //lstIps.add(nuevo);
                        //mapa.put(nuevo.id, ra.ip);

                        AuxGeo x = new AuxGeo();
                        x.idRegistro = nuevo.registroacceso.id;
                        x.ip = ra.ip;
                        x.propiedades = nuevo.propiedades;
                        lstGeo.add(0,x);

                    } else {
                        //RegistroAccesoGeo aux = lstIps.stream().filter(f-> Objects.equals(f.registroacceso.ip, ra.ip)).findFirst().get();


                        Optional<AuxGeo> aux = lstGeo.stream().filter(f -> Objects.equals(f.ip, ra.ip)).findFirst();
                        //Optional<AuxGeo> aux = Optional.empty();
                        boolean encontrado = false;
                        AuxGeo ax = new AuxGeo();
                        for (AuxGeo auxGeo : lstGeo) {
                            if (Objects.equals(auxGeo.ip, ra.ip)) {
                                encontrado = true;
                                ax = auxGeo;
                                break;
                            }
                        }



                        if (!encontrado) {
                            System.out.println("nuevo en reg geo");
                            RegistroAccesoGeo nuevo = new RegistroAccesoGeo();
                            nuevo.registroacceso = ra;
                            nuevo.propiedades = curlIpData(ra.ip);
                            nuevo.save();
                            //mapa.put(nuevo.id, ra.ip);
                            //lstIps.add(nuevo);

                            AuxGeo x = new AuxGeo();
                            x.idRegistro = nuevo.registroacceso.id;
                            x.ip = ra.ip;
                            x.propiedades = nuevo.propiedades;
                            lstGeo.add(  lstGeo.size(),  x);
                        } else {
                            //System.out.println("ya existe en reg geo");
                            RegistroAccesoGeo nuevo = new RegistroAccesoGeo();
                            nuevo.registroacceso = ra;
                            nuevo.propiedades = aux.get().propiedades;
                            //nuevo.propiedades = Ebean.find(RegistroAccesoGeo.class).setId(aux.get()).findUnique().propiedades;
                            nuevo.save();
                        }
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error de indice"+e.getMessage());
            throw new RuntimeException(e);
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
            throw new RuntimeException(e);
        }


    }

    */
    private RegistroAccesoGeo ipEnGeo(){
        RegistroAccesoGeo retorno = null;
        RegistroAccesoGeo uno = null;
        if (RegistroAccesoGeo.find.all().size()>0) {
            for (RegistroAccesoGeo x : RegistroAccesoGeo.find.findList()) {
                //System.out.println("propiedades: "+x.propiedades);
                JsonNode jn = Json.parse(x.propiedades);
                if (Objects.equals(this.ip, jn.get("ip").textValue())) {
                    uno = x;
                    break;
                }
            }
        }

        if (uno!=null){
            LocalDateTime dtHoy= new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
            String qJson = "select max(propiedades->>\"$.time_zone.current_time\") fecha from registro_acceso_geo             where propiedades->>\"$.ip\" = \""+this.ip+"\"";

            //System.out.println(qJson);

            SqlRow x = Ebean.createSqlQuery(qJson).findUnique();
            //System.out.print("X: "+x);

            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            try {
                Date fecha = formatter.parse(x.getString("fecha"));
                LocalDateTime dtReciente =     fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
                long horasDiferencia = ChronoUnit.HOURS.between(dtReciente, dtHoy);
                if (horasDiferencia >= 24){
                    retorno = null;
                } else
                    retorno = uno;


            } catch (ParseException e) {
                System.out.println("Exception de formato de fecha "+e.getMessage());
                throw new RuntimeException(e);
            }
        }

        return retorno;
    }



}





