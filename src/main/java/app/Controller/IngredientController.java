package app.Controller;

import app.repo.IngredientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ingredient")
public class IngredientController {

    @Autowired
    IngredientRepo ingredientRepo;

//    @PostMapping(path = ("/"))
//
//    @GetMapping()
}
