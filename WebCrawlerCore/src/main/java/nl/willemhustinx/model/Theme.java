package nl.willemhustinx.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by willemhustinx on 21-4-2017.
 */
@Entity
public class Theme implements Serializable {

    @Id
    private String name;

    @Column(length = 2000)
    private String description;

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

    @Override
    public String toString() {
        return "Theme{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
