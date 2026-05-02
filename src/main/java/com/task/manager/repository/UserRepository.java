package com.task.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.task.manager.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
        
}
