package entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "brand")
    private String brand;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "human_id", nullable = false)
    private Human human;

    public Car(String brand, Human human)
    {
        this.brand = brand;
        this.human = human;
    }
}
