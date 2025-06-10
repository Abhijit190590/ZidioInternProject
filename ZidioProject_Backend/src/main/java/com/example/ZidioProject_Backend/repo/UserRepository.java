package com.example.ZidioProject_Backend.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ZidioProject_Backend.entity.User;

@Repository

public interface UserRepository extends JpaRepository{
	Optional<User> findByEmail(String email);
	
}
