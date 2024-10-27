package com.cspark.jwt_boot.security;

import lombok.Data;

@Data
public class AuthenticationRequest {
    private String username;
    private String password;
}