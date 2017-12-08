package pro.nazarov.academy.jpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import pro.nazarov.academy.jpa.tool.enums.Gender;
import pro.nazarov.academy.jpa.tool.enums.UserMode;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Shahin on 10/18/2016.
 */
@Entity
@Table(name = "USER_DETAILS")
@NamedQueries({
//        @NamedQuery(name = "user.findByMail" , query = "from UserModel u where u.mail=:mail"),
})
public class UserDetails {

    @GenericGenerator(name = "generator", strategy = "foreign",
            parameters = @org.hibernate.annotations.Parameter(name = "property", value = "user"))
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "ID", unique = true, nullable = false)
    private long id;

    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    @JsonIgnore
    private User user;

    @Enumerated
    @Column(name = "MODE")
    private UserMode mode;

    @Enumerated
    @Column(name = "GENDER")
    private Gender gender = Gender.NONE;

    @Column(name = "FULL_NAME", length = 50)
    private String fullName;

    @Type(type = "text")
    @Column(name = "DETAILS")
    private String details;

    @Column(name = "TOKEN", length = 30)
    private String token;

    @JoinColumn(name = "IMAGE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Image image;

    @Temporal(TemporalType.DATE)
    @Column(name = "Created")
    private Date created;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LAST_ACCESS")
    private Date lastAccess;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public UserMode getMode() {
        return mode;
    }

    public void setMode(UserMode mode) {
        this.mode = mode;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getLastAccess() {
        return lastAccess;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDetails() {
        return details;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setLastAccess(Date lastAccess) {
        this.lastAccess = lastAccess;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}
