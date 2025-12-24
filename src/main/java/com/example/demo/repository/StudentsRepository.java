package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.StudentsStructure;
import java.util.List;

public interface StudentsRepository extends JpaRepository<StudentsStructure, Integer> {

    @Query("SELECT s FROM StudentsStructure s WHERE s.studEmail = :email")
    List<StudentsStructure> findByStudEmail(@Param("email") String email);

    @Query("SELECT s FROM StudentsStructure s WHERE s.cGpa >= :cgpa")
    List<StudentsStructure> findByCgpa(@Param("cgpa") double cgpa);
}
