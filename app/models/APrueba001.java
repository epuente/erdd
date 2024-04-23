package models;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;
import play.Logger;
import play.db.ebean.Model;

import javax.persistence.*;
import java.io.IOException;
import java.util.Date;

@Entity
public class APrueba001 extends Model {
    private static final long serialVersionUID = 1L;

    @Id
    public Long id;

    public String descripcion;

    @CreatedTimestamp
    public Date auditinsert;

    @UpdatedTimestamp
    public Date auditlastupdate;




    @PrePersist
    public void prePersist() throws IOException {
        Logger.warn("PrePersist called");

        RecursoCalificacion rc = new RecursoCalificacion();
        rc.recurso = Recurso.find.byId(4L);
        rc.calificacion = 96.0F;
        rc.save();
    }


     @PostPersist
     public void postPersist() throws IOException {
         Logger.warn("PostPersist called");
     }

    @PreUpdate
    public void preUpdate() throws IOException {
        Logger.warn("PreUpdate called");
    }

    @PostLoad
    public void postLoad() throws IOException {
        Logger.warn("PostLoad called");
    }


}
