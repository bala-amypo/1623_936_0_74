package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ExtraStudent;

@Repository
public interface ExtraStudentRepo extends JpaRepository<ExtraStudent, Long> {

@Query("SELECT s FROM ExtraStudent s WHERE s.email=:email")
    ExtraStudent FindByEmail(@Param("email") String email);

}