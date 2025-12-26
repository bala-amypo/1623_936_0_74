package com.example.demo.service.Impl;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Studentss;
import com.example.demo.repository.StudentssRepository;
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