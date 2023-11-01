package com.example2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example2.DTO.EmployeeDTO;
import com.example2.service.EmployeeService;

@RestController
@CrossOrigin
@RequestMapping("/employee")
public class EmployeeController 
{
	@Autowired
private EmployeeService employeeService;

@PostMapping("/save")
public String saveEmployee(@RequestBody EmployeeDTO employeeDTO)
{

return employeeService.addEmployee(employeeDTO);
}
}
