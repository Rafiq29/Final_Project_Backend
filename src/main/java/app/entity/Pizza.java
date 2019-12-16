package app.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
@Data
@Entity
@Table(name = "pizza")

public class Pizza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "User is required")
    private String name;

    @NotBlank(message = "Price is required")
    private String price;

    @NotBlank(message = "Size is required")
    private String size;

    @NotBlank(message = "Calories is required")
    private int calories;

    @NotBlank(message = "Ingredients is required")
    private String ingredients;

    public Pizza() {}

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