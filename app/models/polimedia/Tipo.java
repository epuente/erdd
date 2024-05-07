package models.polimedia;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;
import play.db.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Tipo extends Model {
    private static final long serialVersionUID = 1L;
    @Id
    public Long id;

    @Column(nullable = false)
    public String descripcion;

    @CreatedTimestamp
    public Date auditinsert;
    @UpdatedTimestamp
    public Date auditlastupdate;

    public static Model.Finder<Long, Tipo> find = new Model.Finder<>(Long.class, Tipo.class);


}
