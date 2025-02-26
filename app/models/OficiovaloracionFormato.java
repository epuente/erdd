package models;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;
import play.db.ebean.Model;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Entity
public class OficiovaloracionFormato extends Model {
    private static final long serialVersionUID = 1L;

    @Id
    public Long id;

    @Size(max = 400)
    public String encabezado;

    @OneToMany
    List<OficiovaloracionFormatoLeyenda> leyendas;

    @Size(max = 500)
    public String asunto;

    @Size(max = 5000)
    public String cuerpo;

    @Size(max = 5000)
    public String pie;

    @Size(max = 500)
    public String remitente;

    @OneToOne(mappedBy = "oficiovaloracionformato", cascade = CascadeType.ALL)
    OficiovaloracionFormatoLogo logoEncabezado1;

    @OneToOne(mappedBy = "oficiovaloracionformato", cascade = CascadeType.ALL)
    OficiovaloracionFormatoLogo logoEncabezado2;

    @OneToOne(mappedBy = "oficiovaloracionformato", cascade = CascadeType.ALL)
    OficiovaloracionFormatoLogo logoEncabezado3;

    @OneToOne(mappedBy = "oficiovaloracionformato", cascade = CascadeType.ALL)
    OficiovaloracionFormatoLogo logoPie1;

    @OneToOne(mappedBy = "oficiovaloracionformato", cascade = CascadeType.ALL)
    OficiovaloracionFormatoLogo logoPie2;

    @OneToOne(mappedBy = "oficiovaloracionformato", cascade = CascadeType.ALL)
    OficiovaloracionFormatoLogo logoPie3;

    @CreatedTimestamp
    public Date auditinsert;
    @UpdatedTimestamp
    public Date auditlastupdate;


    public static Finder<Long,OficiovaloracionFormato> find = new Finder<>(Long.class, OficiovaloracionFormato.class);
}
