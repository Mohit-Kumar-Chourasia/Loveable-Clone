package com.projects.Loveable_Clone.entity;

import com.projects.Loveable_Clone.enums.PreviewStatus;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Preview {

    Long id;
    Project project;
    String nameSpace;
    String previewUrl;
    String podName;

    Instant startedAt;
    Instant terminatedAt;
    Instant createdAt;

    PreviewStatus status;
}
