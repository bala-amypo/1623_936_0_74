package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.example.demo.entity.ExtraStudent;
import com.example.demo.dto.AuthRequest;
import com.example.demo.dto.AuthResponse;
import com.example.demo.security.JwtUtil;

import com.example.demo.service.ExtraStudentService;

// import org.springframework.security.crypto.password.PasswordEncoder;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    ExtraStudentService ser;
    @Autowired
    PasswordEncoder encoder;


    @Autowired JwtUtil util;

    @PostMapping("/add")
    public ExtraStudent addExtraStudent(@RequestBody ExtraStudent stu) {
        return ser.saveExtraStudent(stu);
    }

    @PostMapping("/login")
    public AuthResponse login(@RequestBody AuthRequest request) {
        ExtraStudent student = ser.CheckEmail(request.getEmail());
        if (student == null) {
            throw new RuntimeException("User Not Found");

        }
        if (!encoder.matches(request.getPassword(), student.getPassword())) {
            throw new RuntimeException("Invalid credentials");
        }

        // return "Login successful for " + student.getEmail();


        String token = util.generateToken(
                student.getEmail(),
                student.getRole()
        );


        return new AuthResponse(token, student.getRole());
    }
    
//     @Autowired
//     ExtraStudentService ser;

//     @PostMapping("/register")
//     public ExtraStudent register(@RequestBody ExtraStudent stu) {
//         return ser.saveExtraStudent(stu);
//     }
// @Autowired
//     private PasswordEncoder encoder;

//  @PostMapping("/login")
//     public String login(@RequestBody AuthRequest request) {
//         ExtraStudent student = ser.CheckEmail(request.getEmail());
//         if (student == null) {
//             throw new RuntimeException("User Not Found");

//         }
//         if (!encoder.matches(request.getPassword(), student.getPassword())) {
//             throw new RuntimeException("Invalid credentials");
//         }

//         return "Login successful for " + student.getEmail();
// }
}
