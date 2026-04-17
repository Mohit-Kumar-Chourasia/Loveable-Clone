package com.projects.Loveable_Clone.service;

import com.projects.Loveable_Clone.dto.auth.UserProfileResponse;
import org.jspecify.annotations.Nullable;

public interface UserService {
    UserProfileResponse getProfile(Long userId);
}
