package models;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;

import play.data.validation.Constraints.MaxLength;
import play.db.ebean.Model;

@Entity
public class ClasificadorCriterio2 extends Model{
	private static final long serialVersionUID = 1L;
	
	@Id
	public Long id;
	@ManyToOne
	public ClasificadorCriterio1 criterio1;
	public String descripcion;
	
    @MaxLength(600)
    @Size(max=600)
	public String informacion;
    
	@CreatedTimestamp
    public Date auditinsert;
	@UpdatedTimestamp
    public Date auditlastupdate; 
	
	public static play.db.ebean.Model.Finder<Long,ClasificadorCriterio2> find = new Finder<>(Long.class, ClasificadorCriterio2.class);
	
    public static Map<String,String> options(Long c1) {
        LinkedHashMap<String,String> options = new LinkedHashMap<>();
        for(ClasificadorCriterio2 c: ClasificadorCriterio2.find.where().eq("criterio1_id", 2L).orderBy("descripcion").findList()) {
            options.put(c.id.toString(), c.descripcion);
        }
        return options;
    }	
}
