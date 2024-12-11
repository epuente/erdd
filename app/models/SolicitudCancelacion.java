package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;

import play.db.ebean.Model;

@Entity
public class SolicitudCancelacion extends Model{
	private static final long serialVersionUID = 1L;
	
	@Id
	public Long id;
	
	@ManyToOne
	public Recurso recurso;
	
	@ManyToOne
	public Evaluador evaluador;
	
	@ManyToOne
	public Estado recursoestadoanterior;
	
	public String motivoCancelacion;
	public String observacion;
	
	@NotNull
	public Date fechaSolicitud;
	
	public Boolean aceptada;
	public Date fechaAceptacion;
	public Date fechaReactivacion;
	
	@CreatedTimestamp
    public Date auditinsert;
	@UpdatedTimestamp
    public Date auditlastupdate; 
    
    public static Finder<Long,SolicitudCancelacion> find = new Finder<>(Long.class, SolicitudCancelacion.class);
	

}
