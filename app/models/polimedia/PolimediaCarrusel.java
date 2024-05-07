package models.polimedia;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;
import org.joda.time.DateTime;
import org.joda.time.DateTimeComparator;
import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class PolimediaCarrusel extends Model {
    private static final long serialVersionUID = 1L;
    @Id
    public Long id;

    @OneToOne
    public Polimedia polimedia;

    public String nombreArchivo;
    public String liga;
    @Constraints.Required
    public int posicion;

    @Transient
    public DateTime hoy;
    public Date inicio;
    public Date fin;

    @OneToOne(mappedBy = "polimediacarrusel", orphanRemoval = true, cascade = CascadeType.ALL)
    public PolimediaCarruselImagen imagen;


    @CreatedTimestamp
    public Date auditinsert;
    @UpdatedTimestamp
    public Date auditlastupdate;


    public static Model.Finder<Long, PolimediaCarrusel> find = new Model.Finder<>(Long.class, PolimediaCarrusel.class);

    public PolimediaCarrusel() {
        this.hoy = new DateTime();
    }


    public boolean estaVigente(){
        DateTimeComparator dateTimeComparator = DateTimeComparator.getDateOnlyInstance();
        int v = dateTimeComparator.compare(this.fin, hoy);
        return v>=0;
    }




}
