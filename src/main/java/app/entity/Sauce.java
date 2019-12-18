package app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name= "sauce")
public class Sauce {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "Calories is required")
    private double calories;

    @NotBlank(message = "Price is required")
    private double price;

    @NotBlank(message = "Photo is required")
    private String photo;

    @NotBlank(message = "description")
    private String description;

    public Sauce(@NotBlank(message = "Name is required") String name,
                 @NotBlank(message = "Calories is required") double calories,
                 @NotBlank(message = "Price is required") double price,
                 @NotBlank(message = "Photo is required") String photo,
                 @NotBlank(message = "description") String description) {
        this.name = name;
        this.calories = calories;
        this.price = price;
        this.photo = photo;
        this.description = description;
    }

}
