package com.ventura013.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ventura013.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
