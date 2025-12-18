package com.example.demo.service.Impl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service 

public class ValidationServiceImpl implements ValidationService{

  @Autowired ValidatonRepo validation;
    
@Override
 public ValidationEntity postData(ValidationEntity valid){
      return validation.save(valid);

 }
}