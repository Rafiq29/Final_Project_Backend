package app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Size {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    private int sizeID;

    private String sizeName;

    private double sizeCoefficient;

    @ManyToMany(mappedBy = "pizzaVeggies",fetch = FetchType.EAGER)
    private List<Pizza> pizzas;

}
