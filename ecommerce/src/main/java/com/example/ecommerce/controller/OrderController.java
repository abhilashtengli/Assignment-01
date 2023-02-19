package com.example.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce.model.OrderModel;
import com.example.ecommerce.service.OrderService;

@RestController
public class OrderController {
    @Autowired
    OrderService service;

    @PostMapping("/createorder")
    public void createUser(@RequestBody OrderModel o){
         service.createOrder(o);

    }

    @GetMapping("/orderid/{oId}")
    public OrderModel getOrderById(@PathVariable Integer oId){
        return service.getOrderById(oId);
    }
}
