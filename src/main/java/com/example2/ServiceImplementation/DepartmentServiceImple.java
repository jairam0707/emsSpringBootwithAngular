package com.example2.ServiceImplementation;


import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example2.Model.Department;
import com.example2.Util.Converter;
import com.example2.repository.DepartmentRepository;
import com.example2.repository.EmployeeRepository;
import com.example2.service.DepartmentService;



@Service
public class DepartmentServiceImple implements DepartmentService 
{
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Autowired
	private Converter converter;
	
	private EmployeeRepository employeerepository;
	
	
	@Override
	public List<Department> getAllDepartments()
	{
		List<Department> departmentList=departmentRepository.findAll();
		ArrayList<Department> department1s=new  ArrayList<>(departmentList);
		return department1s;
	}
	
	@Override
	public Department getDepartmentById(int dept_id)
	{
		try
		{
			Department department1=departmentRepository.findById(dept_id).get();
		return department1;
		}
		catch(Exception e)
		{
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
	}
	
	
	
	
        		
        		
	public Department addDepartment(Department department)
	{
		departmentRepository.save(department);
		return department;
	}
	
	@Override
	public Department updateDepartment(int dept_id, Department department)
	{
		try
		{
			Department newDepartment=departmentRepository.findById(dept_id).get();
			if(department.getDept_name()!=null)
			{
				newDepartment.setDept_name(department.getDept_name());
			}
			
	
		departmentRepository.save(newDepartment);
		return newDepartment;
		}
		catch(Exception e)
		{
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
		}
	
	@Override
	public Department deleteDepartment(int dept_id) 
	{
		try
		{
			Department department=departmentRepository.findById(dept_id).get();
			departmentRepository.delete(department);
		    return department;
		}
		catch(Exception e)
		{
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
	}

	
		
	}