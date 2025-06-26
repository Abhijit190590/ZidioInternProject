package com.example.Zproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> register(@RequestBody RecruiterRegistrationRequest request) {
        String result = recruiterService.registerRecruiter(request);
        if (result.equals("success")) {
            return ResponseEntity.ok("Registration successful");
        } else {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
    }

}
