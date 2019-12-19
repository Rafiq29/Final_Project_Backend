package app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "veggies")
public class Veggies {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    private int id;

    @NotBlank(message = "veggiesName is required")
    private String veggiesName;

    private double price;
    @NotBlank(message = "veggiesPhoto is required")
    private String veggiesPhoto;

    public Veggies (String veggiesName,double price,String veggiesPhoto) {
        this.veggiesName=veggiesName;
        this.price=price;
        this.veggiesPhoto=veggiesPhoto;
    }
}
