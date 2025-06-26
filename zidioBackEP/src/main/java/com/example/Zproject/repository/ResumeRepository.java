package com.example.Zproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Zproject.model.Resume;

public interface ResumeRepository extends JpaRepository<Resume, Long> {
    Resume findByStudentId(String studentId);
}