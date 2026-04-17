package com.projects.Loveable_Clone.service.impl;

import com.projects.Loveable_Clone.dto.member.InviteMemberRequest;
import com.projects.Loveable_Clone.dto.member.MemberResponse;
import com.projects.Loveable_Clone.dto.member.UpdateMemberRoleRequest;
import com.projects.Loveable_Clone.service.ProjectMemberService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectMemberServiceImpl implements ProjectMemberService {
    @Override
    public List<MemberResponse> getProjectMembers(Long projectId, Long userId) {
        return List.of();
    }

    @Override
    public MemberResponse inviteMember(Long userId, Long projectId, InviteMemberRequest request) {
        return null;
    }

    @Override
    public MemberResponse updateMemberRole(Long memberId, Long projectId, UpdateMemberRoleRequest request, Long userId) {
        return null;
    }

    @Override
    public MemberResponse deleteProjectMember(Long memberId, Long projectId, Long userId) {
        return null;
    }
}
