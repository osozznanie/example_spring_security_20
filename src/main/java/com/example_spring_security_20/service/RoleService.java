package com.example_spring_security_20.service;

import com.example_spring_security_20.models.ERole;
import com.example_spring_security_20.models.Role;
import org.springframework.stereotype.Service;

@Service
public interface RoleService {
    Role findByName(ERole name);

}
