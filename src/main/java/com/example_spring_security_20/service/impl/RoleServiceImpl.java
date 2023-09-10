package com.example_spring_security_20.service.impl;

import com.example_spring_security_20.dao.RoleRepository;
import com.example_spring_security_20.models.ERole;
import com.example_spring_security_20.models.Role;
import com.example_spring_security_20.service.RoleService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Data
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Role findByName(ERole name) {
        return roleRepository.findRoleByName(name);
    }
}
