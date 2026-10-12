package soa.model;

import java.util.List;

public class OrderRequest {

    private int userId;
    private Long restaurantId;
    private List<String> items;

    public OrderRequest() {}

    public int getUserId() {
        return userId;
    }

    public Long getRestaurantId() {
        return restaurantId;
    }

    public List<String> getItems() {
        return items;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }
}