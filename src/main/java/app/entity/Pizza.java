package app.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
@Data
@Entity
@Table(name = "Pizza")

public class Pizza {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    @Column(name = "name")
    @NotBlank(message = "User is required")
    private String name;
    @Column(name = "price")
    @NotBlank(message = "Price is required")
    private String price;
    @Column(name = "size")
    @NotBlank(message = "Size is required")
    private String size;
    @Column(name = "calories")
    @NotBlank(message = "Calories is required")
    private int calories;
    @Column(name = "ingredients")
    @NotBlank(message = "Ingredients is required")
    private String ingredients;

    public Pizza() {
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
