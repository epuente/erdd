package models;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.avaje.ebean.Page;
import com.avaje.ebean.Query;
import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;

import models.polimedia.Polimedia;
import models.polimedia.Tipo;
import org.springframework.format.annotation.DateTimeFormat;
import play.db.ebean.*;
import play.data.format.Formats;
import play.data.validation.Constraints;


@Entity
public class Recurso extends Model {
	private static final long serialVersionUID = 1L;
	@Id
    public Long id;
	@Constraints.Required

	@NotNull
	@Size(max=150)
    public String titulo;
    
	@NotNull
	@Constraints.Required
    @ManyToOne
    public Areaconocimiento areaconocimiento;
    
	@NotNull
	@Constraints.Required
    @ManyToOne
    @JoinColumn(name="niveleducativo_id")
    public Niveleducativo niveleducativo;    
	
	@ManyToOne
	public UnidadMedida unidadmedida;
	
	@Size(max=5)
    public String duracion;    
    
    @NotNull
	@Constraints.Required
    @ManyToOne
    public Unidadacademica unidadacademica;
    
    
    @ManyToOne
    public AlcanceCurricular alcancecurricular;
    
    @Size(max=120)
    public String alcancecurricularotro;    

    @NotNull
    @Constraints.Required
    @Formats.DateTime(pattern="yyyy-MM-dd")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    public Date elaboracion;    
    
    @NotNull
    @Constraints.Required
    @Size(max=80)
    public String programaacad;    
    
    @NotNull
	@Constraints.Required
    @ManyToOne
    public Modalidad modalidad;
    
    @NotNull
	@Constraints.Required
    @ManyToOne
    public Version version;
    
    @OneToOne(mappedBy="recurso", cascade=CascadeType.ALL)
    public Versionanterior versionanterior;
    
    
    @Size(max=250)
    public String sinopsis;
    
    


    @NotNull
	@Constraints.Required
    @ManyToOne
    public Formatoentrega formatoentrega;  
    
    @Size(max=100)
    public String formatoentregaotro;
        
    @Size(max=80)
    public String url;

    @ManyToOne
    public Estado estado;
	
	@Column(unique=true)
	public String numcontrol;

	@CreatedTimestamp
    public Date auditinsert;
	@UpdatedTimestamp
    public Date auditlastupdate;
    
    
    
    
    @OneToMany(mappedBy="recurso", cascade=CascadeType.ALL)
    public List<Palabraclave> palabrasclave;    

    @OneToMany(mappedBy="recurso", cascade=CascadeType.ALL)
    public List<Recursoenweb> recursosenweb;    
    
    
	@OneToMany(mappedBy="recurso", cascade=CascadeType.ALL)
	public List<RecursoAutor> autores;

	
    
	@OneToMany(mappedBy="recurso", cascade=CascadeType.ALL)
	public List<Documento> documentos;    
	
	
	@OneToMany(mappedBy="recurso", cascade=CascadeType.ALL)
	public List<Observacion> observaciones;

	@OneToOne(mappedBy="recurso", cascade=CascadeType.ALL)
	public Oficio oficio;	
	
	@OneToOne(mappedBy="recurso", cascade=CascadeType.ALL)
	public OficioValoracion oficiovaloracion;	
    
    @OneToMany(mappedBy="recurso", cascade=CascadeType.ALL)
    public List<Historialestado> historialestados;

    @OneToMany(mappedBy="recurso", cascade=CascadeType.ALL)
    public List<HistorialestadoEvaluacion> historialestadoevaluaciones;
    
    @OneToMany(mappedBy="recurso", cascade=CascadeType.ALL)
    public List<HistorialestadoEncuesta> historialestadoencuesta;
       
    
    @OneToOne(mappedBy="recurso", cascade=CascadeType.ALL)
    public Clasificacion clasificacion;
	
    @OneToMany(mappedBy="recurso", cascade=CascadeType.ALL)
    public List<Recursoevaluador> recursoevaluadores;

