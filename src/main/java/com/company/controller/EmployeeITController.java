package com.company.controller;


import com.company.entity.EmployeeIT;
import com.company.repository.EmployeeITRepository;
import com.company.repository.StatusRepository;
import com.company.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class EmployeeITController {
    private final EmployeeITRepository employeeITRepository;
    private final StatusRepository statusRepository;
    private final TagRepository tagRepository;

    @Autowired
    public EmployeeITController(EmployeeITRepository employeeITRepository, StatusRepository statusRepository, TagRepository tagRepository) {
        this.employeeITRepository = employeeITRepository;
        this.statusRepository = statusRepository;
        this.tagRepository = tagRepository;
    }

    @GetMapping("info/employeeit/{id}")
    public String showInfoEmployeeItForm(@PathVariable("id") long id, Model model) {
        EmployeeIT employeeIT = employeeITRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
        model.addAttribute("employeeit", employeeIT);
        model.addAttribute("tags", tagRepository.findAll());

        return "popup-infoEmployeeIt";}

}
