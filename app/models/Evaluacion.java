package models;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;

import play.db.ebean.Model;

@Entity
public class Evaluacion extends Model{
	private static final long serialVersionUID = 1L;
	
	@Id
	public Long id;
	
	@ManyToOne
	public Recursoevaluador recursoevaluador;
	
	@ManyToOne
	@NotNull
	public EvaluacionTabla evaluaciontabla;
	
	
	@NotNull
	public Integer respuesta;
	
	@CreatedTimestamp
    public Date auditinsert;
	@UpdatedTimestamp
    public Date auditlastupdate;  

    public static Finder<Long,Evaluacion> find = new Finder<Long,Evaluacion>(Long.class, Evaluacion.class);  	
	
	@OneToOne (mappedBy="respuesta",  cascade=CascadeType.ALL)
	public EvaluacionObservacion observacion;

}
