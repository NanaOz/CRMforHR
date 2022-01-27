package com.company.controller;

import com.company.entity.Tag;
import com.company.repository.PostRepository;
import com.company.repository.StatusRepository;
import com.company.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@Controller
public class TeamController {

    private final TagRepository tagRepository;
    private final StatusRepository statusRepository;
    private final PostRepository postRepository;

    @Autowired
    public TeamController(TagRepository tagRepository, StatusRepository statusRepository, PostRepository postRepository) {
        this.tagRepository = tagRepository;
        this.statusRepository = statusRepository;
        this.postRepository = postRepository;
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

    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        Tag tag = tagRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
        model.addAttribute("tag", tag);

        return "popup-refreshTag";
    }

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

    //TODO доделать контроллер данные из чекбоксов
    @PostMapping("/searchteam")
    public String inputData(@RequestParam("idChecked") List<String> tags){

        if(tags != null){
            for(String tagStr : tags){

//                tagRepository.
            }
        }
        return "redirect:/team#tab_team";
    }

}
