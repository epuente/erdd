package models.polimedia;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;
import play.db.ebean.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class PolimediaUrl extends Model {
    private static final long serialVersionUID = 1L;
    @Id
    public Long id;

    @OneToOne
    public Polimedia polimedia;

    @Column(length = 200)
    public String url;


    @CreatedTimestamp
    public Date auditinsert;
    @UpdatedTimestamp
    public Date auditlastupdate;

    public static Model.Finder<Long, PolimediaUrl> find = new Model.Finder<>(Long.class, PolimediaUrl.class);
}
