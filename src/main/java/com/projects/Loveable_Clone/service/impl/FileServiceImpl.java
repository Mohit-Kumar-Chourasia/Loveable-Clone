package com.projects.Loveable_Clone.service.impl;

import com.projects.Loveable_Clone.dto.project.FileContentResponse;
import com.projects.Loveable_Clone.dto.project.FileNode;
import com.projects.Loveable_Clone.service.FileService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileServiceImpl implements FileService {
    @Override
    public List<FileNode> getFileTree(Long pathId, Long userId) {
        return List.of();
    }

    @Override
    public FileContentResponse getFileContent(Long pathId, String path, Long userId) {
        return null;
    }
}
