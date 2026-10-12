package soa.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class FoodOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    private int userId;
    private Long restaurantId;
    private String items;
    private String status;

    public FoodOrder() {}

    public FoodOrder(int userId, Long restaurantId,
                     String items, String status) {
        this.userId = userId;
        this.restaurantId = restaurantId;
        this.items = items;
        this.status = status;
    }

    public Long getOrderId() {
        return orderId;
    }

    public int getUserId() {
        return userId;
    }

    public Long getRestaurantId() {
        return restaurantId;
    }

    public String getItems() {
        return items;
    }

    public String getStatus() {
        return status;
    }
}