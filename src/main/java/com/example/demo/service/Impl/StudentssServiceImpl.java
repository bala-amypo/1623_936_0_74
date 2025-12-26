package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentssService;

@Service
public class StudentssServiceImpl implements StudentssService {

    private final StudentssRepository repo;

    public StudentssServiceImpl(StudentssRepository repo) {
        this.repo = repo;
    }

    @Override
    public Studentss saveStudent(Studentss student) {
        return repo.save(student);
    }

    @Override
    public Studentss getStudentById(Long id) {
        return repo.findById(id).orElse(null);
    }
}