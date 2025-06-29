package com.example.Zproject.dto;

public class JobApplicationRequest {
    
    private String studentId;
    private String jobTitle;
    private String companyName;

    public JobApplicationRequest() {
        // Default constructor
    }

    public JobApplicationRequest(String studentId, String jobTitle, String companyName) {
        this.studentId = studentId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
