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
//        if (request.getStudentId() == null || request.getJobTitle() == null || request.getCompanyName() == null) {
//            throw new IllegalArgumentException("All fields are required.");
//        }
    	
    	if (request.getStudentId() == null || request.getJobTitle() == null || request.getCompanyName() == null) {
    	    throw new IllegalArgumentException("All fields are required.");
    	}

        
        JobApplication application = new JobApplication();
        application.setStudentId(request.getStudentId());
        application.setJobTitle(request.getJobTitle());
        application.setCompanyName(request.getCompanyName());
        return jobApplicationRepository.save(application);
    }

    public List<JobApplication> getApplications(String studentId) {
        return jobApplicationRepository.findByStudentId(studentId);
    }

    // Recruiter views all applications
    public List<JobApplication> getAllApplications() {
        return jobApplicationRepository.findAll();
    }

    public String exportApplicationsToCsv() {
        List<JobApplication> applications = jobApplicationRepository.findAll();

        StringBuilder sb = new StringBuilder();
        sb.append("ID,Student ID,Job Title,Company Name\n");

        for (JobApplication app : applications) {
            sb.append(app.getId()).append(",")
              .append(app.getStudentId()).append(",")
              .append(app.getJobTitle()).append(",")
              .append(app.getCompanyName()).append("\n");
        }

        return sb.toString();
    }

}
