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
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "meats")
public class Meats {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    private int id;

    @NotBlank(message = "meatName is required")
    private String meatName;

    private double price;

    @NotBlank(message = "meatPhoto is required")
    private String meatPhoto;

    public Meats (String meatName,double price,String meatPhoto) {
        this.meatName=meatName;
        this.price=price;
        this.meatPhoto=meatPhoto;
    }
}
