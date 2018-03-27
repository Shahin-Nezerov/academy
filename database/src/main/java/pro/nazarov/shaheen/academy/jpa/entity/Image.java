package pro.nazarov.shaheen.academy.jpa.entity;

import javax.persistence.*;

/**
 * Created by Shahin on 3/17/2017.
 */
@Entity
@Table(name = "IMAGES")
@NamedQueries({

})
public class Image {

    @Id
    @Column(name = "NAME", nullable = false)
    private String name;
    @Column(name = "LAST_NAME", nullable = false)
    private String lastName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
