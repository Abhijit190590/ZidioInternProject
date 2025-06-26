package com.example.Zproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Zproject.dto.StudentLoginRequest;
import com.example.Zproject.dto.StudentRegistrationRequest;
import com.example.Zproject.model.Student;
import com.example.Zproject.repository.StudentRepository;

import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public boolean registerStudent(StudentRegistrationRequest request) {
        
        // Check if studentId OR email already exists
        if (studentRepository.findByStudentId(request.getStudentId()).isPresent() 
            || studentRepository.findByEmail(request.getEmail()).isPresent()) {
            return false;
        }

        Student student = new Student();
        student.setStudentId(request.getStudentId());
        student.setFirstName(request.getFirstName());
        student.setLastName(request.getLastName());
        student.setEmail(request.getEmail());
        student.setPassword(request.getPassword());
        student.setDob(request.getDob());
        student.setGender(request.getGender());
        student.setCourse(request.getCourse());
        student.setPhone(request.getPhone());
        student.setAddress(request.getAddress());
        student.setLinkedin(request.getLinkedin());
        student.setSkills(request.getSkills());
        student.setAbout(request.getAbout());

        studentRepository.save(student);
        return true;
    }

    public boolean login(StudentLoginRequest request) {
        Optional<Student> student = studentRepository.findByStudentIdAndPassword(
                request.getStudentId(), request.getPassword());
        return student.isPresent();
    }
}
