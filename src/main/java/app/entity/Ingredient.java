package app.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@Entity
@Table(name="IngredientsDb")
public class Ingredient {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int ID;
    @NotBlank(message = "Name is required")
    private String name;
    @NotBlank(message = "Calories is required")
    private int calories;
    @NotBlank(message = "Price is required")
    private String price;
    @NotBlank(message = "Photo is required")
    private String photo;

    public Ingredient() {
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public String getPrice() {
        return price;
    }

    public String getPhoto() {
        return photo;
    }
}
