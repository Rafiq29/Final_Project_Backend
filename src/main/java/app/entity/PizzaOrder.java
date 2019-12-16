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

    public String getUs() {
        return delivery;
    }

    public String getPizzaList() {
        return pizzaList;
    }

    public String getStatus() {
        return status;
    }

    public double getPrice() {
        return price;
    }

    public String getDate() {
        return date;
    }


}
