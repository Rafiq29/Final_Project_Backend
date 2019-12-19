package app.repo;

import app.entity.Veggies;
import org.springframework.data.repository.CrudRepository;

public interface VeggiesRepo extends CrudRepository<Veggies,Integer> {
}
