package app.repo;

import app.entity.PizzaOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends CrudRepository<PizzaOrder, Integer> {
}
