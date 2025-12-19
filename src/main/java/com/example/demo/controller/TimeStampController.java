package com.example.demo.controller;



@RestController
public class TimeStampController{

    @Autowired Service ser;
    
    @PostMapping("/post")
    public StudentEntity sendData(@RequestBody StudentEntity stu){
           return ser.postData(stu); 
    }
}