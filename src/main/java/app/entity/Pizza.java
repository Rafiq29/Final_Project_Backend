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
    private double calories;

    @NotBlank(message = "Ingredients is required")
    private String ingredients;

    @NotBlank(message = "Photo is required")

    private String photo;

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getSize() {
        return size;
    }

    public double getCalories() {
        return calories;
    }

    public String getIngredients() {
        return ingredients;
    }
}
