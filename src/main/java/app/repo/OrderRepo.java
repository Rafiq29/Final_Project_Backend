package app.repo;

import app.entity.OrderDb;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepo extends CrudRepository <OrderDb,Long> {
}
