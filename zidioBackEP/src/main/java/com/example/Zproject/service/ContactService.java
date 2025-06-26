package com.example.Zproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Zproject.dto.ContactRequest;
import com.example.Zproject.model.ContactMessage;
import com.example.Zproject.repository.ContactRepository;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public void saveMessage(ContactRequest request) {
        ContactMessage message = new ContactMessage();
        message.setName(request.getName());
        message.setEmail(request.getEmail());
        message.setPhone(request.getPhone());
        message.setMessage(request.getMessage());

        contactRepository.save(message);
    }
}