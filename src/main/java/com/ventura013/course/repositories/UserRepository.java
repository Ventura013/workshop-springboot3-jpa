package com.ventura013.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ventura013.course.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
