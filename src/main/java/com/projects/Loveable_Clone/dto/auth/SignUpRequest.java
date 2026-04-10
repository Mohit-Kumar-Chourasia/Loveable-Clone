package com.projects.Loveable_Clone.dto.auth;

public record SignUpRequest(
        String email,
        String name,
        String password
) {
}
