package models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.Size;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;

import play.data.validation.Constraints;
import play.db.ebean.Model;

@Entity
public class RecursoAutor extends Model{
	private static final long serialVersionUID = 1L;
	
	@Id
	public Long id;
	
	@Constraints.Required
	@ManyToOne
	public Recurso recurso;
	
	@Constraints.Required
	@ManyToOne
	public Autorfuncion autorfuncion;
	
	public String otrafuncion;
	
	@Size(max=35)
	public String paterno;
	@Size(max=35)	
	public String materno;
	@Size(max=40)	
	public String nombre;
	
	
	@OneToOne(mappedBy="autor", cascade=CascadeType.ALL)
	public CorreoAutor correo;

    	

	@CreatedTimestamp
    public Date auditinsert;
	@UpdatedTimestamp
    public Date auditlastupdate; 

    @OneToMany(mappedBy="autor", cascade=CascadeType.ALL)
    public List<RegistroAcceso> registrosaccesos;
    
    public static Finder<Long,RecursoAutor> find = new Finder<Long,RecursoAutor>(Long.class, RecursoAutor.class);
    
    public static List<RecursoAutor> searchByRecurso(Long recurso){    	
    	return find.where("recurso_id ="+ recurso).findList();
    }
    
    public String nombreCompleto(){
    	return this.nombre+" "+this.paterno+" "+this.materno;
    }
    
}
