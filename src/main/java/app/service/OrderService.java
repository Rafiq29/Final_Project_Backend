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
    private OrderRepo orderRepo;

    private void addOrder(PizzaOrder pizzaOrder) {
        orderRepo.save(pizzaOrder);
    }

    private void deleteOrderByID(int id) {
        orderRepo.deleteById( id);
    }

    private void deleteOrder(PizzaOrder pizzaOrder) {
        orderRepo.delete(pizzaOrder);
    }

    private PizzaOrder getOrder(int id) {
        Optional<PizzaOrder> optOrder = orderRepo.findById( id);
        return optOrder.orElseGet(PizzaOrder::new);
    }

    private List<PizzaOrder> getAllOrder() {
        List<PizzaOrder> pizzaOrders = new ArrayList<>();
        orderRepo.findAll().forEach(pizzaOrders::add);
        return pizzaOrders;
    }
}
