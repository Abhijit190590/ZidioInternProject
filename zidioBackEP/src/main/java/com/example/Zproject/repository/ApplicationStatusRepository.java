package com.example.Zproject.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Zproject.model.ApplicationStatus;

import java.util.List;

public interface ApplicationStatusRepository extends JpaRepository<ApplicationStatus, Long> {
    List<ApplicationStatus> findByStudentId(String studentId);
}