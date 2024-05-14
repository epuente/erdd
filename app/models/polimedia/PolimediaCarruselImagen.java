package models.polimedia;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;
import play.db.ebean.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class PolimediaCarruselImagen extends Model {
    private static final long serialVersionUID = 1L;
    @Id
    public Long id;

    @OneToOne(orphanRemoval = true)
    public PolimediaCarrusel polimediacarrusel;

    public String contenttype;
    @Lob
    public byte[] contenido;

    @CreatedTimestamp
    public Date auditinsert;
    @UpdatedTimestamp
    public Date auditlastupdate;

    public static Model.Finder<Long, PolimediaCarruselImagen> find = new Model.Finder<>(Long.class, PolimediaCarruselImagen.class);

}
