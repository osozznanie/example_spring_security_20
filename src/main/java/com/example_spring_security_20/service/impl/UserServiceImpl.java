package com.example_spring_security_20.service.impl;

import com.example_spring_security_20.service.UserService;
import com.example_spring_security_20.dao.UserRepository;
import com.example_spring_security_20.models.User;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Data
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findUserById(int id) {
        return userRepository.findUserById(id)
                        .orElseThrow(() -> new RuntimeException("Cannot find user with id " + id));
    }

    @Override
    public User findUserByName(String name) {
        return userRepository.findUserByName(name)
                .orElseThrow(() -> new RuntimeException("Cannot find user with name " + name));
    }

    @Override
    public Boolean existsByName(String name) {
        return userRepository.existsByName(name);
    }

    @Override
    public Boolean existsById(int id) {
        return userRepository.existsById(id);
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }
}
