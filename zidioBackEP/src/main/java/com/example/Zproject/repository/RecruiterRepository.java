package com.example.Zproject.repository;

import com.example.Zproject.model.Recruiter;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RecruiterRepository extends JpaRepository<Recruiter, Long> {
    Optional<Recruiter> findByRecruiterIdAndPassword(String recruiterId, String password);
    Optional<Recruiter> findByRecruiterId(String recruiterId);
    Optional<Recruiter> findByEmail(String email);
}