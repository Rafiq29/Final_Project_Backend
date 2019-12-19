package app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
@Data
@Entity
@ToString
@Table(name= "sauce")
public class Sauces {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    private int sauceID;

    @NotBlank(message = "Name is required")
    private String sauceName;

    private double saucePrice;

     private String saucePhoto;

}
