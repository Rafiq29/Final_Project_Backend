package app.repo;

import app.entity.Sauce;
import org.springframework.data.repository.CrudRepository;

public interface SousRepo extends CrudRepository<Sauce,Long> {
}
