package com.company.controller;

import com.company.utils.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.company.repository.UserRepository;


@Controller
public class UserController {

   @Autowired
   public UserRepository userRepository;

   @GetMapping("/employee")
    public String showEmployee(Model model) {
       Iterable<User> users = userRepository.findAll();
       model.addAttribute("users", users);
       return "ManagerHR";
   }

//    private final UserRepository userRepository;
//
//    @Autowired
//    public UserController(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }

//    @GetMapping("/memu")
//    public String showUserList(Model model) {
//        model.addAttribute("users", userRepository.findAll());
//        return "ManagerHRView";
//    }
//
//    @GetMapping("/signup")
//    public String showSignUpForm(User user) {
//        System.out.println("TRYTOADDD");
//        return "add-user";
//    }
//
//    @PostMapping("/adduser")
//    public String addUser(@Valid User user, BindingResult result, Model model) {
//        System.out.println("BRGINOFADDING");
//        if (result.hasErrors()) {
//            System.out.println("ERROR????");
//            return "add-user";
//        }
//
//        userRepository.save(user);
//        System.out.println("SAVED??????");
//        return "redirect:/index";
//    }
//
//    @GetMapping("/edit/{id}")
//    public String showUpdateForm(@PathVariable("id") long id, Model model) {
//        User user = userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
//        model.addAttribute("user", user);
//
//        return "update-user";
//    }
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
