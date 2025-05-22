package com.example.Zproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Zproject.entity.Employees;

@Repository
public interface EmployeesRepo extends JpaRepository<Employees, String> {
	
}
