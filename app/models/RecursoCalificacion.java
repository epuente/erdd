package models;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;
import models.polimedia.Polimedia;
import play.db.ebean.Model;

import javax.persistence.*;
import javax.validation.Constraint;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
public class RecursoCalificacion extends Model {
    private static final long serialVersionUID = 1L;

    @Id
    public Long id;

    @OneToOne
    public Recurso recurso;


    @OneToMany(mappedBy = "recursocalificacion", cascade = CascadeType.ALL)
    @NotNull
    public List<RecursoCalificacionAspecto> calificacionesAspectos;

    @NotNull
    public Float calificacion;

    @CreatedTimestamp
    public Date auditinsert;

    @UpdatedTimestamp
    public Date auditlastupdate;

    // Si el recurso obtuvo calificación de excelente (>=96) se registra en polimedia
    @PostPersist
    void registroPolimedia(){
        if (  this.recurso.calificacionPorcentajeGral() >= 96 ){
            Polimedia pm = new Polimedia();
            pm.recurso = this.recurso;
            pm.save();
            //AQUI ME QUEDÉ
        }
    }

}
