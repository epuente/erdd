package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;

import play.db.ebean.Model;

@Entity
public class Calendario extends Model{
	private static final long serialVersionUID = 1L;
	
	@Id
	public Long id;
	
	public String descripcion;
	
	public Date desde;
	public Date hasta;
	
	@CreatedTimestamp
    public Date auditinsert;
	@UpdatedTimestamp
    public Date auditlastupdate; 	
	
	public static Finder<Long,Calendario> find = new Finder<Long,Calendario>(Long.class, Calendario.class);

}
