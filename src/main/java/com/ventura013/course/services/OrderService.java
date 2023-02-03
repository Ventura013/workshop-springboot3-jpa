 package com.ventura013.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ventura013.course.entities.Order;
import com.ventura013.course.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository Repository;

	public List<Order> findAll() {
		return Repository.findAll();		
	}
	
	public Order findById(Integer id) {
		Optional<Order> obj = Repository.findById(id);
		return obj.get();
	}
}
