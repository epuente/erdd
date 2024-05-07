package models.polimedia;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;
import play.db.ebean.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class PolimediaArchivo extends Model {
    private static final long serialVersionUID = 1L;
    @Id
    public Long id;

    @ManyToOne
    public Polimedia polimedia;

    @Column(length = 200)
    public String nombreArchivo;

    public String contenttype;
    @Lob
    public byte[] contenido;

    @CreatedTimestamp
    public Date auditinsert;
    @UpdatedTimestamp
    public Date auditlastupdate;

    public static Model.Finder<Long, PolimediaArchivo> find = new Model.Finder<>(Long.class, PolimediaArchivo.class);


}
