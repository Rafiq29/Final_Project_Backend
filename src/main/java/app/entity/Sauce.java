package app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@NoArgsConstructor
@Data
@Entity
@Table(name= "sauce")
public class Sauce {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    private int id;

    @NotBlank(message = "Name is required")
    private String name;

    private double price;

    @NotBlank(message = "Photo is required")
    private String photo;

    @NotBlank(message = "description")
    private String description;

    public Sauce(String name,double price,String photo,String description) {
        this.name=name;
        this.price=price;
        this.photo=photo;
        this.description=description;
    }

}
