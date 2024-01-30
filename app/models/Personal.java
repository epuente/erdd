package models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import com.avaje.ebean.annotation.ConcurrencyMode;
import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.EntityConcurrencyMode;
import com.avaje.ebean.annotation.UpdatedTimestamp;

import play.data.validation.Constraints;
import play.data.validation.Constraints.Email;
import play.db.ebean.Model;

@Entity
@EntityConcurrencyMode(ConcurrencyMode.NONE)
public class Personal extends Model{
	private static final long serialVersionUID = 1L;

	@Id
    public Long id;
	
	@Constraints.Required
	public String nombre;
	@Constraints.Required	
	public String paterno;
	@Constraints.Required	
	public String materno;
	
	@Email
	public String correo;
	
	@ManyToOne
	public EstadoActivo activo;
	
	@OneToOne(mappedBy="personal", cascade=CascadeType.ALL)
	public Usuario usuario;
	

	@OneToOne(mappedBy="personal", cascade=CascadeType.ALL)
	public Evaluador evaluador;
	
	@CreatedTimestamp
    public Date auditinsert;
	@UpdatedTimestamp
    public Date auditlastupdate; 
    
    
    
	public static Finder<Long,Personal> find = new Finder<Long,Personal>(Long.class, Personal.class);    
	
	public static List<Personal> losEvaluadores(){		
		return Personal.find.where().isNotNull("evaluador").orderBy("paterno, materno, nombre").findList();
	}

	public static Personal elAdministrador(){
		return 				
				Personal.find.byId(
						UsuarioRol.find.where().eq("rol_id", "1").findUnique().usuario.personal.id
						);
	}

	public static Personal elCoordinador(){
		return 				
				Personal.find.byId(
						UsuarioRol.find.where().eq("rol_id", "3").findUnique().usuario.personal.id
						);
	}	
	
	
	public String nombreCompleto(){
		return nombre+" "+paterno+" "+materno; 
	}


	public void setNombre(String string) {
		this.nombre = string;
		
	}

	
}
