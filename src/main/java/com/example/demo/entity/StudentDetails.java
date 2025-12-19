package com.example.demo.entity;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDetails{
      @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
    private String name;
    private String email;
    private String address;
}