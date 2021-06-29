package com.acwilliammsn.course.repositeries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acwilliammsn.course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
