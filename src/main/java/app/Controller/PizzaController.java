package app.Controller;

import app.entity.Pizza;
import app.repo.PizzaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RestController
@RequestMapping("/pizza")
public class PizzaController {
    @Autowired
    PizzaRepo pizzaRepo;

    @GetMapping(path = ("/get"))
    public Optional<Pizza> getByName(Pizza pizza){
        return pizzaRepo.findById((long) pizza.getId());
    }

    @GetMapping(path = ("/all"))
    public Iterable<Pizza> getAll (){
        return pizzaRepo.findAll();
    }
}
