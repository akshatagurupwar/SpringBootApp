package com.capgi.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgi.springboot.entities.UserRecord;
import com.capgi.springboot.service.UserService;



@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/allusers")
	public List<UserRecord>getAllUser() {
		
		return userService.getAllUsers();
		
	}
	
	
	@RequestMapping(value="/adduser",method=RequestMethod.POST)	
	public void  addUser(@RequestBody UserRecord uerRecord){
		
		 userService.addUser(uerRecord);
	}

}
