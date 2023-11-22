package com.example2.service;

import java.util.List;

import com.example2.Model.User;





public interface UserService
{
	 User login(String userName, String userPassword);
	 List<User> getAllusers();
		User addUser(User user);
}