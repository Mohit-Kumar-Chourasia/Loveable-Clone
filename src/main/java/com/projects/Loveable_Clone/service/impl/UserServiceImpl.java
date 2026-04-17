package com.projects.Loveable_Clone.service.impl;

import com.projects.Loveable_Clone.dto.auth.UserProfileResponse;
import com.projects.Loveable_Clone.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserProfileResponse getProfile(Long userId) {
        return null;
    }
}
