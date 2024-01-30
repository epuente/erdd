package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;

import play.db.ebean.Model;

@Entity
public class recursoDirigidoa extends Model{
	private static final long serialVersionUID = 1L;

	@Id
	public Long id;	
	
	@OneToOne
	public Recurso recurso;
	
	@ManyToOne
	public Dirigidoa dirigidoa;
	
	@CreatedTimestamp
    public Date auditinsert;
	@UpdatedTimestamp
    public Date auditlastupdate; 
    
    
    
    public static Finder<Long,recursoDirigidoa> find = new Finder<Long,recursoDirigidoa>(Long.class, recursoDirigidoa.class);      
}
