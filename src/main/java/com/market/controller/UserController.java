package com.market.controller;

import com.market.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    @GetMapping
    public ResponseEntity<User> finAll(){
        User u = new User(1111,"Maria","maria@gmail.com","99999","125555");
        return ResponseEntity.ok().body(u);
    }
}
