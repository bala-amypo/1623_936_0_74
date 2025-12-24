package com.example.demo.repository;
import com.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.StudentsStructure;
import com.springframework.data.repository.query.Param;
import java.util.List;
public interface StudentsRepository extends JpaRepository<StudentsStructure, Integer> {

    @Query("SELECT s FROM StudentsStructure s WHERE s.studEmail =:email")
    List<StudentsStructure>findEmail(@Param("email") String email);
}