package com.ecomarket.ecomarket.service;

import com.ecomarket.ecomarket.domain.Users;
import com.ecomarket.ecomarket.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    @Autowired
    private UsersRepository repository;

    public Users save (Users user){
        return repository.save(user);
    }

    public Users findById (int id){
        return repository.findById(id).orElse(null);
    }
}
