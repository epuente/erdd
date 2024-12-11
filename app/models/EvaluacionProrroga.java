package models;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import com.avaje.ebean.Page;
import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;
import com.avaje.ebean.Expr;

import play.db.ebean.Model;

@Entity
public class EvaluacionProrroga extends Model{
	private static final long serialVersionUID = 1L;
	
	@Id
	public Long id;
	
	@ManyToOne
	public Recursoevaluador recursoevaluador;
	
	@NotNull
	public Integer ndias;
	
	@NotNull
	public Date fecha;
	
	public Boolean autorizado;
	
	@CreatedTimestamp
    public Date auditinsert;
	@UpdatedTimestamp
    public Date auditlastupdate;
	
	public static Finder<Long,EvaluacionProrroga> find = new Finder<>(Long.class, EvaluacionProrroga.class);

	
    public static Page<Recursoevaluador> page(int page, int pageSize, String sortBy, String order, String filter, String campoFiltro, int rdioSolicitud) {
System.out.println("desde el modelo Recurso.pageProrroga: ");
System.out.println("pageSize:"+pageSize+"  sortBy:"+sortBy+"   order:"+order+"  Filter:"+filter+"       campoFiltro:"+campoFiltro+"           rdioSolicitud:"+rdioSolicitud);

		Page<Recursoevaluador> r = null;
		
		List<Object> auxTodos = Recursoevaluador.find.where().in("recurso.estado.id", Arrays.asList(6,7,8,9,100)).findIds();
		List<Object> auxConSolicitud = Recursoevaluador.find.fetch("prorrogas").where().in("recurso.estado.id", Arrays.asList(6,7,8,9,100)).ne("prorrogas", null).ne("prorrogas.autorizado", "1").findIds();
		List<Object> auxSinSolicitud = Recursoevaluador.find.where().not(Expr.in("id",auxConSolicitud)).in("recurso.estado.id", Arrays.asList(6,7,8,9,100)).findIds();
		List<Object> auxConProrroga = Recursoevaluador.find.where().in("recurso.estado.id", Arrays.asList(6,7,8,9,100)).ne("prorrogas", null).findIds();
		
		

		
System.out.println("******************");
System.out.println("todos: "+auxTodos.size());
System.out.println("todos: "+auxTodos);
System.out.println("con solicitud: "+auxConSolicitud.size());
System.out.println("sin solicitud: "+auxSinSolicitud.size());
System.out.println("con prórroga: "+auxConProrroga.size());
System.out.println("******************");

	if (!auxTodos.isEmpty()){
		// Todos
		if (rdioSolicitud == -1){
			 r= Recursoevaluador.find.fetch("recurso").where().idIn(auxTodos)
				.orderBy(sortBy + " " + order)
                .findPagingList(pageSize)
                .setFetchAhead(false)
                .getPage(page);				
		}
		// Sin solicitud de prórroga
		if (rdioSolicitud == 0){
			r = Recursoevaluador.find.fetch("recurso").where()
				.in("recurso.estado.id", Arrays.asList(6,7,8,9,100))
				.not( Expr.in("id", auxConSolicitud)   )
		//		.eq("recursoevaluadores", null)
//				.eq("recursoevaluadores.solicitudesprorrogas", null)
				
                .orderBy(sortBy + " " + order)
                .findPagingList(pageSize)
                .setFetchAhead(false)
                .getPage(page);				
		}
		// Con solicitud de prórroga
		if (rdioSolicitud == 1){
			r = Recursoevaluador.find.fetch("recurso").where()					
				.in("recurso.estado.id", Arrays.asList(6,7,8,9,100))
//				.ne("recursoevaluadores", null)
				.ne("prorrogas", null)
				.ne("prorrogas.autorizado", "1")
                .orderBy(sortBy + " " + order)
                .findPagingList(pageSize)
                .setFetchAhead(false)
                .getPage(page);				
		}		
	
		// Recursoevaluador con prórroga solicitada y acepta y/o asignada directamente
		if (rdioSolicitud == 2){
			r = Recursoevaluador.find.fetch("recurso").where()					
				.in("recurso.estado.id", Arrays.asList(6,7,8,9,100))
//				.ne("recursoevaluadores", null)
				.ne("prorrogas", null)
                .orderBy(sortBy + " " + order)
                .findPagingList(pageSize)
                .setFetchAhead(false)
                .getPage(page);				
		}		
		
	}
		

		return r;
    } 	
	
}


