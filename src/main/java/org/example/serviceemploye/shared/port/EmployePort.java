package org.example.serviceemploye.shared.port;

import org.example.serviceemploye.domain.entity.Employe;
import org.example.serviceemploye.shared.dto.EmployeDTO;

import java.util.List;

public interface EmployePort {
    EmployeDTO save(EmployeDTO employe);
    List<EmployeDTO> findAll();
    EmployeDTO findById(Long id);
    void deleteById(Long id);
}
