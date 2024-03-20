package models.polimedia;

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

    @Column(length = 150)
    public String nombreArchivo;

    public String liga;
    @Constraints.Required
    public int posicion;

    public Date caducidad;

    @Lob
    public byte[] contenido;


}
