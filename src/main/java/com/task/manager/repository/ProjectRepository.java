package com.task.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.task.manager.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {

}
