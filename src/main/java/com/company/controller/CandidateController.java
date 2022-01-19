package com.company.controller;

import com.company.repository.CandidateRepository;
import com.company.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
}