package models;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.PrivateOwned;
import com.avaje.ebean.annotation.UpdatedTimestamp;

import play.db.ebean.Model;

@Entity
public class EvaluacionTablaVersion extends Model {
	private static final long serialVersionUID = 1L;	
	@Id
	public Long id;

	@NotNull
	public Long version;
	
	@Size(max=1)
	public String terminado;
	
	@CreatedTimestamp
    public Date auditinsert;
	@UpdatedTimestamp
    public Date auditlastupdate; 

	public static Model.Finder<Long,EvaluacionTablaVersion> find = new Model.Finder<Long,EvaluacionTablaVersion>(Long.class, EvaluacionTablaVersion.class);
	
	@PrivateOwned
	@OneToMany(mappedBy="version", cascade=CascadeType.ALL)	
	public List<EvaluacionTabla> evaluacionTablas;
	
	/*
	public   List<EvaluacionTabla> numEvaluaciones(){
		return this.evaluacionTablas.stream().filter(f->f.version.version == this.version).collect(Collectors.toList());
	}
	*/
	
	public  int numEvaluacionRespuestas(){
		return Evaluacion.find.where().eq("evaluaciontabla.version.id", this.version).findRowCount();
	}
}
