package models.polimedia;

import play.db.ebean.Model;

import javax.persistence.*;

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

    public static Model.Finder<Long, PolimediaCarruselImagen> find = new Model.Finder<>(Long.class, PolimediaCarruselImagen.class);

}
