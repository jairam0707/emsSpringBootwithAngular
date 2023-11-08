package com.example2.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example2.model.Admin;
import com.example2.repository.AdminRepository;

@Service
public class AdminService {
	@Autowired
    private AdminRepository adminJpaRepository;

  
    public Admin addAdmin(Admin admin) {
        adminJpaRepository.save(admin);
       return admin;
                }
    public void deleteAdmin(int id) {
        try {
            adminJpaRepository.deleteById(id);
        } catch (DataAccessException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Admin not found with id: " + id, e);
        }}}

