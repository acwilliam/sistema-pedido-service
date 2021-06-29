package com.acwilliammsn.course.repositeries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acwilliammsn.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
