package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;

import play.db.ebean.Model;

@Entity
public class EncuestaReactivo extends Model{
	private static final long serialVersionUID = 1L;
	
	@Id
	public Long id;
	
	public Long numreactivo;
	
	public String reactivo;
	
	@CreatedTimestamp
    public Date auditinsert;
	@UpdatedTimestamp
    public Date auditlastupdate; 
    
    public static Model.Finder<Long,EncuestaReactivo> find = new Model.Finder<>(Long.class, EncuestaReactivo.class);
}
