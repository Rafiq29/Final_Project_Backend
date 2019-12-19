package app.repo;

import app.entity.Sauce;
import org.springframework.data.repository.CrudRepository;

public interface SauceRepo extends CrudRepository<Sauce,Integer> {
}
