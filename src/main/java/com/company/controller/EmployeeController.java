//package com.company.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//@Controller
//public class EmployeeController {
//    private final EmployeeRepository employeeRepository;
//
//    @Autowired
//    public EmployeeController(EmployeeRepository employeeRepository) {
//        this.employeeRepository = employeeRepository;
//    }
//
//    @GetMapping("/index")
//    public String showUserList(Model model) {
//        model.addAttribute("users", employeeRepository.findAll());
//        return "ManagerHRView";
//    }
//}
