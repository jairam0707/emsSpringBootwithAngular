package com.example2.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example2.Model.Department;
import com.example2.Model.Employee;





public interface EmployeeService 
{
	
	List<Employee> getEmployees();
	Employee getEmployeeById(int id);
	Employee updateEmployee(int id,Employee employee);
	Employee deleteEmployee(int id, Employee employee);
	Employee addEmployee( Employee employee);
	//String assignDepartmentToEmployee(int did, int eid);
	Department getEmployeeDepartment(int emp_id);
	Employee addEmployeeToDepartment(int id, int emp_id);
}