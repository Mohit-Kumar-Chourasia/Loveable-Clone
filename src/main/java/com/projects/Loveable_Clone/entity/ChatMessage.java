package com.projects.Loveable_Clone.entity;

import com.projects.Loveable_Clone.enums.MessageRole;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChatMessage {

    Long id;
    ChatSession session;

    String content;
    String toolCalls;

    Integer tokensUsed;

    Instant createdAt;

    MessageRole role;
}
