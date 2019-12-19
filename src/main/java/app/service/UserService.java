package app.service;
import app.entity.User;
import app.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public UserService() {
    }

    public void addUser(User user) {
        userRepo.save(user);
    }

    public void deleteUserByID(int id) { userRepo.deleteById( id); }

    public void deleteUser(User user) {
        userRepo.delete(user);
    }

    public User getUser(int id) {
        Optional<User> optUser = userRepo.findById( id);
        return optUser.orElseGet(User::new);
    }

    public List<User> getAllUser() {
        List<User> users = new ArrayList<>();
        userRepo.findAll().forEach(users::add);
        return users;
    }

}
