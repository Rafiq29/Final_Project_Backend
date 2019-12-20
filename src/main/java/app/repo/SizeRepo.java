package app.repo;

import app.entity.Size;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SizeRepo extends CrudRepository <Size,Integer> {
}
