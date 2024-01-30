package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;

import play.db.ebean.Model;

@Entity
public class Versionanterior extends Model {
	private static final long serialVersionUID = 1L;
	
	@Id
	public Long id;
	
	@OneToOne
	public Recurso recurso;
	
	@NotNull
	@OneToOne
	public Recurso recursoanterior;
	
	
	@CreatedTimestamp
    public Date auditinsert;
	@UpdatedTimestamp
    public Date auditlastupdate; 

	public static Finder<Long,Versionanterior> find = new Finder<Long,Versionanterior>(Long.class, Versionanterior.class);
	
 	
	
}
