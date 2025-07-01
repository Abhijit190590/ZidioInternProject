package com.example.Zproject.controller;

import com.example.Zproject.dto.PasswordResetRequest;
import com.example.Zproject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/student")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/reset-password")
    public ResponseEntity<String> resetPassword(@RequestBody PasswordResetRequest request) {
        boolean success = studentService.resetPassword(request);
        if (success) {
            return ResponseEntity.ok("Password reset successful!");
        } else {
            return ResponseEntity.status(404).body("Email not found.");
        }
    }
}
