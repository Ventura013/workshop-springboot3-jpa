package com.ventura013.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ventura013.course.entities.User;

@RestController
@RequestMapping(value = "/Users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(10, "Diego", "diego@gmail.com", "9999999", "12345");
		return ResponseEntity.ok().body(u);		
	}
}
