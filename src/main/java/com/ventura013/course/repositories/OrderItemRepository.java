package com.ventura013.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ventura013.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {

}
