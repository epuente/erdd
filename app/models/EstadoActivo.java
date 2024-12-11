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
public class EstadoActivo extends Model{

	/**
	 * Indica cuando una entidad esta activa o no, Evaluadores, tipos documentos, etc.
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	public Long id;
	
	public String descripcion;
	
	@CreatedTimestamp
    public Date auditinsert;
	@UpdatedTimestamp
    public Date auditlastupdate; 
    
    
    public static Finder<Long,EstadoActivo> find = new Finder<>(Long.class, EstadoActivo.class);

    public static Map<String,String> options() {
        LinkedHashMap<String,String> options = new LinkedHashMap<>();
        for(EstadoActivo c: EstadoActivo.find.orderBy("id").findList()) {
            options.put(c.id.toString(), c.descripcion);
        }
        return options;
    }    


    
}
