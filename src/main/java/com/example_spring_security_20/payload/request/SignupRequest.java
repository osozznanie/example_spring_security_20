package com.example_spring_security_20.payload.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;


@AllArgsConstructor
@Data
@Builder
@NoArgsConstructor
public class SignupRequest {
    private String username;
    private Set<String> role;
    private String password;
}
