package app.initial;

import app.entity.User;
import app.repo.UserRepo;
import org.springframework.stereotype.Component;

@Component
public class InitialUsers {

    private final UserRepo repo;

    public InitialUsers(UserRepo repo) {
        this.repo = repo;
    }

    public void create() {
        repo.save(new User("Rafiq",
                "Babayev","Rafiq's email",
                "Rafiq's phone","Rafiq's address"));
    }
}
