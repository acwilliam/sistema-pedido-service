package com.acwilliammsn.course.repositeries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acwilliammsn.course.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {

}
