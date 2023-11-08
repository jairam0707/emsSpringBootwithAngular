package com.example2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example2.DTO.EmployeeDTO;
import com.example2.model.Employee;
@Service
public interface EmployeeService
{
  Employee addEmployee(Employee employee);
   List<Employee> getallEmployee();
   public Employee updateEmployee(int employeeid, Employee employee);
   public String deleteEmployee(int employeeid);
   public Employee getEmployeeById(int id) ;
}
