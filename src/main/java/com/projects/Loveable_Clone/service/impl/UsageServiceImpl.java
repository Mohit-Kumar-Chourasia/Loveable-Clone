package com.projects.Loveable_Clone.service.impl;

import com.projects.Loveable_Clone.dto.usage.PlanLimitResponse;
import com.projects.Loveable_Clone.dto.usage.UsageTodayResponse;
import com.projects.Loveable_Clone.service.UsageService;
import org.springframework.stereotype.Service;

@Service
public class UsageServiceImpl implements UsageService {
    @Override
    public UsageTodayResponse getUsageToday(Long userId) {
        return null;
    }

    @Override
    public PlanLimitResponse getCurrentSubscriptionLimitOfUser(Long userId) {
        return null;
    }
}
