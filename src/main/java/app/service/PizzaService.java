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
    public PizzaRepo pizzaRepo;

    public void addPizza(Pizza pizza) {
        pizzaRepo.save(pizza);
    }

    public void deletePizzaByID(int id) {
        pizzaRepo.deleteById(id);
    }

    public void deletePizza(Pizza pizza) {
        pizzaRepo.delete(pizza);
    }

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
