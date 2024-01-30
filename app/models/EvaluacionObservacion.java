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
public class EvaluacionObservacion extends Model {
	private static final long serialVersionUID = 1L;
	
	@Id
	public Long id;
	
	@OneToOne	
	public Evaluacion respuesta;
	
	@Required
	@NotNull
    @Size(max=600)
	public String Observacion;
	
	
	@CreatedTimestamp
    public Date auditinsert;
	@UpdatedTimestamp
    public Date auditlastupdate;    

    public static Finder<Long,EvaluacionObservacion> find = new Finder<Long,EvaluacionObservacion>(Long.class, EvaluacionObservacion.class);  	

}
