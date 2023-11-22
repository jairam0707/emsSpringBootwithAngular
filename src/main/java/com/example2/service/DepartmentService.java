package com.example2.service;

import java.util.List;

import com.example2.Model.Department;





public interface DepartmentService 
{

	List<Department> getAllDepartments();
   
	Department getDepartmentById(int id);
	Department updateDepartment(int id, Department department1);
	Department deleteDepartment(int id);
	//Department registerDepartment(Department department1);
	//String assignEmployeeToDepartment(int did, int eid);

	Department addDepartment(Department department1);


}