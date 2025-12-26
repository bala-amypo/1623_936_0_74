package com.example.demo.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long depId;
    private String name;
    private String depHead;

    @OneToMany(mappedBy = "department", cascade=CascadeType.ALL)
    @JsonIgnoreProperties("department")
    private List<Student> stu;
}
