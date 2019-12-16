package app.service;

import app.entity.Pizza;
import app.repo.PizzaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PizzaService {
    @Autowired
    private PizzaRepo pizzaRepo;


    private void addPizza(Pizza pizza) {
        pizzaRepo.save(pizza);
    }

    private void deletePizzaByID(int id) {
        pizzaRepo.deleteById((long) id);
    }

    private void deletePizza(Pizza pizza) {
        pizzaRepo.delete(pizza);
    }

    private Pizza getPizza(int id) {
        Optional<Pizza> optPizza = pizzaRepo.findById((long) id);
        return optPizza.orElseGet(Pizza::new);
    }

    private List<Pizza> getAllPizza() {
        List<Pizza> pizza = new ArrayList<>();
        pizzaRepo.findAll().forEach(pizza::add);
        return pizza;
    }

}
