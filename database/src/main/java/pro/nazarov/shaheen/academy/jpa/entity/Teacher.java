package pro.nazarov.shaheen.academy.jpa.entity;

import org.hibernate.annotations.GenericGenerator;

import java.util.Set;
import javax.persistence.*;

/**
 * Created by Shahin on 11/3/2016.
 */
@Entity
@Table(name = "TEACHERS")
@NamedQueries({
        @NamedQuery(name = "teacher.userDetails" , query = "select ud from Teacher t join t.user u join u.userDetails ud where u.enabled=true "),
        @NamedQuery(name = "teacher.userDetailsByName" , query = "select ud from Teacher t join t.user u join u.userDetails ud where u.enabled=true and ud.fullName like :name")
})
public class Teacher {

    @GenericGenerator(name = "generator", strategy = "foreign",
            parameters = @org.hibernate.annotations.Parameter(name = "property", value = "user"))
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "ID" , unique = true , nullable = false)
    private long id;

    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    private User user;

    @OneToMany(mappedBy = "teacher" , fetch = FetchType.LAZY)
    private Set<Group> groups;

    @Column(name = "SALARY" , nullable = false)
    private double salary;

    @ManyToMany(fetch = FetchType.LAZY , mappedBy = "teachers")
    private Set<Course> courses;

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Set<Group> getGroups() {
        return groups;
    }

    public void setGroups(Set<Group> groups) {
        this.groups = groups;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
