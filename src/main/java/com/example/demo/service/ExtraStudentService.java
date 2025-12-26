package com.example.demo.service; //header file

import com.example.demo.entity.ExtraStudent;

import java.util.List;

public interface ExtraStudentService{
    ExtraStudent saveExtraStudent(ExtraStudent stu);
 ExtraStudent CheckEmail(String email);
}