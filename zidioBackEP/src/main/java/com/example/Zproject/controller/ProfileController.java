package com.example.Zproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.Zproject.dto.ProfileRequest;
import com.example.Zproject.model.StudentProfile;
import com.example.Zproject.service.ProfileService;

@RestController
@RequestMapping("/api/student/profile")
@CrossOrigin
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @PostMapping("/save")
    public StudentProfile saveProfile(@RequestBody ProfileRequest request) {
        return profileService.saveProfile(request);
    }

    @GetMapping("/{studentId}")
    public StudentProfile getProfile(@PathVariable String studentId) {
        return profileService.getProfile(studentId);
    }
}