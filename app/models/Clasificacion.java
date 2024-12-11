package models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Version;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;

import play.db.ebean.Model;

@Entity
public class Clasificacion extends Model{	
	private static final long serialVersionUID = 1L;
	
	@Id
	public Long id;
	
	@OneToOne
	public Recurso recurso;
	
	@ManyToOne
	public ClasificadorCriterio1 criterio1;

	@ManyToOne
	public ClasificadorCriterio2 criterio2;

	@ManyToOne
	public ClasificadorCriterio3 criterio3;
	
	@ManyToOne
	public ClasificadorTiporecurso tiporecurso;
	
	@OneToOne (mappedBy="clasificacion", cascade=CascadeType.ALL)
	public clasificacionObservacion observacion;
	
	@CreatedTimestamp
	public Date auditinsert;
	@Version
	@UpdatedTimestamp
	public Date auditlastupdate;

	public static Finder<Long,Clasificacion> find = new Finder<>(Long.class, Clasificacion.class);
	
	public String nombreCompletoClasificacion(){
		return this.criterio1.descripcion +" / "+ this.criterio2.descripcion +" / "+this.criterio3.catalogo.descripcion;
		
	}
}
