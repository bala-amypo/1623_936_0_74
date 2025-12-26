package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.security.access.prepost.PreAuthorize;
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
    @PreAuthorize("hasRole('ADMIN')")
    public Studentss saveStudent(@RequestBody Studentss student) {
        return service.saveStudent(student);
    }

    // GET by ID
    @GetMapping("/{id}")
  @PreAuthorize("hasAnyRole('USER')")
    public Studentss getStudentById(@PathVariable Long id) {
        return service.getStudentById(id);
    }
}