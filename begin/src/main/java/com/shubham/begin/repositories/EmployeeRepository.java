package com.shubham.begin.repositories;

import com.shubham.begin.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// below generate all db quarries like findAll
@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> { }
