package com.projects.Loveable_Clone.controller;

import com.projects.Loveable_Clone.dto.member.InviteMemberRequest;
import com.projects.Loveable_Clone.dto.member.MemberResponse;
import com.projects.Loveable_Clone.dto.member.UpdateMemberRoleRequest;
import com.projects.Loveable_Clone.entity.ProjectMember;
import com.projects.Loveable_Clone.service.ProjectMemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/projects/{projectId}/members")
public class ProjectMemberController {

    private final ProjectMemberService projectMemberService;

    @GetMapping
    public ResponseEntity<List<MemberResponse>> getProjectMembers(@PathVariable Long projectId){
        Long userId = 1L;
        return ResponseEntity.ok(projectMemberService.getProjectMembers(projectId,userId));
    }

    @PostMapping
    public ResponseEntity<MemberResponse> inviteMember(
            @PathVariable Long projectId,
            @RequestBody InviteMemberRequest request
    ){
        Long userId =1L;
        return ResponseEntity.status(HttpStatus.CREATED).body(projectMemberService.inviteMember(userId,projectId,request));
    }

    @PatchMapping("/{memberId}")
    public ResponseEntity<MemberResponse> updateMemberRole(
            @PathVariable Long memberId,
            @PathVariable Long projectId,
            @RequestBody UpdateMemberRoleRequest  request
    ){
        Long userId = 1L;
        return ResponseEntity.ok(projectMemberService.updateMemberRole(memberId,projectId,request,userId));
    }

    @DeleteMapping("/{memberId}")
    public ResponseEntity<MemberResponse> deleteMember(
            @PathVariable Long memberId,
            @PathVariable Long projectId
    ){
        Long userId = 1L;
        return ResponseEntity.ok(projectMemberService.deleteProjectMember(memberId,projectId,userId));
    }
}
