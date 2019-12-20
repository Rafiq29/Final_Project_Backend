package app.Controller;

import app.entity.PizzaOrder;
import app.service.OrderService;
import org.springframework.web.bind.annotation.*;

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
        return service.getOrder((order.getPOrderID()));
    }

    @GetMapping
    public List<PizzaOrder> getAll() {
        return service.getAllOrder();
    }

    @PostMapping
    public String addOrder (PizzaOrder order){
        service.addOrder(order);
        return "Added";
    }
}
