package com.educandoweb.projeto_spring.resources;

import com.educandoweb.projeto_spring.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L,"Maria","Maria@gmail.com", "965969147","1234");
        return ResponseEntity.ok().body(u);
    }
}
