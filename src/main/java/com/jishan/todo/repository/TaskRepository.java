package com.jishan.todo.repository;

import com.jishan.todo.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

// This is an interface, not a class
public interface TaskRepository extends JpaRepository<Task, Long> {
}
