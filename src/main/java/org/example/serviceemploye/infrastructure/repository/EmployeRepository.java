package org.example.serviceemploye.infrastructure.repository;

import org.example.serviceemploye.infrastructure.entity.EmployeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeRepository extends CrudRepository<EmployeEntity, Long> {
}
