package com.example.demo.service.Impl;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;
import com.example.demo.repository.StudentRepo;
import java.util.List;


@Service 

public class TimeStampServiceImpl implements TimeStampService{

    @Autowired TimeStampRepo timestamp;
    
@Override
 public TimeStampEntity postData(TimeStampEntity time){
      return timestamp.save(time);

 }
 @Override
 public List<TimeStampEntity>getAllData(){
    return tim.findAll();
 }
}