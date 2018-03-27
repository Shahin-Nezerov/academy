package pro.nazarov.shaheen.academy.jpa.entity;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import pro.nazarov.shaheen.academy.jpa.tool.enums.UserRole;

import java.util.Set;
import javax.persistence.*;

/**
 * Created by Shahin on 10/10/2016.
 */
@Entity
@Table(name = "USERS")
@NamedQueries({
        @NamedQuery(name = "user.findByMail" , query = "from User u where u.mail=:mail"),
        @NamedQuery(name = "user.findById" , query = "from User u where u.id=:id"),
        @NamedQuery(name = "user.findByMailAndToken" , query = "select u from User u" +
                "  join u.userDetails ud where u.mail=:mail and ud.token=:token")
})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @OneToMany(mappedBy = "user" , fetch = FetchType.LAZY)
    private Set<Payment> payments;

    @Column(name = "MAIL" , length = 200,unique = true ,nullable = false)
    private String mail;

    @Column(name = "PASSWORD" , length = 60 ,nullable = false)
    private String password;

    @Column(name = "ENABLED" , nullable = false)
    private boolean enabled;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "user" , cascade = CascadeType.ALL)
    @NotFound(action= NotFoundAction.IGNORE)
    private UserDetails userDetails;

    @OneToMany(mappedBy = "user" , fetch = FetchType.LAZY)
    private Set<Billing> billings;

    @Enumerated
    @Column(name = "ROLE")
    private UserRole role;


    public Set<Payment> getPayments() {
        return payments;
    }

    public void setPayments(Set<Payment> payments) {
        this.payments = payments;
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public Set<Billing> getBillings() {
        return billings;
    }

    public void setBillings(Set<Billing> billings) {
        this.billings = billings;
    }
}
