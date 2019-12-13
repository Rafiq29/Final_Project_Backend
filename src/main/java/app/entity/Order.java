package app.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
public class Order {
    @Id
    private User user;
    private ArrayList<Pizza> pizzaList;
    private String status;
    private String price;
    private String data;
}
