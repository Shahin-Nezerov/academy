package pro.nazarov.academy.jpa.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Shahin on 10/13/2016.
 */
@Entity
@Table(name = "SUBSCRIBERS")
@NamedQueries({
        @NamedQuery(name = "subscribe.findByMail" , query = "from Subscriber s where s.mail=:mail "),
        @NamedQuery(name = "subscribe.unsubscribe" , query = "from Subscriber s where s.mail=:mail and s.unFollowToken=:token")
})
public class Subscriber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "MAIL" , length = 200,unique = true ,nullable = false)
    private String mail;

    @Column(name = "Token" , length = 30)
    private String unFollowToken;

    @Column(name = "ENABLED" , nullable = false)
    private boolean enabled;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "SUBSCRIBTION_DATE" ,nullable = false)
    private Date created = new Date();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @PrePersist
    public void onCreate(){
        setCreated(new Date());
    }

    public String getUnFollowToken() {
        return unFollowToken;
    }

    public void setUnFollowToken(String unFollowToken) {
        this.unFollowToken = unFollowToken;
    }
}
