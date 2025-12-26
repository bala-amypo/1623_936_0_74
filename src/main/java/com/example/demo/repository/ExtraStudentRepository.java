package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.ExtraStudent;

@Repository 
public interface ExtraStudentRepository extends JpaRepository<ExtraStudent,Integer>{

}