package com.example.Zproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Zproject.model.JobApplication;

import java.util.List;

public interface JobApplicationRepository extends JpaRepository<JobApplication, Long> {
    List<JobApplication> findByStudentId(String studentId);
}