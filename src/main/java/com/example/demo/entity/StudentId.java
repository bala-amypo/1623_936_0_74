package com.example.demo.entity;
import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentId{
     @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String idcardno;

    @OneToOne
    @JoinColumn(name="student_id")
    private StudentDetails students;
}