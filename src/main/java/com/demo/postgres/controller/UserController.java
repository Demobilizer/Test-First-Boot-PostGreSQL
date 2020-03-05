/**
 * 
 */
package com.demo.postgres.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.postgres.model.User;
import com.demo.postgres.service.UserService;

/**
 * @author Mehul
 *
  */

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping("/save")
	public String saveUser(@RequestBody User user) {
		System.out.println("suer name--------------"+user.getUserName());
		userService.saveUser(user);
		return "User added successfully!";
	}
	
}
