package com.example.docker.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.docker.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
    
   
    public List<Employee> getEmployeesByManagerEmail(String email);

   
    public Employee getManagerByEmployeeEmail(String email);
}