package models;


import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.validation.Constraints;
import play.db.ebean.Model;

import com.avaje.ebean.Page;
import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;

@Entity
public class Formatoentrega extends Model {
	
	private static final long serialVersionUID = 1L;

	@Id
    public Long id;
	
    @Constraints.Required
    public String descripcion;	

	@CreatedTimestamp
    public Date auditinsert;
	@UpdatedTimestamp
    public Date auditlastupdate; 
    
    public static Finder<Long,Formatoentrega> find = new Finder<Long,Formatoentrega>(Long.class, Formatoentrega.class);     

    public static  List<Formatoentrega> lista(){
    	return Formatoentrega.find.select("id, descripcion").findList();  
    }
    
    public static Page<Formatoentrega> page(int page, int pageSize, String sortBy, String order, String filter) {
        return 
            find.where()
                .ilike("descripcion", "%" + filter + "%")
                .orderBy(sortBy + " " + order)
                .findPagingList(pageSize)
                .setFetchAhead(false)
                .getPage(page);
    }    
    
    public static Map<String,String> options() {
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(Formatoentrega c: Formatoentrega.find.orderBy("id").findList()) {
            options.put(c.id.toString(), c.descripcion);
        }
        return options;
    }	

}
