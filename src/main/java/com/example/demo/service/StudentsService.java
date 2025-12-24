package com.example.demo.service;

import com.example.demo.entity.StudentsStructure;
import java.util.List;

public interface StudentsService {

    StudentsStructure saveStudent(StudentsStructure student);

    StudentsStructure getStudentById(int id);
    List<StudentsStructure>findByStudEmail(String email);
}