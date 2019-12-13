package app.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
public class UserDb {
    @Id
    private String name;
    private String surname;
    private String username;
    private String password;
    private String email;
    private String phone;
    private String address;
    private ArrayList<Integer>favoritePizza;
}
