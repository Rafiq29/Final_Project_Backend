package app.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "pizza")
public class Pizza {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    private int id;

    @NotBlank(message = "namePizza is required")
    private String namePizza;

    private String sauce;

    private String meats;

    private String veggies;

    @NotBlank(message = "Photo is required")
    private String pizzaPhoto;

    private String pizzaSize;

    public Pizza(String name,String sauce,String meats,String veggies,String pizzaPhoto,String pizzaSize) {
        this.namePizza=name;
        this.meats=meats;
        this.sauce=sauce;
        this.veggies=veggies;
        this.pizzaPhoto = pizzaPhoto;
        this.pizzaSize=pizzaSize;
    }
}
