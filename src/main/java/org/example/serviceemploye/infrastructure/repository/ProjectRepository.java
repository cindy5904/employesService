package org.example.serviceemploye.infrastructure.repository;

import org.example.serviceemploye.infrastructure.entity.ProjectEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<ProjectEntity, Long> {
}
