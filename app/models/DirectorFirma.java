package models;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;
import play.db.ebean.Model;

import javax.persistence.*;
import java.util.Date;

// Se almacenan las firmas de los directores de DEV, EMS, ES y Posgrado

@Entity
public class DirectorFirma extends Model {
    private static final long serialVersionUID = 1L;

    @Id
    public Long id;

    @OneToOne(cascade= CascadeType.ALL)
    public Director director;

    public String nombrearchivo;

    public String contenttype;

    @Lob
    public byte[] contenido;

    @CreatedTimestamp
    public Date auditinsert;
    @UpdatedTimestamp
    public Date auditlastupdate;

    public static Finder<Long, DirectorFirma> find = new Finder<>(Long.class, DirectorFirma.class);

}
