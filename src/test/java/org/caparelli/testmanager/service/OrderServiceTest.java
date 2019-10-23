package org.caparelli.testmanager.service;

import org.caparelli.testmanager.request.Order;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class OrderServiceTest {

    @Autowired
    private OrderService orderService;

    @DisplayName("Test new Order creation")
    @Test
    public void testNewOrder() {
        Order orderRequest = new Order();
        orderRequest.addTestsItem(new org.caparelli.testmanager.request.Test());
        org.caparelli.testmanager.model.Order newOrder = orderService.create(orderRequest);
        assertNotNull(newOrder.getOrderId());
    }
}
