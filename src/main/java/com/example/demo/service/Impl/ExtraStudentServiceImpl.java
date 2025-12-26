package com.example.demo.service.Impl;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.example.demo.entity.ExtraStudent;
import com.example.demo.service.ExtraStudentService;
import com.example.demo.repository.ExtraStudentRepository;
import java.util.List;


@Service 

public class StudentServiceImpl implements StudentService{

    @Autowired StudentRepo studentsss;
    
@Override
 public StudentEntity postData(StudentEntity student){
      return studentsss.save(student);

 }
 }