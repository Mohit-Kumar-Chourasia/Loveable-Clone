package com.projects.Loveable_Clone.controller;

import com.projects.Loveable_Clone.dto.usage.PlanLimitResponse;
import com.projects.Loveable_Clone.dto.usage.UsageTodayResponse;
import com.projects.Loveable_Clone.service.UsageService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/usage")
public class UsageController {
    private final UsageService usageService;

    @GetMapping("/today")
    public ResponseEntity<UsageTodayResponse> getUsage(){
        Long userId = 1L;
        return ResponseEntity.ok(usageService.getUsageToday(userId));
    }

    @GetMapping("/limits")
    public ResponseEntity<PlanLimitResponse> getAllUsage(){
        Long userId = 1L;
        return ResponseEntity.ok(usageService.getCurrentSubscriptionLimitOfUser(userId));
    }
}
