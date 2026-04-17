package com.projects.Loveable_Clone.dto.member;

import com.projects.Loveable_Clone.enums.ProjectRole;

public record InviteMemberRequest(
        String email,
        ProjectRole role
) {
}
