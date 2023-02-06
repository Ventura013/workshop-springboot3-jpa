package com.ventura013.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ventura013.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
