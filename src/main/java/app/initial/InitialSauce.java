package app.initial;

import app.entity.Sauce;
import app.repo.SauceRepo;
import org.springframework.stereotype.Component;

@Component
public class InitialSauce {
    private final SauceRepo repo;

    public InitialSauce(SauceRepo sauceRepo) {
        this.repo = sauceRepo;
    }

    public void create () {
        repo.save(new Sauce("Ketchup",0.70,"photo","description"));

    }
}
