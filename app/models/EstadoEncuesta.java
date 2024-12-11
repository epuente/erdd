package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;

import play.data.validation.Constraints;
import play.db.ebean.Model;

@Entity
public class EstadoEncuesta extends Model {

	private static final long serialVersionUID = 1L;
	
	@Id
	public Long id;
	
    @Constraints.Required
    public String descripcion;	

	@CreatedTimestamp
    public Date auditinsert;
	@UpdatedTimestamp
    public Date auditlastupdate;  

    public static Finder<Long,EstadoEncuesta> find = new Finder<>(Long.class, EstadoEncuesta.class);

}
