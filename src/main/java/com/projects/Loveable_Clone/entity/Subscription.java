package com.projects.Loveable_Clone.entity;

import com.projects.Loveable_Clone.enums.SubscriptionStatus;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Subscription {
    Long id;
    User user;
    Plan plan;

    String stripeCustomerId;
    String stripeSubscriptionId;

    SubscriptionStatus status;

    Instant currentPeriodStart;
    Instant currentPeriodEnd;
    Boolean cancelAtPeriodEnd;

    Instant createdAt;
    Instant deletedAt;
}
