package com.projects.Loveable_Clone.service.impl;

import com.projects.Loveable_Clone.dto.auth.AuthResponse;
import com.projects.Loveable_Clone.dto.auth.LoginRequest;
import com.projects.Loveable_Clone.dto.auth.SignUpRequest;
import com.projects.Loveable_Clone.service.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public AuthResponse signUp(SignUpRequest request) {
        return null;
    }

    @Override
    public AuthResponse login(LoginRequest request) {
        return null;
    }
}
