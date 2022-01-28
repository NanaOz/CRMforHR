package com.company.controller;

import com.company.entity.EmployeeHR;
import com.company.repository.EmployeeHrRepository;
import com.company.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class EmployeeHRController {
    private final EmployeeHrRepository employeeHrRepository;
    private final StatusRepository statusRepository;

    @Autowired
    public EmployeeHRController(EmployeeHrRepository employeeHrRepository, StatusRepository statusRepository) {
        this.employeeHrRepository = employeeHrRepository;
        this.statusRepository = statusRepository;
    }


    @GetMapping("info/employeehr/{id}")
    public String showInfoEmployeeItForm(@PathVariable("id") long id, Model model) {
        EmployeeHR employeeHR = employeeHrRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
        model.addAttribute("employeehr", employeeHR);

        return "popup-infoEmployeeHr";
    }

}
