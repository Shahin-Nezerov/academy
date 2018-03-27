package pro.nazarov.shaheen.academy.jpa.entity;

import org.hibernate.annotations.Type;

import java.util.Set;
import javax.persistence.*;

/**
 * Created by Shahin on 11/3/2016.
 */
@Entity
@Table(name = "COURSES")
@NamedQueries({

})
public class Course {

    @Id
    @Column(name = "NAME" , length = 100  , nullable = false)
    private String name;

    @Column(name = "AMOUNT" , nullable = false)
    private double amount;

    @Type(type = "text")
    @Column(name = "DETAILS")
    private String details;

    @Column(name = "ENABLED" , nullable = false)
    private boolean enabled;

    @OneToMany(mappedBy = "course")
    private Set<Group> groups;

    @JoinColumn(name = "IMAGE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Image image;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "COURSE_TEACHER" ,
            joinColumns = {
            @JoinColumn(name = "COURSE_NAME",referencedColumnName = "name", nullable = false)},
            inverseJoinColumns = {
                    @JoinColumn(name = "TEACHER_ID", nullable = false,referencedColumnName = "id")
            })
    private Set<Teacher> teachers;

    @OneToMany(mappedBy = "course")
    private Set<Lessons> lessons;

    public Set<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(Set<Teacher> teachers) {
        this.teachers = teachers;
    }

    public Set<Group> getGroups() {
        return groups;
    }

    public void setGroups(Set<Group> groups) {
        this.groups = groups;
    }

    public Set<Lessons> getLessons() {
        return lessons;
    }

    public void setLessons(Set<Lessons> lessons) {
        this.lessons = lessons;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}
