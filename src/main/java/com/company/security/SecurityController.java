package com.company.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class SecurityController {
    @GetMapping("/")
    public String user() {
        return "привет у тебя получилось";
    }
}

