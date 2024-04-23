package models.polimedia;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

@Entity
public class PolimediaCarruselImagen extends Model {
    private static final long serialVersionUID = 1L;
    @Id
    public Long id;

    @OneToOne
    public PolimediaCarrusel polimediacarrusel;

    public String contenttype;
    @Lob
    public byte[] contenido;
}
