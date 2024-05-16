package models;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;

import play.data.validation.Constraints;
import play.db.ebean.Model;

@Entity
public class Aspecto extends Model {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    public Long id;
	
    @Constraints.Required
	public String descripcion;
	
    @CreatedTimestamp
    public Date auditinsert;
    @UpdatedTimestamp
    public Date auditlastupdate;


    
    public static Model.Finder<Long,Aspecto> find = new Model.Finder<>(Long.class, Aspecto.class);
    
    public static Map<String,String> options() {
        LinkedHashMap<String,String> options = new LinkedHashMap<>();
        for(Aspecto c: Aspecto.find.orderBy("descripcion").findList()) {
            options.put(c.id.toString(), c.descripcion);
        }
        return options;
    }    
    
}
