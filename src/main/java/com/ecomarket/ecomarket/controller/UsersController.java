package com.ecomarket.ecomarket.controller;

import com.ecomarket.ecomarket.domain.Users;
import com.ecomarket.ecomarket.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    public UsersService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Users save (@RequestBody Users user){
        return service.save(user);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Users findById(@PathVariable Integer id){
        return service.findById(id);
    }


}