    @OneToOne(mappedBy="recurso", cascade=CascadeType.ALL)
    public EvaluacionFecha evaluacionFecha;

    
    @OneToMany(mappedBy="recurso", cascade=CascadeType.ALL)
    public List<recursoDirigidoa> dirigidoa;    
    
    
    @OneToMany(mappedBy="recurso", cascade=CascadeType.ALL)
    public List<SolicitudCancelacion> solicitudescancelacion;  
    
    @OneToOne(mappedBy="recurso", cascade=CascadeType.ALL)
    public ObservacionCancelacion observacioncancelacion;


    @OneToOne(mappedBy="recurso", cascade=CascadeType.ALL, orphanRemoval = true)
    public RecursoCalificacion calificacion;


    @OneToMany(mappedBy="recurso", cascade=CascadeType.ALL)
    public List<RecursoCalificacionA> calificacionesAspectos;

    @OneToOne(mappedBy="recurso", cascade=CascadeType.ALL)
    public EncuestaRespuesta encuesta;
    
    public static Finder<Long,Recurso> find = new Finder<Long,Recurso>(Long.class, Recurso.class);
    
    public static Page<Recurso> page(int page, int pageSize, String sortBy, String order, String filter, String campoFiltro) {
        System.out.println("desde el modelo Recurso: ");
        System.out.println("pageSize:"+pageSize+"  sortBy:"+sortBy+"   order:"+order+"  Filter:"+filter+"       campoFiltro:"+campoFiltro);

		Query<Recurso> busqueda = find.where()
                .ilike(campoFiltro, "%" + filter + "%")
                
                .orderBy(sortBy + " " + order);
		Page<Recurso> r = busqueda
                .findPagingList(pageSize)
                
                .getPage(page);
        System.out.println("tam:"+  r.getTotalRowCount() );
        return  r;
    }    

    public static Map<String,String> options() {
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(Recurso c: Recurso.find.orderBy("titulo").findList()) {
            options.put(c.id.toString(), c.titulo);
        }
        return options;
    }     

    public static Map<String,String> optionsSoloActualizaciones() {
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        // Los recursos que son actualización, pero que no están en la tabla de Versionanterior
        List<Recurso> rs2 = Recurso.find.where().eq("version.id", 2L).eq("versionanterior", null).orderBy("numcontrol").findList();       
        for(Recurso c: rs2 ) {
            options.put(c.id.toString(), c.numcontrol+" "+c.titulo);
        }
        return options;
    }     

    public  RecursoAutor getResponsable(){
    	RecursoAutor retorno = null;
    	for (RecursoAutor x : this.autores){
    		if (x.autorfuncion.id == 1){
    			retorno = x;
    		}
    	}	
		return  retorno;
    }
    
    
    public static Recurso searchByNumControl(String nc){    	
		return Recurso.find.where().eq("numcontrol", nc).findUnique();    	
    }

    public  String calificacionLetraGral(){
		String cadena ="";
        float total = this.calificacion.calificacion;
    	if (  total >= 96)
    		cadena = "Excelente";
    	if (total >= 86 && total <= 95 )
    		cadena = "Bueno";
    	if ( (total >=80) && (total <=85))
    		cadena = "Regular";
    	if (total<= 79)
    		cadena = "No aprobatorio";
		return cadena;    	
    }
    
    public String  ncLetras(){
    	String cadena = "";
    	for (int x = 0; x<=this.numcontrol.length()-1;x++){
    		String aux = this.numcontrol.substring(x, x+1);    		
    		if (  aux.matches("[0-9]") ){
    			switch(Integer.parseInt(aux)){
	    			case 0: cadena+="cero-"; break;
	    			case 1: cadena+="uno-"; break;
	    			case 2: cadena+="dos-"; break;
	    			case 3: cadena+="tres-"; break;
	    			case 4: cadena+="cuatro-"; break;
	    			case 5: cadena+="cinco-"; break;
	    			case 6: cadena+="seis-"; break;
	    			case 7: cadena+="siete-"; break;
	    			case 8: cadena+="ocho-"; break;
	    			case 9: cadena+="nueve-"; break;
    			} 
    		} else {
    			cadena+=aux+"-";
    		}
    	}
    	return cadena.substring(0, cadena.lastIndexOf('-'));
    }

