package org.example.serviceemploye.domain.service;

import org.example.serviceemploye.domain.entity.Project;
import org.example.serviceemploye.shared.dto.ProjectDTO;

import java.util.List;

public interface ProjectService {
    ProjectDTO save(ProjectDTO project);
    List<ProjectDTO> findAll();
    ProjectDTO findById(Long id);
    void deleteById(Long id);
}
