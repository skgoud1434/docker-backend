package com.example.docker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

      @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String employeeName;
    private String employeeEmail;
    private String managerName;
    private String managerEmail;


    public Employee(){

        
    }

    
    public Employee(String employeeName, String employeeEmail, String managerName, String managerEmail) {
    
        this.employeeName = employeeName;
        this.employeeEmail = employeeEmail;
        this.managerName = managerName;
        this.managerEmail = managerEmail;
    }
   
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public String getEmployeeEmail() {
        return employeeEmail;
    }
    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }
    public String getManagerName() {
        return managerName;
    }
    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }
    public String getManagerEmail() {
        return managerEmail;
    }
    public void setManagerEmail(String managerEmail) {
        this.managerEmail = managerEmail;
    }

  



}

