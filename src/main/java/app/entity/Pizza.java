package app.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@ToString
@Table(name = "pizza")
public class Pizza {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotBlank(message = "namePizza is required")
    private String pizza;

     @ManyToMany(targetEntity = Sauces.class,cascade = CascadeType.ALL)
     @JoinTable(name = "saucesID")
     private List<Sauces> sauces;

     @ManyToMany(targetEntity = Meats.class,cascade = CascadeType.ALL)
     @JoinColumn(name= "meatsID")
     private List <Meats> meats;

    @ManyToMany(targetEntity = Veggies.class,cascade = CascadeType.ALL)
    @JoinColumn(name="veggiesID")
    private List<Veggies> veggies;

    @ManyToMany(targetEntity = Size.class,cascade = CascadeType.ALL)
    @JoinColumn(name="smallID")
    private List<Size> size;

    private double price;

    @NotBlank(message = "Photo is required")
    private String photo;
}
