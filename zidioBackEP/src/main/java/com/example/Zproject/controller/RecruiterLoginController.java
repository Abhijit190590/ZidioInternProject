package com.example.Zproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.Zproject.dto.RecruiterLoginRequest;
import com.example.Zproject.service.RecruiterService;

@RestController
@RequestMapping("/api/recruiter")
@CrossOrigin
public class RecruiterLoginController {

    @Autowired
    private RecruiterService recruiterService;

    @PostMapping("/login")
    public String login(@RequestBody RecruiterLoginRequest request) {
        boolean success = recruiterService.login(request);
        return success ? "Login successful" : "Invalid credentials";
    }
}
