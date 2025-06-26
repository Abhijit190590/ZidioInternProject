package com.example.Zproject.service;

import com.example.Zproject.model.Admin;
import com.example.Zproject.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public boolean validateAdmin(String username, String password) {
        return adminRepository.findById(username)
                .map(admin -> admin.getPassword().equals(password))
                .orElse(false);
    }
}
