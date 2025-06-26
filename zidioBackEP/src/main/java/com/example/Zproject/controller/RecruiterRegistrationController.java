package com.example.Zproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.Zproject.dto.RecruiterRegistrationRequest;
import com.example.Zproject.service.RecruiterService;

@RestController
@RequestMapping("/api/recruiter")
@CrossOrigin
public class RecruiterRegistrationController {

    @Autowired
    private RecruiterService recruiterService;

    @PostMapping("/register")
    public String register(@RequestBody RecruiterRegistrationRequest request) {
        boolean success = recruiterService.registerRecruiter(request);
        return success ? "Registration successful" : "Recruiter ID already exists";
    }
}
