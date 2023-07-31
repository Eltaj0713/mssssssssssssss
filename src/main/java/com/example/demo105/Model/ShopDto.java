package com.example.demo105.Model;
public class ShopDto{
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
    @Override
    public String toString(){
        return "ShopDto{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }
    public ShopDto(Integer id, String title, String text, String photo) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.photo = photo;
    }
    public ShopDto(){
    }
}