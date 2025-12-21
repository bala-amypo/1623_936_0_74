package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.StudentId;

@Repository 
public interface StudentIdRepo extends JpaRepository<StudentId,Integer>{

}