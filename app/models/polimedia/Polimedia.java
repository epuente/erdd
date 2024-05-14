package models.polimedia;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;
import models.Recurso;
import play.db.ebean.Model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
public class Polimedia extends Model {
    private static final long serialVersionUID = 1L;
    @Id
    public Long id;

    @ManyToOne
    @Column(nullable = false, unique = true)
    public Recurso recurso;

    @NotNull
    public boolean habilitado=false;


    @ManyToOne
    @NotNull
    public Tipo tipo;

    @OneToMany(mappedBy = "polimedia", cascade = CascadeType.ALL)
    public List<PolimediaArchivo> archivos;

    @OneToOne(mappedBy = "polimedia", cascade = CascadeType.ALL)
    public PolimediaUrl polimediaUrl;

    @OneToOne(mappedBy = "polimedia", cascade = CascadeType.ALL, orphanRemoval = true)
    public PolimediaCarrusel carrusel;

    @CreatedTimestamp
    public Date auditinsert;
    @UpdatedTimestamp
    public Date auditlastupdate;

    public static Model.Finder<Long, Polimedia> find = new Model.Finder<>(Long.class, Polimedia.class);


}
