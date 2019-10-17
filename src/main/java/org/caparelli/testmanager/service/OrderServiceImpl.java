package org.caparelli.testmanager.service;

import org.caparelli.testmanager.model.Order;
import org.caparelli.testmanager.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    private OrderRepository repository;

    public OrderServiceImpl(){}

    @Autowired
    public OrderServiceImpl(OrderRepository repository) {
        this.repository = repository;
    }

    @Override
    public Order create(Order orderRequest) {
        return repository.save(orderRequest);
    }
}
