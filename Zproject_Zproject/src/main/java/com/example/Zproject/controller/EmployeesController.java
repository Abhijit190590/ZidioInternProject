package com.example.Zproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.example.Zproject.entity.Employees;
import com.example.Zproject.service.EmployeesService;

import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class EmployeesController {
	
	@Autowired
	private EmployeesService employeesService;
	
	@GetMapping("/getEmp")
	public List<Employees> getEmp(){
		return employeesService.getEmployees();
	}
}
