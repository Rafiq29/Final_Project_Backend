package app.service;

import app.entity.Order;
import app.entity.User;
import app.repo.OrderRepo;
import app.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepo orderRepo;

    private List<Order> getAllOrder() {
        List<Order> orders = new ArrayList<>();
        orderRepo.findAll().forEach(orders::add);
        return orders;
    }

    private void addOrder(Order order) {
        orderRepo.save(order);
    }

    private void deleteOrderByID(int id) {
        orderRepo.deleteById((long) id);
    }

    private void deleteOrder(Order order) {
        orderRepo.delete(order);
    }

    private Order getOrder(int id) {
        Optional<Order> optOrder = orderRepo.findById((long) id);
        return optOrder.orElseGet(Order::new);
    }
}
