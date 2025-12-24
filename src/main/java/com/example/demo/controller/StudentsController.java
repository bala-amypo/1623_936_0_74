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

    // CREATE
    @PostMapping("/save")
    public StudentsStructure saveStudent(@RequestBody StudentsStructure student) {
        return service.saveStudent(student);
    }

    // READ by ID
    @GetMapping("/{id}")
    public StudentsStructure getStudentById(@PathVariable int id) {
        return service.getStudentById(id);
    }

    // READ by EMAIL
    @GetMapping("/getemail/{email}")
    public List<StudentsStructure> gets1(@PathVariable String email) {
        return service.findByStudEmail(email);
    }
    @GetMapping("/getecgpa/{cgpa}")
    public List<StudentsStructure> gets2(@PathVariable double cgpa) {
        return service.findByCgpa(cgpa);
    }
}
