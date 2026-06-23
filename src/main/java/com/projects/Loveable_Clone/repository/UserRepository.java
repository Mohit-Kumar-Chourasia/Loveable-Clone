package com.projects.Loveable_Clone.repository;

import com.projects.Loveable_Clone.entity.Project;
import com.projects.Loveable_Clone.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
