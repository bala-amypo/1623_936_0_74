package com.example.demo.service.Impl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.ValidationService;
import com.example.demo.repository.ValidationRepo;
import com.example.demo.entity.ValidationEntity;
import com.example.demo.exception.ValidationException;


@Service 
public class ValidationServiceImpl implements ValidationService{

  @Autowired ValidationRepo validation;
    
@Override
 public ValidationEntity postData(ValidationEntity valid){
      return validation.save(valid);

 }
     @Override
 public ValidationEntity getStudentById(Long id){
    return validation.findById(id).orElseThrow(()->new ValidationException("Invalid Id"+id));
 }
 }
