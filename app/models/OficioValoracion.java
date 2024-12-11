package models;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;

import play.db.ebean.Model;

@Entity
public class OficioValoracion extends Model {
    private static final long serialVersionUID = 1L;
    
	@Id
	public Long id;
	
	@OneToOne
	public Recurso recurso;
	
	@NotNull
	public String numero;
	
	public String contenttype;	

	@Lob
	public byte[] contenido;
	
	public String nombrearchivo;
	

	public Date fechaoficio;	

	
	@CreatedTimestamp
    public Date auditinsert;
	@UpdatedTimestamp
    public Date auditlastupdate; 
	
    
    
    public static Finder<Long,OficioValoracion> find = new Finder<>(Long.class, OficioValoracion.class);
    
    public static OficioValoracion searchByRecurso(Long recurso){
        return find.where().eq("recurso_id", recurso).findUnique();
    }      
}
