package soa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import soa.model.FoodOrder;

public interface OrderRepository
        extends JpaRepository<FoodOrder, Long> {
}