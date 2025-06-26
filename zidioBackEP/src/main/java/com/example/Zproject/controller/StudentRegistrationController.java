package com.example.Zproject.controller;

import com.example.Zproject.dto.StudentRegistrationRequest;
import com.example.Zproject.service.StudentService;
import com.sun.jdi.request.ExceptionRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/student")
@CrossOrigin
public class StudentRegistrationController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/register")
    public String register(@RequestBody ExceptionRequest request) {
        boolean success = studentService.registerStudent(request);
        return success ? "Registration successful" : "Student ID already exists";
    }
}
