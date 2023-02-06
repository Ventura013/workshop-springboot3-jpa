package com.ventura013.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ventura013.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
