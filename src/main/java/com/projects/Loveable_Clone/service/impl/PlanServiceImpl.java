package com.projects.Loveable_Clone.service.impl;

import com.projects.Loveable_Clone.dto.subscription.PlanResponse;
import com.projects.Loveable_Clone.service.PlanService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanServiceImpl implements PlanService {
    @Override
    public List<PlanResponse> getAllActivePlans() {
        return List.of();
    }
}
