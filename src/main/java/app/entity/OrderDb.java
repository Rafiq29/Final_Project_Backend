package app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class OrderDb {
    @Id
    private String User;
    private String PizzaList;
    private String status;
    private int price;
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
