package models.polimedia;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;
import models.Recurso;
import org.joda.time.DateTime;
import org.joda.time.DateTimeComparator;
import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Carrusel extends Model {
    private static final long serialVersionUID = 1L;
    @Id
    public Long id;
    public String nombreArchivo;
    public String liga;
    @Constraints.Required
    public int posicion;

    @Transient
    public DateTime hoy;
    public Date inicio;
    public Date fin;
    @Column(length = 100)
    public String titulo;
    public String contenttype;
    @Lob
    public byte[] contenido;

    @ManyToOne
    public Recurso recurso;

    @CreatedTimestamp
    public Date auditinsert;
    @UpdatedTimestamp
    public Date auditlastupdate;

    public static Model.Finder<Long, Carrusel> find = new Model.Finder<>(Long.class, Carrusel.class);

    public Carrusel() {
        this.hoy = new DateTime();
    }


    public boolean estaVigente(){
        DateTimeComparator dateTimeComparator = DateTimeComparator.getDateOnlyInstance();
        int v = dateTimeComparator.compare(this.fin, hoy);
        return v>=0;
    }
}
