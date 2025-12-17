package com.example.demo.service.Impl;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;
import com.example.demo.repository.StudentRepo;

@Service 

public class StudentServiceImpl implements StudentService{

    @Autowired StudentRepo student;
    
@Override
 public StudentEntity postData(StudentEntity stu){
      return student.save(stu);

 }
}