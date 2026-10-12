package soa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import soa.model.Restaurant;
import soa.repository.RestaurantRepository;

@Service
public class RestaurantService {

    private final RestaurantRepository repository;

    public RestaurantService(RestaurantRepository repository) {
        this.repository = repository;
    }

    public List<Restaurant> getAllRestaurants() {
        return repository.findAll();
    }
}