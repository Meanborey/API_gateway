package com.example.ordersservice.repository;

import com.example.ordersservice.enitity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
