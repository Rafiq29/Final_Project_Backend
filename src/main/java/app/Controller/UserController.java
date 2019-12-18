package app.Controller;


import app.entity.User;
import app.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @PostMapping(path = ("/add"))
    public String addNewUser(@RequestParam User user) {
        return ("User added");
    }


    @GetMapping(path = ("/all"))
    public Iterable<User> getAll() {
      return userRepo.findAll();
    }
}
