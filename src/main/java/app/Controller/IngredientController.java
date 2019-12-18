package app.Controller;

import app.repo.IngredientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IngredientController {
    @Autowired
    IngredientRepo ingredientRepo;
}
