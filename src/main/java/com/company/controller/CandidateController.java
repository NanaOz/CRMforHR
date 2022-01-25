package com.company.controller;

import com.company.entity.Candidate;
import com.company.entity.Employee;
import com.company.repository.CandidateRepository;
import com.company.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Controller
public class CandidateController {
    private final CandidateRepository candidateRepository;

    @Autowired
    public CandidateController(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
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
}