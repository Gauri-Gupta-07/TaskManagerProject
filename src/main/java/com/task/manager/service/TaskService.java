package com.task.manager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.manager.model.Task;
import com.task.manager.repository.TaskRepository;

@Service
public class TaskService {
	@Autowired
	private TaskRepository repo;

	public Task create(Task t) {
		return repo.save(t);
	}

	public List<Task> getAll() {
		return repo.findAll();
	}
}
