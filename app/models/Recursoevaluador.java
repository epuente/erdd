package models;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.avaje.ebean.Page;
import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;

import play.db.ebean.Model;

@Entity
public class Recursoevaluador extends Model{
	private static final long serialVersionUID = 1L;
	
	@Id
	public Long id;

	@ManyToOne
	@Column(name="recurso")
	public Recurso recurso;	
	
	@ManyToOne
	public Aspecto aspecto;
	
	@ManyToOne	
	public Evaluador evaluador;
	
	@ManyToOne
	public EstadoEvaluacion estadoevaluacion;
	
	@CreatedTimestamp
    public Date auditinsert;
	@UpdatedTimestamp
    public Date auditlastupdate; 

	@OneToMany(mappedBy="recursoevaluador", cascade =CascadeType.ALL)
	public List<EvaluacionProrroga> prorrogas;	
	
    @OneToMany(mappedBy="recursoevaluador", cascade=CascadeType.ALL)
    public List<Evaluacion> evaluaciones;
	
	
    @OneToOne(mappedBy="recursoevaluador", cascade=CascadeType.ALL)
    public EvaluacionObservacionGral observacionEvaluacion;	

	
	public static   Model.Finder<Long,Recursoevaluador> find = new Model.Finder<Long,Recursoevaluador>(Long.class, Recursoevaluador.class);
		

    public static Page<Recursoevaluador> page(int page, int pageSize, String sortBy, String order, String filter, String campoFiltro) {  
        return 
            find.
            where()
            	.ge("estadoevaluacion.id", 6L).lt("estadoevaluacion.id", 400L).ne("estadoevaluacion.id", 11).ne("estadoevaluacion.id", 12)
            	.in("estadoevaluacion.id",  Arrays.asList(1,2,3,4,5))
            	.eq("evaluador.id", play.mvc.Controller.session("idEvaluador") )            	
                .ilike(campoFiltro, "%" + filter + "%")
                .orderBy(sortBy + " " + order)
                .findPagingList(pageSize)
                .setFetchAhead(false)
                .getPage(page);
    } 	
	
    
    // Regresa true cuando la fecha límite para evaluar ha expirado o cuando la(s) fecha(a) de prórroga(s) ha(n) vencido
    public Boolean fueraDeTiempo(){
    	Boolean vencido = true;
    	Calendar hoy = Calendar.getInstance();
    	hoy.set(Calendar.HOUR_OF_DAY,0);
    	hoy.set(Calendar.MINUTE,0);
    	hoy.set(Calendar.SECOND, 0);
    	hoy.set(Calendar.MILLISECOND, 0);
    	
    	
    	Calendar fecha = Calendar.getInstance();
    	fecha.set(Calendar.HOUR_OF_DAY,0);    	
    	fecha.setTime( this.recurso.evaluacionFecha.fechalimite  );
    	fecha.set(Calendar.HOUR_OF_DAY,0);    	
    	fecha.set(Calendar.MINUTE, 0);
    	fecha.set(Calendar.SECOND, 0);
    	fecha.set(Calendar.MILLISECOND, 0);    	
    	
    	SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd/MM/yyyy mm:ss:ms");

    	if (this.prorrogas.isEmpty()){
System.out.println(this.recurso.titulo+" Sin prórrogas, regresando: "+fecha.before(hoy)+"   "+sdf.format(fecha.getTime())+"     "+ sdf.format(hoy.getTime()));    		
    		return fecha.before(hoy);
    	} else {
	    	
	    	for ( EvaluacionProrroga efp : this.prorrogas ){	
	        	Calendar fechaP = Calendar.getInstance();
	        	fechaP.set(Calendar.HOUR_OF_DAY,0);    	
	        	fechaP.setTime( efp.fecha  );
	        	fechaP.set(Calendar.HOUR_OF_DAY,0);    	
	        	fechaP.set(Calendar.MINUTE, 0);
	        	fechaP.set(Calendar.SECOND, 0);
	        	fechaP.set(Calendar.MILLISECOND, 0); 	    		
				System.out.println("-----------"+  sdf.format(fechaP.getTime())  );
				vencido &= fechaP.before(hoy);
System.out.println("vencido:"+vencido);				
	    	}
System.out.println(this.recurso.titulo+" Con prórrogas, vencido: "+vencido+"      "+ sdf.format(hoy.getTime()));	    	
	    	return vencido;
    	}
    }
    
    
    
    public Float calificacionPorcentajeAspectos(){    	
    	Integer calMaxima = this.evaluaciones.size();
    	Integer acum = 0;
    	Integer numNA = 0;
    	for (Evaluacion rvResp : this.evaluaciones){
    		if (rvResp.respuesta != -1){
    			acum+=rvResp.respuesta;
    		} else {
    			numNA++;
    		}
    	}
System.out.println("acum: "+acum+"   numNA:"+numNA+"     calMaxima:"+calMaxima);    	
		return (float) (  (acum*25) / ((calMaxima - numNA)*2)  );
    }
    
    public Float calificacionPorcentajeAspecto(){
    	Integer calMaxima = this.evaluaciones.size();
    	System.out.println("CALMAXIMA  "+calMaxima);
    	Integer acum = 0;
    	Integer numNA = 0;
System.out.println("\n");

    	for (Evaluacion rvResp : this.evaluaciones){
    		if (rvResp.respuesta != -1){
    			System.out.print("   "+rvResp.respuesta);
    			acum+=rvResp.respuesta;
    		} else {
    			numNA++;
    		}
    	}
System.out.println("\n idRe: "+ this.id);    	
System.out.println(" Acumulado: "+ acum);    	
System.out.println(" (calMaxima - numNA)*2: "+ (calMaxima - numNA)*2);
		return (float) (  (acum*25) / ((calMaxima - numNA)*2)  );
    }    
}