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
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    private int id;

    @NotBlank(message = "namePizza is required")
    private String namePizza;

    @OneToMany(targetEntity = Sauces.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "ps_pk",referencedColumnName = "id")
    private List<Sauces> sauce;

    @OneToMany(targetEntity = Meats.class,cascade = CascadeType.ALL)
    @JoinColumn(name= "pm_pk",referencedColumnName = "id")
    private List<Meats> meats;

    @OneToMany(targetEntity = Veggies.class,cascade = CascadeType.ALL)
    @JoinColumn(name="pv_pk",referencedColumnName = "id")
    private List<Veggies> veggies;

    @NotBlank(message = "Photo is required")
    private String pizzaPhoto;

}
