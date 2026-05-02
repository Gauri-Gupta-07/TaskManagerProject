package com.task.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.task.manager.model.Task;
import com.task.manager.service.TaskService;

@RestController
@RequestMapping("/tasks")
public class TaskController {

	@Autowired
	private TaskService service;

	@PostMapping
	public Task create(@RequestBody Task t) {
		return service.create(t);
	}

	@GetMapping
	public List<Task> all() {
		return service.getAll();
	}
}