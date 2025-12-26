package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.demo.entity.ExtraStudent;
import com.example.demo.service.ExtraStudentService;
import java.util.List;

@RestController
public class AuthController{

    @Autowired ExtraStudentService ser;
    
    @PostMapping("/post")
    public ExtraStudent sendData(@RequestBody ExtraStudent student){
           return ser.postData(student); 
    }
    }