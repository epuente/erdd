package models;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;
import play.db.ebean.Model;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class OficiovaloracionFormato extends Model {
    private static final long serialVersionUID = 1L;

    @Id
    public Long id;

    @Size(max = 400)
    String encabezado;

    @Size(max = 400)
    String leyenda;

    @Size(max = 400)
    String asunto;

    @Size(max = 5000)
    String cuerpo;

    @Size(max = 400)
    String pie;

    @Size(max = 400)
    String remitente;

    @OneToOne(mappedBy = "oficiovaloracionformato", cascade = CascadeType.ALL)
    OficiovaloracionFormatoLogo logoPie;

    @CreatedTimestamp
    public Date auditinsert;
    @UpdatedTimestamp
    public Date auditlastupdate;
}
