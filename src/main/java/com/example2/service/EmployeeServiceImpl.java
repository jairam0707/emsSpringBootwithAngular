package com.example2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example2.DTO.EmployeeDTO;
import com.example2.model.Employee;
import com.example2.repository.EmployeeRepository;


@Service
public class EmployeeServiceImpl implements EmployeeService
{ 
	@Autowired
	private EmployeeRepository employeeRepository;
public String addEmployee(EmployeeDTO employeeDTO)
{
	Employee employee=new Employee(
	employeeDTO.getEmployeeid(),
	employeeDTO.getEmployeename(),
	employeeDTO.getAddress(),
	employeeDTO.getMobile());
	
	
	employeeRepository.save(employee);
	return employee.getEmployeename();
}
}
