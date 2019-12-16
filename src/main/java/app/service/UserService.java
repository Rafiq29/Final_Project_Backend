package app.service;
import app.entity.User;
import app.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    private void addUser(User user) {
        userRepo.save(user);
    }

    private void deleteUserByID(int id) {
        userRepo.deleteById((long) id);
    }

    private void deleteUser(User user) {
        userRepo.delete(user);
    }

    private User getUser(int id) {
        Optional<User> optUser = userRepo.findById((long) id);
        return optUser.orElseGet(User::new);
    }

    private List<User> getAllUser() {
        List<User> users = new ArrayList<>();
        userRepo.findAll().forEach(users::add);
        return users;
    }
}
