package com.projects.Loveable_Clone.entity;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.time.Instant;


@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
     Long id;
     String email;
     String passwordHash;

     String avatarUrl;
     Instant createdAt;
     Instant updatedAt;
     Instant deletedAt;

}
