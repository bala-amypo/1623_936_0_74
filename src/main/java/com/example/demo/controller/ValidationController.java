package com.example.demo.controller;


@RestController
public class ValidationController{

    @Autowired ValidationService ser;
    
    @PostMapping("/post")
    public ValidationEntity sendData(@RequestBody ValidationEntity valid){
           return ser.postData(valid); 
    }
}