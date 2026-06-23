package com.projects.Loveable_Clone.service.impl;

import com.projects.Loveable_Clone.dto.project.ProjectRequest;
import com.projects.Loveable_Clone.dto.project.ProjectResponse;
import com.projects.Loveable_Clone.dto.project.ProjectSummaryResponse;
import com.projects.Loveable_Clone.entity.Project;
import com.projects.Loveable_Clone.entity.User;
import com.projects.Loveable_Clone.mapper.ProjectMapper;
import com.projects.Loveable_Clone.repository.ProjectRepository;
import com.projects.Loveable_Clone.repository.UserRepository;
import com.projects.Loveable_Clone.service.ProjectService;
import jakarta.transaction.Transactional;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Transactional
public class ProjectServiceImpl implements ProjectService {
    ProjectRepository projectRepository;
    UserRepository userRepository;
    ProjectMapper projectMapper;

    @Override
    public ProjectResponse createProject(ProjectRequest request, Long userId) {
        User owner = userRepository.findById(userId).orElseThrow();

        Project project = Project.builder()
                .name(request.name())
                .owner(owner)
                .build();

        project = projectRepository.save(project);

        return projectMapper.toProjectResponse(project);
    }

    @Override
    public List<ProjectSummaryResponse> getUserProjects(Long userId) {
        return List.of();
    }

    @Override
    public ProjectResponse getUserProjectById(Long id, Long userId) {
        return null;
    }

    @Override
    public ProjectResponse updateProject(Long id, ProjectRequest request, Long userId) {
        return null;
    }

    @Override
    public void softDelete(Long id, Long userId) {

    }
}
