package com.vikash.UserService.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vikash.UserService.Entity.User;
import com.vikash.UserService.Service.UserService;
import com.vikash.UserService.VO.ResponseTemplate;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
				
		return userService.saveUser(user);
	}
	
	@GetMapping("/{Id}")
	public ResponseTemplate getUserWithDepartment(@PathVariable("Id") Long userId) {
		
		return userService.getUserWithDepartment(userId);
	}

}
