package app.repo;

import app.entity.Meats;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeatRepo extends CrudRepository<Meats,Integer> {
}
