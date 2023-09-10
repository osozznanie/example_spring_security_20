package com.example_spring_security_20.service;

import com.example_spring_security_20.models.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User findUserById(int id);
    User findUserByName(String name);
    Boolean existsByName(String name);
    Boolean existsById(int id);
    void save(User user);
}
