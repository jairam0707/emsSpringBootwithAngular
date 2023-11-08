package com.example2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example2.DTO.EmployeeDTO;
import com.example2.model.Employee;
import com.example2.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService
{ 
	@Autowired
	private EmployeeRepository employeeRepository;

@Override
public List<Employee> getallEmployee() {
	List<Employee> employeelist=employeeRepository.findAll();
	ArrayList<Employee> employees=new ArrayList<>(employeelist);
	return employees;
}
public Employee addEmployee(Employee employee)
{
	employeeRepository.save(employee);
	return employee;
}
@Override
public Employee updateEmployee(int employeeid, Employee employee)
{
	try
	{
	Employee newEmployee=employeeRepository.findById(employeeid).get();
	if(employee.getEmployeename()!=null)
	{
		newEmployee.setEmployeename(employee.getEmployeename());
	}
	if(employee.getMobile()!=0)
	{
		newEmployee.setMobile(employee.getMobile());
	}
	if(employee.getAddress()!=null)
	{
		newEmployee.setAddress(employee.getAddress());
	}
	if(employee.getEmployeegender()!=null)
	{
		newEmployee.setEmployeegender(employee.getEmployeegender());
	}
	if(employee.getSalary()!=0)
	{
		newEmployee.setSalary(employee.getSalary());
	}
	employeeRepository.save(newEmployee);
	return newEmployee;
	}
	catch(Exception e)
	{
		throw new ResponseStatusException(HttpStatus.NOT_FOUND);
	}
	}


@Override
public String deleteEmployee(int employeeid) 
{
	try
	{
	employeeRepository.deleteById(employeeid);
	return "Employees got deleted successfully!!";
	}
	catch(Exception e)
	{
		throw new ResponseStatusException(HttpStatus.NOT_FOUND);
	}
}

@Override
public Employee getEmployeeById(int id) 
{
	try
	{
	Employee employee=employeeRepository.findById(id).get();
	return employee;
	}
	catch(Exception e)
	{
	throw new ResponseStatusException(HttpStatus.NOT_FOUND);
	}

}
}
