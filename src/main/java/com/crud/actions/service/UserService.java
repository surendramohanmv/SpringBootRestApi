package com.crud.actions.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.actions.repository.UserRepository;
import com.crud.actions.vo.User;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	//private static HashMap<Integer, User> map = new HashMap<Integer, User>();
	

	public List<User> getAllUser() {
		List<User> userList = new ArrayList<User>();
		userRepository.findAll().forEach(user -> userList.add(user));
		//map.values().stream().filter(user -> userList.add(user)).collect(Collectors.toList());
		return userList;
	}

	public Optional<User> getUser(int id) {
		return userRepository.findById(id);
	}

	public User saveUser(User user) {
		User savedObj = userRepository.save(user);
		return savedObj;
		//map.put(user.getId(), user);
		//return map.get(user.getId());
	}

	public User updateUser(User user) {
		User savedObj = userRepository.save(user);
		return savedObj;
		//map.put(user.getId(), user);
		//return map.get(user.getId());
	}

	public String deleteUser(User user) {
		userRepository.delete(user);
		//return savedObj;
		//map.remove(user.getId());
		return "Deleted User Info : "+ user;
	}

}
