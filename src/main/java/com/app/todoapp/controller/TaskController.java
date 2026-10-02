package com.app.todoapp.controller;
import com.app.todoapp.models.Task;
import com.app.todoapp.services.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskservice;

    public TaskController(TaskService taskservice) {
        this.taskservice = taskservice;
    }

    @GetMapping
    public String getTask(Model model){
        List<Task> tasks = taskservice.getAllTasks();
        model.addAttribute("tasks", tasks);
        return "tasks";
    }
}
