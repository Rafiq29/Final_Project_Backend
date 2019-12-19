package app.service;

import app.repo.IngredientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class IngredientService {
    @Autowired
    private IngredientRepo ingredientRepo;

    private void addIngredients(Ingredient ingredient) {
        ingredientRepo.save(ingredient);
    }

    private void deleteIngredientByID(int id) {
        ingredientRepo.deleteById(id);
    }

    private void deleteIngredient(Ingredient ingredient) {
        ingredientRepo.delete(ingredient);
    }

    private Ingredient getIngredient(int id) {
        Optional<Ingredient> optIngredient = ingredientRepo.findById(id);
        return optIngredient.orElseGet(Ingredient::new);
    }

    private List<Ingredient> getAllIngredients() {
        List<Ingredient> ingredients = new ArrayList<>();
        ingredientRepo.findAll().forEach(ingredients::add);
        return ingredients;
    }

}
