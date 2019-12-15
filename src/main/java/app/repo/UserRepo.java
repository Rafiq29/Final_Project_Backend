package app.repo;

import app.entity.UserDb;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<UserDb,Long> {
}
