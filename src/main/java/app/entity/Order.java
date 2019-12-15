package app.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
@Entity
@Table(name = "Order")
public class Order {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    @Column(name = "User")
    @NotBlank(message = "Delivery name is required")
    private String User;
    @Column(name = "PizzaList")
    @NotBlank(message = "PizzaList is required")
    private String PizzaList;
    @Column(name = "Status")
    @NotBlank(message = "Status is required")
    private String status;
    @Column(name = "price")
    @NotBlank(message = "Price is required")
    private int price;
    @Column(name = "date")
    @NotBlank(message = "Date is required")
    private String date;

    public String getUs() {
        return User;
    }

    public String getPizzaList() {
        return PizzaList;
    }

    public String getStatus() {
        return status;
    }

    public int getPrice() {
        return price;
    }

    public String getDate() {
        return date;
    }

    public Order() {
    }

}
