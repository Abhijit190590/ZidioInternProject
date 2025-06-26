package com.example.Zproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Zproject.dto.JobApplicationRequest;
import com.example.Zproject.model.JobApplication;
import com.example.Zproject.repository.JobApplicationRepository;

import java.util.List;

@Service
public class JobApplicationService {

    @Autowired
    private JobApplicationRepository jobApplicationRepository;

    public JobApplication applyJob(JobApplicationRequest request) {
        JobApplication application = new JobApplication();
        application.setStudentId(request.getStudentId());
        application.setJobTitle(request.getJobTitle());
        application.setCompanyName(request.getCompanyName());
        return jobApplicationRepository.save(application);
    }

    public List<JobApplication> getApplications(String studentId) {
        return jobApplicationRepository.findByStudentId(studentId);
    }
}