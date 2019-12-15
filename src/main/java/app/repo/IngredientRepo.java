package app.repo;

import app.entity.IngredientsDb;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepo extends CrudRepository<IngredientsDb,Long> {
}
