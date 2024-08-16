package org.example.serviceemploye.domain.entity;

public class Project {
    private Long id;
    private  Long employeId;
    private String name;
    private String description;
    private String status;

    public Project(Long id, Long employeId, String name, String description, String status) {
        this.id = id;
        this.employeId = employeId;
        this.name = name;
        this.description = description;
        this.status = status;
    }

    public Project(Long employeId, String name, String description, String status) {
        this.employeId = employeId;
        this.name = name;
        this.description = description;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEmployeId() {
        return employeId;
    }

    public void setEmployeId(Long employeId) {
        this.employeId = employeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
