package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.StudentsStructure;
import com.example.demo.service.StudentsService;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService service;

    // CREATE (POST)
    @PostMapping("/save")
    public StudentStructure saveStudent(@RequestBody StudentsStructure student) {
        return service.saveStudent(student);
    }

    // READ (GET by ID)
    @GetMapping("/{id}")
    public StudentStructure getStudentById(@PathVariable int id) {
        return service.getStudentById(id);
    }
}