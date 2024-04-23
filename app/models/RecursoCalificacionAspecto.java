package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

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
}
