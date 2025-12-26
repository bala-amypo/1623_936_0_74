package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Studentss;

public interface StudentssRepository extends JpaRepository<Studentss, Long> {
    
}