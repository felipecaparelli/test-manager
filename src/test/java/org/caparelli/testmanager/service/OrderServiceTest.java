package org.caparelli.testmanager.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.caparelli.testmanager.model.Order;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OrderServiceTest {

    @Autowired
    private OrderService orderService;

    @DisplayName("Test new Order creation")
    @Test
    public void testNewOrder() {
        Order orderRequest = new Order();
        orderRequest.setName("Order 1");
        Order newOrder = orderService.create(orderRequest);
        assertNotNull(newOrder.getId());
    }
}
