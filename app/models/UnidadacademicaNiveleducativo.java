package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;

import play.db.ebean.Model;

@Entity
public class UnidadacademicaNiveleducativo extends Model {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	public Long id;
	
	@ManyToOne
	public Unidadacademica unidadacademica;
	
	@ManyToOne
	public Niveleducativo nivel;
	
	@CreatedTimestamp
    public Date auditinsert;  
	@UpdatedTimestamp 
    public Date auditlastupdate;	

}
