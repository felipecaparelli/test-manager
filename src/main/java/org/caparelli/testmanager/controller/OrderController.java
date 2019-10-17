package org.caparelli.testmanager.controller;

import org.caparelli.testmanager.model.Order;
import org.caparelli.testmanager.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    private OrderService service;

    @Autowired
    public OrderController(OrderService service) {
        this.service = service;
    }

    @PostMapping(value = "/order")
    public ResponseEntity<Object> createOrder(@RequestBody Order order) {
        try {
            return ResponseEntity.status(HttpStatus.CREATED).body(service.create(order));
        } catch (RuntimeException e) {
            return ResponseEntity.noContent().build();
        }
    }
}
