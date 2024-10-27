package com.cspark.jwt_boot.security;

import com.cspark.jwt_boot.config.jwt.JwtUtil;
import com.cspark.jwt_boot.config.jwt.MyUserDetailsService;
import com.cspark.jwt_boot.model.Authentication;
import com.cspark.jwt_boot.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    private final AuthenticationManager authenticationManager;

    private final MyUserDetailsService userDetailsService;

    private final JwtUtil jwtUtil;

    @PostMapping("/authenticate")
    public ResponseEntity<String> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {

        Authentication authentication = authenticationService.login(authenticationRequest.getUsername(), authenticationRequest.getPassword());

        if(authentication == null) {
            return ResponseEntity.status(401).body("Invalid username or password");
        }

        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword())
            );
        } catch (AuthenticationException e) {
            throw new Exception("Incorrect username or password", e);
        }

        final UserDetails userDetails = userDetailsService
                .loadUserByUsername(authenticationRequest.getUsername());

        final String jwt = jwtUtil.generateToken(userDetails.getUsername());

        return ResponseEntity.ok()
                .header("Content-Type", "application/json")
                .body(jwt);
    }
}
