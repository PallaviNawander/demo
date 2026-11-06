package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class RegistrationController {

    @PostMapping("/register")
    public String register(
        @RequestParam String name,
        @RequestParam String email,
        @RequestParam String event) {

        return "Registration Successful!\n"
             + "Name: " + name + "\n"
             + "Email: " + email + "\n"
             + "Event: " + event;
    }
}