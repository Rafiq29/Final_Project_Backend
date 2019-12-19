package app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "pizzaOrder")
public class PizzaOrder {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private int id;

    @NotBlank(message = "Delivery name is required")
    private String delivery;

    @NotBlank(message = "PizzaList is required")
    private String pizzaList;

    @NotBlank(message = "Status is required")
    private String status;

    private double price;

    @NotBlank(message = "Date is required")
    private String date;

    public PizzaOrder(@NotBlank(message = "Delivery name is required") String delivery,
                      @NotBlank(message = "PizzaList is required") String pizzaList,
                      @NotBlank(message = "Status is required") String status,
                      double price,
                      @NotBlank(message = "Date is required") String date) {
        this.delivery = delivery;
        this.pizzaList = pizzaList;
        this.status = status;
        this.price = price;
        this.date = date;
    }

}
