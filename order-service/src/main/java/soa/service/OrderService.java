package soa.service;

import org.springframework.stereotype.Service;
import soa.model.FoodOrder;
import soa.model.OrderRequest;
import soa.repository.OrderRepository;

@Service
public class OrderService {

    private final OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public FoodOrder placeOrder(OrderRequest request) {

        FoodOrder order = new FoodOrder(
            request.getUserId(),
            request.getRestaurantId(),
            String.join(", ", request.getItems()),
            "Order Placed Successfully"
        );

        return repository.save(order);
    }
}