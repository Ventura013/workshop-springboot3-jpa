 package com.ventura013.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ventura013.course.entities.Category;
import com.ventura013.course.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository Repository;

	public List<Category> findAll() {
		return Repository.findAll();		
	}
	
	public Category findById(Integer id) {
		Optional<Category> obj = Repository.findById(id);
		return obj.get();
	}
}
