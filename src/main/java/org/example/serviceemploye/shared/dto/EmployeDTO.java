package org.example.serviceemploye.shared.dto;

import org.example.serviceemploye.domain.entity.Project;

import java.util.List;

public class EmployeDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private List<ProjectDTO> projectDTOS;

    public EmployeDTO(Long id, String firstName, String lastName, String email, List<ProjectDTO> projectDTOS) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.projectDTOS = projectDTOS;
    }

    public EmployeDTO(String firstName, String lastName, String email, List<ProjectDTO> projectDTOS) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.projectDTOS = projectDTOS;
    }

    public EmployeDTO(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public EmployeDTO(EmployeDTO employe) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<ProjectDTO> getProjectDTOS() {
        return projectDTOS;
    }

    public void setProjectDTOS(List<ProjectDTO> projectDTOS) {
        this.projectDTOS = projectDTOS;
    }
}
