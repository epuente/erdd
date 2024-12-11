package models;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;

import play.db.ebean.Model;

@Entity
public class ClasificadorCriterio1 extends Model{
	private static final long serialVersionUID = 1L;
	
	@Id
	public Long id;
	public String descripcion;
	@CreatedTimestamp
    public Date auditinsert;
	@UpdatedTimestamp
    public Date auditlastupdate; 
	
	public static play.db.ebean.Model.Finder<Long,ClasificadorCriterio1> find = new Finder<>(Long.class, ClasificadorCriterio1.class);
	
	
    public static Map<String,String> options() {
        LinkedHashMap<String,String> options = new LinkedHashMap<>();
        for(ClasificadorCriterio1 c: ClasificadorCriterio1.find.orderBy("descripcion").findList()) {
            options.put(c.id.toString(), c.descripcion);
        }
        return options;
    }		
}
