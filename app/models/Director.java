package models;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;
import play.db.ebean.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.Date;

// Se almacena la información de los directores de DEV, EMS, ES y Posgrado
@Entity
public class Director extends Model {
    private static final long serialVersionUID = 1L;

    @Id
    public Long id;

    public String ur;

    public String titulo;
    public String nombre;
    public String paterno;
    public String materno;

    public String genero;

    @OneToOne(mappedBy = "director", cascade= CascadeType.ALL)
    public DirectorFirma firma;

    @CreatedTimestamp
    public Date auditinsert;
    @UpdatedTimestamp
    public Date auditlastupdate;

    public static Finder<Long, Director> find = new Finder<>(Long.class, Director.class);

    public String nombreConTitulo(){
        return titulo+" "+nombreCompleto();
    }

    public String nombreCompleto(){
        return nombre+" "+paterno+" "+materno;
    }

}
