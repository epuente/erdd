package models;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import com.avaje.ebean.Page;
import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;

import play.data.validation.Constraints.MaxLength;
import play.db.ebean.Model;

@Entity
public class EvaluacionTablaReactivo extends Model {
	private static final long serialVersionUID = 1L;	
	@Id
	public Long id;
	
    @MaxLength(600)
    @Size(max=600)
	public String descripcion;
	
	@CreatedTimestamp
    public Date auditinsert;
	@UpdatedTimestamp
    public Date auditlastupdate; 
    
	public static Model.Finder<Long,EvaluacionTablaReactivo> find = new Model.Finder<>(Long.class, EvaluacionTablaReactivo.class);
	
    public static Page<EvaluacionTablaReactivo> page(int page, int pageSize, String sortBy, String order, String filter) {
        return 
            find.where()
                .ilike("descripcion", "%" + filter + "%")
                .orderBy(sortBy + " " + order)
                .findPagingList(pageSize)
                .setFetchAhead(false)
                .getPage(page);
    } 	
}



