package org.caparelli.testmanager.service;


import org.caparelli.testmanager.model.Order;

public interface OrderService {
    Order create(Order orderRequest);
}
