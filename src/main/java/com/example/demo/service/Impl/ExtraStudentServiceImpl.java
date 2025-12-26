package com.example.demo.service.Impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.entity.ExtraStudent;
import com.example.demo.repository.ExtraStudentRepo;
import com.example.demo.service.ExtraStudentService;
import org.springframework.security.crypto.password.PasswordEncoder;

@Service
public class ExtraStudentServiceImpl implements ExtraStudentService {

    @Autowired
    ExtraStudentRepo repo;

     @Autowired
    private PasswordEncoder encoder; 
 @Override
    public ExtraStudent saveExtraStudent(ExtraStudent extraStudent) {
        extraStudent.setPassword(encoder.encode(extraStudent.getPassword()));
        return repo.save(extraStudent);
    }

}