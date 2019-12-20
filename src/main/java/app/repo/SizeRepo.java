package app.repo;

import app.entity.Size;
import org.springframework.data.repository.CrudRepository;

public interface SizeRepo extends CrudRepository <Size,Integer> {
}
