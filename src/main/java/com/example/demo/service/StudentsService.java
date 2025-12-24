package com.example.demo.service;

import com.example.demo.entity.StudentsStructure;

public interface StudentsService {

    StudentsStructure saveStudent(StudentsStructure student);

    StudentsStructure getStudentById(int id);
    List<StudentsStructure>
}