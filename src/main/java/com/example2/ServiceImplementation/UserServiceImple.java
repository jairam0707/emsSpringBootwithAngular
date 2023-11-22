package com.example2.ServiceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example2.Model.User;
import com.example2.Util.Converter;
import com.example2.repository.UserRepository;
import com.example2.service.UserService;







@Service
public class  UserServiceImple implements UserService
{
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private Converter converter;
	
	
	public User login(String userName, String userPassword) {
	    User user = userRepository.findByUserNameAndPassword(userName, userPassword);
	    if (user == null) {
	        // Handle the case where the user is not found, for example, throw an exception.
	        throw new RuntimeException("User not found");
	    }
	    return user;
	}
	 



	@Override
	public List<User> getAllusers() {
		List<User> users=userRepository.findAll();
		return users;
	}
	
	@Override
	public  User addUser(User user)
	{
		userRepository.save(user);
		return user;
	}
	
}