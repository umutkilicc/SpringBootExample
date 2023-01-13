package entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "il")
    private String il;

    @Column(name = "ülke")
    private String ulke;

    @OneToOne(mappedBy = "address")
    private Human human;

    public Address (String il, String ulke)
    {
        this.il = il;
        this.ulke = ulke;
    }


}
