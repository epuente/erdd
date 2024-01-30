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
public class ClasificadorTiporecurso extends Model{
	private static final long serialVersionUID = 1L;
	
	@Id
	public Long id;
	
	public String descripcion;
	
	@CreatedTimestamp
    public Date auditinsert;
	@UpdatedTimestamp
    public Date auditlastupdate; 	
	
	public static Finder<Long,ClasificadorTiporecurso> find = new Finder<Long,ClasificadorTiporecurso>(Long.class, ClasificadorTiporecurso.class);	

    public static Map<String,String> options() {
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        //for(ClasificadorTiporecurso c: ClasificadorTiporecurso.find.orderBy("descripcion").findList()) {        
        for(ClasificadorEjemplo c: ClasificadorEjemplo.find.where().ne("criterio1.id", 2).findList()   ) {
            options.put(c.tiporecurso.id.toString(), c.tiporecurso.descripcion);
        }
        return options;
    }	
	
}
