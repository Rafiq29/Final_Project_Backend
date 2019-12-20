package app.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@AllArgsConstructor
@Data
@Entity
@ToString
@Table(name = "inCard")
public class InCard {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    private int inCardID;

    @ManyToMany(targetEntity = Pizza.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "pizzaCard")
    private List<Pizza> pizzasList;

    private int pizzaCount;

    private double price;
    public InCard() { }

}
