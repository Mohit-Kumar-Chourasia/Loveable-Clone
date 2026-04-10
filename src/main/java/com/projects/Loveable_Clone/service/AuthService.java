package com.projects.Loveable_Clone.service;

import com.projects.Loveable_Clone.dto.auth.AuthResponse;
import com.projects.Loveable_Clone.dto.auth.LoginRequest;
import com.projects.Loveable_Clone.dto.auth.SignUpRequest;
import com.projects.Loveable_Clone.entity.User;
import org.jspecify.annotations.Nullable;

public interface AuthService {
    AuthResponse signUp(SignUpRequest request);

    AuthResponse login(LoginRequest request);
}
