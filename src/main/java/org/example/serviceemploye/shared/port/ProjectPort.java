package org.example.serviceemploye.shared.port;


import org.example.serviceemploye.shared.dto.ProjectDTO;

import java.util.List;

public interface ProjectPort {
    ProjectDTO save(ProjectDTO project);
    List<ProjectDTO> findAll();
    ProjectDTO findById(Long id);
    void deleteById(Long id);
}
