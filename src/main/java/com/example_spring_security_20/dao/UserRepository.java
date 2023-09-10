package com.example_spring_security_20.dao;

import com.example_spring_security_20.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findUserById(int id);
    Optional<User> findUserByName(String name);
    Boolean existsByName(String name);
    Boolean existsById(int id);


}
