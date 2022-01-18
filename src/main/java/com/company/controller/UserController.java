package com.company.controller;

import com.company.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import com.company.repository.UserRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/menu")
    public String homePage(){
        return "menu";
    }

    @GetMapping("/candidate")
    public String showUserList(Model model) {
        model.addAttribute("users", userRepository.findAll());
        return "candidate";
    }


//    @GetMapping("/signup")
//    public String showSignUpForm(User user) {
//        System.out.println("TRYTOADDD");
//        return "employee";
//    }
//
//    @PostMapping("/adduser")
//    public String addUser(@Valid User user, BindingResult result, Model model) {
//        System.out.println("BRGINOFADDING");
//        if (result.hasErrors()) {
//            System.out.println("ERROR????");
//            return "employee";
//        }
//
//        userRepository.save(user);
//        System.out.println("SAVED??????");
//        return "redirect:/in";
//    }



    @GetMapping("/info/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        User user = userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
        model.addAttribute("user", user);

        return "popup-info";
    }

    @GetMapping("/popup-create-account")
    public String showSignUpForm() {
        System.out.println("TRYTOADDD");
        return "popup-create-account";
    }

//
//    @PostMapping("/update/{id}")
//    public String updateUser(@PathVariable("id") long id, @Valid User user, BindingResult result, Model model) {
//        if (result.hasErrors()) {
//            user.setId(id);
//            return "update-user";
//        }
//
//        userRepository.save(user);
//
//        return "redirect:/index";
//    }
//
//    @GetMapping("/delete/{id}")
//    public String deleteUser(@PathVariable("id") long id, Model model) {
//        User user = userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
//        userRepository.delete(user);
//
//        return "redirect:/index";
//    }

}
