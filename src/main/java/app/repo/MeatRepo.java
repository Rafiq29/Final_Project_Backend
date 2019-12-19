package app.repo;

import app.entity.Meats;
import org.springframework.data.repository.CrudRepository;

public interface MeatRepo extends CrudRepository<Meats,Integer> {
}
