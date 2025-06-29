package com.example.Zproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.Zproject.dto.ResumeUploadRequest;
import com.example.Zproject.model.Resume;
import com.example.Zproject.service.ResumeService;

@RestController
@RequestMapping("/api/student/resume")
@CrossOrigin
public class ResumeController {

    @Autowired
    private ResumeService resumeService;

    @PostMapping("/upload")
    public Resume uploadResume(@RequestBody ResumeUploadRequest request) {
        return resumeService.uploadResume(request);
    }

    @GetMapping("/{studentId}")
    public Resume getResume(@PathVariable String studentId) {
        return resumeService.getResume(studentId);
    }
    
    @DeleteMapping("/{studentId}")
    public void deleteResume(@PathVariable String studentId) {
        resumeService.deleteResume(studentId);
    }

}