package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;

import play.db.ebean.Model;

@Entity
public class ClasificadorCriterio3Ejemplo extends Model{	
	private static final long serialVersionUID = 1L;
	
	@Id
	public Long id;

	@ManyToOne
	public ClasificadorCriterio3 criterio3;
	
	@ManyToOne
	public ClasificadorTiporecurso tiporecurso;
	/*
	public String descripcion;
	*/
	@CreatedTimestamp
    public Date auditinsert;
	@UpdatedTimestamp
    public Date auditlastupdate; 
	
	public static Finder<Long,ClasificadorCriterio3Ejemplo> find = new Finder<>(Long.class, ClasificadorCriterio3Ejemplo.class);
		
}
