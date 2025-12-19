package com.example.demo.service.Impl;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.example.demo.entity.StudentId;
import com.example.demo.service.StudentIdService;
import com.example.demo.repository.StudentIdRepo;
import java.util.List;


@Service 

public class StudentIdServiceImpl implements StudentIdService{

    @Autowired StudentIdRepo ids;
    
@Override
 public StudentId postData(StudentId idd){
      return ids.save(idd);

 }
}