package models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Entity
public class Observacion extends Model{
	private static final long serialVersionUID = 1L;

	@Id
    public Long id;

	@ManyToOne
	public Recurso recurso;
	
	public String campo;
	@Required
	@NotNull
    @Size(max=600)
	public String observacion;
	
	
	@CreatedTimestamp
    public Date auditinsert;
	@UpdatedTimestamp
    public Date auditlastupdate; 

    public static Finder<Long,Observacion> find = new Finder<>(Long.class, Observacion.class);

    public static List<Observacion> searchByRecurso(Long recurso){
        return find.where().eq("recurso_id",recurso).findList();
    }     
    
    public static Observacion searchByRecursoNombreCampo(Long recurso, String ncampo){
        return find.where().eq("recurso_id",recurso).eq("campo", ncampo).findUnique();
    }     
   
		
}
