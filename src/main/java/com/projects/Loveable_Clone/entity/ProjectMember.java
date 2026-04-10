package com.projects.Loveable_Clone.entity;

import com.projects.Loveable_Clone.enums.ProjectRole;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProjectMember {
    ProjectMemberId id;

    Project project;
    ProjectRole role;
    User user;

    Instant invitedAt;
    Instant acceptedAt;

}
