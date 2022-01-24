package com.company.controller;

import com.company.repository.EmployeeRepository;
import com.company.repository.TaskRepository;
import com.company.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TaskController {

    private final TaskRepository taskRepository;
    private final UserRepository userRepository;
    private final EmployeeRepository employeeRepository;

    public TaskController(TaskRepository taskRepository, UserRepository userRepository, EmployeeRepository employeeRepository) {
        this.taskRepository = taskRepository;
        this.userRepository = userRepository;
        this.employeeRepository = employeeRepository;
    }


    @GetMapping("/task")
    public String showTaskList(Model model) {
        model.addAttribute("tasks", taskRepository.findAll());
        model.addAttribute("users", userRepository.findAll());
        model.addAttribute("employee", employeeRepository.findAll());
        return "task";
    }

//    @GetMapping("/close")
//    public String closeInfoForm(Model model) {
//        return "redirect:/task#tab_task";
//    }
////
////    @GetMapping("/task")
////    public String showEmployeeList(Model model) {
////        model.addAttribute("tasks", taskRepository.findAll());
////        return "task";
////    }
//
}
