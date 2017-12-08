package pro.nazarov.academy.jpa.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * Created by Shahin on 11/3/2016.
 */

@Entity
@Table(name = "GROUPS")
@NamedQueries({

})
public class Group {

    @Id
    @Column(name = "NAME")
    private String name;

    @JoinColumn(name = "TEACHER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Teacher teacher;

    @JoinColumn(name = "COURSE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Course course;

    @Column(name = "START_DATE")
    @Temporal(TemporalType.DATE)
    private Date start;

    @Column(name = "FINSIH_DATE")
    @Temporal(TemporalType.DATE)
    private Date finish;

    @Column(name = "ENABLED" , nullable = false)
    private boolean enabled;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "STUDENT_GROUP" ,joinColumns = {
            @JoinColumn(name = "GROUP_ID" , nullable = false),
    }, inverseJoinColumns ={
            @JoinColumn(name = "STUDENT_ID" , nullable = false)
    } )
    private Set<Student> students;

    @OneToMany(mappedBy = "group" , fetch = FetchType.LAZY)
    private Set<Tables> tables;

    @OneToMany(mappedBy = "group" , fetch = FetchType.LAZY)
    private Set<Activity> activities;


    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getFinish() {
        return finish;
    }

    public void setFinish(Date finish) {
        this.finish = finish;
    }

    public Set<Tables> getTables() {
        return tables;
    }

    public void setTables(Set<Tables> tables) {
        this.tables = tables;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
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
