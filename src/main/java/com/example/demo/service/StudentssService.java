package com.example.demo.service;

import com.example.demo.entity.Studentss;

public interface StudentssService {
    Studentss saveStudent(Studentss student);
    Studentss getStudentById(Long id);
}