package pro.nazarov.shaheen.academy.jpa.entity;

import org.hibernate.annotations.GenericGenerator;

import java.util.Set;
import javax.persistence.*;

/**
 * Created by Shahin on 11/3/2016.
 */
@Entity
@Table(name = "STUDENTS")
@NamedQueries({

})
public class Student {

    @GenericGenerator(name = "generator", strategy = "foreign",
            parameters = @org.hibernate.annotations.Parameter(name = "property", value = "user"))
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "ID" , unique = true , nullable = false)
    private long id;

    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    private User user;

    @Column(name = "UNIVERSITY" , length = 200)
    private String university;

    @Column(name = "DISCOUNT"
            ,nullable = false)
    private float disCount = 0.0f;

    @OneToMany(mappedBy = "student" , fetch = FetchType.LAZY)
    private Set<Payment> payments;

    @ManyToMany(fetch = FetchType.LAZY , mappedBy = "students")
    private Set<Group> groups;

    @OneToMany(mappedBy = "student" , fetch = FetchType.LAZY)
    private Set<Activity> activities;

    @Column(name = "ENABLED" , nullable = false)
    private boolean enabled;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getDisCount() {
        return disCount;
    }

    public void setDisCount(float disCount) {
        this.disCount = disCount;
    }

    public Set<Payment> getPayments() {
        return payments;
    }

    public void setPayments(Set<Payment> payments) {
        this.payments = payments;
    }

    public Set<Group> getGroups() {
        return groups;
    }

    public void setGroups(Set<Group> groups) {
        this.groups = groups;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<Activity> getActivities() {
        return activities;
    }

    public void setActivities(Set<Activity> activities) {
        this.activities = activities;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
