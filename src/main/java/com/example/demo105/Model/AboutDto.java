package com.example.demo105.Model;
public class AboutDto{
    private Integer id;
    private String title;
    private String text;
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
    public AboutDto(Integer id, String title, String text, String photo) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.photo = photo;
    }
    public AboutDto(){
    }
    @Override
    public String toString(){
        return "AboutDto{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }
}