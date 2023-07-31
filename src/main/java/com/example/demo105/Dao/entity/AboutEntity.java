package com.example.demo105.Dao.entity;
import jakarta.persistence.*;
@Entity
@Table(name = "about")
public class AboutEntity{
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    public String getPhoto() {
        return photo;
    }
    public void setPhoto(String photo){
        this.photo = photo;
    }
    public AboutEntity(Integer id, String title, String text, String photo) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.photo = photo;
    }
    public AboutEntity() {
    }
    @Override
    public String toString(){
        return "AboutEntity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }
}