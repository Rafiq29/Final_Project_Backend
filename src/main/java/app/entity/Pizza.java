package app.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@ToString
@Table(name = "pizza")
public class Pizza {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    private int pizzaID;

    @NotBlank(message = "namePizza is required")
    private String pizzaName;

     @ManyToMany(cascade = CascadeType.ALL)
     @JoinColumn(name = "pizzaSauceID", referencedColumnName = "sauceID")
     private List<Sauces> pizzaSauces;

     @ManyToMany(targetEntity = Meats.class,cascade = CascadeType.ALL)
     @JoinColumn(name= "pm_pk",referencedColumnName = "id")
     private List<Meats> pizzaMeats;

    @ManyToMany(targetEntity = Veggies.class,cascade = CascadeType.ALL)
    @JoinColumn(name="pv_pk",referencedColumnName = "id")
    private List<Veggies> pizzaVeggies;

    @NotBlank(message = "Photo is required")
    private String pizzaPhoto;
}
