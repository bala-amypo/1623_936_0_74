package com.example.demo.repository;
import com.example.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.StudentsStructure;
import com.example.data.repository.query.Param;

public interface StudentsRepository extends JpaRepository<StudentsStructure, Integer> {

    @Query("SELECT * FROM StudentStructure s WHERE s.studEmail =:email")
    List<StudentStructure>findEmail(@Param("email") String email)
}