package models;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;
import com.fasterxml.jackson.databind.JsonNode;
import org.json.JSONObject;
import play.db.ebean.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class RegistroAccesoGeo extends Model {
    private static final long serialVersionUID = 1L;
    @Id
    public Long id;

    @OneToOne
    public RegistroAcceso registroacceso;

    // Campo JSON

    @Column(columnDefinition = "JSON")
    @Lob // Para textos largos
    public String propiedades;

    @CreatedTimestamp
    public Date auditinsert;
    @UpdatedTimestamp
    public Date auditlastupdate;

    public static Model.Finder<Long,RegistroAccesoGeo> find = new Model.Finder<>(Long.class, RegistroAccesoGeo.class);

}
