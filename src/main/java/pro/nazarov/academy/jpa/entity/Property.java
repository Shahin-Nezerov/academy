package pro.nazarov.academy.jpa.entity;

import javax.persistence.*;

/**
 * Created by Shahin on 10/16/2016.
 */
@Entity
@Table(name = "MAPS")
@NamedQueries({

})
public class Property {

    @Id
    @Column(name = "name" , length = 50,unique = true ,nullable = false)
    private String key;

    @Column(name = "value" , length = 250,nullable = false)
    private String value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
