package com.example.Zproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Zproject.dto.ProfileRequest;
import com.example.Zproject.model.StudentProfile;
import com.example.Zproject.repository.ProfileRepository;

@Service
public class ProfileService {

    @Autowired
    private ProfileRepository profileRepository;

    public StudentProfile saveProfile(ProfileRequest request) {
        StudentProfile profile = new StudentProfile();
        profile.setStudentId(request.getStudentId());
        profile.setFullName(request.getFullName());
        profile.setEmail(request.getEmail());
        profile.setPhone(request.getPhone());
        profile.setCourse(request.getCourse());
        return profileRepository.save(profile);
    }

    public StudentProfile getProfile(String studentId) {
        return profileRepository.findByStudentId(studentId);
    }
}
