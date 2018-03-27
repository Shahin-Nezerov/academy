package pro.nazarov.shaheen.academy.jpa.entity;

import org.hibernate.annotations.Type;
import javax.persistence.*;

/**
 * Created by Shahin on 11/3/2016.
 */
@Entity
@Table(name = "LESSONS")
@NamedQueries({

})
public class Lessons {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name = "NAME" , length = 200)
    private String name;

    @Column(name = "DESCRIPTION")
    @Type(type = "text")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COURSE_ID")
    private Course course;

    @Column(name = "PERIOD")
    private int period;

    @Column(name = "ENABLED" , nullable = false)
    private boolean enabled;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
