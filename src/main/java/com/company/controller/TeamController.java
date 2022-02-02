package com.company.controller;

import com.company.entity.*;
import com.company.repository.*;
import logika.Lid;
import logika.Logics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class TeamController {

    private final TagRepository tagRepository;
    private final StatusRepository statusRepository;
    private final PostRepository postRepository;
    private final CandidateRepository candidateRepository;
    private final EmployeeITRepository employeeITRepository;

    @Autowired
    public TeamController(TagRepository tagRepository, StatusRepository statusRepository, PostRepository postRepository, CandidateRepository candidateRepository, EmployeeITRepository employeeITRepository) {
        this.tagRepository = tagRepository;
        this.statusRepository = statusRepository;
        this.postRepository = postRepository;
        this.candidateRepository = candidateRepository;
        this.employeeITRepository = employeeITRepository;
    }

//    @GetMapping("/team")
//    public String homePage(){
//        return "team";
//    }

    @GetMapping("/team")
    public String showTagList(Model model) {
        model.addAttribute("tags", tagRepository.findAll());
        model.addAttribute("statususer", statusRepository.findAll());
        model.addAttribute("postname", postRepository.findAll());
        return "team";
    }

    @GetMapping("/delete/{id}")
    public String deleteTag(@PathVariable("id") long id, Model model) {
        Tag tag = tagRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
        tagRepository.delete(tag);

        return "redirect:/team#tab_team";
    }

//    @GetMapping("/edit/{id}")
//    public String showUpdateForm(@PathVariable("id") long id, Model model) {
//        Tag tag = tagRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
//        model.addAttribute("tag", tag);
//
//        return "popup-refreshTag";
//    }

    @PostMapping("/refresh/{id}")
    public String refreshTag(@PathVariable("id") long id, @Valid Tag tag, BindingResult result, Model model) {
        if (result.hasErrors()) {
            tag.setId(id);
            return "popup-refreshTag";
        }

        tagRepository.save(tag);

        return "redirect:/team#tab_team";
    }

    @GetMapping("/signup")
    public String showSignUpForm(Tag tag) {
        System.out.println("TRYTOADDD");

        return "popup-addTag";
    }

    @PostMapping("/addtag")
    public String addUser(@Valid Tag tag, BindingResult result, Model model) {
        System.out.println("BRGINOFADDING");
        if (result.hasErrors()) {
            System.out.println("ERROR????");
            return "popup-addTag";
        }

        tagRepository.save(tag);
        System.out.println("SAVED??????");
        return "redirect:/team#tab_team";
    }

    @PostMapping("/searchteam")
    public String inputData(@RequestParam("idChecked") Map<Post, Map<Tag, Level>> tagsWithLevel, /*ArrayList<String> filterByStatus,*/ Model model){

        model.addAttribute("readyTeam", tagsWithLevel);

        ArrayList<Lid> lids=new ArrayList<>();
        List<Candidate> candidates= candidateRepository.findAll();
        List<EmployeeIT> employeeITs= employeeITRepository.findAll();

        for(Candidate candidate:candidates){
            lids.add(new Lid(candidate));
        }
        for(EmployeeIT employeeIT:employeeITs){
            lids.add(new Lid(employeeIT));
        }

        Logics logics=new Logics(tagsWithLevel,lids);

        return "team";
    }



}
