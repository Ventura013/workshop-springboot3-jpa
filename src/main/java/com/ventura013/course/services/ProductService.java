 package com.ventura013.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ventura013.course.entities.Product;
import com.ventura013.course.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository Repository;

	public List<Product> findAll() {
		return Repository.findAll();		
	}
	
	public Product findById(Integer id) {
		Optional<Product> obj = Repository.findById(id);
		return obj.get();
	}
}
