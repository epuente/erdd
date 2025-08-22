package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;


@Entity
public class EvaluacionObservacion extends Model {
	private static final long serialVersionUID = 1L;
	
	@Id
	public Long id;
	
	@OneToOne	
	public Evaluacion respuesta;
	
	@Required
	@NotNull
    @Size(max=2000)
	public String Observacion;
	
	
	@CreatedTimestamp
    public Date auditinsert;
	@UpdatedTimestamp
    public Date auditlastupdate;    

    public static Finder<Long,EvaluacionObservacion> find = new Finder<>(Long.class, EvaluacionObservacion.class);


    public String saltoHTML(){
        return "jejejej";
    }

    @PrePersist
    public void prePersist(){
        // Cambia los saltos de línea a la cadena [saltoDeLinea]
        Observacion = Observacion.replaceAll("\\r\\n", "[saltoDeLinea]");
    }

}
