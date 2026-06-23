package com.projects.Loveable_Clone.mapper;

import com.projects.Loveable_Clone.dto.project.ProjectResponse;
import com.projects.Loveable_Clone.entity.Project;
import com.projects.Loveable_Clone.repository.ProjectRepository;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProjectMapper {


    ProjectResponse toProjectResponse(Project project);
}
