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

    public InCard() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCount() {
        return count;
    }

    public String getPhoto() {
        return photo;
    }

    public double getPrice() {
        return price;
    }
}
