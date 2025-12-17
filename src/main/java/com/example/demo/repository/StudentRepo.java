package com.example.demo.repository;

import org.springframework.stereotype.Repository;

@Repository 
public interface StudentRepo extends JpaRepository<StudentEntity,Integer>{

}