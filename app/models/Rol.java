package models;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;

import play.db.ebean.Model;

@Entity
public class Rol extends Model{
    private static final long serialVersionUID = 1L;
	@Id
    public Long id;
	@NotNull
	public String descripcion;
	
	@CreatedTimestamp
    public Date auditinsert;
	@UpdatedTimestamp
    public Date auditlastupdate; 	
	
	public static Finder<Long,Rol> find = new Finder<>(Long.class, Rol.class);
	
    public static Map<String,String> options() {
        LinkedHashMap<String,String> options = new LinkedHashMap<>();
        for(Rol c: Rol.find.orderBy("id").findList()) {
            options.put(c.id.toString(), c.descripcion);
        }
        return options;
    }	

}
