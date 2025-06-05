package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;

import play.db.ebean.Model;

@Entity
public class clasificacionObservacion extends Model{
	private static final long serialVersionUID = 1L;
	
	@Id
	public Long id;
	
	@OneToOne
	public Clasificacion clasificacion;
	
	@NotNull
    @Size(max=600)
	public String observacion;
	
	@CreatedTimestamp
    public Date auditinsert;
	@UpdatedTimestamp
    public Date auditlastupdate; 
	

}
