package com.example.Zproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Zproject.model.ContactMessage;

public interface ContactRepository extends JpaRepository<ContactMessage, Long> {
}