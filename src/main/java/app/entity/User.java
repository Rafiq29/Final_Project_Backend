package app.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    @Column(name = "name")
    @NotBlank(message = "Name is required")
    private String name;
    @Column(name = "surname")
    @NotBlank(message = "Surname is required")
    private String surname;
    @Column(name = "username")
    @NotBlank(message = "Username is required")
    private String username;
    @Column(name = "password")
    @NotBlank(message = "Password is required")
    private String password;
    @Column(name = "email")
    @NotBlank(message = "Email is required")
    private String email;
    @Column(name = "phone")
    @NotBlank(message = "Phone is required")
    private String phone;
    @Column(name = "address")
    @NotBlank(message = "Address is required")
    private String address;

    @Column(name = "FavoritePizza")
    @NotBlank(message = "FavoritePizza is required")
    private String favoritePizza;

    public User() {
    }

    public String getFavoritePizza() {return favoritePizza; }


    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
}
