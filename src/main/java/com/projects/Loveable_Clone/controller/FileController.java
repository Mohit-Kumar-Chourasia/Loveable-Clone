package com.projects.Loveable_Clone.controller;

import com.projects.Loveable_Clone.dto.project.FileNode;
import com.projects.Loveable_Clone.dto.project.FileContentResponse;
import com.projects.Loveable_Clone.service.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/projects/{projectId}/files")
public class FileController {

    private final FileService fileService;

    @GetMapping
    public ResponseEntity<List<FileNode>> getFileTree(@PathVariable Long pathId){
        Long userId = 1L;
        return ResponseEntity.ok(fileService.getFileTree(pathId,userId));
    }

    @GetMapping("/{*path}")  //  /scr/hooks/AppHooks.jsx  research why this * is used
    public ResponseEntity<FileContentResponse> getFile(
            @PathVariable Long pathId,
            @PathVariable String path
    ){
        Long userId =1L;
        return ResponseEntity.ok(fileService.getFileContent(pathId,path,userId));
    }
}
