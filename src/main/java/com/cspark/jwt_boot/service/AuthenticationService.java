package com.cspark.jwt_boot.service;

import com.cspark.jwt_boot.mapper.AuthenticationMapper;
import com.cspark.jwt_boot.model.Authentication;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final AuthenticationMapper authenticationMapper;

    public Authentication login(String username, String password) {
        return authenticationMapper.findByUsernameAndPassword(username, password);
    }
}
