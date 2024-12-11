package models;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;

import play.data.validation.Constraints.MaxLength;
import play.db.ebean.Model;

@Entity
public class ClasificadorCatalogoCriterio3 extends Model{
	private static final long serialVersionUID = 1L;
	
	@Id
	public Long id;
	public String descripcion;
	
    @MaxLength(600)
    @Size(max=600)
	public String informacion;
    
	@CreatedTimestamp
    public Date auditinsert;
	@UpdatedTimestamp
    public Date auditlastupdate; 
	
	public static play.db.ebean.Model.Finder<Long,ClasificadorCatalogoCriterio3> find = new Finder<>(Long.class, ClasificadorCatalogoCriterio3.class);
	
	
	
}
