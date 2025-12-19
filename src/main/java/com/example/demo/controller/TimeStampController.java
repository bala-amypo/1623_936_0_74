package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.entity.TimeStampEntity;
import com.example.demo.service.TimeStampService;


@RestController
public class TimeStampController{

    @Autowired TimeStampService ser;
    
    @PostMapping("/postdata")
    public TimeStampEntity sendidData(@RequestBody TimeStampEntity time){
           return ser.postData(time); 
    }
}