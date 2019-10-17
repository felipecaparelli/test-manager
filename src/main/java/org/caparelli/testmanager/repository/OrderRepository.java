package org.caparelli.testmanager.repository;

import org.caparelli.testmanager.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
