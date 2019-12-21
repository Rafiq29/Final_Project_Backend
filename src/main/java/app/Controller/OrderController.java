package app.Controller;

import app.entity.PizzaOrder;
import app.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public PizzaOrder getById (@PathVariable("id") PizzaOrder order) {
        return service.getOrder((order.getId()));
    }

    @GetMapping
    public Iterable<PizzaOrder> getAll() {
        return service.getAllOrder();
    }

    @PostMapping
    public String addOrder (@RequestBody Collection<PizzaOrder> order){
        service.addOrder(order);
        return "Added";
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@RequestBody int id) {
        service.deleteByID(id);
        return "Deleted";
    }
}
