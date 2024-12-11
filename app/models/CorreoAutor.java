package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;

import play.data.validation.Constraints.Email;
import play.data.validation.Constraints.Required;
import play.db.ebean.Model;





import javax.validation.constraints.Size;




@Entity
public class CorreoAutor extends Model{
	private static final long serialVersionUID = 1L;
	
	@Id	
	public Long id;
	
	@Required
	@OneToOne
	public RecursoAutor autor;
	
	@Email
    @Size(max=50)
	public String email;
	
	
    @Size(max=5)
	public String telefono;


	@CreatedTimestamp
    public Date auditinsert;
	@UpdatedTimestamp
    public Date auditlastupdate; 

    
    
    public static Finder<Long,CorreoAutor> find = new Finder<>(Long.class, CorreoAutor.class);
    
}
