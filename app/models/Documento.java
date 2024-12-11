package models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Entity
public class Documento extends Model {
    private static final long serialVersionUID = 1L;
    
	@Id
	public Long id;
	
	@Required
	@ManyToOne
	public Recurso recurso;
	
	@Required
	@ManyToOne
	public Tipodocumento tipodocumento;
	
	public String nombrearchivo;
	
	public String contenttype;
	
	@Lob
	public byte[] contenido;

	
	
    
	@CreatedTimestamp
    public Date auditinsert;
	@UpdatedTimestamp
    public Date auditlastupdate; 
	
    
    
    public static Finder<Long,Documento> find = new Finder<>(Long.class, Documento.class);
    
    public static List<Documento> searchByRecurso(Long recurso){
    	
        return find.where().eq("recurso_id", recurso).findList();
    }      
}
