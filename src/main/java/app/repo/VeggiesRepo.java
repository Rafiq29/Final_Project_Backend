package app.repo;

import app.entity.Veggies;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeggiesRepo extends CrudRepository<Veggies,Integer> {
}
