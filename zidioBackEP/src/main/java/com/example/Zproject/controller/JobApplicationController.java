package com.example.Zproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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

    // Student applies for a job
    @PostMapping("/apply")
    public JobApplication applyJob(@RequestBody JobApplicationRequest request) {
        return jobApplicationService.applyJob(request);
    }

    // Student views their own applications
    @GetMapping("/{studentId}")
    public List<JobApplication> getApplications(@PathVariable("studentId") String studentId) {
        return jobApplicationService.getApplications(studentId);
    }


    // Recruiter views all applications
    @GetMapping("/all")
    public List<JobApplication> getAllApplications() {
        return jobApplicationService.getAllApplications();
    }

    // Export applications to CSV
    @GetMapping("/export")
    public ResponseEntity<ByteArrayResource> exportApplicationsToCsv() {
        String csvData = jobApplicationService.exportApplicationsToCsv();
        ByteArrayResource resource = new ByteArrayResource(csvData.getBytes());

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"applications.csv\"")
                .contentType(MediaType.TEXT_PLAIN)
                .contentLength(csvData.length())
                .body(resource);
    }
}
