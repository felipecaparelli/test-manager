package org.caparelli.testmanager.service;

import org.caparelli.testmanager.model.Order;
import org.caparelli.testmanager.repository.OrderRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

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
