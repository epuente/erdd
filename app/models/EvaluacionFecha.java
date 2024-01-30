package models;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;

import play.db.ebean.Model;

@Entity
public class EvaluacionFecha extends Model{
	private static final long serialVersionUID = 1L;
	
	@Id
	public Long id;

	@OneToOne
	public Recurso recurso;
	
	
	public Date fechainicio;	
	public Integer ndias;
	public Date fechalimite;	

	@CreatedTimestamp
    public Date auditinsert;
	@UpdatedTimestamp
    public Date auditlastupdate; 
	

	
	public static Finder<Long,EvaluacionFecha> find = new Finder<Long,EvaluacionFecha>(Long.class, EvaluacionFecha.class);
		
	
	
}
