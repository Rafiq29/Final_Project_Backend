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
@Table(name = "inCard")
public class InCard {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    private int id;

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "Size is required")
    private String size;

    private int count;

    @NotBlank(message = "Photo is required")
    private String photo;

    private double price;

    public InCard (String name,String size,int count,String photo,double price) {
        this.name=name;
        this.size=size;
        this.count=count;
        this.photo=photo;
        this.price=price;
    }
}
