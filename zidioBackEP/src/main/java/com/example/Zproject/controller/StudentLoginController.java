package com.example.Zproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.Zproject.dto.StudentLoginRequest;
import com.example.Zproject.service.StudentService;

public class StudentLoginController {
	 @Autowired
	    private StudentService studentService;

	    @PostMapping("/login")
	    public String login(@RequestBody StudentLoginRequest request) {
	        boolean success = studentService.login(request);
	        return success ? "Login successful" : "Invalid credentials";
	    }
}
