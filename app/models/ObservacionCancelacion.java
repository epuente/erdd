package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Entity
public class ObservacionCancelacion extends Model{
	private static final long serialVersionUID = 1L;
	
	@Id
	public Long id;
	
	@OneToOne
	public Recurso recurso;
	
	@Required
	@NotNull
    @Size(max=600)	
	public String observacion;
	
	@CreatedTimestamp
    public Date auditinsert;
	@UpdatedTimestamp
    public Date auditlastupdate; 
	
	public static Finder<Long,ObservacionCancelacion> find = new Finder<>(Long.class, ObservacionCancelacion.class);
}
