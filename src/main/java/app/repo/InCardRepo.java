package app.repo;

import app.entity.Basket;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InCardRepo extends CrudRepository<Basket,Integer> {
}
