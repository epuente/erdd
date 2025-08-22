package classes;

import models.RegistroAccesoGeo;
import play.libs.Json;

import javax.persistence.Column;
import javax.persistence.Lob;
import java.util.Objects;

import com.fasterxml.jackson.databind.JsonNode;

public class AuxGeo {
    public long id;
    public long idRegistro;
    public String ip;

    @Column(columnDefinition = "JSON")
    @Lob // Para textos largos
    public String propiedades;

    public AuxGeo(RegistroAccesoGeo nuevo) {
        JsonNode jn = Json.parse(nuevo.propiedades);
        this.id = nuevo.id;
        this.idRegistro = nuevo.registroacceso.id;
        this.ip = jn.get("ip").textValue();
        this.propiedades = nuevo.propiedades;
    }
}
