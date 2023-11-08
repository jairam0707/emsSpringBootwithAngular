package com.example2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example2.DTO.EmployeeDTO;
import com.example2.model.Employee;
import com.example2.service.EmployeeService;

@RestController
@CrossOrigin
@RequestMapping("/employee")
public class EmployeeController 
{
	@Autowired
private EmployeeService employeeService;

@PostMapping("/save")
public Employee saveEmployee(@RequestBody Employee employee)
{

return employeeService.addEmployee(employee);
}
 @GetMapping("/get")
 public List<Employee> getallEmployee(){
	 return employeeService.getallEmployee();
 }
 
 @GetMapping("/{emplpoyeeid}")
	public Employee getEmployeeById(@PathVariable("employeeid") int employeeid)
	{
		return employeeService.getEmployeeById(employeeid);

	}
	
	@PutMapping("/updateEmployee/{employeeid}")
	public Employee updateEmployee(@PathVariable("employeeid") int id,@RequestBody Employee employee)
	{
		return employeeService.updateEmployee(id, employee);
	}
	
	@DeleteMapping("/deleteEmployee/{employeeid}")
	public String deleteEmployee(@PathVariable("employeeid") int id)
	{
		return employeeService.deleteEmployee(id);
	}
}

