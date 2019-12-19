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

@Table(name = "pizza")

public class Pizza {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotBlank(message = "User is required")
    private String name;

    @NotBlank(message = "Price is required")
    private double price;

    @NotBlank(message = "Size is required")
    private String size;

    @NotBlank(message = "Ingredients is required")
    private String ingredients;

    @NotBlank(message = "Photo is required")
    private String photo;

    public Pizza(String name,double price,String size,String ingredients,String photo) {
        this.name=name;
        this.price=price;
        this.size=size;
        this.ingredients=ingredients;
        this.photo=photo;
    }
}
