package app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Size {
    @Id
    private int sizeID;

    private String sizeName;

    private double sizeCoefficient;

    @ManyToMany(mappedBy = "pizzaVeggies",fetch = FetchType.EAGER)
    private List<Pizza> pizzas;

}
