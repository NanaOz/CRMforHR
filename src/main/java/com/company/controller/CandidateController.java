package com.company.controller;

import com.company.entity.*;
import com.company.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.Map;

@Controller
public class CandidateController {
    private final CandidateRepository candidateRepository;
    private final EmployeeRepository employeeRepository;
    private final StatusRepository statusRepository;
    private final TagRepository tagRepository;
    private final EmployeeHrRepository employeeHrRepository;
    private final EmployeeITRepository employeeITRepository;
    private final ProjectRepository projectRepository;
    private final PostRepository postRepository;

    @Autowired
    public CandidateController(CandidateRepository candidateRepository, EmployeeRepository employeeRepository, StatusRepository statusRepository, TagRepository tagRepository, UserRepository userRepository, EmployeeHrRepository employeeHrRepository, EmployeeITRepository employeeITRepository, ProjectRepository projectRepository, PostRepository postRepository) {
        this.candidateRepository = candidateRepository;
        this.employeeRepository = employeeRepository;
        this.statusRepository = statusRepository;
        this.tagRepository = tagRepository;
        this.employeeHrRepository = employeeHrRepository;
        this.employeeITRepository = employeeITRepository;
        this.projectRepository = projectRepository;
        this.postRepository = postRepository;
    }

    @GetMapping("/candidate")
    public String showCandidateList(Model model) {
        model.addAttribute("candidates", candidateRepository.findAll());
        model.addAttribute("tags", tagRepository.findAll());
        return "candidate";
    }

    @GetMapping("/closex")
    public String closeInfoForm(Model model) {
        return "redirect:/candidate#tab_candidate";
    }

    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        Candidate candidate = candidateRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
        System.out.println(candidate.getUser());
        model.addAttribute("candidate", candidate);
        model.addAttribute("tags", tagRepository.findAll());
        model.addAttribute("postes", postRepository.findAll());
        model.addAttribute("statuses", statusRepository.findAll());
        return "popup-infoCandidateUpdate";
    }

    @PostMapping("/update/{id}")
    public String updateUser(@PathVariable("id") long id, @Valid Candidate candidate, BindingResult result, Model model) {

/*        if (result.hasErrors()) {
            candidate.setId(id);
            return "popup-infoCandidateUpdate";
        }*/
//        userRepository.save(user);
        candidateRepository.save(candidate);

        return "redirect:/candidate#tab_candidate";
    }

    @GetMapping("/infocand/{id}")
    public String showInfoForm(@PathVariable("id") long id, Model model) {
        Candidate candidate = candidateRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
        model.addAttribute("candidate", candidate);
        model.addAttribute("tags", tagRepository.findAll());
        return "popup-infoCandidate";
    }

    //TODO ДОДЕЛАТЬ контроллер на добавление выбранного тега
    @GetMapping("/addtagcand")
    public String tagAddCandidate(Model model) {
        return "redirect:/candidate#tab_candidate";
    }

    @GetMapping("/create/{id}")
    public String addUser(@PathVariable("id") long id,  Model model) {
        Candidate candidate = candidateRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid candidate Id:" + id));
        Employee employee = new Employee();
        EmployeeHR employeeHR = new EmployeeHR();
        EmployeeIT employeeIT = new EmployeeIT();

        employee.setUser(candidate.getUser());
        employee.setPost(candidate.getPost());
        employee.setStatus(statusRepository.findByName("Работает"));
        employee.setId(candidate.getId());

        candidate.getTagLevelMap().keySet();


        Map<Tag, Level> tagLev = candidate.getTagLevelMap();

        System.out.println(tagLev);
        candidateRepository.delete(candidate);
        employeeRepository.save(employee);

        if (employee.getPost().getId() == 110 || employee.getPost().getId() == 111){
            employeeHR.setEmployee(employee);
            employeeHR.setId(employee.getId());
            employeeHrRepository.save (employeeHR);
        }
        else {
            employeeIT.setEmployee(employee);
            employeeIT.setId(employee.getId());
            employeeIT.setProject(projectRepository.getById(0L));
            employeeIT.setTagLevel(tagLev);
            employeeITRepository.save(employeeIT);}

        System.out.println("SAVED??????");
        return "redirect:/candidate#tab_candidate";
    }

}