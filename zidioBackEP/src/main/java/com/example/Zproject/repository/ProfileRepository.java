package com.example.Zproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Zproject.model.StudentProfile;

public interface ProfileRepository extends JpaRepository<StudentProfile, Long> {
    StudentProfile findByStudentId(String studentId);
}