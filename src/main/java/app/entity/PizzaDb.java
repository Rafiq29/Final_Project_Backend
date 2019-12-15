package app.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Entity
@Table(name="PizzaDb")

public class PizzaDb {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int ID;
    @NotBlank(message = "Name is required")
    private String name;
    @NotBlank(message = "Price is required")
    private String price;
    @NotBlank(message = "Size is required")
    private String size;
    @NotBlank(message = "Calories is required")
    private int calories;
    @NotBlank(message = "Ingredients is required")
    private String ingredients;

    public PizzaDb() {
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getSize() {
        return size;
    }

    public int getCalories() {
        return calories;
    }

    public String getIngredients() {
        return ingredients;
    }
}
