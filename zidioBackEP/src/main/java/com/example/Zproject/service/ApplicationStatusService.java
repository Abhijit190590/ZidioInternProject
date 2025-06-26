package com.example.Zproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Zproject.model.ApplicationStatus;
import com.example.Zproject.repository.ApplicationStatusRepository;

import java.util.List;

@Service
public class ApplicationStatusService {

    @Autowired
    private ApplicationStatusRepository applicationStatusRepository;

    public ApplicationStatus updateStatus(String studentId, String jobTitle, String status) {
        ApplicationStatus appStatus = new ApplicationStatus();
        appStatus.setStudentId(studentId);
        appStatus.setJobTitle(jobTitle);
        appStatus.setStatus(status);
        return applicationStatusRepository.save(appStatus);
    }

    public List<ApplicationStatus> getStatusList(String studentId) {
        return applicationStatusRepository.findByStudentId(studentId);
    }
}