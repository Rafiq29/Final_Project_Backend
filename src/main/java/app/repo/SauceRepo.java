package app.repo;

import app.entity.Sauces;
import org.springframework.data.repository.CrudRepository;

public interface SauceRepo extends CrudRepository<Sauces,Integer> {
}
