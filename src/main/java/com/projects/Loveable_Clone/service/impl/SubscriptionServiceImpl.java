package com.projects.Loveable_Clone.service.impl;

import com.projects.Loveable_Clone.dto.subscription.CheckoutRequest;
import com.projects.Loveable_Clone.dto.subscription.CheckoutResponse;
import com.projects.Loveable_Clone.dto.subscription.PortalResponse;
import com.projects.Loveable_Clone.dto.subscription.SubscriptionResponse;
import com.projects.Loveable_Clone.service.SubscriptionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {
    @Override
    public List<SubscriptionResponse> getCurrentSubscription(Long userId) {
        return List.of();
    }

    @Override
    public CheckoutResponse createCheckoutSessionUrl(Long userId, CheckoutRequest checkoutRequest) {
        return null;
    }

    @Override
    public PortalResponse openCustomerPortal(Long userId) {
        return null;
    }
}
