package models;

import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import com.avaje.ebean.Page;
import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;

import play.db.ebean.Model;

@Entity
public class EvaluadorAspecto extends Model {
	private static final long serialVersionUID = 1L;

	@Id
	public Long id;
	
	@NotNull
	@ManyToOne
	@Column(name="evaluador")
	public Evaluador evaluador;
	
	@NotNull
	@ManyToOne
	public Aspecto aspecto;
	
	@CreatedTimestamp
    public Date auditinsert;
	@UpdatedTimestamp
    public Date auditlastupdate; 
	


	
	public static Finder<Long,EvaluadorAspecto> find = new Finder<>(Long.class, EvaluadorAspecto.class);

    public static Map<String,String> optionsAspecto( Long numAspecto) {
        LinkedHashMap<String,String> options = new LinkedHashMap<>();
        for(EvaluadorAspecto c: EvaluadorAspecto.find.where().eq("aspecto.id", numAspecto).findList()) {
            options.put(c.evaluador.id.toString(), c.evaluador.personal.nombreCompleto());
        }
        return options;
    }
    

    public static Map<String,String> optionsAspectoActivo( Long numAspecto) {
        LinkedHashMap<String,String> options = new LinkedHashMap<>();
        for(EvaluadorAspecto c: EvaluadorAspecto.find.where().eq("aspecto.id", numAspecto).eq("evaluador.personal.activo.id", 2).findList()) {
            options.put(c.evaluador.id.toString(), c.evaluador.personal.nombreCompleto());
        }
        return options;
    }
    
    
    public static Page<Recurso> page(int page, int pageSize, String sortBy, String order, String filter, String campoFiltro) {  
        return 
        	Recurso.        		
            find.where()
            	.in("estado.id", Arrays.asList(6,7,8,9))
                .ilike(campoFiltro, "%" + filter + "%")
                .orderBy(sortBy + " " + order)
                .findPagingList(pageSize)
                .setFetchAhead(false)
                .getPage(page);
    }     
}
