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
public class Evaluador extends Model{
	private static final long serialVersionUID = 1L;

	@Id
    public Long id;

	@OneToOne
	public Personal personal;
	@CreatedTimestamp
    public Date auditinsert;
	@UpdatedTimestamp
    public Date auditlastupdate; 
    
	@NotNull
	@OneToMany (mappedBy="evaluador", cascade=CascadeType.ALL)	
	public List<EvaluadorAspecto> evaluadoraspectos;
    
    public static play.db.ebean.Model.Finder<Long,Evaluador> find = new Finder<Long,Evaluador>(Long.class, Evaluador.class);
    
    public static Usuario getUsuario(Long idEvaluador){
       Evaluador e = Evaluador.find.byId(idEvaluador);    	
       return  Usuario.find.where().eq("personal.id", e.personal.id).findUnique();
    	
    }

}
