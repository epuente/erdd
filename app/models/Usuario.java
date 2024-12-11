package models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;

import play.db.ebean.Model;

@Entity
public class Usuario extends Model {
    private static final long serialVersionUID = 1L;
	@Id
    public Long id;	
	
	@OneToOne
	public Personal personal;
	
	@NotNull
    public String usuario;
	@NotNull
	public String password;	

	@OneToMany(mappedBy="usuario", cascade=CascadeType.ALL)
	public List<UsuarioRol> roles;
	
	
	@CreatedTimestamp
    public Date auditinsert;
	@UpdatedTimestamp
    public Date auditlastupdate; 

    @OneToMany(mappedBy="usuario", cascade=CascadeType.ALL)
    public List<RegistroAcceso> registrosaccesos;

	public static Model.Finder<String,Usuario> find = new Model.Finder<>(String.class, Usuario.class);
	
	public static Usuario autenticar(String usuario, String password) {		
        return find.where().eq("usuario", usuario)
            .eq("password", password).findUnique();
    }
	
}
