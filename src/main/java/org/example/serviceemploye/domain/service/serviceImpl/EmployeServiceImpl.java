package org.example.serviceemploye.domain.service.serviceImpl;

import lombok.extern.java.Log;
import org.example.serviceemploye.domain.entity.Employe;
import org.example.serviceemploye.domain.service.EmployeService;
import org.example.serviceemploye.shared.dto.EmployeDTO;
import org.example.serviceemploye.shared.port.EmployePort;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeServiceImpl implements EmployeService {
    private final EmployePort employePort;

    public EmployeServiceImpl(EmployePort employePort) {
        this.employePort = employePort;
    }

    @Log
    @Override
    public EmployeDTO save(EmployeDTO employe) {
        EmployeDTO employeeDTO = new EmployeDTO(employe);
        employeeDTO = employePort.save(employeeDTO);
        return employeeDTO;

    }

    @Log
    @Override
    public List<EmployeDTO> findAll() {
        return employePort.findAll();
    }

    @Override
    public EmployeDTO findById(Long id) {
        EmployeDTO employeDTO = employePort.findById(id);
        return employeDTO;
    }

    @Override
    public void deleteById(Long id) {
        employePort.deleteById(id);
    }
}
