package app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="ingredients")
public class Ingredient {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "Calories is required")
    private double calories;

    @NotBlank(message = "Price is required")
    private double price;

    @NotBlank(message = "Photo is required")
    private String photo;

    public Ingredient(@NotBlank(message = "Name is required") String name,
                      @NotBlank(message = "Calories is required") double calories,
                      @NotBlank(message = "Price is required") double price,
                      @NotBlank(message = "Photo is required") String photo) {
        this.name = name;
        this.calories = calories;
        this.price = price;
        this.photo = photo;
    }
}
