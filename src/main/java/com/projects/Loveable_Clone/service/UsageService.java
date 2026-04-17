package com.projects.Loveable_Clone.service;

import com.projects.Loveable_Clone.dto.usage.PlanLimitResponse;
import com.projects.Loveable_Clone.dto.usage.UsageTodayResponse;

public interface UsageService {
    UsageTodayResponse getUsageToday(Long userId);

    PlanLimitResponse getCurrentSubscriptionLimitOfUser(Long userId);
}
