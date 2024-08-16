package org.example.serviceemploye.domain.service.serviceImpl;

import org.example.serviceemploye.domain.service.ProjectService;
import org.example.serviceemploye.shared.dto.EmployeDTO;
import org.example.serviceemploye.shared.dto.ProjectDTO;
import org.example.serviceemploye.shared.port.ProjectPort;

import java.util.List;

public class ProjectServiceImpl implements ProjectService {
    private final ProjectPort projectPort;

    public ProjectServiceImpl(ProjectPort projectPort) {
        this.projectPort = projectPort;
    }

    @Override
    public ProjectDTO save(ProjectDTO project) {
        ProjectDTO projectDTO = new ProjectDTO(project);
        projectDTO = projectPort.save(projectDTO);
        return projectDTO;
    }

    @Override
    public List<ProjectDTO> findAll() {
        return projectPort.findAll();
    }

    @Override
    public ProjectDTO findById(Long id) {

        ProjectDTO projectDTO = projectPort.findById(id);
        return projectDTO;
    }

    @Override
    public void deleteById(Long id) {
        projectPort.deleteById(id);
    }
}
