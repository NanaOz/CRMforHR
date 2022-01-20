package com.company.controller;

import com.company.entity.Candidate;
import com.company.entity.Employee;
import com.company.entity.Status;
import com.company.repository.CandidateRepository;
import com.company.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController {
    private final EmployeeRepository employeeRepository;
    private final CandidateRepository candidateRepository;

    @Autowired
    public EmployeeController(EmployeeRepository employeeRepository, CandidateRepository candidateRepository) {
        this.employeeRepository = employeeRepository;
        this.candidateRepository = candidateRepository;
    }

//    @GetMapping("/employee")
//    public String homePage(){
//        return "employee";
//    }

//    @GetMapping("/employee")
//    public String showUserListEmployee(@PathVariable("id") long id, Model model) {
//
//        User user = userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
//        model.addAttribute("users", user);
////        Employee employee = employeeRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
////        model.addAttribute("workers", employee);
//        model.addAttribute("workers", employeeRepository.findAll());
////        model.addAttribute("users", userRepository.findAll());
//        return "employee";
//    }

    @GetMapping("/employee")
    public String showEmployeeList(Model model) {
        model.addAttribute("employees", employeeRepository.findAll());
        model.addAttribute("candidatess", candidateRepository.findAll());

//        model.addAttribute("users", userRepository.findAll());
        return "employee";
    }
//
//    @GetMapping("/popup-create")
//    public String addEmployeeList(Model model) {
//        model.addAttribute("candidatess", candidateRepository.findAll());
//        return "popup-create-acount";
//    }

//    @PostMapping("/create")
//    public String addUser(BindingResult result, @PathVariable("id") long id, Model model) {
//        System.out.println("BRGINOFADDING");
//        if (result.hasErrors()) {
//            System.out.println("ERROR????");
//            return "popup-create-acount";
//        }
//
//        Candidate candidate = candidateRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid candidate Id:" + id));
//        Employee employee1 = new Employee();
//
//        employee1.setUser(candidate.getUser());
//        employee1.setPost(candidate.getPost());
//        employee1.setStatus(new Status());
//
//        candidateRepository.delete(candidate);
//        employeeRepository.save(employee1);
//        System.out.println("SAVED??????");
//        return "redirect:/employee";
//    }

}
