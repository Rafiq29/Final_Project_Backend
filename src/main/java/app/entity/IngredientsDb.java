package app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class IngredientsDb {
    @Id
    private String name;
    private int calories;
    private String price;
    private String photo;

    public IngredientsDb() {
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public String getPrice() {
        return price;
    }

    public String getPhoto() {
        return photo;
    }
}
