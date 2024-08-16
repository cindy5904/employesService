package org.example.serviceemploye.domain.service;

import lombok.extern.java.Log;
import org.example.serviceemploye.domain.entity.Employe;
import org.example.serviceemploye.shared.dto.EmployeDTO;

import java.util.List;

public interface EmployeService {

    EmployeDTO save(EmployeDTO employe);
    List<EmployeDTO> findAll();
    EmployeDTO findById(Long id);
    void deleteById(Long id);
}
