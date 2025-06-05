package com.example.ZidioProject_Backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="recruiter")
public class Recruiter {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	
	private Long userId;
	
	private String company_name;
	
}
