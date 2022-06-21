package com.web.springdemo.service;

import com.web.springdemo.entities.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User createUser(User user){
        User savedUser = new User(
                user.getId(),
                user.getName(),
                user.getUsername()
        );
        return savedUser;
    }
}
