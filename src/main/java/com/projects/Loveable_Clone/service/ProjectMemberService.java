package com.projects.Loveable_Clone.service;

import com.projects.Loveable_Clone.dto.member.InviteMemberRequest;
import com.projects.Loveable_Clone.dto.member.MemberResponse;
import com.projects.Loveable_Clone.dto.member.UpdateMemberRoleRequest;
import com.projects.Loveable_Clone.entity.ProjectMember;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface ProjectMemberService {
    List<MemberResponse> getProjectMembers(Long projectId, Long userId);

    MemberResponse inviteMember(Long userId, Long projectId, InviteMemberRequest request);

    MemberResponse updateMemberRole(Long memberId, Long projectId, UpdateMemberRoleRequest  request, Long userId);

    MemberResponse deleteProjectMember(Long memberId, Long projectId, Long userId);
}
