//package com.example.ZidioProject_Backend.service;
//
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.example.ZidioProject_Backend.entity.User;
//
//import sun.reflect.generics.repository.ConstructorRepository;
//
//
//@Service
//public class UserService {
//
//	@Autowired
//	private ConstructorRepository userRepository;
//	
//	public Optional<User> getUserByEmail(String emain){
//		return userRepository.findByEmail(email);
//	}
//	public User saveUser(User user) {
//		return userRepository.save(user);
//	}
//	
//}
