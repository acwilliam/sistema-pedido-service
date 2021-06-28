package com.acwilliammsn.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acwilliammsn.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		//User u = new User(1L,"maria","maria@gmail.com","999999","123456");
		User u = new User(2L, "Cristian","crisqu@gmail.com","999999","123465");
		
		
	
		return ResponseEntity.ok().body(u);
	}
}
