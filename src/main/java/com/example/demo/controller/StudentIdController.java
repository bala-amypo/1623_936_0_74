package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.entity.StudentIdEntity;
import com.example.demo.service.StudentIdService;

@RestController
public class StudentIdController{

    @Autowired StudentIdService ser;
    
    @PostMapping("/postidd")
    public StudentIdEntity sendiddData(@RequestBody StudentIdEntity idd){
           return ser.postData(idd); 
    }
}