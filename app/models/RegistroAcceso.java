package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;

import play.data.validation.Constraints;
import play.db.ebean.Model;

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

}
