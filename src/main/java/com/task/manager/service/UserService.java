package com.task.manager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.manager.model.User;
import com.task.manager.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repo;

	public User register(User user) {
		return repo.save(user);
	}
}
