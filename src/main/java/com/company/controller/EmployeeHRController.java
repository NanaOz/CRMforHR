package com.company.controller;

import com.company.entity.EmployeeHR;
import com.company.entity.EmployeeIT;
import com.company.entity.User;
import com.company.repository.EmployeeHrRepository;
import com.company.repository.StatusRepository;
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
public class EmployeeHRController {
    private final EmployeeHrRepository employeeHrRepository;
    private final StatusRepository statusRepository;
    private final UserRepository userRepository;

    @Autowired
    public EmployeeHRController(EmployeeHrRepository employeeHrRepository, StatusRepository statusRepository, UserRepository userRepository) {
        this.employeeHrRepository = employeeHrRepository;
        this.statusRepository = statusRepository;
        this.userRepository = userRepository;
    }

    @GetMapping("info/employeehr/{id}")
    public String showInfoEmployeeItForm(@PathVariable("id") long id, Model model) {
        EmployeeHR employeeHR = employeeHrRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
        model.addAttribute("employeehr", employeeHR);

        return "popup-infoEmployeeHr";
    }

    @GetMapping("/employeehr/edit/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        EmployeeHR employeeHR = employeeHrRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
        User user = userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
        System.out.println(employeeHR.getEmployee().getUser());
        model.addAttribute("employeehr", employeeHR);
        model.addAttribute("user", user);

        return "popup-infoEmployeeHrUpdate";
    }

    @PostMapping("/employeehr/update/{id}")
    public String updateUser(@PathVariable("id") long id, @Valid EmployeeHR employeeHR, BindingResult result, Model model) {

        if (result.hasErrors()) {
            employeeHR.setId(id);
            return "popup-infoEmployeeHrUpdate";
        }
        System.out.println(employeeHR);
        System.out.println(employeeHR.getEmployee().getUser());
        employeeHrRepository.save(employeeHR);

        return "redirect:/employee#tab_employee";
    }

}
