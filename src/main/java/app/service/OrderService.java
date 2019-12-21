package app.service;

import app.entity.PizzaOrder;
import app.repo.OrderRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    private final OrderRepo orderRepo;

    public OrderService(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    public void addOrder(Collection<PizzaOrder> pizzaOrder) {
        orderRepo.saveAll(pizzaOrder);
    }


    public void deleteOrder(PizzaOrder pizzaOrder) {
        orderRepo.delete(pizzaOrder);
    }
    public void deleteByID(int id) {orderRepo.deleteById(id);}

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
