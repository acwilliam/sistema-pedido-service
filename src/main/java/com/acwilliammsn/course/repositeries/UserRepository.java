package com.acwilliammsn.course.repositeries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acwilliammsn.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
