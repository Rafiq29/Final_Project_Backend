package app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@Entity
@AllArgsConstructor
@Table(name= "sous")
public class Sous {
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


    public Sous() {}

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCalories() {
        return calories;
    }

    public double getPrice() {
        return price;
    }

    public String getPhoto() {
        return photo;
    }
}
