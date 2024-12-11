package models;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Entity
public class Tipodocumento extends Model{
	private static final long serialVersionUID = 1L;
	
	@Id
	public Long id;
	
	@Required
	public String descripcion;
	@ManyToOne	
	public EstadoActivo estado;	
	public Integer obligatorio; 
	@CreatedTimestamp
    public Date auditinsert;
	@UpdatedTimestamp
    public Date auditlastupdate; 	
	
    public static play.db.ebean.Model.Finder<Long,Tipodocumento> find = new Finder<>(Long.class, Tipodocumento.class);
	
    public static Map<String,String> optionsActivas() {
        LinkedHashMap<String,String> options = new LinkedHashMap<>();
        for(Tipodocumento c: Tipodocumento.find.where().ne("estado.id", 1).orderBy("descripcion").findList()) {
            options.put(c.id.toString(), c.descripcion);
        }
        return options;
    }	
	
	
}
