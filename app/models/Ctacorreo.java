package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;

import play.db.ebean.Model;



@Entity
public class Ctacorreo extends Model{
    private static final long serialVersionUID = 1L;

	@Id
    public Long id;
	
	@NotNull
	public String hostname;
	
    @NotNull
	public String puerto;
	

	public String cuenta;

	public String contrasenia;

    public Boolean activo;

    public  int prioridad;
	

	@CreatedTimestamp
    public Date auditinsert = new Date();
	@UpdatedTimestamp
    public Date auditlastupdate; 	

    public static Model.Finder<Long,Ctacorreo> find = new Model.Finder<>(Long.class, Ctacorreo.class);
	
}
