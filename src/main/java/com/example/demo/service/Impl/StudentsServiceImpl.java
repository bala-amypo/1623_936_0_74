package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.StudentsStructure;
import com.example.demo.repository.StudentsRepository;
import com.example.demo.exception.StudentsException;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentsServiceImpl implements StudentsService {

    @Autowired
    private StudentsRepository repository;

    @Transactional
    @Override
    public StudentsStructure saveStudent(StudentsStructure student) {
        repository.save(student);
        if(student.getEmail().equals("maha@gmail.com")){

        throw new StudentsException("Network issuse or serve issuse");
    }
    return student;
    }

    @Override
    public StudentsStructure getStudentById(int id) {
        return repository.findById(id).orElse(null);
    }
}