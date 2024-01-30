package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;
import javax.validation.constraints.Size;



@Entity
public class Recursoenweb extends Model{
	
	private static final long serialVersionUID = 1L;

	@Id
    public Long id;
	
	@ManyToOne
	public Recurso recurso;
	
	@Required
    @Size(max=20)
	public String usuario;
	
	@Required
    @Size(max=50)
	public String password;

	@CreatedTimestamp
    public Date auditinsert;
	@UpdatedTimestamp
    public Date auditlastupdate; 


    
    public static Finder<Long,Recursoenweb> find = new Finder<Long,Recursoenweb>(Long.class, Recursoenweb.class);    
	
}
