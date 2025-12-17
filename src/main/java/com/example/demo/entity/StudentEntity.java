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
public Date getCreated(){
    return created;
}
public void setCreated(Date created){
    this.created=created;
}
public void setId(Integer id){
    this.id=id;
}
public Integer getId(){
    return id;
}
public void setName(String name){
    this.name=name;
}
public String getName(){
    return name;
}
public String getEmail(){
    return email;
}
public void setEmail(String email){
    this.email=email;
}
public String getPassword(){
    return password;
}
public void setPassword(String password){
    this.password=password;
}
public StudentEntity(Integer id,String name,String email,String password,Date created){
    this.id=id;
    this.name=name;
    this.email=email;
    this.password=password;
    this.created=created;
}
public StudentEntity(){
    
}
