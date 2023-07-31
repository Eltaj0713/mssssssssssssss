package com.example.demo105.Dao.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "shop")
public class ShopEntity{
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "title")
    private String title;
    @Column(name = "text")
    private String text;
    @Column(name = "photo")
    private String photo;
    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getText(){
        return text;
    }
    public void setText(String text){
        this.text = text;
    }
    public String getPhoto(){
        return photo;
    }
    public void setPhoto(String photo){
        this.photo = photo;
    }
    public ShopEntity(Integer id, String title, String text, String photo){
        this.id = id;
        this.title = title;
        this.text = text;
        this.photo = photo;
    }
    public ShopEntity(){
    }
}