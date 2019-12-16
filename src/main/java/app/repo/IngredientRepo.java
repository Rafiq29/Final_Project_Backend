package app.repo;

import app.entity.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepo extends CrudRepository<Ingredient, Long> {
}
