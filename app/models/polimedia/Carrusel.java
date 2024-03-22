package models.polimedia;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;
import models.Aspecto;
import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.validation.Constraint;
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
    public Date inicio;
    public Date fin;
    @Column(length = 100)
    public String titulo;
    public String contenttype;
    @Lob
    public byte[] contenido;
    @CreatedTimestamp
    public Date auditinsert;
    @UpdatedTimestamp
    public Date auditlastupdate;

    public static Model.Finder<Long, Carrusel> find = new Model.Finder<Long,Carrusel>(Long.class, Carrusel.class);
}
