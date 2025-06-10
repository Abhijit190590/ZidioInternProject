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



//
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Service;
//
//import com.example.ZidioProject_Backend.entity.User;
//import com.sun.tools.javac.util.List;
//
//public interface UserRepository extends JpaRepository<User, Long> {
// Optional<User> findByEmail(String email);
//}
//
//public interface UserService {
// User register(User user);
// Optional<User> findByEmail(String email);
// List<User> findAll();
//}
//@Service
//public class UserServiceImpl implements UserService {
// @Autowired private UserRepository userRepository;
// public User register(User user) {
// return userRepository.save(user);
// }
// public Optional<User> findByEmail(String email) {
// return userRepository.findByEmail(email);
// }
// public List<User> findAll() {
// return userRepository.findAll();
// }
//}

