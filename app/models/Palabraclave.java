package models;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;

import play.data.validation.Constraints;
import play.db.ebean.Model;


import javax.validation.constraints.Size;

@Entity
public class Palabraclave extends Model {
	private static final long serialVersionUID = 1L;
	@Id
    public Long id;
	
	@ManyToOne
	public Recurso recurso;
	
    @Constraints.Required
    @Size(max=35)
    public String descripcion;
    
	@CreatedTimestamp
    public Date auditinsert;
	@UpdatedTimestamp
    public Date auditlastupdate;     
    

    public static Finder<Long,Palabraclave> find = new Finder<Long,Palabraclave>(Long.class, Palabraclave.class);     

    public static Map<String,String> options() {
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(Palabraclave c: Palabraclave.find.orderBy("id").findList()) {
            options.put(c.id.toString(), c.descripcion);
        }
        return options;
    }    
    
    
    public static List<Palabraclave> searchByRecurso(Long recurso){
    	
        return find.where().eq("recurso_id",recurso).findList();
        		
        		
        		
    }    
    
    
}
