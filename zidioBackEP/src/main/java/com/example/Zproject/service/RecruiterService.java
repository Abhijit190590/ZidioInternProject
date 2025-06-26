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

    public boolean registerRecruiter(RecruiterRegistrationRequest request) {
        if (recruiterRepository.findByRecruiterId(request.getRecruiterId()).isPresent()) {
            return false; // Recruiter ID already exists
        }
        Recruiter recruiter = new Recruiter();
        recruiter.setRecruiterId(request.getRecruiterId());
        recruiter.setName(request.getName());
        recruiter.setCompany(request.getCompany());
        recruiter.setEmail(request.getEmail());
        recruiter.setPhone(request.getPhone());
        recruiter.setPassword(request.getPassword());

        recruiterRepository.save(recruiter);
        return true;
    }

    public boolean login(RecruiterLoginRequest request) {
        Optional<Recruiter> recruiter = recruiterRepository.findByRecruiterIdAndPassword(request.getRecruiterId(), request.getPassword());
        return recruiter.isPresent();
    }
}