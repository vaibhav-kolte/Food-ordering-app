package com.example.foodorderapp.Models;

public class MainModel {
    private int image;
    private String name, price, description;

    public MainModel(int image, String name, String price, String description) {
        this.image = image;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescrition() {
        return description;
    }

    public void setDescrition(String description) {
        this.description = description;
    }
}
