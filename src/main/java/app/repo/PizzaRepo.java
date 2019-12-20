package app.repo;

import app.entity.Pizza;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaRepo extends CrudRepository<Pizza, Integer> {
}
