package app.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "pizzaOrder")
public class PizzaOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotBlank(message = "Delivery name is required")
    private String deliveryName;

    @NotBlank(message = "Delivery surname is required")
    private String deliverySurname;

    @ManyToMany(targetEntity = Basket.class,cascade = CascadeType.ALL)
    @JoinColumn(name="pizzaOrder")
    private List<Basket> basket;

    @NotBlank(message = "Status is required")
    private String status;

    @NotBlank(message = "Date is required")
    private String date;

    private String address;

    private String phone;

    private String email;
}
