package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentService service;

    public DepartmentController(DepartmentService service) {
        this.service = service;
    }
    @PostMapping
    public Department saveDepartment(@RequestBody Department department) {
        return service.saveDepartment(department);
    }
   @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable Long id) {
        return service.getDepartmentById(id);
    }
    @DeleteMapping("/del/{id}")
    public String deleteDepartment(@PathVariable Long id){
      return service.deletedatadepartment(id);
}
}