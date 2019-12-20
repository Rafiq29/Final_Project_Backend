package app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "veggies")
public class Veggies {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    private int veggiesID;

    @NotBlank(message = "veggiesName is required")
    private String veggiesName;

    private double veggiesPrice;

    @NotBlank(message = "veggiesPhoto is required")
    private String veggiesPhoto;

    @ManyToMany(mappedBy = "pizzaVeggies",fetch = FetchType.EAGER)
    private List<Pizza> pizzas;
}
