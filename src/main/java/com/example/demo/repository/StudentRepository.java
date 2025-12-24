package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.StudentStructure;

public interface StudentRepository extends JpaRepository<StudentStructure, Integer> {
}