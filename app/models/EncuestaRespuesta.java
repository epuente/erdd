package models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.Size;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;

import play.db.ebean.Model;

@Entity
public class EncuestaRespuesta extends Model{
	private static final long serialVersionUID = 1L;

	@Id
	public Long id;

	@OneToOne
	@Column(unique=true)
	public Recurso recurso;	

	public String respuesta1;
	
    @Size(max=600)
    public String respuesta1txt;
    
	public String respuesta2;
	
    @Size(max=600)
    public String respuesta2txt;
    
	public String respuesta3;
	
    @Size(max=600)
    public String respuesta3txt;
    
	public String respuesta4;
    
    @Size(max=600)
	public String respuesta4txt;
    
    @Size(max=600)
	public String respuesta5txt;
	
    
    @ManyToOne
    public EstadoEncuesta estado;
    
	@CreatedTimestamp
    public Date auditinsert;
	@UpdatedTimestamp
    public Date auditlastupdate; 
    
    public static Model.Finder<Long,EncuestaRespuesta> find = new Model.Finder<>(Long.class, EncuestaRespuesta.class);

    @OneToMany (mappedBy="encuesta", cascade=CascadeType.ALL)	
    public List<EncuestaObservacion> observaciones; 
}
