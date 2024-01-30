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
public class AlcanceCurricular extends Model{

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

    public static Finder<Long,AlcanceCurricular> find = new Finder<Long,AlcanceCurricular>(Long.class, AlcanceCurricular.class);     
	
	
    public static Map<String,String> options() {
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(AlcanceCurricular c: AlcanceCurricular.find.findList()) {
            options.put(c.id.toString(), c.descripcion);
        }
        return options;
    } 	

}
