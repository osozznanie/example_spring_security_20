package com.example_spring_security_20.dao;

import com.example_spring_security_20.models.ERole;
import com.example_spring_security_20.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findRoleByName(ERole name);
}
