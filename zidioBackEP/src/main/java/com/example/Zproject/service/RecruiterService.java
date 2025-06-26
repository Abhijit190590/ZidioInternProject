package com.example.Zproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Zproject.dto.RecruiterLoginRequest;
import com.example.Zproject.dto.RecruiterRegistrationRequest;
import com.example.Zproject.model.Recruiter;
import com.example.Zproject.repository.RecruiterRepository;

import java.util.Optional;

@Service
public class RecruiterService {

    @Autowired
    private RecruiterRepository recruiterRepository;

    public String registerRecruiter(RecruiterRegistrationRequest request) {
        if (recruiterRepository.findByRecruiterId(request.getRecruiterId()).isPresent()) {
            return "Recruiter ID already exists"; // Recruiter ID already exists
        }
        if (recruiterRepository.findByEmail(request.getEmail()).isPresent()) {
            return "Email already exists"; // Email already exists
        }

        Recruiter recruiter = new Recruiter();
        recruiter.setLocation(request.getLocation());
        recruiter.setName(request.getName());
        recruiter.setRecruiterId(request.getRecruiterId());
        recruiter.setCompany(request.getCompany());
        recruiter.setEmail(request.getEmail());
        recruiter.setPhone(request.getPhone());
        recruiter.setPassword(request.getPassword());

        recruiterRepository.save(recruiter);
        return "success";
    }

    public String login(RecruiterLoginRequest request) {
        Optional<Recruiter> recruiterOptional = recruiterRepository.findByRecruiterId(request.getRecruiterId());
        
        if (recruiterOptional.isEmpty()) {
            return "Recruiter ID does not exist";
        }

        Recruiter recruiter = recruiterOptional.get();
        
        if (recruiter.getPassword().equals(request.getPassword())) {
            return "Login successful";
        } else {
            return "Incorrect password";
        }
    }
}