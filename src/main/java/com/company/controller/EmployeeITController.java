package com.company.controller;


import com.company.entity.Candidate;
import com.company.entity.EmployeeIT;
import com.company.entity.User;
import com.company.repository.EmployeeITRepository;
import com.company.repository.StatusRepository;
import com.company.repository.TagRepository;
import com.company.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class EmployeeITController {
    private final EmployeeITRepository employeeITRepository;
    private final StatusRepository statusRepository;
    private final TagRepository tagRepository;
    private final UserRepository userRepository;

    @Autowired
    public EmployeeITController(EmployeeITRepository employeeITRepository, StatusRepository statusRepository, TagRepository tagRepository, UserRepository userRepository) {
        this.employeeITRepository = employeeITRepository;
        this.statusRepository = statusRepository;
        this.tagRepository = tagRepository;
        this.userRepository = userRepository;
    }

    @GetMapping("info/employeeit/{id}")
    public String showInfoEmployeeItForm(@PathVariable("id") long id, Model model) {
        EmployeeIT employeeIT = employeeITRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
        model.addAttribute("employeeit", employeeIT);
        model.addAttribute("tags", tagRepository.findAll());

        return "popup-infoEmployeeIt";}

    @GetMapping("/employeeit/edit/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        EmployeeIT employeeIT = employeeITRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
        User user = userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
        System.out.println(employeeIT.getEmployee().getUser());
        model.addAttribute("employeeit", employeeIT);
        model.addAttribute("user", user);
        model.addAttribute("tags", tagRepository.findAll());

        return "popup-infoEmployeeItUpdate";
    }

    @PostMapping("/employeeit/update/{id}")
    public String updateUser(@PathVariable("id") long id, @Valid EmployeeIT employeeIT, BindingResult result, Model model) {

        if (result.hasErrors()) {
            employeeIT.setId(id);
            return "popup-infoEmployeeItUpdate";
        }
        System.out.println(employeeIT);
        System.out.println(employeeIT.getEmployee().getUser());
        employeeITRepository.save(employeeIT);

        return "redirect:/employee#tab_employee";
    }


}
