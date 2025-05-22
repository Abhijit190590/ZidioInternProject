package com.example.Zproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Zproject.entity.Employees;
import com.example.Zproject.repo.EmployeesRepo;

@Service
public class EmployeesService {
	
	@Autowired
	private EmployeesRepo employeesRepo;
	
	public List<Employees> getEmployees(){
		return employeesRepo.findAll();
	}
}
