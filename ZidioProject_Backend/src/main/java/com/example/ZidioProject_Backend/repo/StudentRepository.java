package com.example.ZidioProject_Backend.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ZidioProject_Backend.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	Optional<Student> findByEmail(String email);
}

// public interface StudentRepository extends JpaRepository<Student Long>{
// 	Optional<Student> findByEmail(String email);

// }
