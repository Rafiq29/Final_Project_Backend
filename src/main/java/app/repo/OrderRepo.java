package app.repo;

import app.entity.PizzaOrder;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepo extends CrudRepository<PizzaOrder, Long> {
}
