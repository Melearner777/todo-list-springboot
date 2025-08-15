package com.jishan.todo.service;

import com.jishan.todo.model.Task;
import com.jishan.todo.repository.TaskRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskService {

    private final TaskRepository repo;

    public TaskService(TaskRepository repo) {
        this.repo = repo;
    }

    public List<Task> getAllTasks() {
        return repo.findAll();
    }

    public void addTask(String title) {
        repo.save(new Task(title));
    }

    public void markDone(Long id) {
        Task task = repo.findById(id).orElseThrow();
        task.setDone(true);
        repo.save(task);
    }

    public void deleteTask(Long id) {
        repo.deleteById(id);
    }
}
