package soa.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import soa.model.FoodOrder;
import soa.model.OrderRequest;
import soa.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public FoodOrder placeOrder(
            @RequestBody OrderRequest request) {
        return service.placeOrder(request);
    }
}