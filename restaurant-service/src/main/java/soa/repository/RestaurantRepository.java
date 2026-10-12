package soa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import soa.model.Restaurant;

public interface RestaurantRepository
        extends JpaRepository<Restaurant, Long> {
}