package app.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@Data
@Entity
@Table(name = "inCard")
public class InCard {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    private int id;

    @NotBlank(message = "deliveryName is required")
    private String deliveryName;

    private String pizzasList;

    @NotBlank(message = "Size is required")
    private String size;

    private int pizzaCount;

    @NotBlank(message = "Photo is required")
    private String photo;

    private double price;

    public InCard (String deliveryName,String pizzasList,String size, int pizzaCount, String photo, double price) {
        this.deliveryName = deliveryName;
        this.pizzasList=pizzasList;
        this.size=size;
        this.pizzaCount = pizzaCount;
        this.photo=photo;
        this.price=price;
    }

    public InCard() { }

}
