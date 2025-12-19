package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Positive;


@Entity
public class ValidationEntity{
     @Id 
     @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min = 2,max = 6, message = "must be 2 to 6 character")
    private String name;
    @Email(message = "Email is not valid")
    private String email;
    @Size(min = 2 , max = 8 , message = "must be 2 to 8 character") 
    @NotNull(message = "Password is mandatory")
    private String password;
    @Max(30)
    @Positive(message = "Age should be Positive")
    @NotNull
    private int age;

}
// public void setId(Long id){
//     this.id=id;
// }
// public Long getId(){
//     return id;
// }
// public void setName(String name){
//     this.name=name;
// }
// public String getName(){
//     return name;
// }
// public String getEmail(){
//     return email;
// }
// public void setEmail(String email){
//     this.email=email;
// }
// public String getPassword(){
//     return password;
// }
// public void setPassword(String password){
//     this.password=password;
// }
// public void setAge(int age){
//     this.age=age;
// }
// public int getAge(){
//     return age;
// }

// public ValidationEntity(Long id,
//         @NotNull @Size(min = 2, max = 6 ,message = "must be 2 to 6 character")
//         String name, @Email(message = "Email is not valid") String email,
//         @Size(min = 2 , max = 8 , message = "must be 2 to 8 character" ) @NotNull(message = "Password is mandatory")
//         @Max(30) @Positive(message = "Age should be Positive") int age){
//     this.id=id;
//     this.name=name;
//     this.email=email;
//     this.password=password;
//     this.age=age;

//         }
//         public ValidationEntity(){
    
// }
// }
