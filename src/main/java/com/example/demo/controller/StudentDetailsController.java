package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.entity.StudentDetails;
import com.example.demo.service.StudentDetailsService;

@RestController
public class StudentDetailsController{

    @Autowired StudentDetailsService ser;
    
    @PostMapping("/postdetails")
    public StudentDetails senddetailsData(@RequestBody StudentDetails details){
           return ser.postData(details); 
    }
}