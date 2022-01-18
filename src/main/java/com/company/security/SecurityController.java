package com.company.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {
    @GetMapping("/")
    public String hello() {
        return "redirect:/menu";
    }
//    @GetMapping("/user")
//    public String user() {
//        return "User";
//    }
//    @GetMapping("/admin")
//    public String admin() {
//        return "Admin";
//    }
}

