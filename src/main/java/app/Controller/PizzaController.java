package app.Controller;

import app.entity.Meats;
import app.entity.Pizza;
import app.repo.PizzaRepo;
import app.service.MeatService;
import app.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/pizza")
public class PizzaController {
    @Autowired
    PizzaService service;

    @GetMapping(path = ("/get"))
    public Pizza getById (Pizza pizza) {
        return service.getPizza(pizza.getPizzaID());
    }

    @GetMapping(path = ("/all"))
    public List<Pizza> getAll() {
        return service.getAllPizza();
    }

    @PostMapping(path = ("/add"))
    public String addPizza (Pizza pizza){
        service.addPizza(pizza);
        return "Added";
    }
}
