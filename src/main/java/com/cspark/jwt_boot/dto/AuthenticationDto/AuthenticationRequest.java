package com.cspark.jwt_boot.dto.AuthenticationDto;

import lombok.Data;

@Data
public class AuthenticationRequest {
    private String username;
    private String password;
}