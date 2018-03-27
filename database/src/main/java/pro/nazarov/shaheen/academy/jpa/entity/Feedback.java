package pro.nazarov.shaheen.academy.jpa.entity;

import org.hibernate.annotations.Type;

import java.util.Date;
import javax.persistence.*;

/**
 * Created by Shahin on 10/13/2016.
 */

@Entity
@Table(name = "FEEDBACKS")
@NamedQueries({

})
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "MAIL",unique = true, length = 200, nullable = false)
    private String mail;

    @Column(name = "NAME", length = 100, nullable = false)
    private String name;

    @Column(name = "PHONE", length = 200)
    private String phone;

    @Column(name = "MESSAGE")
    @Type(type = "text")
    private String message;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATED" , nullable = false)
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @PrePersist
    public void onCreate() {
        setCreated(new Date());
    }
}
