package app.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@Entity
@Table(name="Ingredients")
public class Ingredient {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int ID;
    @Column(name = "name")
    @NotBlank(message = "Name is required")
    private String name;
    @Column(name = "calories")
    @NotBlank(message = "Calories is required")
    private int calories;
    @Column(name = "price")
    @NotBlank(message = "Price is required")
    private String price;
    @Column(name = "photo")
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
