package com.geekster.Food_delivery.repos;

import com.geekster.Food_delivery.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepo extends JpaRepository<Order,Long> {
    Order findByFoodOrderId(Long orderId);
}
