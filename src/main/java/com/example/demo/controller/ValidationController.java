package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.entity.ValidationEntity;
import com.example.demo.service.ValidationService;
import org.springframework.web.bind.annotation.PathVariable;
import jakarta.validation.Valid;

@RestController
public class ValidationController{

    @Autowired ValidationService ser;
    
    @PostMapping("/data")
    public ValidationEntity sendData(@Valid @RequestBody ValidationEntity valid){
           return ser.postData(valid); 
    }
    @PutMapping("/put/{id}")
public ValidationEntity putval(@PathVariable int id,@RequestBody ValidationEntity entity){
    return ser.updateData(id,entity);
}
}