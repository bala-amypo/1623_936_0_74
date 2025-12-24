package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.StudentsStructure;
import com.example.demo.repository.StudentsRepository;
import com.example.demo.exception.StudentsException;


@Service
public class StudentsServiceImpl implements StudentsService {

    @Autowired
    private StudentsRepository repository;

    @Override
    public StudentsStructure saveStudent(StudentsStructure student) {
        repository.save(student);
        throw new StudentsException(message: "Network issuse or serve issuse");
    }

    @Override
    public StudentsStructure getStudentById(int id) {
        return repository.findById(id).orElse(null);
    }
}