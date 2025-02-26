package models;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;
import play.db.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class OficiovaloracionFormatoLeyenda extends Model {
    private static final long serialVersionUID = 1L;
    @Id
    public Long id;

    @OneToOne
    public OficiovaloracionFormato oficiovaloracionformato;

    @Column(length = 150)
    String leyenda;

    @CreatedTimestamp
    public Date auditinsert;
    @UpdatedTimestamp
    public Date auditlastupdate;



    public static Finder<Long,OficiovaloracionFormatoLeyenda> find = new Finder<>(Long.class, OficiovaloracionFormatoLeyenda.class);

}
