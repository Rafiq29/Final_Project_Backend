package app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
@Table(name = "meats")
public class Meats {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    private int meatID;

    @NotBlank(message = "meatName is required")
    private String meatName;

    private double meatPrice;

    @NotBlank(message = "meatPhoto is required")
    private String meatPhoto;

    @ManyToMany(mappedBy = "pizzaMeats",fetch = FetchType.EAGER)
    private List<Pizza> pizzas;

}
