package pro.nazarov.academy.jpa.entity;

import pro.nazarov.academy.jpa.tool.enums.ActivityMode;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Shahin on 12/17/2016.
 */
@Entity
@Table(name = "ACTIVITY")
@NamedQueries({

})
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @JoinColumn(name = "GROUP_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Group group;

    @JoinColumn(name = "STUDENT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Student student;

    @Column(name = "MODE")
    @Enumerated
    private ActivityMode activityMode;

    @Column(name = "DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    public ActivityMode getActivityMode() {
        return activityMode;
    }

    public void setActivityMode(ActivityMode activityMode) {
        this.activityMode = activityMode;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

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
}
