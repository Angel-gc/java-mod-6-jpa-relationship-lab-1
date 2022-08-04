package Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
public class Country {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private int id;
    private String name;

    public Country(String name) {
        this.name = name;
    }

    @OneToOne(fetch = FetchType.LAZY)
    private Capital capital;
}
