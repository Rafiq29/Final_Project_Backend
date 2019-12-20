package app.service;

import app.entity.PizzaOrder;
import app.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    public OrderRepo orderRepo;

    public void addOrder(PizzaOrder pizzaOrder) {
        orderRepo.save(pizzaOrder);
    }

    public void deleteOrderByID(int id) {
        orderRepo.deleteById( id);
    }

    public void deleteOrder(PizzaOrder pizzaOrder) {
        orderRepo.delete(pizzaOrder);
    }

    public PizzaOrder getOrder(int id) {
        Optional<PizzaOrder> optOrder = orderRepo.findById( id);
        return optOrder.orElseGet(PizzaOrder::new);
    }

    public List<PizzaOrder> getAllOrder() {
        List<PizzaOrder> pizzaOrders = new ArrayList<>();
        orderRepo.findAll().forEach(pizzaOrders::add);
        return pizzaOrders;
    }
}
