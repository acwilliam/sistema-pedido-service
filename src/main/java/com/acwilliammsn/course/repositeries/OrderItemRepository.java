package com.acwilliammsn.course.repositeries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acwilliammsn.course.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
