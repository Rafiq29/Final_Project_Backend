package app.service;

import app.entity.Pizza;
import app.repo.PizzaRepo;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PizzaService {
    private final PizzaRepo pizzaRepo;

    public PizzaService(PizzaRepo pizzaRepo) {
        this.pizzaRepo = pizzaRepo;
    }

    public void addPizza(Collection<Pizza> pizza) {
       pizzaRepo.saveAll(pizza);
//       pizzaRepo.saveAll(pizza.stream().map(p -> { p.setId(0); return p; }).collect(Collectors.toList()));
    }


    public void deletePizza(Pizza pizza) {
        pizzaRepo.delete(pizza);
    }
    public void deleteByID(int id) {pizzaRepo.deleteById(id);}

    public Pizza getPizza(int id) {
        Optional<Pizza> optPizza = pizzaRepo.findById( id);
        return optPizza.orElseGet(Pizza::new);
    }

    public List<Pizza> getAllPizza() {
        List<Pizza> pizza = new ArrayList<>();
        pizzaRepo.findAll().forEach(pizza::add);
        return pizza;
    }

}
