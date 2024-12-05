package models;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;
import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

@Entity
public class CoberturaContenido extends Model{

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

    public static Finder<Long, CoberturaContenido> find = new Finder<>(Long.class, CoberturaContenido.class);
	
	
    public static Map<String,String> options() {
        LinkedHashMap<String,String> options = new LinkedHashMap<>();
        for(CoberturaContenido c: CoberturaContenido.find.findList()) {
            options.put(c.id.toString(), c.descripcion);
        }
        return options;
    } 	

}
