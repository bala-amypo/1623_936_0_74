package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.ExtraStudent;

import com.example.demo.service.ExtraStudentService;

// import org.springframework.security.crypto.password.PasswordEncoder;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    ExtraStudentService ser;

    @PostMapping("/register")
    public ExtraStudent register(@RequestBody ExtraStudent stu) {
        return ser.saveExtraStudent(stu);
    }
@GetMapping("/getemail/{email}")
    public List<StudentsStructure> gets1(@PathVariable String email) {
        return service.findByStudEmail(email);
    }
}