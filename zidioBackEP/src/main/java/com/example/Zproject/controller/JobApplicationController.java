package com.example.Zproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.Zproject.dto.JobApplicationRequest;
import com.example.Zproject.model.JobApplication;
import com.example.Zproject.service.JobApplicationService;

import java.util.List;

@RestController
@RequestMapping("/api/student/application")
@CrossOrigin
public class JobApplicationController {

    @Autowired
    private JobApplicationService jobApplicationService;

    @PostMapping("/apply")
    public JobApplication applyJob(@RequestBody JobApplicationRequest request) {
        return jobApplicationService.applyJob(request);
    }

    @GetMapping("/{studentId}")
    public List<JobApplication> getApplications(@PathVariable String studentId) {
        return jobApplicationService.getApplications(studentId);
    }
}