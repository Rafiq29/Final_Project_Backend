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
public class OrderDb {
    @Id
    private UserDb userDb;
    private ArrayList<PizzaDb> pizzaList;
    private String status;
    private String price;
    private String data;
}
