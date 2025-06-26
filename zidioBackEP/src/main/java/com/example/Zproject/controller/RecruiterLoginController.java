package com.example.Zproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> login(@RequestBody RecruiterLoginRequest request) {
        String result = recruiterService.login(request);
        
        if (result.equals("Login successful")) {
            return ResponseEntity.ok(result);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(result);
        }
    }

}
