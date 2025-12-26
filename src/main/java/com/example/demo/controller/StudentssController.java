package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Studentss;
import com.example.demo.service.StudentssService;

@RestController
@RequestMapping("/students")
public class StudentssController {

    private final StudentssService service;

    public StudentssController(StudentssService service) {
        this.service = service;
    }

    // POST
    @PostMapping
    public Studentss saveStudent(@RequestBody Studentss student) {
        return service.saveStudent(student);
    }

    // GET by ID
    @GetMapping("/{id}")
    public Studentss getStudentById(@PathVariable Long id) {
        return service.getStudentById(id);
    }
}