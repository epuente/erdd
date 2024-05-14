package models;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;
import play.db.ebean.Model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
public class RecursoCalificacion extends Model {
    private static final long serialVersionUID = 1L;

    @Id
    public Long id;

    @OneToOne
    @Column(unique = true)
    public Recurso recurso;

    @NotNull
    public Float calificacion;

    @CreatedTimestamp
    public Date auditinsert;

    @UpdatedTimestamp
    public Date auditlastupdate;
}
