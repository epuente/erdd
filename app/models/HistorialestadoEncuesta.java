package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;

import play.db.ebean.Model;

@Entity
public class HistorialestadoEncuesta extends Model{
	private static final long serialVersionUID = 1L;
	@Id
    public Long id;	
	
	@NotNull
	@ManyToOne
	public Recurso recurso;
	
	@NotNull
	@ManyToOne
	public EstadoEncuesta estado;

    
	@CreatedTimestamp
    public Date auditinsert;
	@UpdatedTimestamp
    public Date auditlastupdate; 

    
    public static Finder<Long,HistorialestadoEncuesta> find = new Finder<Long,HistorialestadoEncuesta>(Long.class, HistorialestadoEncuesta.class);    
    
    
}
