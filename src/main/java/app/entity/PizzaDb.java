package app.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
public class PizzaDb {
    @Id
    private  String Id;
    private  String name;
    private  String price;
    private  String ingredient;
    private  String size;
    private  String calories;

}
