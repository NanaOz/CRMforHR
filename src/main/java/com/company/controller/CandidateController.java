package com.company.controller;

import com.company.entity.Candidate;
import com.company.entity.Employee;
import com.company.repository.CandidateRepository;
import com.company.repository.EmployeeRepository;
import com.company.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.persistence.Entity;
import javax.persistence.Table;

@Controller
public class CandidateController {
    private final CandidateRepository candidateRepository;
    private final EmployeeRepository employeeRepository;
    private final StatusRepository statusRepository;

    @Autowired
    public CandidateController(CandidateRepository candidateRepository, EmployeeRepository employeeRepository, StatusRepository statusRepository) {
        this.candidateRepository = candidateRepository;
        this.employeeRepository = employeeRepository;
        this.statusRepository = statusRepository;
    }

//    @GetMapping("/candidate")
//    public String homePage(){
//        return "candidate";
//    }

    @GetMapping("/candidate")
    public String showCandidateList(Model model) {
        model.addAttribute("candidates", candidateRepository.findAll());
        return "candidate";
    }

    @GetMapping("/infocand/{id}")
    public String showInfoForm(@PathVariable("id") long id, Model model) {
        Candidate candidate = candidateRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
        model.addAttribute("candidates", candidate);
        return "popup-infocand";
    }

    @GetMapping("/closex")
    public String closeInfoForm(Model model) {
        return "redirect:/candidate#tab_candidate";
    }

    @GetMapping("/candok")
    public String okayInfoForm(Model model) {
        return "redirect:/candidate#tab_candidate";
    }

//        @PostMapping("/create")
//    public String addUser(BindingResult result, @PathVariable("id") long id, Model model) {
//        System.out.println("BRGINOFADDING");
//        if (result.hasErrors()) {
//            System.out.println("ERROR????");
//            return "popup_addacount";
//        }
//
//        Candidate candidate = candidateRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid candidate Id:" + id));
//        Employee employee = new Employee();
//
//        employee.setUser(candidate.getUser());
//        employee.setPost(candidate.getPost());
////        employee.setStatus(new Status());
//        employee.setStatus(statusRepository.getById(1L));
//
//        candidateRepository.delete(candidate);
//        employeeRepository.save(employee);
//        System.out.println("SAVED??????");
//        return "redirect:/candidate#tab_candidate";
//    }
}