package app.Controller;


import app.entity.User;
import app.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @PostMapping(path = ("/add"))
    public String addNewUser(@RequestParam User user) {
        return ("User added");
    }

    @GetMapping(path = ("/get"))
    public Optional<User> getById (User user){
        return userRepo.findById((long) user.getId());
    }

    @GetMapping(path = ("/all"))
    public Iterable<User> getAll() {
      return userRepo.findAll();
    }
}
