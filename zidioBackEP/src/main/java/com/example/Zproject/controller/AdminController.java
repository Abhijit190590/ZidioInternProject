package com.example.Zproject.controller;

import com.example.Zproject.dto.AdminLoginRequest;
import com.example.Zproject.model.Admin;
import com.example.Zproject.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = "*")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/login")
    public boolean login(@RequestBody AdminLoginRequest request) {
        return adminService.validateAdmin(request.getUsername(), request.getPassword());
    }
}
