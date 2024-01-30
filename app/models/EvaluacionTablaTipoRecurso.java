package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;

import play.db.ebean.Model;

/*
****************************
LA TABLA SE CREARA ASI


select evaluacion_tabla_tipo_recurso.id, evaluaciontabla_id evaluaciontabla_id, clasificador_criterio3ejemplo.criterio3_id tiporecurso_id, evaluacion_tabla_tipo_recurso.auditinsert, evaluacion_tabla_tipo_recurso.auditlastupdate
from evaluacion_tabla_tipo_recurso inner join clasificador_criterio3ejemplo on criterio3ejemplo_id = clasificador_criterio3ejemplo.id
*/



@Entity
public class EvaluacionTablaTipoRecurso extends Model{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	public Long id;
	
	@ManyToOne
	public EvaluacionTabla evaluaciontabla;
	/*
	@ManyToOne
	public ClasificadorCriterio3Ejemplo criterio3ejemplo;
	*/
	
	
	
	
	

	
	@ManyToOne
	public ClasificadorTiporecurso tiporecurso;

	@CreatedTimestamp
    public Date auditinsert;
	@UpdatedTimestamp
    public Date auditlastupdate; 
	
	public static Model.Finder<Long,EvaluacionTablaTipoRecurso> find = new Model.Finder<Long,EvaluacionTablaTipoRecurso>(Long.class, EvaluacionTablaTipoRecurso.class);	
	

}
