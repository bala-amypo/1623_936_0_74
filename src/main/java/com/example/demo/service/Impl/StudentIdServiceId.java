package com.example.demo.service.Impl;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;
import com.example.demo.repository.StudentRepo;
import java.util.List;


@Service 

public class StudentServiceImpl implements StudentService{

    @Autowired StudentIdRepo ids;
    
@Override
 public StudentEntity postData(StudentId idd){
      return ids.save(idd);

 }