package com.projects.Loveable_Clone.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "users")
public class User {
     @Id @GeneratedValue(strategy = GenerationType.AUTO)
     Long id;
     String email;
     String passwordHash;

     String avatarUrl;

     @CreationTimestamp
     Instant createdAt;

     @UpdateTimestamp
     Instant updatedAt;
     Instant deletedAt;

}
