package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;

import play.db.ebean.Model;

@Entity
public class EncuestaObservacion extends Model{
	private static final long serialVersionUID = 1L;

	@Id
	public Long id;
	
	@ManyToOne
	public EncuestaRespuesta encuesta;
	
	@NotNull	
	public String respuesta;
	
	@NotNull
	@Size(max=600)
	public String descripcion;
	
	@CreatedTimestamp
    public Date auditinsert;
	@UpdatedTimestamp
    public Date auditlastupdate; 
    
    public static Finder<Long,EncuestaObservacion> find = new Finder<Long,EncuestaObservacion>(Long.class, EncuestaObservacion.class); 

}
