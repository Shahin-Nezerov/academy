package pro.nazarov.academy.jpa.entity;

import org.hibernate.annotations.Type;
import pro.nazarov.academy.jpa.tool.enums.BillingType;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Shahin on 3/12/2017.
 */
@Entity
@Table(name = "BILLING")
@NamedQueries({
//        @NamedQuery(name = "subscribe.unsubscribe" , query = "from SubscriberModel s where s.mail=:mail and s.unFollowToken=:token")
})
public class Billing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Enumerated
    @Column(nullable = false,name = "BILLING_TYPE")
    private BillingType type;

    @Column(name = "AMOUNT",nullable = false)
    private double amount = 0.0;

    @JoinColumn(name = "USER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @Type(type = "text")
    @Column(name = "DETAILS")
    private String details;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "Date")
    private Date date;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BillingType getType() {
        return type;
    }

    public void setType(BillingType type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
