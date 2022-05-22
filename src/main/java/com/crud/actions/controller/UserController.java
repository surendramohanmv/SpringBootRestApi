package com.crud.actions.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.actions.service.UserService;
import com.crud.actions.vo.User;

@RestController
@RequestMapping("/user")
public class UserController {
	

	@Autowired
	private UserService userService;

	@GetMapping(path = "/all")
	public @ResponseBody List<User> getUserList() {
		System.out.println("Surendra getUserList()");
		List<User> allUser = userService.getAllUser();
		allUser.stream().forEach(System.out::println);
		return allUser;
	}

	@GetMapping(path = "/getUser/{id}")
	public User getUser(@PathVariable int id) {
		System.out.println("Surendra getUser()");
		return userService.getUser(id);
	}

	@PostMapping("/saveUser")  
	public @ResponseBody User saveUser(@RequestBody User user) {
		System.out.println("Surendra saveUser()");
		return userService.saveUser(user);
	}

	@PutMapping("/updateUser")  
	public @ResponseBody User updateUser(@RequestBody User user) {
		System.out.println("Surendra updateUser()");
		return userService.updateUser(user);
	}

	@DeleteMapping("/deleteUser")  
	public @ResponseBody String deleteUser(@RequestBody User user) {
		System.out.println("Surendra deleteUser()");
		return userService.deleteUser(user);
	}


	@DeleteMapping("/deleteUser/{id}")  
	public @ResponseBody String deleteUser(@PathVariable int id) {
		System.out.println("Surendra deleteUser()");
		return userService.deleteUser(id);
	}

}
