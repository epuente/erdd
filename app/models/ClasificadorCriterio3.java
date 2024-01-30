package models;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;

import play.db.ebean.Model;

@Entity
public class ClasificadorCriterio3 extends Model{
	private static final long serialVersionUID = 1L;
	
	@Id
	public Long id;
	@ManyToOne
	public ClasificadorCriterio1 criterio1;
	@ManyToOne
	public ClasificadorCriterio2 criterio2;	
	@ManyToOne
	public ClasificadorCatalogoCriterio3 catalogo;	
	
	
	@CreatedTimestamp
    public Date auditinsert;
	@UpdatedTimestamp
    public Date auditlastupdate;
	
	@OneToMany (mappedBy="criterio3", cascade=CascadeType.ALL)
	public List<ClasificadorCriterio3Ejemplo> ejemplos;
	
	public static play.db.ebean.Model.Finder<Long,ClasificadorCriterio3> find = new Finder<Long,ClasificadorCriterio3>(Long.class, ClasificadorCriterio3.class);
	
	
    public static Map<String,String> options(Long c1) {
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(ClasificadorCriterio3 c: ClasificadorCriterio3.find.where().eq("criterio1_id", 2L).orderBy("catalogo.descripcion").findList()) {
            options.put(c.id.toString(), c.catalogo.descripcion);
        }
        return options;
    }
}
