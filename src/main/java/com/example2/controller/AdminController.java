package com.example2.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example2.model.Admin;
import com.example2.service.AdminService;
@RestController
public class AdminController {
	@Autowired
    private AdminService adminJpaService;
@PostMapping("/admin/add")
    public Admin addAdmin(@RequestBody Admin admin) {
    return	adminJpaService.addAdmin(admin);
    	
    }

    @DeleteMapping("/admin/delete/{id}")
    public void deleteAdmin(@PathVariable int id) {
    	adminJpaService.deleteAdmin(id);

    }

}
