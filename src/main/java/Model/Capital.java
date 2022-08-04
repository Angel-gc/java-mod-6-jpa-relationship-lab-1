package Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
public class Capital {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private int id;
    private String name;

    @OneToOne(mappedBy = "capital")
    private Country country;

    public Capital(String name) {
        this.name = name;
    }
}
