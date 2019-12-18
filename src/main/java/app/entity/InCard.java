package app.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Data
@Entity
public class InCard {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "Name is required")
    private String name;
    @NotBlank(message = "Size is required")
    private String size;
    @NotBlank(message = "Count is required")
    private int count;
    @NotBlank(message = "Photo is required")
    private String photo;
    @NotBlank(message = "Price is required")
    private double price;

    public InCard(@NotBlank(message = "Name is required") String name,
                  @NotBlank(message = "Size is required") String size,
                  @NotBlank(message = "Count is required") int count,
                  @NotBlank(message = "Photo is required") String photo,
                  @NotBlank(message = "Price is required") double price) {
        this.name = name;
        this.size = size;
        this.count = count;
        this.photo = photo;
        this.price = price;
    }
}
