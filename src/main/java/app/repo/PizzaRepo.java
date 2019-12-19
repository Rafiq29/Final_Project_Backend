package app.repo;

import app.entity.Pizza;
import org.springframework.data.repository.CrudRepository;

public interface PizzaRepo extends CrudRepository<Pizza, Integer> {
}
