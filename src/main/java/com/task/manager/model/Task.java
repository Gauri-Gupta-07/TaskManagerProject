package com.task.manager.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String status;

	@ManyToOne
	private User assignedTo;

	@ManyToOne
	private Project project;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String t) {
		this.title = t;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String s) {
		this.status = s;
	}

	public User getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(User u) {
		this.assignedTo = u;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project p) {
		this.project = p;
	}
}
