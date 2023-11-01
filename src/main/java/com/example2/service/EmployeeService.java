package com.example2.service;

import org.springframework.stereotype.Service;

import com.example2.DTO.EmployeeDTO;
@Service
public interface EmployeeService
{
   String addEmployee(EmployeeDTO employeeDTO);
}
