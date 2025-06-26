package com.example.Zproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.Zproject.model.ApplicationStatus;
import com.example.Zproject.service.ApplicationStatusService;

import java.util.List;

@RestController
@RequestMapping("/api/student/status")
@CrossOrigin
public class ApplicationStatusController {

    @Autowired
    private ApplicationStatusService applicationStatusService;

    @PostMapping("/update")
    public ApplicationStatus updateStatus(@RequestParam String studentId,
                                          @RequestParam String jobTitle,
                                          @RequestParam String status) {
        return applicationStatusService.updateStatus(studentId, jobTitle, status);
    }

    @GetMapping("/{studentId}")
    public List<ApplicationStatus> getStatusList(@PathVariable String studentId) {
        return applicationStatusService.getStatusList(studentId);
    }
}