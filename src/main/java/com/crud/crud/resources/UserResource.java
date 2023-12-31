package com.crud.crud.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.crud.entities.User;

@RestController
@RequestMapping(value = "/users")

public class UserResource {
    
    @GetMapping
    ResponseEntity<User> findAll(){
        User u = new User(1L, "Maria", "Maria@gmail.com", "99999999", "senha");
        return ResponseEntity.ok().body(u);
    }
}
