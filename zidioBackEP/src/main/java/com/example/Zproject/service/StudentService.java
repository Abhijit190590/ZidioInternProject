package com.example.Zproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Zproject.dto.StudentLoginRequest;
import com.example.Zproject.dto.StudentRegistrationRequest;
import com.example.Zproject.model.Student;
import com.example.Zproject.repository.StudentRepository;
import com.sun.jdi.request.ExceptionRequest;

import java.util.Optional;

@Service
public class StudentService {
	@Autowired
    private StudentRepository studentRepository;

    public boolean registerStudent(StudentRegistrationRequest request) {
        if (studentRepository.findByStudentId(((StudentLoginRequest) request).getStudentId()).isPresent()) {
            return false; // Student ID already exists
        }
        Student student = new Student();
        student.setStudentId(((StudentLoginRequest) request).getStudentId());
        student.setFirstName(((Student) request).getFirstName());
        student.setLastName(((Student) request).getLastName());
        student.setEmail(((Student) request).getEmail());
        student.setPassword(((StudentLoginRequest) request).getPassword());
        student.setDob(((Student) request).getDob());
        student.setGender(((Student) request).getGender());
        student.setCourse(((Student) request).getCourse());
        student.setPhone(((Student) request).getPhone());
        student.setAddress(((Student) request).getAddress());
        student.setLinkedin(((Student) request).getLinkedin());
        student.setSkills(((Student) request).getSkills());
        student.setAbout(((Student) request).getAbout());

        studentRepository.save(student);
        return true;
    }

    public boolean login(StudentLoginRequest request) {
        Optional<Student> student = studentRepository.findByStudentIdAndPassword(request.getStudentId(), request.getPassword());
        return student.isPresent();
    }
}
