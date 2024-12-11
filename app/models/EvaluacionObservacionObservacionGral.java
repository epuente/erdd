package models;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Size;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;

import play.data.validation.Constraints.MaxLength;
import play.db.ebean.Model;

@Entity
public class EvaluacionObservacionObservacionGral extends Model {
	private static final long serialVersionUID = 1L;
	
	@Id
	public Long id;
	
	@OneToOne
	public EvaluacionObservacionGral evaluacionobservaciongral;
	
	@MaxLength(900)
	@Size(max=900)
	public String observacion;
	
	@CreatedTimestamp
    public Date auditinsert;
	@UpdatedTimestamp
    public Date auditlastupdate; 	

    public static Finder<Long,EvaluacionObservacionObservacionGral> find = new Finder<>(Long.class, EvaluacionObservacionObservacionGral.class);
}
 