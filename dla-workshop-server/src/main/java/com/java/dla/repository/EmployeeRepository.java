package com.java.dla.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.dla.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
