package app.initial;

import app.entity.Pizza;
import app.repo.PizzaRepo;
import org.springframework.stereotype.Component;

@Component
public class InitialPizza {
    private final PizzaRepo repo;

    public InitialPizza(PizzaRepo repo) {
        this.repo = repo;
    }

}
