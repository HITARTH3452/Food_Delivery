package com.geekster.Food_delivery.controllers;

import com.geekster.Food_delivery.models.Order;
import com.geekster.Food_delivery.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService foodOrderService;

    @PostMapping()
    public Order createOrder(@RequestParam String userEmail, @RequestParam String token, @RequestBody Order foodOrder){
        return foodOrderService.createOrder(foodOrder);
    }

    @GetMapping("/{orderId}")
    public Order getOrderById(@PathVariable Long orderId){
        return foodOrderService.getOrderById(orderId);
    }
}
