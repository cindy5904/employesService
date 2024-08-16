package org.example.serviceemploye.infrastructure.restProject.impl;

import org.example.serviceemploye.infrastructure.restProject.config.RestClient;
import org.example.serviceemploye.shared.dto.ProjectDTO;
import org.example.serviceemploye.shared.port.ProjectPort;

import java.util.List;

public class ProjectPortImpl implements ProjectPort {

    private final RestClient<ProjectDTO[], ProjectDTO> restClient;

    public ProjectPortImpl(RestClient<ProjectDTO[], ProjectDTO> restClient) {
        this.restClient = restClient;
    }

    @Override
    public ProjectDTO save(ProjectDTO project) {
        return null;
    }

    @Override
    public List<ProjectDTO> findAll() {
        return null;
    }

    @Override
    public ProjectDTO findById(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
