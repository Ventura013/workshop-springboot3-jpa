package com.ventura013.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ventura013.course.entities.Product;
import com.ventura013.course.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
	
	@Autowired
	private ProductService Service;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		List<Product> list = Service.findAll();
		return ResponseEntity.ok().body(list);		
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Integer id) {
		Product obj = Service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
