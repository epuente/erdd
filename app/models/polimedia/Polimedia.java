package models.polimedia;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;
import models.Recurso;
import play.db.ebean.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Polimedia extends Model {
    private static final long serialVersionUID = 1L;
    @Id
    public Long id;

    @ManyToOne
    public Recurso recurso;

    @OneToOne(mappedBy = "polimedia", cascade = CascadeType.ALL)
    public PolimediaCarrusel carrusel;


    @CreatedTimestamp
    public Date auditinsert;
    @UpdatedTimestamp
    public Date auditlastupdate;

    public static Model.Finder<Long, Polimedia> find = new Model.Finder<>(Long.class, Polimedia.class);


}
