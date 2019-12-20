package app.repo;

import app.entity.Sauces;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SauceRepo extends CrudRepository<Sauces,Integer> {
}
