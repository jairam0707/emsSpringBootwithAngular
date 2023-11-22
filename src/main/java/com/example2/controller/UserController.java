package com.example2.controller;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example2.Model.User;
import com.example2.ServiceImplementation.EmployeeServiceImple;
import com.example2.service.UserService;

import javax.persistence.*;
import javax.servlet.ServletException;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")

public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private EmployeeServiceImple eservice;

	@GetMapping("/users")
	public List<User> getAllusers() {
		return userService.getAllusers();
	}

	@PostMapping("/login")
	public User validate(@RequestBody User user) throws ServletException 
	{
       
		
		String userName = user.getUserName();
		String userPassword = user.getPassword();
		System.out.print(userName);
		System.out.println(userPassword);

		return userService.login(userName, userPassword);

	}

	@PostMapping("/addusers")
	public User addUser(@RequestBody User user) {
		return userService.addUser(user);
	}

	@PostMapping("/assigndepartment/{did}/{eid}")
	public String assignDepartmentToEmployee(@PathVariable int did, @PathVariable int eid) {
		return eservice.assignDepartmentToEmployee(did, eid);
	}
}