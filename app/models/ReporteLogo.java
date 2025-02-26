package models;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.util.Date;

@Entity
public class ReporteLogo extends Model {
    private static final long serialVersionUID = 1L;
    @Id
    public Long id;

    public String nombrearchivo;

    public String contenttype;

    @Lob
    public byte[] contenido;

    @CreatedTimestamp
    public Date auditinsert;
    @UpdatedTimestamp
    public Date auditlastupdate;

    public static Finder<Long,ReporteLogo> find = new Finder<>(Long.class, ReporteLogo.class);


    public byte[] getContenido() {
        return contenido;
    }

    public void setContenido(byte[] contenido) {
        this.contenido = contenido;
    }
}


