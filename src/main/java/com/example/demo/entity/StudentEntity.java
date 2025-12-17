package com.example.demo.entity;
import java.sql.Date;
@Entity
public class StudentEntity{
    private Integer id;
    private String name;
    private String email;
    private String password;
    private Date created;

}
public void setId(int id){
    this.id=id;
}
public Integer getId(){
    return id;
}
public void setName(String name){
    this.Username=name;
}
public String getUsername(){
    return name;
}
