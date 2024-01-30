package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import com.avaje.ebean.Page;
import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;

import play.db.ebean.Model;

@Entity
public class EvaluacionTabla extends Model{
	private static final long serialVersionUID = 1L;	
	@Id
	public Long id;

	@ManyToOne
	public EvaluacionTablaVersion version;
	
	@ManyToOne
	public EvaluacionTablaReactivo reactivo;
	
	@ManyToOne
	public Aspecto aspecto;
	
	@ManyToOne
	public ClasificadorCriterio1 criterio1;
	
	@ManyToOne
	public ClasificadorCriterio2 criterio2;
	
	@ManyToOne
	public ClasificadorCriterio3 criterio3;
	
	@OneToMany (mappedBy="evaluaciontabla", cascade=CascadeType.ALL)
	public List<EvaluacionTablaTipoRecurso> tiposrecursos;

	
	@CreatedTimestamp
    public Date auditinsert;
	@UpdatedTimestamp
    public Date auditlastupdate; 

	public static Model.Finder<Long,EvaluacionTabla> find = new Model.Finder<Long,EvaluacionTabla>(Long.class, EvaluacionTabla.class);
	
    public static List<EvaluacionTabla> searchByVersionReactivo(Long idVersion, Long idReactivo){
        return find.where().eq("version.id",idVersion).eq("reactivo.id", idReactivo).findList();
    }  	
    
    public static List<EvaluacionTabla> searchByAspecto(Long idRecursoEvaluador){
    	  List<Evaluacion> er = Evaluacion.find.where().eq("recursoevaluador.id", idRecursoEvaluador).findList();
		 ArrayList<Long> arrIds = new ArrayList<Long>();
		 for ( Evaluacion a : er){ 
			 arrIds.add(a.evaluaciontabla.id);
		 }
    	//Encontrar los criterios de la evaluacion que realizó
    	List<EvaluacionTabla> evt = EvaluacionTabla.find.where().idIn(arrIds).findList();
        return evt;
    }      
    
    
    public Boolean existe(){
        if (EvaluacionTabla.find.where()
        		.eq("version.id",this.version.id)
        		.eq("reactivo.id", this.reactivo.id)
        		.eq("aspecto.id",this.aspecto.id)
        		.eq("criterio1.id", this.criterio1.id)
        		.eq("criterio2.id", this.criterio2.id)
        		.eq("criterio3.id", this.criterio3.id)
        		.findList().size() == 0
           ){
        		return false;
        				
        	} else {
        		return true;
        	}
    }		
    
    
    public static Page<EvaluacionTabla> page(int page, int pageSize, String filtro, String columnaOrden, String tipoOrden) {
    	System.out.println(" * * * * * * * * ");    	
    	Page<EvaluacionTabla> p = find
            .where("  reactivo.descripcion like :cadena OR aspecto.descripcion like :cadena")
            .fetch("aspecto")
            .setDistinct(true)
            .setParameter("cadena", "%"+filtro+"%")
                .orderBy( columnaOrden +" "+tipoOrden )
                .findPagingList(pageSize)
                .setFetchAhead(false)
                .getPage(page);


    	System.out.println(" * * * * * * * * registros:"+p.getTotalRowCount());
        return p;
            
    }      
    
}



