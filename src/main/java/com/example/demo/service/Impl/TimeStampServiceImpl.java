package com.example.demo.service.Impl;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.example.demo.entity.TimeStampEntity;
import com.example.demo.service.TimeStampService;
import com.example.demo.repository.TimeStampRepo;



@Service 

public class TimeStampServiceImpl implements TimeStampService{

    @Autowired TimeStampRepo timestamp;
    
@Override
 public TimeStampEntity postData(TimeStampEntity time){
      return timestamp.save(time);

 }
}