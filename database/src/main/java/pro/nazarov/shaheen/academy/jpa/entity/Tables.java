package pro.nazarov.shaheen.academy.jpa.entity;

import java.util.Date;
import javax.persistence.*;

/**
 * Created by Shahin on 11/3/2016.
 */
@Entity
@Table(name = "TABLES")
@NamedQueries({

})
public class Tables {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "GROUP_ID")
    private Group group;

    @Column(name = "DAY_OF_WEEK" ,nullable = false)
    private int dayOfWeek;

    @Column(name = "START_TIME",nullable = false)
    @Temporal(TemporalType.DATE)
    private Date time;

    @Column(name = "HOURS" ,nullable = false)
    private int hours;

    @Column(name = "ENABLED" , nullable = false)
    private boolean enabled;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
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

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}
