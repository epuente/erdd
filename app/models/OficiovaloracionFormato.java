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
    public String encabezado;

    @Size(max = 500)
    public String asunto;

    @Size(max = 5000)
    public String cuerpo1;

    @Size(max = 5000)
    public String cuerpo2;

    @Size(max = 5000)
    public String cuerpo3;

    @Size(max = 5000)
    public String cuerpo4;

    @Size(max = 5000)
    public String cuerpo5;

    @Size(max = 5000)
    public String despedida;

    @Size(max = 500)
    public String direccionDEV;

    @OneToOne(mappedBy = "oficiovaloracionformato", cascade = CascadeType.ALL)
    OficiovaloracionFormatoLogo imagenFondo;



    @CreatedTimestamp
    public Date auditinsert;
    @UpdatedTimestamp
    public Date auditlastupdate;

    public static Finder<Long,OficiovaloracionFormato> find = new Finder<>(Long.class, OficiovaloracionFormato.class);


}
