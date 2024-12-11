package models;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;

import play.data.validation.Constraints;
import play.db.ebean.Model;


@Entity
public class Autorfuncion extends Model{
	private static final long serialVersionUID = 1L;

	@Id
    public Long id;
	
    @Constraints.Required
    public String descripcion;
    @CreatedTimestamp
    public Date auditinsert;
    @UpdatedTimestamp
    public Date auditlastupdate;    
    
    public static Finder<Long,Autorfuncion> find = new Finder<>(Long.class, Autorfuncion.class);
    
    public static Map<String,String> options() {
        LinkedHashMap<String,String> options = new LinkedHashMap<>();
        for(Autorfuncion c: Autorfuncion.find.where().ne("id", 1L).orderBy("id").findList()) {
            options.put(c.id.toString(), c.descripcion);
        }
        return options;
    }        

    public static Map<String, Boolean> mapeo(Recurso recurso) {
        Map<String, Boolean> mapeo = new TreeMap<>();
        List <Autorfuncion> afAll = Autorfuncion.find.all();
        for (Autorfuncion af : afAll) {
          mapeo.put(af.descripcion,  true);
        }
        return mapeo;
      }    
    
    
    
}