    // Este método es temporal, para calificar los recursos que ya estaban en la db
    public void Calificar(){
        /*
        RecursoCalificacion rCal = new RecursoCalificacion();
        rCal.recurso = this;
        float calGeneral = 0;
        for (Recursoevaluador res :  this.recursoevaluadores  ){
            int acum = 0;
            int numNA = 0;
            int nreactivosAspecto = 0;
            nreactivosAspecto = res.evaluaciones.size();
            System.out.println("\n\ncalMaxima "+nreactivosAspecto);
            for  ( Evaluacion eva : res.evaluaciones){
                if (eva.respuesta != -1){
                    acum+=eva.respuesta;
                } else {
                    numNA++;
                }
            }
            float cal = ((float) (acum * 25) / ((nreactivosAspecto - numNA) * 2) );
            RecursoCalificacionAspecto rca = new RecursoCalificacionAspecto();
            rca.recursocalificacion = rCal;
            rca.aspecto = res.aspecto;
            // Se redondea a 1 decimal
            rca.calificacion = (float) (Math.round(cal * 10.0) / 10.0);
            calGeneral+=rca.calificacion;
            rCal.calificacionesAspectos.add(rca);
        }
        rCal.calificacion = calGeneral;
        this.calificacion = rCal;

        // Si la calificación general es igual o mayor a 96, se agrega el id del recurso a la tabla Polimedia
        if (  this.calificacion.calificacion >= 96 ){
            Polimedia pm = new Polimedia();
            pm.recurso = this;
            pm.save();
        }
        this.update();

         */
    }


    @PreUpdate
    public void preUpdate(){
        //Cuando el estado cambia a 10 (evaulación concluida) se califica, la calificación por aspecctos se guarda en
        // la tabla RecursoCalificacionAspecto y la calificacion general se guarda en RecursoCalificación
        if (this.estado.id == 10) {
            RecursoCalificacion rCal = new RecursoCalificacion();
            rCal.recurso = this;
            float calGeneral = 0;

            for ( RecursoCalificacionA rcAspecto: this.calificacionesAspectos){
                calGeneral+=rcAspecto.calificacion;
            }
            rCal.calificacion= calGeneral;
            this.calificacion = rCal;

            /*
            for (Recursoevaluador res : this.recursoevaluadores) {
                int acum = 0;
                int numNA = 0;
                int nreactivosAspecto = 0;
                nreactivosAspecto = res.evaluaciones.size();
                System.out.println("\n\ncalMaxima " + nreactivosAspecto);
                for (Evaluacion eva : res.evaluaciones) {
                    if (eva.respuesta != -1) {
                        acum += eva.respuesta;
                    } else {
                        numNA++;
                    }
                    System.out.println("acum " + acum);
                    System.out.println("numNA " + numNA);
                }
                float cal = ((float) (acum * 25) / ((nreactivosAspecto - numNA) * 2));
                System.out.println("cal " + cal);
                RecursoCalificacionAspecto rca = new RecursoCalificacionAspecto();
                rca.recursocalificacion = rCal;
                rca.aspecto = res.aspecto;
                // Se redondea a 1 decimal
                rca.calificacion = (float) (Math.round(cal * 10.0) / 10.0);
                calGeneral += rca.calificacion;
                rCal.calificacionesAspectos.add(rca);
            }
            rCal.calificacion = calGeneral;
            this.calificacion = rCal;
             */

            // Si la calificación general es igual o mayor a 96, se agrega el id del recurso a la tabla Polimedia
            if (this.calificacion.calificacion >= 96) {
                Polimedia pm = new Polimedia();
                pm.recurso = this;
                pm.tipo = Tipo.find.ref(1L);
                pm.save();
            }
        }
    }
}
