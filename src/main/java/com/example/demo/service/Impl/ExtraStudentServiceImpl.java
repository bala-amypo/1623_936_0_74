package com.example.demo.service.Impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.entity.ExtraStudent;
import com.example.demo.repository.ExtraStudentRepo;
import com.example.demo.service.ExtraStudentService;

@Service
public class ExtraStudentServiceImpl implements ExtraStudentService {

    @Autowired
    ExtraStudentRepo repo;

    @Override
    public ExtraStudent saveExtraStudent(ExtraStudent stu) {
        return repo.save(stu);
    }
}