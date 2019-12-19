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

    @NotBlank(message = "Delivery name is required")
    private String deliveryName;

    @NotBlank(message = "Delivery surname is required")
    private String deliverySurname;

    @ManyToMany(targetEntity = Pizza.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "pc_pk",referencedColumnName = "id")
    private List<Pizza> pizzasList;

    @NotBlank(message = "Size is required")
    private String pizzaSize;

    private int pizzaCount;

    private double pizzaPrice;

    public InCard() { }

}
