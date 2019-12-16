package app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@NoArgsConstructor
@Data
@Entity
@AllArgsConstructor
@Table(name= "sous")
public class Sauce {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "Calories is required")
    private double calories;

    @NotBlank(message = "Price is required")
    private double price;

    @NotBlank(message = "Photo is required")
    private String photo;

}
