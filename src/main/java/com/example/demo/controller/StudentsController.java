package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.demo.entity.StudentsStructure;
import com.example.demo.service.StudentsService;

@RestController
@RequestMapping("/student")
public class StudentsController {

    @Autowired
    private StudentsService service;

    // CREATE (POST)
    @PostMapping("/save")
    public StudentsStructure saveStudent(@RequestBody StudentsStructure student) {
        return service.saveStudent(student);
    }

    // READ (GET by ID)
    @GetMapping("/{id}")
    public StudentsStructure getStudentById(@PathVariable int id) {
        return service.getStudentById(id);
    }
    @GetMapping("/getemail/{id}")
    public List<StudentsStructure> gets1(String email){
        return service.getBysingleEmail(email);
    }
}