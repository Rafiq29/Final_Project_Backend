package app.Controller;

import app.entity.PizzaOrder;
import app.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderRepo orderRepo;

    @PostMapping(path = ("/add"))
    public String addOrder (PizzaOrder order){
        return ("Order completed");
    }

    @GetMapping(path = ("/get"))
    public Optional<PizzaOrder> getById (PizzaOrder order){
        return orderRepo.findById(order.getId());
    }

    @GetMapping(path = ("/all"))
    public Iterable<PizzaOrder> getAll (){
        return orderRepo.findAll();
    }
}
