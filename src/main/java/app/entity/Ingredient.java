package app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="ingredients")
public class Ingredient {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    private int id;

    @NotBlank(message = "Name is required")
    private String name;

    private double price;

    @NotBlank(message = "Photo is required")
    private String photo;

    public Ingredient (String name,double price,String photo) {
        this.name=name;
        this.price=price;
        this.photo=photo;
    }
}
