package models;

import java.util.*;

import javax.persistence.*;

import com.avaje.ebean.Page;
import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;

import play.data.validation.Constraints;
import play.db.ebean.Model;


@Entity
public class Unidadacademica extends Model {
	private static final long serialVersionUID = 1L;

	@Id
    public Long id;
	
    @Constraints.Required
    public String nombre;
    
    @OneToMany (mappedBy="unidadacademica", cascade=CascadeType.ALL)
    public List<UnidadacademicaNiveleducativo> niveles;

    @OneToMany (mappedBy="unidadacademica", cascade=CascadeType.ALL)
    public List<UnidadacademicaAreaconocimiento> areas;    
    
	@CreatedTimestamp
    public Date auditinsert;
	@UpdatedTimestamp
    public Date auditlastupdate; 	
    
    
    public static Finder<Long,Unidadacademica> find = new Finder<>(Long.class, Unidadacademica.class);

    public static Page<Unidadacademica> page(int page, int pageSize, String sortBy, String order, String filter) {
        return 
            find.where()
                .ilike("nombre", "%" + filter + "%")
                .orderBy(sortBy + " " + order)
                .findPagingList(pageSize)
                .setFetchAhead(false)
                .getPage(page);
    } 	

    public static Map<String,String> options() {
        LinkedHashMap<String,String> options = new LinkedHashMap<>();
        for(Unidadacademica c: Unidadacademica.find.orderBy("nombre").findList()) {
            options.put(c.id.toString(), c.nombre);
        }
        return options;
    }     
    
    
}
