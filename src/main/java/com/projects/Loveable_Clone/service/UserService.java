package com.projects.Loveable_Clone.service;

import com.projects.Loveable_Clone.dto.auth.UserProfileResponse;
import org.jspecify.annotations.Nullable;

public interface UserService {
    public UserProfileResponse getProfile(Long userId);
}
