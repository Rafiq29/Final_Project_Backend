package app.repo;

import app.entity.PizzaDb;
import org.springframework.data.repository.CrudRepository;

public interface PizzaRepo extends CrudRepository<PizzaDb,Long> {
}
