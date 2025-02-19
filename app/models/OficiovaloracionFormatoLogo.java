package models;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;
import play.db.ebean.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class OficiovaloracionFormatoLogo extends Model {
    private static final long serialVersionUID = 1L;
    @Id
    public Long id;

    @OneToOne
    public OficiovaloracionFormato oficiovaloracionformato;

    public String nombrearchivo;

    public String contenttype;

    @Lob
    public byte[] contenido;

    @CreatedTimestamp
    public Date auditinsert;
    @UpdatedTimestamp
    public Date auditlastupdate;

    public static Finder<Long, OficiovaloracionFormatoLogo> find = new Finder<>(Long.class, OficiovaloracionFormatoLogo.class);

}
