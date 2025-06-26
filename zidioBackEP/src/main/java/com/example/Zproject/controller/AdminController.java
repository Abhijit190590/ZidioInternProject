package com.example.Zproject.controller;

import com.example.Zproject.dto.AdminLoginRequest;
import com.example.Zproject.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = "*")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody AdminLoginRequest request) {
        boolean isValid = adminService.validateAdmin(request.getUsername(), request.getPassword());

        if (isValid) {
            return ResponseEntity.ok("Login successful");
        } else {
            return ResponseEntity.status(401).body("Invalid username or password");
        }
    }
}
