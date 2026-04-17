package com.projects.Loveable_Clone.service;

import com.projects.Loveable_Clone.dto.project.FileContentResponse;
import com.projects.Loveable_Clone.dto.project.FileNode;

import java.util.List;

public interface FileService {
    List<FileNode> getFileTree(Long pathId, Long userId);

    FileContentResponse getFileContent(Long pathId, String path, Long userId);
}
