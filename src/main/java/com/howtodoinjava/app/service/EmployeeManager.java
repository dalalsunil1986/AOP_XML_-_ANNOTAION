package com.howtodoinjava.app.service;

import java.util.List;

import com.howtodoinjava.app.model.EmployeeDTO;

public interface EmployeeManager
{
    public EmployeeDTO getEmployeeById(Integer employeeId);
 
    public List<EmployeeDTO> getAllEmployee();
 
    public void createEmployee(EmployeeDTO employee);
 
    public void deleteEmployee(Integer employeeId);
 
    public void updateEmployee(EmployeeDTO employee);
}