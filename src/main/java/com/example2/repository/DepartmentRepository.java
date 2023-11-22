package com.example2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example2.Model.Department;



@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>
{

}