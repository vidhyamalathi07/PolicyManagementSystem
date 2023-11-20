package com.hexaware.policymanagement.controller;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.policymanagement.dto.AuthRequest;
import com.hexaware.policymanagement.services.JwtService;

@RestController
@RequestMapping("/api/v1/login")
public class LoginController {

    private final AuthenticationManager authenticationManager;
    private final JwtService jwtService;
    

    public LoginController
    (
            AuthenticationManager authenticationManager,
            JwtService jwtService)
            
    {
        this.authenticationManager = authenticationManager;
        this.jwtService = jwtService;
        
    }

    @PostMapping("/user")
    public String userLogin(@RequestBody AuthRequest authRequest) 
    {
        authenticate(authRequest.getUsername(), authRequest.getPassword());

        String token = jwtService.generateToken(authRequest.getUsername());
        return "User login successful. Token: " + token;
    }

    private void authenticate(String username, String password) 
    {
        Authentication authenticate = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(username, password));

        if (!authenticate.isAuthenticated()) 
        {
            throw new UsernameNotFoundException("Invalid Username or Password / Invalid request");
        }
    }
}