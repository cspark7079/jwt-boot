package com.cspark.jwt_boot.config.jwt;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // 여기에서는 간단한 예제로 고정된 사용자 정보를 리턴
        return new org.springframework.security.core.userdetails.User(username, "password", new ArrayList<>());
    }
}