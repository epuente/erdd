package models;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;
import play.db.ebean.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class EvaluadorFirma extends Model {
    private static final long serialVersionUID = 1L;

    @Id
    public Long id;

    @OneToOne (cascade=CascadeType.ALL)
    public Evaluador evaluador;

    public String nombrearchivo;

    public String contenttype;

    @Lob
    public byte[] contenido;

    @CreatedTimestamp
    public Date auditinsert;
    @UpdatedTimestamp
    public Date auditlastupdate;

    public static play.db.ebean.Model.Finder<Long,EvaluadorFirma> find = new Finder<>(Long.class, EvaluadorFirma.class);

}



