package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.StudentsStructure;

public interface StudentsRepository extends JpaRepository<StudentsStructure, Integer> {

    @Query("SELECT * FROM StudentStructure s WHERE s.studEmail =:email")
    List<StudentStructure>findEmail()
}