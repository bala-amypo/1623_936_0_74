package com.example.demo.service.Impl;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.example.demo.entity.StudentDetails;
import com.example.demo.service.StudentDetailsService;
import com.example.demo.repository.StudentDetailsRepo;



@Service 

public class StudentDetailsServiceImpl implements StudentDetailsService{

    @Autowired StudentRepo studentss;
    
@Override
 public StudentDetails postData(StudentDetails details){
      return studentss.save(details);

 }
 }