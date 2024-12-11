package models;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Id;
import com.avaje.ebean.annotation.CreatedTimestamp;

import play.data.validation.Constraints;
import play.db.ebean.Model;

@Entity
public class UnidadMedida extends Model{

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
	
	@CreatedTimestamp
    public Date auditlastupdate;    

    public static Finder<Long,UnidadMedida> find = new Finder<>(Long.class, UnidadMedida.class);
    
    
    public static Map<String,String> options() {
        LinkedHashMap<String,String> options = new LinkedHashMap<>();
        for(UnidadMedida c: UnidadMedida.find.findList()) {
            options.put(c.id.toString(), c.descripcion);
        }
        return options;
    }    
}
