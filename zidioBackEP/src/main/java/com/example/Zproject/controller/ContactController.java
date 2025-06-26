package com.example.Zproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.Zproject.dto.ContactRequest;
import com.example.Zproject.service.ContactService;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin
public class ContactController {

    @Autowired
    private ContactService contactService;

    @PostMapping("/submit")
    public String submitMessage(@RequestBody ContactRequest request) {
        contactService.saveMessage(request);
        return "Message submitted successfully!";
    }
}