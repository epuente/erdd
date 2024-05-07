package models;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class RecursoCalificacionAspecto extends Model {
    private static final long serialVersionUID = 1L;

    @Id
    public Long id;

    @ManyToOne
    public RecursoCalificacion recursocalificacion;

    @ManyToOne
    public Aspecto aspecto;

    @NotNull
    public Float calificacion;

    @CreatedTimestamp
    public Date auditinsert;
    @UpdatedTimestamp
    public Date auditlastupdate;
}
