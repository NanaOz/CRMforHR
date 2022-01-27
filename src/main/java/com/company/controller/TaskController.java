package com.company.controller;

import com.company.entity.Employee;
import com.company.entity.Task;
import com.company.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class TaskController {

    private final EmployeeRepository employeeRepository;
    private final CandidateRepository candidateRepository;
    private final EmployeeITRepository employeeITRepository;
    private final EmployeeHrRepository employeeHrRepository;
    private final UserRepository userRepository;
    private final TaskRepository taskRepository;
    private final StatusTaskRepository statusTaskRepository;

    @Autowired
    public TaskController(EmployeeRepository employeeRepository, CandidateRepository candidateRepository, EmployeeITRepository employeeITRepository, EmployeeHrRepository employeeHrRepository, UserRepository userRepository, TaskRepository taskRepository, StatusTaskRepository statusTaskRepository) {
        this.employeeRepository = employeeRepository;
        this.candidateRepository = candidateRepository;
        this.employeeITRepository = employeeITRepository;
        this.employeeHrRepository = employeeHrRepository;
        this.userRepository = userRepository;
        this.taskRepository = taskRepository;
        this.statusTaskRepository = statusTaskRepository;
    }


    @GetMapping("/task")
    public String showTaskList(Model model) {
        model.addAttribute("tasks", taskRepository.findAll());
        model.addAttribute("employees", employeeRepository.findAll());
        model.addAttribute("candidatess", candidateRepository.findAll());
        model.addAttribute("employeesIt", employeeITRepository.findAll());
        model.addAttribute("employeesHr", employeeHrRepository.findAll());
        model.addAttribute("users", userRepository.findAll());
        model.addAttribute("statustask", statusTaskRepository.findAll());
        return "task";
    }

    @GetMapping("infotask/{id}")
    public String showInfoForm(@PathVariable("id") long id, Model model) {
        Task task = taskRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
        model.addAttribute("task", task);
        model.addAttribute("statustask", statusTaskRepository.findAll());
        return "popup-infoTask";
    }

    @GetMapping("/closetask")
    public String closeInfoForm(Model model) {
        return "redirect:/task#tab_task";
    }

    //TODO доделать контроллер на смену статуса
    @GetMapping("/taskok")
    public String okayInfoForm(Model model) {
        return "redirect:/task#tab_task";
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
