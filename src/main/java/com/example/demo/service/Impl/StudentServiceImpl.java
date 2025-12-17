package com.example.demo.service.Impl;


import org.springframework.stereotype.Service;
import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;

@Service 
public class StudentServiceImpl implements StudentService{

    @Autowired StudentRepo student;
    

 public StudentEntity postData(StudentEntity stu){

 }
}