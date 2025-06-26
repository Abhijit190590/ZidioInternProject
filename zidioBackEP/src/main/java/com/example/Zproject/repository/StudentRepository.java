package com.example.Zproject.repository;

import com.example.Zproject.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Student> findByStudentIdAndPassword(String studentId, String password);
    Optional<Student> findByStudentId(String studentId);
}