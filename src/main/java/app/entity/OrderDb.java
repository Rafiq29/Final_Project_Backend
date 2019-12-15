package app.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;
@Data
@Entity
@Table(name="OrderDb")
public class OrderDb {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long ID;
    @NotBlank(message="Delivery name is required")
    private String User;
    @NotBlank(message="PizzaList is required")
    private String PizzaList;
    @NotBlank(message="Status is required")
    private String status;
    @NotBlank(message="Price is required")
    private int price;
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

    public OrderDb() {
    }

}
