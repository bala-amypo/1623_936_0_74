package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepository;
import com.example.demo.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository repo;

    public DepartmentServiceImpl(DepartmentRepository repo) {
        this.repo = repo;
    }

    @Override
    public Department saveDepartment(Department department) {
        return repo.save(department);
    }

    @Override
    public Department getDepartmentById(Long id) {
        return repo.findById(id).orElse(null);
    }
    @Override
    public String deletedatadepartment(Long id) {
        repo.deleteById(id);
        return "Department deleted successfully with id : " + id;
    }
}
