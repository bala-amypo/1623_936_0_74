package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Au
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController{

    @Autowired StudentService ser;

}