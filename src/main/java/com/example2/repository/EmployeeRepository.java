package com.example2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example2.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
