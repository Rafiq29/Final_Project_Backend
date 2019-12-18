package app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@NoArgsConstructor
@Data
@Entity
@AllArgsConstructor
@Table(name = "pizzaOrder")
public class PizzaOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Delivery name is required")
    private String delivery;

    @NotBlank(message = "PizzaList is required")
    private String pizzaList;

    @NotBlank(message = "Status is required")
    private String status;

    @NotBlank(message = "Price is required")
    private double price;

    @NotBlank(message = "Date is required")
    private String date;

    public PizzaOrder(@NotBlank(message = "Delivery name is required") String delivery,
                      @NotBlank(message = "PizzaList is required") String pizzaList,
                      @NotBlank(message = "Status is required") String status,
                      @NotBlank(message = "Price is required") double price,
                      @NotBlank(message = "Date is required") String date) {
        this.delivery = delivery;
        this.pizzaList = pizzaList;
        this.status = status;
        this.price = price;
        this.date = date;
    }
}
