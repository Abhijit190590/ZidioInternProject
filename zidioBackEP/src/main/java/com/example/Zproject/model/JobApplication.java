package com.example.Zproject.model;

import jakarta.persistence.*;

@Entity
@Table(name = "job_applications")  // Optional: Explicit table name
public class JobApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String studentId;
    private String jobTitle;
    private String companyName;

    public JobApplication() {
        // Default constructor required by JPA
    }

    public JobApplication(String studentId, String jobTitle, String companyName) {
        this.studentId = studentId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
    }

    public Long getId() {
        return id;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
