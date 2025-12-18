package com.example.demo.service.Impl;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;
import com.example.demo.repository.StudentRepo;
import java.util.List;


@Service 

public class StudentServiceImpl implements StudentService{

    @Autowired StudentRepo student;
    
@Override
 public StudentEntity postData(StudentEntity stu){
      return student.save(stu);

 }
 @Override
 public List<StudentEntity>getAllData(){
    return student.findAll();
 }
 @Override
 public String DeleteData( int id){
      student.deleteById(id);
      return "Deleted Successfully";
 }
}
