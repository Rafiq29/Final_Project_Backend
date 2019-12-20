package app.Controller;

import app.entity.Ingredient;
import app.repo.IngredientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class IngredientController {
    @Autowired
    IngredientRepo ingredientRepo;

    @GetMapping(path = ("/get"))
    public Optional<Ingredient> getById (Ingredient ingredient) {
        return ingredientRepo.findById(ingredient.getId());
    }

    @GetMapping(path = ("/all"))
    public Iterable<Ingredient> getAll() {
        return ingredientRepo.findAll();
    }
}
