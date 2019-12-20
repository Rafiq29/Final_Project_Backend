package app.repo;

import app.entity.InCard;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InCardRepo extends CrudRepository<InCard,Integer> {
}
