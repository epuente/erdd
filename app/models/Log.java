package models;

import java.util.Date;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;

public  class Log {

	public String tipo;
	public Recurso recurso;
	
	public Estado estado;
    public EstadoEvaluacion estadoevaluacion;
    public EstadoEncuesta estadoencuesta;
	
	@CreatedTimestamp
    public Date auditinsert;
	@UpdatedTimestamp
    public Date auditlastupdate; 


    
}
