package com.jishan.todo.controller;

import org.springframework.ui.Model;

import com.jishan.todo.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TaskController {
    private final TaskService service;

    public TaskController(TaskService service){
        this.service = service;
    }
    @GetMapping("/")
    public String viewTasks(Model model){
        model.addAttribute("tasks",service.getAllTasks());
        return "index";
    }

    @PostMapping("/add")
    public String addTask(@RequestParam String title){
        service.addTask(title);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteTask(@PathVariable Long id){
        service.deleteTask(id);
        return "redirect:/";
    }
    @GetMapping("/done/{id}")
    public String markDone(@PathVariable Long id) {
        service.markDone(id); // ✅ call the injected service instance

        return "redirect:/";
    }

}
