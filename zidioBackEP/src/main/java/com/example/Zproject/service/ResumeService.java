package com.example.Zproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Zproject.dto.ResumeUploadRequest;
import com.example.Zproject.model.Resume;
import com.example.Zproject.repository.ResumeRepository;

@Service
public class ResumeService {

    @Autowired
    private ResumeRepository resumeRepository;

    public Resume uploadResume(ResumeUploadRequest request) {
        Resume resume = new Resume();
        resume.setStudentId(request.getStudentId());
        resume.setFileName(request.getFileName());
        resume.setFileUrl(request.getFileUrl());
        return resumeRepository.save(resume);
    }

    public Resume getResume(String studentId) {
        return resumeRepository.findByStudentId(studentId);
    }

	public void deleteResume(String studentId) {
		// TODO Auto-generated method stub
		
	}
}