package com.example.demo105.Dao.entity;
import jakarta.persistence.*;
@Entity
@Table(name = "contact")
public class ContactEntity{
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "full_name")
    private String full_name;
    @Column(name = "email")
    private String email;
    @Column(name = "message")
    private String message;
    @Column(name = "phone_number")
    private String phone_number;
    public ContactEntity(String full_name, String email, String message, String phone_number){
    }
    public ContactEntity(){
    }
    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public String getEmail(){
        return email;
    }
    public String getFull_name(){
        return full_name;
    }
    public void setFull_name(String full_name){
        this.full_name = full_name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getMessage(){
        return message;
    }
    public void setMessage(String message){
        this.message = message;
    }
    public String getPhone_number(){
        return phone_number;
    }
    public void setPhone_number(String phone_number){
        this.phone_number = phone_number;
    }
    public ContactEntity(Integer id, String full_name, String email, String message, String phone_number){
        this.id = id;
        this.full_name = full_name;
        this.email = email;
        this.message = message;
        this.phone_number = phone_number;
    }
    @Override
    public String toString(){
        return "ContactEntity{" +
                "id=" + id +
                ", full_name='" + full_name + '\'' +
                ", email='" + email + '\'' +
                ", message='" + message + '\'' +
                ", phone_number='" + phone_number + '\'' +
                '}';
    }
}