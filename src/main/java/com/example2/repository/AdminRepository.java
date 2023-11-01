package com.example2.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example2.model.Admin;
@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>{

}
