package com.example.demo105.Model;
public class GlassesDto{
    private Integer id;
    private String name;
    private Double price;
    private String image;
    private String currency;
    private String country;
    private String material;
    private String company;
    private String expiration_date;
    private String purpose_use_product;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public String getExpiration_date() {
        return expiration_date;
    }
    public void setExpiration_date(String expiration_date) {
        this.expiration_date = expiration_date;
    }
    public String getPurpose_use_product() {
        return purpose_use_product;
    }
    public void setPurpose_use_product(String purpose_use_product) {
        this.purpose_use_product = purpose_use_product;
    }
    public GlassesDto(Integer id, String name, Double price, String image, String currency, String country, String material, String company, String expirationDate, String purposeUseProduct) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.image = image;
        this.currency = currency;
        this.country = country;
        this.material = material;
        this.company = company;
        this.expiration_date = expirationDate;
        this.purpose_use_product = purposeUseProduct;
    }
    public GlassesDto() {
    }
    @Override
    public String toString(){
        return "GlassesEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", image='" + image + '\'' +
                ", currency='" + currency + '\'' +
                ", country='" + country + '\'' +
                ", material='" + material + '\'' +
                ", company='" + company + '\'' +
                ", expirationDate='" + expiration_date + '\'' +
                ", purposeUseProduct='" + purpose_use_product + '\'' +
                '}';
    }
}