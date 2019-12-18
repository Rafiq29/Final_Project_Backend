package app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity

@Table(name = "pizza")

public class Pizza {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    private int id;

    @NotBlank(message = "User is required")
    private String name;

    @NotBlank(message = "Price is required")
    private double price;

    @NotBlank(message = "Size is required")
    private String size;

    @NotBlank(message = "Calories is required")
    private double calories;

    @NotBlank(message = "Ingredients is required")
    private String ingredients;

    @NotBlank(message = "Photo is required")
    private String photo;

    public Pizza(String name,double price,String size,double calories,String ingredients,String photo) {
        this.name=name;
        this.price=price;
        this.calories=calories;
        this.size=size;
        this.ingredients=ingredients;
        this.photo=photo;
    }
}
