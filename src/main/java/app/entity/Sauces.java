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
@Data
@Entity
@ToString
@Table(name= "sauce")
public class Sauces {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sauceID;

    @NotBlank(message = "Name is required")
    private String sauceName;

    private double saucePrice;

     private String saucePhoto;

     @ManyToMany(mappedBy = "pizzaSauces")
    private List<Pizza> pizzas;

}
