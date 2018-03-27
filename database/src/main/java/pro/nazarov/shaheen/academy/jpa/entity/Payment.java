package pro.nazarov.shaheen.academy.jpa.entity;
import javax.persistence.*;

import java.util.Date;

/**
 * Created by Shahin on 11/3/2016.
 */
@Entity
@Table(name = "PAYMENTS")
@NamedQueries({

})
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @JoinColumn(name = "GROUP_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Group group;

    @JoinColumn(name = "STUDENT_ID",nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private Student student;

    @JoinColumn(name = "USER_ID",nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @Column(name = "PAYMENT_DATE" , nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date paymentDate = new Date();

    @Column(name = "AMOUNT" , nullable = false)
    private double amount = 0.00;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
