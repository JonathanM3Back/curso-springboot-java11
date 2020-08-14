package com.educandoweb.couse.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.couse.entities.User;

@RestController //Indica que a classe é um recurso web implementando por um controlador web
@RequestMapping(value = "/users") //Nome pro Recurso
public class UserResources  {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "maria", "mari@gmail.com", "122122121", "1232131");
		return ResponseEntity.ok().body(u);
	}

}
