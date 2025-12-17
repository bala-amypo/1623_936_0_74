package com.example.demo.entity;
import java.sql.Date;
@Entity
public class StudentEntity{
    Private Integer id;
    Private String username;
    Private String email;
    Private String password;
}
public void setId(int id){
    this.id=id;
}
public void getId(){
    return id;
}
public String setName(String name){
    this.name=name;
}
public String set