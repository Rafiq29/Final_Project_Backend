package app.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@ToString
@Table(name = "Basket")
public class Basket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToMany(targetEntity = Pizza.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "pizzas")
    private List<Pizza> pizzas;

    private int count;

    private double price;

}