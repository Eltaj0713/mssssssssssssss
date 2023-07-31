package com.example.demo105.Model;
public class ContactDto{
    private Integer id;
    private String full_name;
    private String email;
    private String message;
    private String phone_number;
    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public String getFull_name(){
        return full_name;
    }
    public void setFull_name(String full_name){
        this.full_name = full_name;
    }
    public String getEmail(){
        return email;
    }
    public String getPhone_number(){
        return phone_number;
    }
    public void setPhone_number(String phone_number){
        this.phone_number = phone_number;
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
    public ContactDto(Integer id, String full_name, String phone_number, String email, String message){
        this.id = id;
        this.full_name = full_name;
        this.phone_number = phone_number;
        this.email = email;
        this.message = message;
    }
    public ContactDto(){
    }
    @Override
    public String toString(){
        return "ContactDto{" +
                "id=" + id +
                ", full_name='" + full_name + '\'' +
                ", phoneNumber='" + phone_number + '\'' +
                ", email='" + email + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}