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
    @GeneratedValue(strategy = GenerationType.AUTO)
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


    public Pizza(@NotBlank(message = "User is required") String name,
                 @NotBlank(message = "Price is required") String price,
                 @NotBlank(message = "Size is required") String size,
                 @NotBlank(message = "Calories is required") double calories,
                 @NotBlank(message = "Ingredients is required") String ingredients,
                 @NotBlank(message = "Photo is required") String photo) {
        this.name = name;
        this.price = price;
        this.size = size;
        this.calories = calories;
        this.ingredients = ingredients;
        this.photo = photo;
    }
}
