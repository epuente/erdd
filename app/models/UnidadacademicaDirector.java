package models;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;
import play.db.ebean.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class UnidadacademicaDirector extends Model {
    private static final long serialVersionUID = 1L;
    @Id
    public Long id;

    @ManyToOne
    public Unidadacademica unidadacademica;

    public String paterno;

    public String materno;

    public String nombre;

    public String genero;

    public String titulo;

    @CreatedTimestamp
    public Date auditinsert;
    @UpdatedTimestamp
    public Date auditlastupdate;

    public String nombreConTitulo(){
        return titulo+" "+nombreCompleto();
    }

    public String nombreCompleto(){
        return nombre+" "+paterno+" "+materno;
    }

    public static Finder<Long,UnidadacademicaDirector> find = new Finder<>(Long.class, UnidadacademicaDirector.class);

}
