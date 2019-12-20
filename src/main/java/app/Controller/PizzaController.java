package app.Controller;

import app.entity.Pizza;
import app.service.PizzaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/pizza")
public class PizzaController {

    private final PizzaService service;

    public PizzaController(PizzaService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public Pizza getById (@PathVariable("id") Pizza pizza) {
        return service.getPizza(pizza.getPizzaID());
    }

    @GetMapping
    public Iterable<Pizza> getAll() {
        return service.getAllPizza();
    }

    @PostMapping
    public String addPizza (@RequestBody Pizza pizza){
        service.addPizza(pizza);
        return "Added";
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@RequestBody int id) {
        service.deleteByID(id);
        return "Deleted";
    }
}
