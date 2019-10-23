package org.caparelli.testmanager.service;

import org.caparelli.testmanager.request.Order;

public interface OrderService {
    org.caparelli.testmanager.model.Order create(Order orderRequest);
}
