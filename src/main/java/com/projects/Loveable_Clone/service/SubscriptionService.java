package com.projects.Loveable_Clone.service;

import com.projects.Loveable_Clone.dto.subscription.CheckoutRequest;
import com.projects.Loveable_Clone.dto.subscription.CheckoutResponse;
import com.projects.Loveable_Clone.dto.subscription.PortalResponse;
import com.projects.Loveable_Clone.dto.subscription.SubscriptionResponse;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface SubscriptionService {
    List<SubscriptionResponse> getCurrentSubscription(Long userId);

    CheckoutResponse createCheckoutSessionUrl(Long userId, CheckoutRequest checkoutRequest);

    PortalResponse openCustomerPortal(Long userId);
}
