package app.Controller;

import app.entity.PizzaOrder;
import app.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @GetMapping(path = ("/get"))
    public PizzaOrder getById (PizzaOrder order) {
        return service.getOrder((order.getPOrderID()));
    }

    @GetMapping(path = ("/all"))
    public List<PizzaOrder> getAll() {
        return service.getAllOrder();
    }

    @PostMapping(path = ("/add"))
    public String addOrder (PizzaOrder order){
        service.addOrder(order);
        return "Added";
    }
}
